/*
 *  Copyright (c) 2005-2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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
package org.wso2.carbon.internal.clustering;

import org.wso2.carbon.clustering.ClusterMember;
import org.wso2.carbon.clustering.ClusterMessage;
import org.wso2.carbon.clustering.api.Cluster;
import org.wso2.carbon.clustering.exception.MessageFailedException;
import org.wso2.carbon.clustering.spi.ClusteringAgent;
import org.wso2.carbon.internal.DataHolder;

import java.util.Collections;
import java.util.List;

/**
 * The cluster api implementation
 */
public class CarbonCluster implements Cluster {

    private ClusteringAgent clusteringAgent;

    public CarbonCluster(ClusteringAgent clusteringAgent) {
        this.clusteringAgent = clusteringAgent;
    }

    @Override
    public void sendMessage(ClusterMessage clusterMessage) throws MessageFailedException {
        clusteringAgent.sendMessage(clusterMessage);
    }

    @Override
    public void sendMessage(ClusterMessage clusterMessage, List<ClusterMember> members)
            throws MessageFailedException {
        clusteringAgent.sendMessage(clusterMessage, members);
    }

    @Override
    public List<ClusterMember> getMembers() {
        ClusterContext clusterContext = DataHolder.getInstance().getClusterContext();
        return Collections.unmodifiableList(clusterContext.getClusterMembers());
    }
}
