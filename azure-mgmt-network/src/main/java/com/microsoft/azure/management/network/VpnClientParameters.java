/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VpnClientParameters.
 */
public class VpnClientParameters {
    /**
     * VPN client Processor Architecture -Amd64/X86. Possible values include:
     * 'Amd64', 'X86'.
     */
    @JsonProperty(value = "ProcessorArchitecture")
    private ProcessorArchitecture processorArchitecture;

    /**
     * Get the processorArchitecture value.
     *
     * @return the processorArchitecture value
     */
    public ProcessorArchitecture processorArchitecture() {
        return this.processorArchitecture;
    }

    /**
     * Set the processorArchitecture value.
     *
     * @param processorArchitecture the processorArchitecture value to set
     * @return the VpnClientParameters object itself.
     */
    public VpnClientParameters withProcessorArchitecture(ProcessorArchitecture processorArchitecture) {
        this.processorArchitecture = processorArchitecture;
        return this;
    }

}
