package terracotta.grails.demo

import org.terracotta.toolkit.*
import org.terracotta.toolkit.cluster.ClusterInfo;

class StatusController {

    def show() {
        // A configuration source must be specified in the argument.
        // In this case the source is a server and its configured port.
        Toolkit toolkit = ToolkitFactory.createToolkit("toolkit:terracotta://localhost:9510")
        ClusterInfo clusterInfo = toolkit.getClusterInfo()
        LinkedHashMap status = new LinkedHashMap()
        status.put("currentNode",clusterInfo.currentNode)
        status.put("nodeList",clusterInfo.nodes)
        status.put("topology",clusterInfo.dsoCluster.topology)
        return [status:status]

    }
}
