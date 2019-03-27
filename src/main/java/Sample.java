import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {
    public void inputCsv(DataConfiguration a) throws InterruptedException {
        System.setProperty("webdriver.firefox.driver", "/usr/local/bin/geckodriver");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://admin:admin@192.168.2.180");
        Thread.sleep(5000);

        WebElement changeSsid = driver.findElement(By.name("ssid0"));
        changeSsid.clear();
        a[].ssid = String
        changeSsid.sendKeys(a[].ssid); //데이터형 변환

        WebElement getPw = driver.findElement(By.name("pskValue0_show"));
        getPw.click();

        WebElement adminId = driver.findElement(By.name("username"));
        adminId.clear();
        adminId.sendKeys("admin");
        WebElement adminPw = driver.findElement(By.name("newpass"));
        adminPw.clear();
        adminPw.sendKeys("pwd");
        WebElement adminCpw = driver.findElement(By.name("confpass"));
        adminCpw.clear();
        adminCpw.sendKeys("pwd");

        WebElement changeIp = driver.findElement(By.name("lan_ip"));
        changeIp.click();
    }
}

/* http://admin:0526newp@192.168.76.20 basic 인증 */
/* socket */
/* 윈도우 쉘 커맨드 활용하는 방법 - IP주소 변 */