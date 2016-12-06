<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:url value="/logout" var="logout" />
<ul>
	<c:if test="${not empty sessionScope.USERSESSION.user.userID}">
		<h1>Adi Jada</h1>
	</c:if>

</ul>

