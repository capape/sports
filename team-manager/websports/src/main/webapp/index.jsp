<%@ include file="/WEB-INF/views/include.jsp"%>
<%-- Redirected because we can't set the welcome page to a virtual URL. --%>
<fmt:bundle basename="team">
<html>

<body>
	<h1>
		<fmt:message key="title.main.page" />
	</h1>
	<ul>
		<li><a href="./team.htm"><fmt:message key="index.teams" /></a>
		</li>
		
		<li><a href="./players.htm"><fmt:message key="index.players" /></a>
		</li>

		<li><a href="./coach.htm"><fmt:message key="index.coach" /></a>
		</li>

	</ul>
</body>
	</html>
</fmt:bundle>

