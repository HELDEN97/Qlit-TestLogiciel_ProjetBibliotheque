<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gestion des Utilisateurs</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>

	<header>
        <h1>Gestion des Utilisateurs</h1>
    </header>
    <main>
        <h2>Créer un Nouvel Utilisateur</h2>
        <form id="create-user-form">
            <label for="user-name">Nom:</label>
            <input type="text" id="user-name" name="user-name" required>
            <label for="user-email">Email:</label>
            <input type="email" id="user-email" name="user-email" required>
            <label for="user-password">Date de naissance:</label>
            <input type="date" id="Date de naissance" name="Date de naissance" required>
            <button type="submit">Créer Utilisateur</button>
        </form>

        <h2>Modifier un Utilisateur</h2>
        <form id="update-user-form">
            <label for="update-user-id">ID de l'Utilisateur:</label>
            <input type="text" id="update-user-id" name="update-user-id" required>
            <label for="update-user-name">Nom:</label>
            <input type="text" id="update-user-name" name="update-user-name" required>
            <label for="update-user-email">Email:</label>
            <input type="email" id="update-user-email" name="update-user-email" required>
            <label for="update-user-password">Date de naissance:</label>
            <input type="date" id="update-Date de naissance" name="update-Date de naissance" required>
            <button type="submit">Modifier Utilisateur</button>
        </form>
    </main>
    <footer>
        <a href="accueil.jsp">Accueil</a>
        <a href="gestion.jsp">Gestion des Livres</a>
        <button id="logout-button">Se Déconnecter</button>
    </footer>
    <script src="script.js"></script>
    
</body>
</html>