<%@ include file="/WEB-INF/views/include.jsp"%>
<!DOCTYPE html>
<fmt:bundle basename="team">
    <html>
<head>
<title><fmt:message key="team.home.page.title" /></title>
<%@ include file="/WEB-INF/views/header-view.jspf"%>
</head>
<body>
<div>
    <h1>
        <fmt:message key="team.home.page.title" />
    </h1>
</div>
<div class="content">
    <div class="menu">
        <ul>
            <li><a href="./addteam.htm"><fmt:message key="team.add" /></a></li>
            <li><a href="./searchteam.htm"><fmt:message key="team.search" /></a></li>
        </ul>
    </div>
    <div class="resultlist">

    <table>
        <caption><fmt:message key="team.number" />${fn:length(model.teams)}</caption>
        <thead>
            <tr>
                <td><fmt:message key="team.header.id" /></td>
                <td><fmt:message key="team.header.name" /></td>
                <td><fmt:message key="team.header.category" /></td>
                <td></td>
            </tr>
        </thead>
        <c:if test="${fn:length(model.teams) gt 0}">
        <tbody>
            <c:forEach items="${model.teams}" var="team">
                <tr>
                        <td><span><c:out value="${team.id}" default=""/></span></td>
                        <td><span><c:out value="${team.name}" default="" escapeXml="true" /></span></td>
                        <td><span><c:out value="${team.category.name}" default="" escapeXml="true" /></span></td>
                        <td><span><fmt:message key="team.edit" /></span></td>
                </tr>
            </c:forEach>
         </tbody>
        </c:if>
    </table>
    </div>
</div>
</body>
    </html>
</fmt:bundle>