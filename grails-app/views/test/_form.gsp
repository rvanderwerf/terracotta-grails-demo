<%@ page import="com.test.company.Test" %>



<div class="fieldcontain ${hasErrors(bean: testInstance, field: 'email', 'error')} ">
	<label for="email">
		<g:message code="test.email.label" default="Email" />
		
	</label>
	<g:textField name="email" value="${testInstance?.email}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: testInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="test.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${testInstance?.name}"/>
</div>

