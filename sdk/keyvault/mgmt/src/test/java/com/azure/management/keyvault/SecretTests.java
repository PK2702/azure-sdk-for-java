// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.management.keyvault;

import com.azure.management.ApplicationTokenCredential;
import com.azure.management.resources.core.TestBase;
import com.azure.management.resources.fluentcore.arm.Region;
import com.azure.management.resources.fluentcore.utils.SdkContext;
import java.io.File;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SecretTests extends KeyVaultManagementTest {

    public SecretTests() {
        super(TestBase.RunCondition.LIVE_ONLY);
    }

    @Test
    public void canCRUDSecret() throws Exception {
        String vaultName = sdkContext.randomResourceName("vault", 20);
        String secretName = sdkContext.randomResourceName("secret", 20);

        ApplicationTokenCredential credentials =
            ApplicationTokenCredential.fromFile(new File(System.getenv("AZURE_AUTH_LOCATION")));

        Vault vault =
            keyVaultManager
                .vaults()
                .define(vaultName)
                .withRegion(Region.US_WEST)
                .withNewResourceGroup(rgName)
                .defineAccessPolicy()
                .forServicePrincipal(credentials.getClientId())
                .allowSecretAllPermissions()
                .attach()
                .create();

        Assertions.assertNotNull(vault);

        SdkContext.sleep(10000);

        Secret secret = vault.secrets().define(secretName).withValue("Some secret value").create();

        Assertions.assertNotNull(secret);
        Assertions.assertNotNull(secret.id());
        Assertions.assertEquals("Some secret value", secret.value());

        secret = secret.update().withValue("Some updated value").apply();

        Assertions.assertEquals("Some updated value", secret.value());

        Iterable<Secret> versions = secret.listVersions();

        int count = 2;
        for (Secret version : versions) {
            if ("Some secret value".equals(version.value())) {
                count--;
            }
            if ("Some updated value".equals(version.value())) {
                count--;
            }
        }
        Assertions.assertEquals(0, count);
    }
}
