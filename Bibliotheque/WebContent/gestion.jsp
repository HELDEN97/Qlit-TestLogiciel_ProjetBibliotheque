<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gestion des Livres</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
	<header>
        <h1>Gestion des Livres</h1>
    </header>
    <main>
        <h2>Mettre à jour le statut d'un livre</h2>
        <form id="update-book-form">
            <label for="book-id">ID du Livre:</label>
            <input type="text" id="book-id" name="book-id">
            <label for="status">Statut:</label>
            <select id="status" name="status">
                <option value="disponible">Disponible</option>
                <option value="emprunté">Emprunté</option>
                <option value="réservé">Réservé</option>
            </select>
            <label for="date-sortie">Date de Sortie:</label>
            <input type="date" id="date-sortie" name="date-sortie">
            <label for="date-retour">Date de Retour:</label>
            <input type="date" id="date-retour" name="date-retour">
            <button type="submit" id="submit-button">Mettre à jour</button>
        </form>

        <h2>Enregistrer un retour de livre</h2>
        <form id="return-book-form">
            <label for="return-book-id">ID du Livre:</label>
            <input type="text" id="return-book-id" name="return-book-id">
            <label for="etat">État du Livre:</label>
            <input type="text" id="etat" name="etat">
            <button type="submit">Enregistrer Retour</button>
        </form>
    </main>
    <footer>
        <a href="accueil.jsp">Accueil</a>
        <a href="utilisateur.jsp">Gestion des Utilisateurs</a>
        <button id="logout-button">Se Déconnecter</button>
    </footer>
    <script src="script.js"></script>

</body>
</html>