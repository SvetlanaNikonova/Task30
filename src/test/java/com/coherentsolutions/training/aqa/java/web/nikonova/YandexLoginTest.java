package com.coherentsolutions.training.aqa.java.web.nikonova;

import com.coherentsolutions.training.aqa.java.web.nikonova.util.Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YandexLoginTest extends Elements {

    private WebDriver driver;
    private final String LOGIN_BUTTON_LOCATOR = ".HeadBanner-ButtonsWrapper a:nth-child(2)";

    @BeforeTest
     void setup() {
        driver = new ChromeDriver();
    }

    @Test
    void yandexLoginTest() throws InterruptedException {
        driver.get("https://mail.yandex.com");
        driver.findElement(getElementByCssSelector(LOGIN_BUTTON_LOCATOR)).click();
        WebElement emailInput = driver.findElement(getElementById("passp-field-login"));
        emailInput.sendKeys("seleniumtest789test");
        driver.findElement(getElementById("passp:sign-in")).click();
        Thread.sleep(1000);
        WebElement enterPasswordInput = driver.findElement(getElementByXPath("//input[@id='passp-field-passwd']"));
        enterPasswordInput.sendKeys("belekoks_789!");
        driver.findElement(getElementById("passp:sign-in")).click();
        Thread.sleep(2000);

        Assert.assertTrue(driver.getTitle().contains("Inbox"));
    }

    @AfterTest
    void cleanup() {
        driver.quit();
    }
}
