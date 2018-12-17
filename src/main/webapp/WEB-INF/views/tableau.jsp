<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>tableau de bord</title>
</head>
<body>
	<h1>Bienvenue sur votre tableau de bord</h1>
	<div>
		<label for="comptes">Liste de vos comptes</label> <select id="comptes"
			name="comptes">
			<option value="">----</option>
			<c:forEach var="comptes" items="${account}">
				<option id="${chocoType.id}" value="${chocoType.value}">${chocoType.label}</option>

			</c:forEach>
		</select>
		<div id="stockinfo"></div>
	</div>
</body>
</html>