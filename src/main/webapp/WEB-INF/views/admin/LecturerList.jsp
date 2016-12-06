
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<h3>Lecturer List Page</h3>
<a href="${pageContext.request.contextPath}/admin/user/create">Add
	Lecturer</a>
<c:if test="${fn:length(LecturerList) gt 0}">
	<table style="cellspacing: 2; cellpadding: 2; border: 1;">
		<thead>
			<tr class="listHeading">
				<th><spring:message code="fieldLabel.LecturerID" /></th>
				<th><spring:message code="fieldLabel.UserID" /></th>
				<th><spring:message code="fieldLabel.LecturerName" /></th>
				<th><spring:message code="fieldLabel.LecturerFacultyID" /></th>
				<th><spring:message code="fieldLabel.LecturerDepartmentID" /></th>
				<th><spring:message code="fieldLabel.Status" /></th>
				<th><spring:message code="fieldLabel.Gender" /></th>
				<th><spring:message code="fieldLabel.DOB" /></th>
				<th><spring:message code="fieldLabel.Email" /></th>
				<th><spring:message code="fieldLabel.Address" /></th>
				<th><spring:message code="fieldLabel.EmployedDate" /></th>
				<th><spring:message code="caption.edit" /></th>
				<th><spring:message code="caption.delete" /></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="lec" items="${lecList}">
				<tr class="listRecord">
					<td>${lec.lecturerID}</td>
					<td>${lec.userID}</td>
					<td>${lec.lecturerName}</td>
					<td>${lec.lecturerFacultyID}</td>
					<td>${lec.lecturerDepartmentID}</td>
					<td>${lec.status}</td>
					<td>${lec.gender}</td>
					<td>${lec.dob}</td>
					<td>${lec.email}</td>
					<td>${lec.address}</td>
					<td>${lec.employedDate}</td>
					
					<!--  <td align="center"><a	
						href="${pageContext.request.contextPath}/admin/user/edit/${user.userId}.html"><spring:message
								code="caption.edit" /></a></td>
					<td><a
						href="${pageContext.request.contextPath}/admin/user/delete/${user.userId}.html"><spring:message
								code="caption.delete" /></a></td> -->
				</tr>
			</c:forEach>
		</tbody>
	</table>
</c:if>