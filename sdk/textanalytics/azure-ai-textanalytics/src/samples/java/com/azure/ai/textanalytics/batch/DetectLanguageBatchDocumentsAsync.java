// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.textanalytics.batch;

import com.azure.ai.textanalytics.TextAnalyticsAsyncClient;
import com.azure.ai.textanalytics.TextAnalyticsClientBuilder;
import com.azure.ai.textanalytics.models.DetectLanguageInput;
import com.azure.ai.textanalytics.models.DetectLanguageResult;
import com.azure.ai.textanalytics.models.DetectedLanguage;
import com.azure.ai.textanalytics.models.TextAnalyticsRequestOptions;
import com.azure.ai.textanalytics.models.TextDocumentBatchStatistics;
import com.azure.core.credential.AzureKeyCredential;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Sample demonstrates how to asynchronously detect the languages of {@link DetectLanguageInput} documents.
 */
public class DetectLanguageBatchDocumentsAsync {
    /**
     * Main method to invoke this demo about how to detect the languages of {@link DetectLanguageInput} documents.
     *
     * @param args Unused arguments to the program.
     */
    public static void main(String[] args) {
        // Instantiate a client that will be used to call the service.
        TextAnalyticsAsyncClient client = new TextAnalyticsClientBuilder()
            .apiKey(new AzureKeyCredential("{api_key}"))
            .endpoint("{endpoint}")
            .buildAsyncClient();

        // The texts that need be analyzed.
        List<DetectLanguageInput> documents = Arrays.asList(
            new DetectLanguageInput("A", "This is written in English.", "US"),
            new DetectLanguageInput("B", "Este es un documento  escrito en Español.", "ES")
        );

        // Request options: show statistics and model version
        TextAnalyticsRequestOptions requestOptions = new TextAnalyticsRequestOptions().setIncludeStatistics(true).setModelVersion("latest");

        // Detecting language for each document in a batch of documents
        client.detectLanguageBatch(documents, requestOptions).byPage().subscribe(
            pagedResponse -> {
                System.out.printf("Results of Azure Text Analytics \"Language Detection\" Model, version: %s%n", pagedResponse.getModelVersion());

                // Batch statistics
                TextDocumentBatchStatistics batchStatistics = pagedResponse.getStatistics();
                System.out.printf("Documents statistics: document count = %s, erroneous document count = %s, transaction count = %s, valid document count = %s.%n",
                    batchStatistics.getDocumentCount(), batchStatistics.getInvalidDocumentCount(), batchStatistics.getTransactionCount(), batchStatistics.getValidDocumentCount());

                // Detected language for each document in a batch of documents\
                AtomicInteger counter = new AtomicInteger();
                for (DetectLanguageResult detectLanguageResult : pagedResponse.getElements()) {
                    System.out.printf("%n%s%n", documents.get(counter.getAndIncrement()));
                    if (detectLanguageResult.isError()) {
                        // Erroneous document
                        System.out.printf("Cannot detect language. Error: %s%n", detectLanguageResult.getError().getMessage());
                    } else {
                        // Valid document
                        DetectedLanguage language = detectLanguageResult.getPrimaryLanguage();
                        System.out.printf("Detected primary language: %s, ISO 6391 name: %s, score: %f.%n",
                            language.getName(), language.getIso6391Name(), language.getScore());
                    }
                }
            },
            error -> System.err.println("There was an error detecting language of the documents." + error),
            () -> System.out.println("Batch of language detected."));

        // The .subscribe() creation and assignment is not a blocking call. For the purpose of this example, we sleep
        // the thread so the program does not end before the send operation is complete. Using .block() instead of
        // .subscribe() will turn this into a synchronous call.
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException ignored) {
        }
    }
}
