package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestISBN {

    public static void main(String[] args) {
        // Configuration du chemin du driver (assurez-vous de télécharger le bon driver pour votre navigateur)
		System.setProperty("webdriver.chrome.driver","C://Users//ESIEE-IT//Desktop//Marianne//qualité logiciel et tests automatisés//chromedriver.exe");

        // Initialiser le WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Ouvrir la page de recherche des livres
            driver.get("http://localhost:8080/Bibliotheque/accueil.jsp");

            // Trouver le champ d'entrée ISBN
            WebElement isbnField = driver.findElement(By.id("isbn"));

            // Saisir un texte non numérique dans le champ ISBN
            isbnField.sendKeys("abc123");

            // Récupérer la valeur actuelle du champ ISBN
            String enteredValue = isbnField.getAttribute("value");

            // Vérifier si le champ ISBN contient uniquement des chiffres
            if (enteredValue.matches("[0-9]+")) {
                System.out.println("Test de validation ISBN réussi !");
            } else {
                System.out.println("Test de validation ISBN échoué.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Fermer le navigateur
            driver.quit();
        }
    }
}
