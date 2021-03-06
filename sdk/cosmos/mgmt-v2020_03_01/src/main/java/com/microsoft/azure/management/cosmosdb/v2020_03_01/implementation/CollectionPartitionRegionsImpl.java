/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.cosmosdb.v2020_03_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.CollectionPartitionRegions;
import rx.functions.Func1;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.PartitionMetric;

class CollectionPartitionRegionsImpl extends WrapperImpl<CollectionPartitionRegionsInner> implements CollectionPartitionRegions {
    private final CosmosDBManager manager;

    CollectionPartitionRegionsImpl(CosmosDBManager manager) {
        super(manager.inner().collectionPartitionRegions());
        this.manager = manager;
    }

    public CosmosDBManager manager() {
        return this.manager;
    }

    @Override
    public Observable<PartitionMetric> listMetricsAsync(String resourceGroupName, String accountName, String region, String databaseRid, String collectionRid, String filter) {
        CollectionPartitionRegionsInner client = this.inner();
        return client.listMetricsAsync(resourceGroupName, accountName, region, databaseRid, collectionRid, filter)
        .flatMap(new Func1<List<PartitionMetricInner>, Observable<PartitionMetricInner>>() {
            @Override
            public Observable<PartitionMetricInner> call(List<PartitionMetricInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<PartitionMetricInner, PartitionMetric>() {
            @Override
            public PartitionMetric call(PartitionMetricInner inner) {
                return new PartitionMetricImpl(inner, manager());
            }
        });
    }

}
