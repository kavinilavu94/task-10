package task10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
       // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the jQuery UI Droppable demo page
            driver.get("https://jqueryui.com/droppable/");
            driver.manage().window().maximize();

            // Switch to the iframe containing the draggable and droppable elements
            driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

            // Locate the draggable (source) and droppable (target) elements
            WebElement source = driver.findElement(By.id("draggable"));
            WebElement target = driver.findElement(By.id("droppable"));

            // Initialize the Actions class
            Actions actions = new Actions(driver);

            // Perform the drag-and-drop action
            actions.dragAndDrop(source, target).perform();

            // Optional: Verify the drop was successful
            String dropText = target.getText();
            if (dropText.equals("Dropped!")) {
                System.out.println("Drag and drop successful.");
            } else {
                System.out.println("Drag and drop failed.");
            }
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}