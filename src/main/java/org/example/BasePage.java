package org.example;

import org.opencv.core.Core;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BasePage {

  public static void main(String[] args) throws FindFailed {

      System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

    WebDriver driver = WebDriverManager.chromedriver().create();

    driver.manage().window().maximize();
    driver.get("https://ebstst1.comfort.com/OA_HTML/AppsLocalLogin.jsp");

    EBSLoginPage ebs = new EBSLoginPage();
    ebs.login();

    driver.close();
  }

}
