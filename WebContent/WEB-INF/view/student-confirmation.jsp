<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Student Confirmation</title>
	</head>
	<body>
		The Student Confirmed: ${student.firstName} ${student.lastName}
		<br><br>
		Country: ${student.country}
		<br><br>
		Postal Code: ${student.postalCode}
		<br><br>
		Years of Study: ${student.studyYears}
		<br><br>
		Course Code: ${student.courseCode}
		<br><br>
		Favorite Language: ${student.favLanguage}
		<br><br>
		Operating Systems:
		<ul>
			<c:forEach var="temp" items="${student.operatingSystems}" >
				<li>${temp}</li>
			</c:forEach>
		</ul>
	</body>
</html>