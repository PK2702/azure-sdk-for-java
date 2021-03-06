// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CreationData model.
 */
@Fluent
public final class CreationData {
    /*
     * This enumerates the possible sources of a disk's creation.
     */
    @JsonProperty(value = "createOption", required = true)
    private DiskCreateOption createOption;

    /*
     * If createOption is Import, the Azure Resource Manager identifier of the
     * storage account containing the blob to import as a disk. Required only
     * if the blob is in a different subscription
     */
    @JsonProperty(value = "storageAccountId")
    private String storageAccountId;

    /*
     * The source image used for creating the disk.
     */
    @JsonProperty(value = "imageReference")
    private ImageDiskReference imageReference;

    /*
     * If createOption is Import, this is the URI of a blob to be imported into
     * a managed disk.
     */
    @JsonProperty(value = "sourceUri")
    private String sourceUri;

    /*
     * If createOption is Copy, this is the ARM id of the source snapshot or
     * disk.
     */
    @JsonProperty(value = "sourceResourceId")
    private String sourceResourceId;

    /*
     * If this field is set, this is the unique id identifying the source of
     * this resource.
     */
    @JsonProperty(value = "sourceUniqueId", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceUniqueId;

    /*
     * If createOption is Upload, this is the size of the contents of the
     * upload including the VHD footer. This value should be between 20972032
     * (20 MiB + 512 bytes for the VHD footer) and 35183298347520 bytes (32 TiB
     * + 512 bytes for the VHD footer).
     */
    @JsonProperty(value = "uploadSizeBytes")
    private Long uploadSizeBytes;

    /**
     * Get the createOption property: This enumerates the possible sources of a
     * disk's creation.
     * 
     * @return the createOption value.
     */
    public DiskCreateOption createOption() {
        return this.createOption;
    }

    /**
     * Set the createOption property: This enumerates the possible sources of a
     * disk's creation.
     * 
     * @param createOption the createOption value to set.
     * @return the CreationData object itself.
     */
    public CreationData withCreateOption(DiskCreateOption createOption) {
        this.createOption = createOption;
        return this;
    }

    /**
     * Get the storageAccountId property: If createOption is Import, the Azure
     * Resource Manager identifier of the storage account containing the blob
     * to import as a disk. Required only if the blob is in a different
     * subscription.
     * 
     * @return the storageAccountId value.
     */
    public String storageAccountId() {
        return this.storageAccountId;
    }

    /**
     * Set the storageAccountId property: If createOption is Import, the Azure
     * Resource Manager identifier of the storage account containing the blob
     * to import as a disk. Required only if the blob is in a different
     * subscription.
     * 
     * @param storageAccountId the storageAccountId value to set.
     * @return the CreationData object itself.
     */
    public CreationData withStorageAccountId(String storageAccountId) {
        this.storageAccountId = storageAccountId;
        return this;
    }

    /**
     * Get the imageReference property: The source image used for creating the
     * disk.
     * 
     * @return the imageReference value.
     */
    public ImageDiskReference imageReference() {
        return this.imageReference;
    }

    /**
     * Set the imageReference property: The source image used for creating the
     * disk.
     * 
     * @param imageReference the imageReference value to set.
     * @return the CreationData object itself.
     */
    public CreationData withImageReference(ImageDiskReference imageReference) {
        this.imageReference = imageReference;
        return this;
    }

    /**
     * Get the sourceUri property: If createOption is Import, this is the URI
     * of a blob to be imported into a managed disk.
     * 
     * @return the sourceUri value.
     */
    public String sourceUri() {
        return this.sourceUri;
    }

    /**
     * Set the sourceUri property: If createOption is Import, this is the URI
     * of a blob to be imported into a managed disk.
     * 
     * @param sourceUri the sourceUri value to set.
     * @return the CreationData object itself.
     */
    public CreationData withSourceUri(String sourceUri) {
        this.sourceUri = sourceUri;
        return this;
    }

    /**
     * Get the sourceResourceId property: If createOption is Copy, this is the
     * ARM id of the source snapshot or disk.
     * 
     * @return the sourceResourceId value.
     */
    public String sourceResourceId() {
        return this.sourceResourceId;
    }

    /**
     * Set the sourceResourceId property: If createOption is Copy, this is the
     * ARM id of the source snapshot or disk.
     * 
     * @param sourceResourceId the sourceResourceId value to set.
     * @return the CreationData object itself.
     */
    public CreationData withSourceResourceId(String sourceResourceId) {
        this.sourceResourceId = sourceResourceId;
        return this;
    }

    /**
     * Get the sourceUniqueId property: If this field is set, this is the
     * unique id identifying the source of this resource.
     * 
     * @return the sourceUniqueId value.
     */
    public String sourceUniqueId() {
        return this.sourceUniqueId;
    }

    /**
     * Get the uploadSizeBytes property: If createOption is Upload, this is the
     * size of the contents of the upload including the VHD footer. This value
     * should be between 20972032 (20 MiB + 512 bytes for the VHD footer) and
     * 35183298347520 bytes (32 TiB + 512 bytes for the VHD footer).
     * 
     * @return the uploadSizeBytes value.
     */
    public Long uploadSizeBytes() {
        return this.uploadSizeBytes;
    }

    /**
     * Set the uploadSizeBytes property: If createOption is Upload, this is the
     * size of the contents of the upload including the VHD footer. This value
     * should be between 20972032 (20 MiB + 512 bytes for the VHD footer) and
     * 35183298347520 bytes (32 TiB + 512 bytes for the VHD footer).
     * 
     * @param uploadSizeBytes the uploadSizeBytes value to set.
     * @return the CreationData object itself.
     */
    public CreationData withUploadSizeBytes(Long uploadSizeBytes) {
        this.uploadSizeBytes = uploadSizeBytes;
        return this;
    }
}
