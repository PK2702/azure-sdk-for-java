// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.keyvault.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.polling.AsyncPollResponse;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PrivateEndpointConnections. */
public final class PrivateEndpointConnectionsInner {
    /** The proxy service used to perform REST calls. */
    private final PrivateEndpointConnectionsService service;

    /** The service client containing this operation class. */
    private final KeyVaultManagementClientImpl client;

    /**
     * Initializes an instance of PrivateEndpointConnectionsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    PrivateEndpointConnectionsInner(KeyVaultManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    PrivateEndpointConnectionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for KeyVaultManagementClientPrivateEndpointConnections to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "KeyVaultManagementCl")
    private interface PrivateEndpointConnectionsService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.KeyVault"
                + "/vaults/{vaultName}/privateEndpointConnections/{privateEndpointConnectionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<PrivateEndpointConnectionInner>> get(
            @HostParam("$host") String host,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("vaultName") String vaultName,
            @PathParam("privateEndpointConnectionName") String privateEndpointConnectionName,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.KeyVault"
                + "/vaults/{vaultName}/privateEndpointConnections/{privateEndpointConnectionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<PrivateEndpointConnectionsPutResponse> put(
            @HostParam("$host") String host,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("vaultName") String vaultName,
            @PathParam("privateEndpointConnectionName") String privateEndpointConnectionName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") PrivateEndpointConnectionInner properties,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Delete(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.KeyVault"
                + "/vaults/{vaultName}/privateEndpointConnections/{privateEndpointConnectionName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(
            @HostParam("$host") String host,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("vaultName") String vaultName,
            @PathParam("privateEndpointConnectionName") String privateEndpointConnectionName,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Delete(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.KeyVault"
                + "/vaults/{vaultName}/privateEndpointConnections/{privateEndpointConnectionName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<PrivateEndpointConnectionsBeginDeleteResponse> beginDelete(
            @HostParam("$host") String host,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("vaultName") String vaultName,
            @PathParam("privateEndpointConnectionName") String privateEndpointConnectionName,
            @QueryParam("api-version") String apiVersion,
            Context context);
    }

    /**
     * Gets the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the key vault.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<PrivateEndpointConnectionInner>> getWithResponseAsync(
        String resourceGroupName, String vaultName, String privateEndpointConnectionName) {
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getHost(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            vaultName,
                            privateEndpointConnectionName,
                            this.client.getApiVersion(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the key vault.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PrivateEndpointConnectionInner> getAsync(
        String resourceGroupName, String vaultName, String privateEndpointConnectionName) {
        return getWithResponseAsync(resourceGroupName, vaultName, privateEndpointConnectionName)
            .flatMap(
                (SimpleResponse<PrivateEndpointConnectionInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the key vault.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateEndpointConnectionInner get(
        String resourceGroupName, String vaultName, String privateEndpointConnectionName) {
        return getAsync(resourceGroupName, vaultName, privateEndpointConnectionName).block();
    }

    /**
     * Updates the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @param properties Private endpoint connection resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PrivateEndpointConnectionsPutResponse> putWithResponseAsync(
        String resourceGroupName,
        String vaultName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner properties) {
        return FluxUtil
            .withContext(
                context ->
                    service
                        .put(
                            this.client.getHost(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            vaultName,
                            privateEndpointConnectionName,
                            this.client.getApiVersion(),
                            properties,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Updates the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @param properties Private endpoint connection resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PrivateEndpointConnectionInner> putAsync(
        String resourceGroupName,
        String vaultName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner properties) {
        return putWithResponseAsync(resourceGroupName, vaultName, privateEndpointConnectionName, properties)
            .flatMap(
                (PrivateEndpointConnectionsPutResponse res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Updates the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @param properties Private endpoint connection resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateEndpointConnectionInner put(
        String resourceGroupName,
        String vaultName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner properties) {
        return putAsync(resourceGroupName, vaultName, privateEndpointConnectionName, properties).block();
    }

    /**
     * Deletes the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName, String vaultName, String privateEndpointConnectionName) {
        return FluxUtil
            .withContext(
                context ->
                    service
                        .delete(
                            this.client.getHost(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            vaultName,
                            privateEndpointConnectionName,
                            this.client.getApiVersion(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Deletes the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PrivateEndpointConnectionInner> deleteAsync(
        String resourceGroupName, String vaultName, String privateEndpointConnectionName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> mono =
            deleteWithResponseAsync(resourceGroupName, vaultName, privateEndpointConnectionName);
        return this
            .client
            .<PrivateEndpointConnectionInner, PrivateEndpointConnectionInner>getLroResultAsync(
                mono,
                this.client.getHttpPipeline(),
                PrivateEndpointConnectionInner.class,
                PrivateEndpointConnectionInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Deletes the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateEndpointConnectionInner delete(
        String resourceGroupName, String vaultName, String privateEndpointConnectionName) {
        return deleteAsync(resourceGroupName, vaultName, privateEndpointConnectionName).block();
    }

    /**
     * Deletes the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PrivateEndpointConnectionsBeginDeleteResponse> beginDeleteWithResponseAsync(
        String resourceGroupName, String vaultName, String privateEndpointConnectionName) {
        return FluxUtil
            .withContext(
                context ->
                    service
                        .beginDelete(
                            this.client.getHost(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            vaultName,
                            privateEndpointConnectionName,
                            this.client.getApiVersion(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Deletes the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PrivateEndpointConnectionInner> beginDeleteAsync(
        String resourceGroupName, String vaultName, String privateEndpointConnectionName) {
        return beginDeleteWithResponseAsync(resourceGroupName, vaultName, privateEndpointConnectionName)
            .flatMap(
                (PrivateEndpointConnectionsBeginDeleteResponse res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Deletes the specified private endpoint connection associated with the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param privateEndpointConnectionName Name of the private endpoint connection associated with the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateEndpointConnectionInner beginDelete(
        String resourceGroupName, String vaultName, String privateEndpointConnectionName) {
        return beginDeleteAsync(resourceGroupName, vaultName, privateEndpointConnectionName).block();
    }
}
