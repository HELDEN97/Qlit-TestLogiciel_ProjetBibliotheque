<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Connexion Gestionnaire</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>

	<header>
        <h1>Connexion Gestionnaire</h1>
    </header>
    <main>
        <form id="login-form">
            <label for="login-email">Email:</label>
            <input type="email" id="email" name="email" required>
            <label for="login-password">Mot de Passe:</label>
            <input type="password" id="password" name="password" required>
            <button type="submit" id="login-button">Se Connecter</button>
        </form>
    </main>
    <footer>
        <a href="accueil.jsp">Accueil</a>
    </footer>
    <script src="script.js"></script>
    
</body>
</html>