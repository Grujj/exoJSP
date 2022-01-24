<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Client</title>
</head>
	<body>
        <p>Nom : <%= request.getParameter("nomClient") %></p>
        <p>Prénom : <%= request.getParameter("prenomClient") %><p>
        <p>Adresse : <%= request.getParameter("adresseClient") %></p>
        <p>Numéro de téléphone : <%= request.getParameter("telephoneClient") %> </p>
        <p>Email : <%= request.getParameter("emailClient") %></p>
    </body>
</html>