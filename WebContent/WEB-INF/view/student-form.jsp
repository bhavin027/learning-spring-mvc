<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Student Registration Form</title>
		<style type="text/css">
			.error { color:red }
		</style>
	</head>
	<body>
		<form:form action="processForm" modelAttribute="student">
			
			First Name(*): <form:input path="firstName"/>
			<form:errors path="firstName" cssClass="error" />
			<br><br>
			Last Name: <form:input path="lastName" />
			<br><br>
			Years of Study: <form:input path="studyYears" />
			<form:errors path="studyYears" cssClass="error" />
			<br><br>
			Country: 
			<form:select path="country">
				<form:options items="${student.countryOptions}" />
			</form:select>
			<br><br>
			Postal Code: <form:input path="postalCode"/>
			<form:errors path="postalCode" cssClass="error" />
			<br><br>
			Favorite Language:
			Java <form:radiobutton path="favLanguage" value="Java" />
			PHP <form:radiobutton path="favLanguage" value="PHP" />
			C# <form:radiobutton path="favLanguage" value="C#" />
			Python <form:radiobutton path="favLanguage" value="Python" />
			<br><br>
			Operating Systems:
			Linux <form:checkbox path="operatingSystems" value="Linux" />
			MS Windows <form:checkbox path="operatingSystems" value="MS Windows" />
			Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
			<br><br>
			<input type="submit" value="Submit" />
		</form:form>
	</body>
</html>