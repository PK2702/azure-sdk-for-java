// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The DedicatedHostGroupListResult model.
 */
@Fluent
public final class DedicatedHostGroupListResultInner {
    /*
     * The list of dedicated host groups
     */
    @JsonProperty(value = "value", required = true)
    private List<DedicatedHostGroupInner> value;

    /*
     * The URI to fetch the next page of Dedicated Host Groups. Call ListNext()
     * with this URI to fetch the next page of Dedicated Host Groups.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of dedicated host groups.
     * 
     * @return the value value.
     */
    public List<DedicatedHostGroupInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of dedicated host groups.
     * 
     * @param value the value value to set.
     * @return the DedicatedHostGroupListResultInner object itself.
     */
    public DedicatedHostGroupListResultInner withValue(List<DedicatedHostGroupInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of Dedicated
     * Host Groups. Call ListNext() with this URI to fetch the next page of
     * Dedicated Host Groups.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to fetch the next page of Dedicated
     * Host Groups. Call ListNext() with this URI to fetch the next page of
     * Dedicated Host Groups.
     * 
     * @param nextLink the nextLink value to set.
     * @return the DedicatedHostGroupListResultInner object itself.
     */
    public DedicatedHostGroupListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
