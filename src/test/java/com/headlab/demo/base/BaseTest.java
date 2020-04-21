package com.headlab.demo.base;

import com.headlab.demo.util.Browser;
import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    static WebDriver webDriver=null;
    protected static Browser browser = new Browser();

    @BeforeScenario
    public void setUp() {
        browser.setBrowser("https://www.gittigidiyor.com/");
    }

    public static WebDriver getDriver() {
        return webDriver;
    }

    public static void setDriver(WebDriver webDriver) {
        BaseTest.webDriver = webDriver;
    }

    @AfterScenario
    public void tearDown(){
        getDriver().quit();
    }

}
