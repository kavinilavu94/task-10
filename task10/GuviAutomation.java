package task10;

import java.time.Duration;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;



public class GuviAutomation {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		

		try {

            

            driver.get("https://www.guvi.in/");



            

            WebElement signUpButton = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign up")));

            signUpButton.click();



            

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("name"))).sendKeys("Test User");

            driver.findElement(By.id("email")).sendKeys("nilatester@example.com");

            driver.findElement(By.id("password")).sendKeys("TestPassword123");

            driver.findElement(By.id("mobileNumber")).sendKeys("1234567890");



            

            WebElement signUp_Button = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign Up")));

            signUp_Button.click();

            

            WebElement signUp_Button1 = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("May be later")));

            signUp_Button1.click();



            driver.navigate();

            driver.get("https://www.guvi.in/");

            

            WebElement LoginButton = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Login")));

            LoginButton.click();

            

            

            driver.findElement(By.id("email")).sendKeys("kavi1994it@gmail.com");

            driver.findElement(By.id("password")).sendKeys("Kavihari27");

            WebElement LoginButton1 = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Login")));

            LoginButton1.click();

            

            String a="";

            do {

            	a = driver.findElement(By.tagName("title")).toString();

            	System.out.println(a);

            } while (a == "GUVI | courses");

            System.out.println("Page Loaded.");

            

            try {

                Thread.sleep(5000); // Sleep for 10 seconds

            } catch (InterruptedException e) {

                Thread.currentThread().interrupt();

            }

            

            driver.close();

            

                   

         

        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            // Close the browser after a short delay

            try {

                Thread.sleep(5000);

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

           // driver.quit();

        }



	}}

