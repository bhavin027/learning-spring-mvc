<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Student Registration Form</title>
	</head>
	<body>
		<form:form action="processForm" modelAttribute="student">
			
			First Name: <form:input path="firstName"/>
			<br><br>
			Last Name: <form:input path="lastName" />
			<br><br>
			Country: 
			<form:select path="country">
				<form:options items="${student.countryOptions}" />
			</form:select>
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