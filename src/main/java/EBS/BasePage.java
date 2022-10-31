package EBS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.sikuli.script.FindFailed;
import io.github.bonigarcia.wdm.WebDriverManager;



public class BasePage {

public static void main(String[] args) throws FindFailed {

    ChromeOptions chromeOptions = new ChromeOptions();
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver(chromeOptions);


    driver.manage().window().maximize();
    driver.get("https://ebstst1.comfort.com/OA_HTML/AppsLocalLogin.jsp");

    EBSLoginPage ebs = new EBSLoginPage();
    ebs.login();

    driver.close();
  }

}
