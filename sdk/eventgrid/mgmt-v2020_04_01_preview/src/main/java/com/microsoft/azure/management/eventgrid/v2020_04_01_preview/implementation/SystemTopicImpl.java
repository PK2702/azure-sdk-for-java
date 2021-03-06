/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_04_01_preview.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.SystemTopic;
import rx.Observable;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.ResourceProvisioningState;

class SystemTopicImpl extends GroupableResourceCoreImpl<SystemTopic, SystemTopicInner, SystemTopicImpl, EventGridManager> implements SystemTopic, SystemTopic.Definition, SystemTopic.Update {
    SystemTopicImpl(String name, SystemTopicInner inner, EventGridManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<SystemTopic> createResourceAsync() {
        SystemTopicsInner client = this.manager().inner().systemTopics();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<SystemTopic> updateResourceAsync() {
        SystemTopicsInner client = this.manager().inner().systemTopics();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<SystemTopicInner> getInnerAsync() {
        SystemTopicsInner client = this.manager().inner().systemTopics();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String metricResourceId() {
        return this.inner().metricResourceId();
    }

    @Override
    public ResourceProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String source() {
        return this.inner().source();
    }

    @Override
    public String topicType() {
        return this.inner().topicType();
    }

    @Override
    public SystemTopicImpl withSource(String source) {
        this.inner().withSource(source);
        return this;
    }

    @Override
    public SystemTopicImpl withTopicType(String topicType) {
        this.inner().withTopicType(topicType);
        return this;
    }

}
