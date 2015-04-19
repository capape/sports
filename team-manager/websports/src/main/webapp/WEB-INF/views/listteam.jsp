<%@ include file="/WEB-INF/views/include.jsp"%>

<fmt:bundle basename="team">
	<html>
<head>
<title><fmt:message key="team.home.page.title" /></title>
<%@ include file="/WEB-INF/views/header-view.jspf"%>
</head>
<body>
	<h1>
		<fmt:message key="team.home.page.title" />
	</h1>
	<div class="<spring:theme code='menu'/>">
		<ul>
			<li><a href="./addteam.htm"></a><fmt:message key="team.add" /></a></li>
			<li><a href="./searchteam.htm"><fmt:message key="team.search" /></li>
		</ul>
	</div>
	<div class="<spring:theme code='resultlist'/>">
	<fmt:message key="team.number" />
	${fn:length(model.teams)}
	<ul>
		<li>
			<ul>
				<li><fmt:message key="team.header.id" /></li>
				<li><fmt:message key="team.header.name" /></li>
				<li><fmt:message key="team.header.category" /></li>
				<li></li>
			</ul>
		</li>
		<c:if test="${fn:length(model.teams) gt 0}">

			<c:forEach items="${model.teams}" var="team">
				<li>
					<ul>
						<li><c:out value="${team.id}" /></li>
						<li><c:out value="${team.name}" default="" escapeXml="true" /></li>
						<li><c:out value="${team.category.name}" default=""
								escapeXml="true" /></li>
						<li><span><fmt:message key="team.edit" /></span></li>
					</ul>
				</li>
			</c:forEach>
		</c:if>
	</ul>
    </div>

</body>
	</html>
</fmt:bundle>