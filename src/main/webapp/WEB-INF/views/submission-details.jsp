<%@page import="com.springmvc.model.ContactInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import= "com.springmvc.model.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details</title>
</head>
<body>
<% User u = (User)session.getAttribute("user") ;%>

<div class="user_table">
	
	<table>
		<tr>
		<td>First Name</td>
		<td><%= u.getfName() %></td>
		</tr>
		<tr>
		<td>Last Name</td>
		<td><%= u.getlName() %></td>
		</tr>
		<tr>
		<td>Username</td>
		<td><%= u.getUsername() %></td>
		</tr>
		<tr>
		<td>Gender</td>
		<td><%= u.getGender()%></td>
		</tr>
		<tr>
		<td>Phone</td>
		<td><%= u.getContactInfo().getPhone() %></td>
		</tr>
		<tr>
		<td>Email</td>
		<td><%= u.getContactInfo().getEmail() %></td>
		</tr>
		<tr>
		<td>LinkedInURL</td>
		<td><%= u.getContactInfo().getLinkedInURL() %></td>
		</tr>
		<tr>
		<td>SSN</td>
		<td><%= u.getPrivateInfo().getSsn() %></td>
		</tr>
		<tr>
		<td>CCN</td>
		<td><%= u.getPrivateInfo().getCcn() %></td>
		</tr>
		<tr>
		<td>Date of Birth</td>
		<td><%= u.getPrivateInfo().getDobString()%></td>
		</tr>
		
	</table>
</div>
</body>
</html>