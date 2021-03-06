<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<title>Transfert effectue</title>

<!-- Bootstrap core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom fonts for this template -->
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700"
	rel="stylesheet" type="text/css">
<link href='https://fonts.googleapis.com/css?family=Kaushan+Script'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700'
	rel='stylesheet' type='text/css'>

<!-- Custom styles for this template -->
<link href="css/agency.min.css" rel="stylesheet">
<link href="css/index.css" rel="stylesheet">
</head>
<body>


	<section class="head"></section>
	
	<div class="footer-button" style="margin-left:1700px">
				<a href="index.html">
					<button class="button">Se Déconnecter</button>
				</a>
			</div>
	<h1 class="page-title">Commander une carte</h1>


	<c:if test="${not empty createRate}">
		<h1 class="page-title">Erreur : La commande est impossible</h1>
	</c:if>

	<form method="post" action="">
		<div class="centered-input">
		<label for="choco">Type de carte</label>
			<select class="menu" id="card"  name="card">
				<option label="Visa electron" value="electron" />
				<option label="Visa premier" value="premier" />
			</select>
			<div id ="stockinfo"></div>
		
			<button id ="button">Commander</button>
		</div>
	</form>


	<div class="footer-button">
		<a href="/proxibanquev3/tableau.html?id=${client.id}">
			<button class="button">Retour au tableau de bord</button>
		</a>
	</div>

</body>
</html>