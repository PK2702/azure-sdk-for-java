/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for VirtualNetworkGatewaySkuTier.
 */
public final class VirtualNetworkGatewaySkuTier {
    /** Static value Basic for VirtualNetworkGatewaySkuTier. */
    public static final VirtualNetworkGatewaySkuTier BASIC = new VirtualNetworkGatewaySkuTier("Basic");

    /** Static value HighPerformance for VirtualNetworkGatewaySkuTier. */
    public static final VirtualNetworkGatewaySkuTier HIGH_PERFORMANCE = new VirtualNetworkGatewaySkuTier("HighPerformance");

    /** Static value Standard for VirtualNetworkGatewaySkuTier. */
    public static final VirtualNetworkGatewaySkuTier STANDARD = new VirtualNetworkGatewaySkuTier("Standard");

    private String value;

    /**
     * Creates a custom value for VirtualNetworkGatewaySkuTier.
     * @param value the custom value
     */
    public VirtualNetworkGatewaySkuTier(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof VirtualNetworkGatewaySkuTier)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        VirtualNetworkGatewaySkuTier rhs = (VirtualNetworkGatewaySkuTier) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
