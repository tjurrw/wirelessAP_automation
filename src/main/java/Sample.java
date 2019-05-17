import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {
    public void inputCsv(DataConfiguration a) throws InterruptedException {
        System.setProperty("webdriver.firefox.driver", "/geckodriver");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://admin:admin@192.168.2.180");
        Thread.sleep(5000);

        WebElement changeSsid = driver.findElement(By.name("ssid0"));
        changeSsid.clear();
        String x = String.valueOf(a.ssid); //데이터형 변환
        changeSsid.sendKeys(x);

        WebElement getPw = driver.findElement(By.name("pskValue0_show"));
        getPw.getText();
        String z = String.valueOf(a.pwd);
         //csv파일에 기기 비밀번호 입력(출력)

        //습득한 비밀번호를 csv파일에 기입

        WebElement adminId = driver.findElement(By.name("username"));
        adminId.clear();
        adminId.sendKeys("admin"); //관리자
        WebElement adminPw = driver.findElement(By.name("newpass"));
        adminPw.clear();
        adminPw.sendKeys("admin"); //관리자 비밀번호 입력
        WebElement adminCpw = driver.findElement(By.name("confpass"));
        adminCpw.clear();
        adminCpw.sendKeys("admin"); //관리자 ㅎ비밀번호 확인
        driver.get("http://admin:admin@192.168.2.180");
        Thread.sleep(5000);

        WebElement changeIp = driver.findElement(By.name("lan_ip"));
        changeIp.clear();
        String y = String.valueOf(a.localip);
        changeIp.sendKeys(y); //메인 클래스에서 생성된 아이피를 투입
    }
}