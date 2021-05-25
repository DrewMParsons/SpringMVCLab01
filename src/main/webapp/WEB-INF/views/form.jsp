<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Welcome</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/styles/main.css"></link>
</head>
<body>
	<div class="container">
		<form action="process-form" method="POST">
			<div class="field">
				<label for="first_name">First Name</label> 
				<input id="fName" name="fName"
					type="text" placeholder="Enter your first name" />
			</div>
			<div class="field">
				<label for="last_name">Last Name</label> 
				<input id="lName" name="lName"
					type="text" placeholder="Enter your last name" />
			</div>
			<div class="field">
				<label for="username">Username</label> 
				<input id="username" name="username"
					type="text" placeholder="Enter your Username" />
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
				<input id="phone" name="contactInfo.phone"
					type="text" placeholder="Enter your Phone Number" />
			</div>
			<div class="field">
				<label for="email">Email</label> 
				<input id="email" name="contactInfo.email"
					type="text" placeholder="Enter your Email" />
			</div>
			<div class="field">
				<label for="linkedInURL">linkedIn URL</label> 
				<input id="linkedInURL" name="contactInfo.linkedInURL"
					type="text" placeholder="Enter your linkedIn URL" />
			</div>
			
			<div class="field">
				<label for="ssn">SSN</label> 
				<input id="ssn" name="privateInfo.ssn"
					type="password" placeholder="Enter your SSN" />
			</div>
			<div class="field">
				<label for="ccn">Credit Card</label> 
				<input id="ccn" name="privateInfo.ccn"
					type="password" placeholder="Enter your credit card" />
			</div>
			<div class="field">
				<label for="dob">Date of Birth</label> 
				<input id="dob" name="privateInfo.dob"
					type="date" placeholder="Enter your Date of Birth" />
			</div>
			<div class="btn">
				<input id="sub" name="submit"
					type="submit" value="Submit Name" />
			</div>
		</form>
	</div>
</body>
</html>