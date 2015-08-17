/*
 *  Copyright (c) 2005-2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */

package org.wso2.carbon.internal;

import org.osgi.framework.BundleContext;
import org.wso2.carbon.internal.clustering.CarbonCluster;
import org.wso2.carbon.internal.clustering.ClusterContext;
import org.wso2.carbon.internal.runtime.RuntimeManager;

public class DataHolder {
    private BundleContext bundleContext;

    private static DataHolder instance = new DataHolder();
    private CarbonCluster carbonCluster;
    private ClusterContext clusterContext;

    private RuntimeManager runtimeManager = null;

    public static DataHolder getInstance() {
        return instance;
    }

    public BundleContext getBundleContext() {
        return bundleContext;
    }

    public void setBundleContext(BundleContext bundleContext) {
        this.bundleContext = bundleContext;
    }

    public void setCarbonCluster(CarbonCluster carbonCluster) {
        this.carbonCluster = carbonCluster;
    }

    public CarbonCluster getCarbonCluster() {
        return carbonCluster;
    }

    public ClusterContext getClusterContext() {
        return clusterContext;
    }

    public void setClusterContext(ClusterContext clusterContext) {
        this.clusterContext = clusterContext;
    }


    /**
     * Getter method of RuntimeManager instance
     *
     * @return
     */
    public RuntimeManager getRuntimeManager() {
        return runtimeManager;
    }

    /**
     * setter method of RuntimeManager
     *
     * @param runtimeManager - RuntimeManager instance to be set
     */
    public void setRuntimeManager(RuntimeManager runtimeManager) {
        this.runtimeManager = runtimeManager;
    }
}
