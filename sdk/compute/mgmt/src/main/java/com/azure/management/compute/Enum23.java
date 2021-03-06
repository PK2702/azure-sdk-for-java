// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for Enum23.
 */
public final class Enum23 extends ExpandableStringEnum<Enum23> {
    /**
     * Static value 1 for Enum23.
     */
    public static final Enum23 ONE = fromString("1");

    /**
     * Static value 3 for Enum23.
     */
    public static final Enum23 THREE = fromString("3");

    /**
     * Static value 5 for Enum23.
     */
    public static final Enum23 FIVE = fromString("5");

    /**
     * Creates or finds a Enum23 from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding Enum23.
     */
    @JsonCreator
    public static Enum23 fromString(String name) {
        return fromString(name, Enum23.class);
    }

    /**
     * @return known Enum23 values.
     */
    public static Collection<Enum23> values() {
        return values(Enum23.class);
    }
}
