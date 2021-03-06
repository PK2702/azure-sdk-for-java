/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The dsc nodeconfiguration property associated with the entity.
 */
public class DscNodeConfigurationAssociationProperty {
    /**
     * Gets or sets the name of the dsc nodeconfiguration.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get gets or sets the name of the dsc nodeconfiguration.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set gets or sets the name of the dsc nodeconfiguration.
     *
     * @param name the name value to set
     * @return the DscNodeConfigurationAssociationProperty object itself.
     */
    public DscNodeConfigurationAssociationProperty withName(String name) {
        this.name = name;
        return this;
    }

}
