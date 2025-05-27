package task10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class DatePickerAutomation {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable if not set in system PATH
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Maximize the browser window
            driver.manage().window().maximize();

            // Navigate to the jQuery UI Datepicker demo page
            driver.get("https://jqueryui.com/datepicker/");

            // Implicit wait
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            // Switch to the iframe containing the datepicker
            WebElement iframe = driver.findElement(By.className("demo-frame"));
            driver.switchTo().frame(iframe);

            // Locate the datepicker input field and click to open the datepicker
            WebElement dateInput = driver.findElement(By.id("datepicker"));
            dateInput.click();

            // Click the "Next" button to go to the next month
            WebElement nextButton = driver.findElement(By.cssSelector(".ui-datepicker-next"));
            nextButton.click();

            // Select the date "22" from the datepicker
            WebElement date = driver.findElement(By.xpath("//a[text()='22']"));
            date.click();

            // Retrieve the selected date from the input field
            String selectedDate = dateInput.getAttribute("value");
            System.out.println("Selected Date: " + selectedDate);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser and quit the WebDriver instance
            driver.quit();
        }
    }
}
