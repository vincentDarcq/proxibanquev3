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
<title>Cr�ation de carte</title>

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

<body id="page-top">

	<!-- Header -->
	
	<header class="masthead">
	
		<div class="container">
			<div class="intro-text"
				style="padding-top: 150px;">
				<div class="intro-lead-in">Bienvenue sur le syst�me
					d'information</div>
				<div class="intro-heading text-uppercase">PROXIBANQUE</div>
			</div>
		</div>
		
	</header>
	<!-- Footer -->

	<div class="footer-button" style="margin-left:1700px">
				<a href="index.html">
					<button class="button">Se D�connecter</button>
				</a>
			</div>

		<h1>Quel type de cate souhaitez vous s�lectionner ?</h1>
		
		<form method="post" action="">
			
			<div class="selection">
			<label for="carte">Type de carte</label>
			<select class="menu" id="carte"  name="carte">
				<option label="----" value="" />
				<c:forEach var="cardType" items="${card.type}">
					<option class="cardOption" id="${card.id}" label="${carte.type}" />
				</c:forEach>
			</select>
			<div id ="stockinfo"></div>
			</div>
			<button id ="button">Commander</button>
		</form>	
		<!-- Footer -->

	<footer>
		<div class="container">
			<div class="row">
				<div class="col-md-4">
					<span class="copyright">Copyright &copy; Proxibanque 2018</span>
				</div>
				<div class="col-md-4">
					<ul class="list-inline quicklinks">
						<li class="list-inline-item"><a href="#">Privacy Policy</a></li>
						<li class="list-inline-item"><a href="#">Terms of Use</a></li>
					</ul>
				</div>
			</div>
		</div>
	</footer>

</body>
</html>