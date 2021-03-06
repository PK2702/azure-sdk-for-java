// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.management.sql.ServerConnectionType;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ServerConnectionPolicy model. */
@JsonFlatten
@Fluent
public class ServerConnectionPolicyInner extends ProxyResource {
    /*
     * Metadata used for the Azure portal experience.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /*
     * Resource location.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /*
     * The server connection type.
     */
    @JsonProperty(value = "properties.connectionType")
    private ServerConnectionType connectionType;

    /**
     * Get the kind property: Metadata used for the Azure portal experience.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get the location property: Resource location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the connectionType property: The server connection type.
     *
     * @return the connectionType value.
     */
    public ServerConnectionType connectionType() {
        return this.connectionType;
    }

    /**
     * Set the connectionType property: The server connection type.
     *
     * @param connectionType the connectionType value to set.
     * @return the ServerConnectionPolicyInner object itself.
     */
    public ServerConnectionPolicyInner withConnectionType(ServerConnectionType connectionType) {
        this.connectionType = connectionType;
        return this;
    }
}
