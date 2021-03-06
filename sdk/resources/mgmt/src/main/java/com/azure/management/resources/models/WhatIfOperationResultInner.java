// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.management.resources.ErrorResponse;
import com.azure.management.resources.WhatIfChange;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The WhatIfOperationResult model. */
@JsonFlatten
@Fluent
public class WhatIfOperationResultInner {
    /*
     * Status of the What-If operation.
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * Error when What-If operation fails.
     */
    @JsonProperty(value = "error")
    private ErrorResponse error;

    /*
     * List of resource changes predicted by What-If operation.
     */
    @JsonProperty(value = "properties.changes")
    private List<WhatIfChange> changes;

    /**
     * Get the status property: Status of the What-If operation.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: Status of the What-If operation.
     *
     * @param status the status value to set.
     * @return the WhatIfOperationResultInner object itself.
     */
    public WhatIfOperationResultInner withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the error property: Error when What-If operation fails.
     *
     * @return the error value.
     */
    public ErrorResponse error() {
        return this.error;
    }

    /**
     * Set the error property: Error when What-If operation fails.
     *
     * @param error the error value to set.
     * @return the WhatIfOperationResultInner object itself.
     */
    public WhatIfOperationResultInner withError(ErrorResponse error) {
        this.error = error;
        return this;
    }

    /**
     * Get the changes property: List of resource changes predicted by What-If operation.
     *
     * @return the changes value.
     */
    public List<WhatIfChange> changes() {
        return this.changes;
    }

    /**
     * Set the changes property: List of resource changes predicted by What-If operation.
     *
     * @param changes the changes value to set.
     * @return the WhatIfOperationResultInner object itself.
     */
    public WhatIfOperationResultInner withChanges(List<WhatIfChange> changes) {
        this.changes = changes;
        return this;
    }
}
