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
        <p>Pr�nom : <%= request.getParameter("prenomClient") %><p>
        <p>Adresse : <%= request.getParameter("adresseClient") %></p>
        <p>Num�ro de t�l�phone : <%= request.getParameter("telephoneClient") %> </p>
        <p>Email : <%= request.getParameter("emailClient") %></p>
    </body>
</html>