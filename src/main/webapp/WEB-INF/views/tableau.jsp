<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<title>Outil de virement</title>

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


<body id="page-top">


	<div class="footer-button" style="margin-left:1700px">
				<a href="index.html">
					<button class="button">Se Déconnecter</button>
				</a>
			</div>
		<section class="account-body">
			<div class="header-account">
				<h1 class="page-title">Liste des comptes de ${client.firstname} ${client.lastname }</h1>
	<!--			<div style="text-align:center;display:inline;margin:50px">
				<div class="transfer-button">
					<a href="transfer.html?id=${id}">
						<button class="button">Faire un virement</button>
						
					</a>
				</div>
				<div class="transfer-button">
					<a href="card.html?id=${id}">
						<button class="button">Commander une carte</button>
						
					</a>
				</div>
				<div class="transfer-button">
					<a href="cheque.html?id=${id}">
						<button class="button">Commander un chequier</button>
						
					</a>
				</div>
				</div>
			</div>  
			<div class="account-list">
				<div class="left-list">
				<h2>Liste des comptes courant </h2>


	<section class="account-body">
		<div class="header-account">
			<h1 class="page-title">Liste des comptes de ${client.firstname}
				${client.lastname }</h1>

		</div>
		
		-->
							<div>
								<a href="transfer.html?id=${id}">
									<button class="button">Faire un virement</button>
								</a>
							</div>
		
		<div class="account-list">
			<div class="left-list">
				<h2>Liste des comptes courant</h2>

				<c:if test="${empty currentAccounts}">
					<h4>Aucun compte associé à ce client.</h4>
				</c:if>
				<c:if test="${not empty currentAccounts}">
				<!-- 
					<c:forEach var="CurrentAccount" items="${currentAccounts}">
						<p class="name">Numéro XXX de compte : ${currentAccount.number}</p>
						<p class="text">Solde de compte : ${currentAccount.balance}</p>
						<p class="text">Date d'ouverture du compte :
							${currentAccount.openningDate}</p>
						<p class="text">Label du compte : ${currentAccount.label}</p>
						<div class="button-container">
							<div>
								<a href="Card.html?id=${currentAccount.id}">
									<button class="button">Commander une carte</button>
								</a>
							</div>
							<div>
								<a href="Cheque.html?id=${currentAccount.id}">
									<button class="button">Commander un cheque</button>
								</a>
							</div>
							<div>
								<a href="withdrawal.html?id=${currentAccount.id}">
									<button class="button">Faire un retrait</button>
								</a>
							</div>
						</div>
					</c:forEach>
					
					-->
					
					<table>
						<tr>
							<th>Numero de compte</th>
							<th class="balance">Solde en &#8364</th>
						</tr>
						<c:forEach var="currentAccount" items="${currentAccounts }">
							<tr class="data">
								<td>${currentAccount.number}</td>
								<td class="balance">${currentAccount.balance}</td>
							</tr>
							
						</c:forEach>
						<div class="button-container">
							<div>
								<a href="Card.html?id=${currentAccount.id}">
									<button class="button">Commander une carte</button>
								</a>
							</div>
							<div>
								<a href="Cheque.html?id=${currentAccount.id}">
									<button class="button">Commander un cheque</button>
								</a>
							</div>
							<div>
								<a href="withdrawal.html?id=${currentAccount.id}">
									<button class="button">Faire un retrait</button>
								</a>
							</div>
						</div>
					</table>
				</c:if>
			</div>
			<div class="right-list">
				<h2>Liste des comptes epargne</h2>
				<c:if test="${empty savingAccounts}">
					<h4>Aucun compte associé à ce client.</h4>
				</c:if>
				<c:if test="${not empty savingAccounts}">
					<table>
						<tr>
							<th>Numero de compte</th>
							<th class="balance">Solde en &#8364</th>
						</tr>
						<c:forEach var="savingAccount" items="${savingAccounts }">
							<tr class="data">
								<td>${savingAccount.number}</td>
								<td class="balance">${savingAccount.balance}</td>
							</tr>
						</c:forEach>
					</table>

					</c:if>
				</div>
			</div>
			
		</section>
		
		<!-- Footer -->

			
			</div>
		</div>
		<div class="footer-button">
			<a href="index.html">
				<button class="button">Retour à l'accueil</button>
			</a>
		</div>
	</section>

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