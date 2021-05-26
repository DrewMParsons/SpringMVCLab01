<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib  uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">

<title>Welcome</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/styles/main.css"></link>
</head>
<body>
	<div class="container">
		<form:form action="process-form" method="POST" modelAttribute="user">
			<div class="field">
				<label for="first_name">First Name</label> 
				<form:input id="fName" path="fName"
					type="text" placeholder="Enter your first name" />
				<form:errors path="fName" cssClass="error"/>
			</div>
			<div class="field">
				<label for="last_name">Last Name</label> 
				<form:input id="lName" path="lName"
					type="text" placeholder="Enter your last name" />
				<form:errors path="lName" cssClass="error"/>	
			</div>
			<div class="field">
				<label for="username">Username</label> 
				<form:input id="username" path="username"
					type="text" placeholder="Enter your Username" />
				<form:errors path="username" cssClass="error"/>
			</div>
			<div class="field">
				<label for="gender">Gender</label> 
				<input type="radio" id="male" name="gender" value="male">
				<label for="male">Male</label><br>
				<input type="radio" id="female" name="gender" value="female">
				<label for="female">Female</label><br>
				<input type="radio" id="other" name="gender" value="other">
				<label for="other">Other</label>
			</div>
			<div class="field">
				<label for="phone">Phone</label> 
				<form:input id="phone" path="contactInfo.phone"
					type="number" placeholder="Enter your Phone Number" />
					<form:errors cssClass="error" path="contactInfo.phone" />
			</div>
			<div class="field">
				<label for="email">Email</label> 
				<form:input id="email" path="contactInfo.email"
					type="text" placeholder="Enter your Email" />
					<form:errors cssClass="error" path="contactInfo.email" />
			</div>
			<div class="field">
				<label for="linkedInURL">linkedIn URL</label> 
				<form:input id="linkedInURL" path="contactInfo.linkedInURL"
					type="text" placeholder="Enter your linkedIn URL" />
	
			</div>
			
			<div class="field">
				<label for="ssn">SSN</label> 
				<form:input id="ssn" path="privateInfo.ssn"
					type="number" placeholder="Enter your SSN" />
					<form:errors cssClass="error" path="privateInfo.ssn" />
			</div>
			<div class="field">
				<label for="ccn">Credit Card</label> 
				<form:input id="ccn" path="privateInfo.ccn"
					type="number" placeholder="Enter your credit card" />
					<form:errors cssClass="error" path="privateInfo.ccn" />
			</div>
			<div class="field">
				<label for="dob">Date of Birth</label> 
				<form:input id="dob" path="privateInfo.dob"
					type="date" placeholder="Enter your Date of Birth" />
					<form:errors cssClass="error" path="privateInfo.dob" />
			</div>
			<div class="btn">
				<input id="sub" name="submit"
					type="submit" value="Submit Name" />
			</div>
		</form:form>
	</div>
</body>
</html>