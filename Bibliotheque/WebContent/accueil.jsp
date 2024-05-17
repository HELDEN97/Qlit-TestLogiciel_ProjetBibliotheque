<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bibliothèque</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>

	<header>
        <h1>Bibliothèque</h1>
    </header>
    <main>
        <h2>Rechercher un Livre</h2>
        <form id="search-form">
            <label for="titre">Titre:</label>
            <input type="text" id="titre" name="titre">
            <label for="auteur">Auteur:</label>
            <input type="text" id="auteur" name="auteur">
            <label for="isbn">ISBN:</label>
            <input type="text" id="isbn" name="isbn">
            <button type="submit">Rechercher</button>
        </form>
        <div id="search-results"></div>
    </main>
    <footer>
        <div id="admin-buttons" style="display: none;">
            <a href="gestion.jsp" id="Gestion_des_Livres">Gestion des Livres</a>
            <a href="utilisateur.jsp" id="Gestion_des_Utilisateurs">Gestion des Utilisateurs</a>
        </div>
        <a href="connexion.jsp" id="login-link">Connexion Gestionnaire</a>
        <button id="logout-button" style="display: none;">Se Déconnecter</button>
    </footer>
    <script src="script.js"></script>

</body>
</html>