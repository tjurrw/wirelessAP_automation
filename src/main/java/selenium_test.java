import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_test {
    public static void seleniumTest(){
        try {
            System.setProperty("webdriver.chrome.driver", "/Users/parkchikook/IdeaProjects/exe/chromedriver");
            WebDriver driver = new ChromeDriver();

            driver.get("www.google.com");
            Thread.sleep(5000);  // Let the user actually see something!

            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("ChromeDriver");
            searchBox.submit();
            Thread.sleep(5000);  // Let the user actually see something!
            driver.quit();
        } catch (InterruptedException ex){

        }
    }
}