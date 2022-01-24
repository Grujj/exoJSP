<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Commande</title>
</head>
<body>
	<h1>Commande</h1>
	<div>
		<h2>Client</h2>
		<p>Nom : <%= request.getParameter("nomClient") %></p>
    	<p>Prénom : <%= request.getParameter("prenomClient") %><p>
    	<p>Adresse : <%= request.getParameter("adresseClient") %></p>
    	<p>Numéro de téléphone : <%= request.getParameter("telephoneClient") %> </p>
    	<p>Email : <%= request.getParameter("emailClient") %></p>
	</div>
	<div>
		<h2>Commande</h2>
		<p>Date : <%= request.getParameter("dateCommande") %></p>
    	<p>Montant : <%= request.getParameter("montantCommande") %></p>
    	<p>Mode de paiement : <%= request.getParameter("modePaiementCommande") %></p>
    	<p>Statut du paiement : <%= request.getParameter("statutPaiementCommande") %></p>
    	<p>Mode de livraison : <%= request.getParameter("modeLivraisonCommande") %></p>
    	<p>Statut de la livraison : <%= request.getParameter("statutLivraisonCommande") %></p>
	</div>
</body>
</html>