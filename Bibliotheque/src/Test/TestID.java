package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestID {

    public static void main(String[] args) {
        // Configuration du chemin du driver (assurez-vous de télécharger le bon driver pour votre navigateur)
		System.setProperty("webdriver.chrome.driver","C://Users//ESIEE-IT//Desktop//Marianne//qualité logiciel et tests automatisés//chromedriver.exe");

        // Initialiser le WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Ouvrir la page où se trouve le champ pour saisir l'ID
            driver.get("http://localhost:8080/Bibliotheque/gestion.jsp");

            // Saisir un ID composé uniquement de chiffres et dépassant 3 chiffres
            WebElement idField = driver.findElement(By.id("book-id"));
            idField.sendKeys("1234");

            // Cliquer sur un autre élément pour que le champ perde le focus et que la validation se déclenche
            WebElement otherElement = driver.findElement(By.id("autre-element"));
            otherElement.click();

            // Attendre un peu pour que la validation se produise (facultatif)
            Thread.sleep(2000);

            // Vérifier si un message de validation est affiché
            WebElement validationMessage = driver.findElement(By.id("validation-message"));
            String message = validationMessage.getText();

            // Vérifier si le message de validation est correct
            if (message.contains("ID valide")) {
                System.out.println("Test de validation d'ID réussi !");
            } else {
                System.out.println("Test de validation d'ID échoué.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Fermer le navigateur
            driver.quit();
        }
    }
}