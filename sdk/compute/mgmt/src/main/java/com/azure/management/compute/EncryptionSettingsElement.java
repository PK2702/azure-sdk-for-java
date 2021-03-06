// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The EncryptionSettingsElement model.
 */
@Fluent
public final class EncryptionSettingsElement {
    /*
     * Key Vault Secret Url and vault id of the encryption key
     */
    @JsonProperty(value = "diskEncryptionKey")
    private KeyVaultAndSecretReference diskEncryptionKey;

    /*
     * Key Vault Key Url and vault id of KeK, KeK is optional and when provided
     * is used to unwrap the encryptionKey
     */
    @JsonProperty(value = "keyEncryptionKey")
    private KeyVaultAndKeyReference keyEncryptionKey;

    /**
     * Get the diskEncryptionKey property: Key Vault Secret Url and vault id of
     * the encryption key.
     * 
     * @return the diskEncryptionKey value.
     */
    public KeyVaultAndSecretReference diskEncryptionKey() {
        return this.diskEncryptionKey;
    }

    /**
     * Set the diskEncryptionKey property: Key Vault Secret Url and vault id of
     * the encryption key.
     * 
     * @param diskEncryptionKey the diskEncryptionKey value to set.
     * @return the EncryptionSettingsElement object itself.
     */
    public EncryptionSettingsElement withDiskEncryptionKey(KeyVaultAndSecretReference diskEncryptionKey) {
        this.diskEncryptionKey = diskEncryptionKey;
        return this;
    }

    /**
     * Get the keyEncryptionKey property: Key Vault Key Url and vault id of
     * KeK, KeK is optional and when provided is used to unwrap the
     * encryptionKey.
     * 
     * @return the keyEncryptionKey value.
     */
    public KeyVaultAndKeyReference keyEncryptionKey() {
        return this.keyEncryptionKey;
    }

    /**
     * Set the keyEncryptionKey property: Key Vault Key Url and vault id of
     * KeK, KeK is optional and when provided is used to unwrap the
     * encryptionKey.
     * 
     * @param keyEncryptionKey the keyEncryptionKey value to set.
     * @return the EncryptionSettingsElement object itself.
     */
    public EncryptionSettingsElement withKeyEncryptionKey(KeyVaultAndKeyReference keyEncryptionKey) {
        this.keyEncryptionKey = keyEncryptionKey;
        return this;
    }
}
