package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class TestDate {

    public static void main(String[] args) {
        // Configuration du chemin du driver (assurez-vous de télécharger le bon driver pour votre navigateur)
		System.setProperty("webdriver.chrome.driver","C://Users//ESIEE-IT//Desktop//Marianne//qualité logiciel et tests automatisés//chromedriver.exe");

        // Initialiser le WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Ouvrir la page de saisie des dates
            driver.get("http://localhost:8080/Bibliotheque/gestion.jsp");

            // Récupérer la date actuelle
            LocalDate currentDate = LocalDate.now();

            // Formatter la date au format attendu dans le champ date de sortie
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String formattedDate = currentDate.format(formatter);

            // Saisir la date de sortie (actuelle)
            WebElement dateSortieField = driver.findElement(By.id("date-sortie"));
            dateSortieField.sendKeys(formattedDate);

            // Calculer la date de retour (3 jours après la date de sortie)
            LocalDate dateRetour = currentDate.plusDays(3);
            String formattedDateRetour = dateRetour.format(formatter);
            // Saisir la date de retour (3 jours après la date de sortie)
            WebElement dateRetourField = driver.findElement(By.id("date-retour"));
            dateRetourField.sendKeys(formattedDateRetour);

            // Cliquer sur le bouton pour valider les dates
            WebElement submitButton = driver.findElement(By.id("submit-button"));
            submitButton.click();

            // Attendre un peu pour que la validation se produise (facultatif)
            Thread.sleep(2000);

            // Vérifier si un message de validation est affiché
            WebElement validationMessage = driver.findElement(By.id("validation-message"));
            String message = validationMessage.getText();

            // Vérifier si le message de validation est correct
            if (message.contains("Date de retour valide")) {
                System.out.println("Test de validation de date réussi !");
            } else {
                System.out.println("Test de validation de date échoué.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Fermer le navigateur
            driver.quit();
        }
    }
}