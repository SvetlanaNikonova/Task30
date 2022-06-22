package com.coherentsolutions.training.aqa.java.web.nikonova;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YandexLoginTest extends Elements {

    private WebDriver driver;
    private final String LOGIN_BUTTON_LOCATOR = ".HeadBanner-ButtonsWrapper a:nth-child(2)";

    @BeforeEach
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

        Assertions.assertTrue(driver.getTitle().contains("Inbox"));
    }

    @AfterEach
    void cleanup() {
        driver.quit();
    }
}
