package com.headlab.demo.base;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage {

    WebDriver driver = null;
    WebDriverWait wait = null;

    public BasePage(WebDriver driver){
        this.driver=driver;
        this.wait= new WebDriverWait(driver,30);
    }

    protected JavascriptExecutor getJSExecutor() {
        return (JavascriptExecutor) driver;
    }

    public WebElement findElement(By by){
        presenceOfAllElementsLocatedBy(by);
        return driver.findElement(by);
    }

    public void click(By by) {
        elementToBeClickable(by);
        findElement(by).click();
    }
    public void waitclick(By by) {
        presenceOfAllElementsLocatedBy(by);
        elementToBeClickable(by);
        findElement(by).click();
    }

    public void sendKeys(By by,String text){
        elementToBeClickable(by);
        findElement(by).sendKeys(text);
    }

    public String getText(By by){
        presenceOfAllElementsLocatedBy(by);
        return findElement(by).getText();
    }

    public void hoverElement(By by) {
        Actions action = new Actions(driver);
        action.moveToElement(findElement(by)).build().perform();
    }

    protected void scrollTo(int x, int y) {
        String jsStmt = String.format("window.scrollTo(%d, %d);", x, y);
        getJSExecutor().executeScript(jsStmt, true);
    }

    public void selectVisibleText(By by, String text) {
        Select select = new Select(findElement(by));
        select.selectByVisibleText(text);
    }

    public void assertionTrue(String message, boolean condition) {
        Assert.assertTrue(message, condition);
    }

    public void presenceOfAllElementsLocatedBy(By by){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }
    public void elementToBeClickable(By by){
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public void untilElementDissapear(By by) {
        WebDriverWait dissapear = new WebDriverWait(driver, 300);
        dissapear.ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
        dissapear.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public static void waitSeconds(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }

}