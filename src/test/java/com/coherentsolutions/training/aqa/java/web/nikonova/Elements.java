package com.coherentsolutions.training.aqa.java.web.nikonova;

import org.openqa.selenium.By;

public class Elements {

    protected By getElementById(String id) {
        return By.id(id);
    }

    protected By getElementByCssSelector(String cssSelector) {
        return By.cssSelector(cssSelector);
    }

    protected By getElementByName(String name) {
        return By.name(name);
    }

    protected By getElementByXPath(String xpath) {
        return By.xpath(xpath);
    }

    protected By getElementByClassName(String className) {
        return By.className(className);
    }

    protected By getElementByLinkText(String linkText) {
        return By.linkText(linkText);
    }

    protected By getElementByPartialLinkText(String partialLinkText) {
        return By.partialLinkText(partialLinkText);
    }

    protected By getElementTagByName(String tagName) {
        return By.tagName(tagName);
    }
}
