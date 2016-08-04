<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<jsp:useBean id="userName" class="java.lang.String" scope="request"/>

<portlet:defineObjects />

<p>This is the hello of you portlet</p>
<p>Hello <%=userName%>!</p>