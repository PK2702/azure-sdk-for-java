// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cosmosdb;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The MongoDBDatabaseResource model. */
@Fluent
public class MongoDBDatabaseResource {
    /*
     * Name of the Cosmos DB MongoDB database
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Get the id property: Name of the Cosmos DB MongoDB database.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Name of the Cosmos DB MongoDB database.
     *
     * @param id the id value to set.
     * @return the MongoDBDatabaseResource object itself.
     */
    public MongoDBDatabaseResource withId(String id) {
        this.id = id;
        return this;
    }
}
