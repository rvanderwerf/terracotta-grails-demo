
<%@ page import="com.test.company.Test" %>
<!doctype html>
<html>
<head>
    <meta name="layout" content="main">
    <g:set var="entityName" value="${message(code: 'test.label', default: 'Test')}" />
    <title><g:message code="default.show.label" args="[entityName]" /></title>
</head>
<body>
<a href="#show-test" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
<div id="show-test" class="content scaffold-show" role="main">
    <h1>Current Nodes</h1>
    <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
    </g:if>
    <ul class="property-list test">

        <g:if test="${status?.currentNode}">
            <li class="fieldcontain">
                <span id="email-label" class="property-label">Current Node</span>

                <span class="property-value" aria-labelledby="email-label">ID:${status?.currentNode.id}</span>
                <span class="property-value" aria-labelledby="email-label">IP:${status?.currentNode.ip}</span>
                <span class="property-value" aria-labelledby="email-label">HOST:${status?.currentNode.hostname}</span>
            </li>
        </g:if>

        <g:if test="${status?.nodeList}">
            <li class="fieldcontain">
                <span id="email-label" class="property-label">BigMemory Node List</span>
                <g:each in="${status.nodeList}" var="node">
                    <span class="property-value" aria-labelledby="email-label">ID:${node?.id}</span>
                    <span class="property-value" aria-labelledby="email-label">IP:${node?.ip}</span>
                    <span class="property-value" aria-labelledby="email-label">HOST:${node?.hostname}</span>
                </g:each>

            </li>
        </g:if>
        <g:if test="${status?.topology}">
            <li class="fieldcontain">
                <span id="email-label" class="property-label">BigMemory Topology</span>
                <g:each in="${status.topology.nodes}" var="node">
                    <span class="property-value" aria-labelledby="email-label">ID:${node?.id}</span>
                    <span class="property-value" aria-labelledby="email-label">CHANNEL:${node?.channelId}</span>
                    <span class="property-value" aria-labelledby="email-label">IP:${node?.metaData.ip}</span>
                </g:each>

            </li>
        </g:if>
        <li>
        <span id="email-label" class="property-label">BigMemory Cluster Status</span>
        </li>
        <li>
            <span class="property-value" aria-labelledby="email-label">Cluster State: ${status.clusterState}</span>



    </li>
      %{--  <g:if test="${testInstance?.name}">
            <li class="fieldcontain">
                <span id="name-label" class="property-label"><g:message code="test.name.label" default="Name" /></span>

                <span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${testInstance}" field="id"/></span>

            </li>
        </g:if>--}%

    </ul>

</div>
</body>
</html>
