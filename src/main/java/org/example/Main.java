package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // Navigate to website
        driver.get("https://www.automationexercise.com");
        driver.manage().window().maximize();
        //Navigate to login page
        WebElement loginPageButton = driver.findElement(By.xpath("//a[@href=\"/login\"]"));
        loginPageButton.click();
        //Write email and password
        WebElement emailAddress = driver.findElement(By.xpath("//form[@action=\"/login\"]//input[@name=\"email\"]"));
        WebElement loginPassword = driver.findElement(By.xpath("//form[@action=\"/login\"]//input[@name=\"password\"]"));
        emailAddress.sendKeys("omarelaraby@gmail.com");
        loginPassword.sendKeys("123456A");
        //Clicking on the login button
        WebElement loginButton = driver.findElement(By.xpath("//form[@action=\"/login\"]//button[@type=\"submit\"]"));
        loginButton.click();
        //Making sure that account is logged in
        WebElement logoutButton = driver.findElement(By.xpath("//a[@href=\"/logout\"]"));
        //String makeSureOfLogout = logoutButton.getText();
            if (logoutButton.isDisplayed() && logoutButton.isEnabled()){
                System.out.print("True");
            }else{
                System.out.print("False");
            }
            //Quitting chrome
            driver.quit();
    }
}





