package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.sikuli.script.FindFailed;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;


public class BasePage {

public static void main(String[] args) throws FindFailed {

    //ChromeOptions chromeOptions = new ChromeOptions();

    WebDriver driver = WebDriverManager.chromedriver().create();

    driver.manage().window().maximize();
    driver.get("https://ebstst1.comfort.com/OA_HTML/AppsLocalLogin.jsp");

    EBSLoginPage ebs = new EBSLoginPage();
    ebs.login();

    driver.close();
  }

}
