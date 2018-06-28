/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.keyvault.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The storage account key regenerate parameters.
 */
public class StorageAccountRegenerteKeyParameters {
    /**
     * The storage account key name.
     */
    @JsonProperty(value = "keyName", required = true)
    private String keyName;

    /**
     * Get the keyName value.
     *
     * @return the keyName value
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set the keyName value.
     *
     * @param keyName the keyName value to set
     * @return the StorageAccountRegenerteKeyParameters object itself.
     */
    public StorageAccountRegenerteKeyParameters withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

}
