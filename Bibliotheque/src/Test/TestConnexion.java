package Test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import org.openqa.selenium.interactions.*;


public class TestConnexion {

    public static void main(String[] args) {
        // Configuration du chemin du driver (assurez-vous de télécharger le bon driver pour votre navigateur)
		System.setProperty("webdriver.chrome.driver","C://Users//ESIEE-IT//Desktop//Marianne//qualité logiciel et tests automatisés//chromedriver.exe");

        // Initialiser le WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Ouvrir la page de connexion
            driver.get("http://localhost:8080/Bibliotheque/connexion.jsp");

            // Trouver les champs de saisie
            WebElement emailField = driver.findElement(By.id("email"));
            WebElement passwordField = driver.findElement(By.id("password"));
            WebElement loginButton = driver.findElement(By.id("login-button"));

            // Remplir le formulaire de connexion
            emailField.sendKeys("veyrat.marine@gmail.com");
            passwordField.sendKeys("123");

            // Cliquer sur le bouton de connexion
            loginButton.click();

            // Attendre un peu pour que la redirection se produise
            Thread.sleep(2000);

            // Vérifier si la connexion a réussi en vérifiant la présence des boutons de gestion
            WebElement gestionLivresButton = driver.findElement(By.id("Gestion_des_Livres"));
            WebElement gestionUtilisateursButton = driver.findElement(By.id("Gestion_des_Utilisateurs"));

            if (gestionLivresButton.isDisplayed() && gestionUtilisateursButton.isDisplayed()) {
                System.out.println("Test de connexion réussi !");
            } else {
                System.out.println("Test de connexion échoué.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Fermer le navigateur
            driver.quit();
        }
    }
}