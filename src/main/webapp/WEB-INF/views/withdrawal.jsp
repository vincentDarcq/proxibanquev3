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
	<h1 class="page-title">Effectuer un Retrait de liquide</h1>


	<c:if test="${not empty withdrawRate}">
		<h1 class="page-title">Erreur : Le retrait est impossible</h1>
	</c:if>

	<form method="post" action="">
		<div class="centered-input">
			<div>
				<label for="value" class="text"> Montant du retrait : </label> <input
					type="number" step=0.1 name="value" id="value"
					style="margin-left: 0.5em;">
				<button style="margin-left: 2em;" class="button">Confirmer</button>
			</div>
		</div>
	</form>


	<div class="footer-button">
		<a href="/proxibanquev3/client.html?id=${client.id}">
			<button class="button">Retour � l'accueil</button>
		</a>
	</div>

</body>
</html>
