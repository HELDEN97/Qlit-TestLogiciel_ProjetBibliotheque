document.addEventListener('DOMContentLoaded', function() {
    // Vérifie si le gestionnaire est connecté
    function checkLoginStatus() {
        const isLoggedIn = sessionStorage.getItem('isLoggedIn') === 'true';
        const adminButtons = document.getElementById('admin-buttons');
        const loginLink = document.getElementById('login-link');
        const logoutButton = document.getElementById('logout-button');

        if (isLoggedIn) {
            adminButtons.style.display = 'block';
            loginLink.style.display = 'none';
            logoutButton.style.display = 'block';
        } else {
            adminButtons.style.display = 'none';
            loginLink.style.display = 'block';
            logoutButton.style.display = 'none';
        }
    }

    // Gestion de la soumission du formulaire de connexion
    const loginForm = document.getElementById('login-form');
    if (loginForm) {
        loginForm.addEventListener('submit', function(event) {
            event.preventDefault();
            const email = document.getElementById('login-email').value;
            const password = document.getElementById('login-password').value;

            // Vérification simple des informations de connexion
            if (email === 'veyrat.marine@gmail.com' && password === '123') {
                sessionStorage.setItem('isLoggedIn', 'true');
                alert('Connexion réussie!');
                window.location.href = 'accueil.jsp';
            } else {
                alert('Email ou mot de passe incorrect.');
            }
        });
    }

    // Gestion de la déconnexion
    const logoutButton = document.getElementById('logout-button');
    if (logoutButton) {
        logoutButton.addEventListener('click', function() {
            sessionStorage.removeItem('isLoggedIn');
            alert('Déconnexion réussie!');
            checkLoginStatus();
        });
    }

    // Appeler la fonction pour vérifier l'état de connexion
    checkLoginStatus();

    // Logique de recherche de livre
    const searchForm = document.getElementById('search-form');
    if (searchForm) {
        searchForm.addEventListener('submit', function(event) {
            event.preventDefault();
            const titre = document.getElementById('titre').value;
            const auteur = document.getElementById('auteur').value;
            const isbn = document.getElementById('isbn').value;
            console.log(`Searching for book with Title: ${titre}, Author: ${auteur}, ISBN: ${isbn}`);
            document.getElementById('search-results').innerHTML = `<p>Résultats de recherche pour ${titre}, ${auteur}, ${isbn}</p>`;
        });
    }

    // Logique de mise à jour des livres
    const updateBookForm = document.getElementById('update-book-form');
    if (updateBookForm) {
        updateBookForm.addEventListener('submit', function(event) {
            event.preventDefault();
            const bookId = document.getElementById('book-id').value;
            const status = document.getElementById('status').value;
            const dateSortie = document.getElementById('date-sortie').value;
            const dateRetour = document.getElementById('date-retour').value;
            console.log(`Updating book ID ${bookId} to status ${status}, date sortie: ${dateSortie}, date retour: ${dateRetour}`);
        });
    }

    // Logique d'enregistrement de retour de livre
    const returnBookForm = document.getElementById('return-book-form');
    if (returnBookForm) {
        returnBookForm.addEventListener('submit', function(event) {
            event.preventDefault();
            const returnBookId = document.getElementById('return-book-id').value;
            const etat = document.getElementById('etat').value;
            console.log(`Returning book ID ${returnBookId} with state ${etat}`);
        });
    }

    // Logique de création d'utilisateur
    const createUserForm = document.getElementById('create-user-form');
    if (createUserForm) {
        createUserForm.addEventListener('submit', function(event) {
            event.preventDefault();
            const userName = document.getElementById('user-name').value;
            const userEmail = document.getElementById('user-email').value;
            const userPassword = document.getElementById('user-password').value;
            console.log(`Creating user with Name: ${userName}, Email: ${userEmail}`);
        });
    }

    // Logique de modification d'utilisateur
    const updateUserForm = document.getElementById('update-user-form');
    if (updateUserForm) {
        updateUserForm.addEventListener('submit', function(event) {
            event.preventDefault();
            const updateUserId = document.getElementById('update-user-id').value;
            const updateUserName = document.getElementById('update-user-name').value;
            const updateUserEmail = document.getElementById('update-user-email').value;
            const updateUserPassword = document.getElementById('update-user-password').value;
            console.log(`Updating user ID ${updateUserId} with Name: ${updateUserName}, Email: ${updateUserEmail}`);
        });
    }
});
