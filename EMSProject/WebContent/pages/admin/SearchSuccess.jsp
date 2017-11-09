<%@ include file = "AdminHeader.jsp" %>

<br/>
<hr/>
<br/>
<div class="w3-container">

<table class="w3-table-all w3-hoverable">
<thead>
<tr class="w3-teal">
<td>Employee Id </td>
<td>First Name</td>
<td>Last Name </td>
<td>Department Name</td>
<td>Designation Name</td>
<td>Grade</td>
<td>Contact No</td>
<td>Pincode</td>
</tr>
</thead>

<c:forEach items = "${listofEmpl}" var ="list">
<tr>
	<td><c:out value="${list.empId}"><br/></c:out></td>
	<td><c:out value="${list.firstName}"><br/></c:out></td>
	<td><c:out value="${list.lastName}"><br/></c:out></td>
	
		<c:forEach items="${listDept}" var="dept">
				<c:if test="${list.deptId == dept.deptId}">
					<td><c:out value="${dept.deptName}"><br/></c:out></td>
				</c:if>
		</c:forEach>	
		
		<c:forEach items="${listDesig}" var="design">
				<c:if test="${list.designationId == design.desigId}">
					<td><c:out value="${design.desigName}"><br/></c:out></td>
				</c:if>
		</c:forEach>
			
	<td><c:out value="${list.grade}"><br/></c:out></td>
	<td><c:out value="${list.contactNo}"><br/></c:out></td>
	<td><c:out value="${list.getPincode()}"><br/></c:out></td>
	
</tr>
</c:forEach>

</table>

</div>

<br/>
<br/>
<br/>


<%@ include file = "AdminFooter.jsp" %>