<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:bundle basename="team" >
<html>
  <head><title><fmt:message key="team.home.page.title"/></title></head>
  <body>
    <h1><fmt:message key="team.home.page.title" /></h1>

    <fmt:message key="team.number"/> ${ model.size }
  </body>
</html>
</fmt:bundle>