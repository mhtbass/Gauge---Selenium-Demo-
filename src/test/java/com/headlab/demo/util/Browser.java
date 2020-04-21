package com.headlab.demo.util;

import com.headlab.demo.base.BaseTest;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class Browser {

    public void setBrowser(String url) {

        System.setProperty("webdriver.chrome.driver", "web_driver/chromedriver.exe");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("test-type");
        option.addArguments("disable-popup-blocking");
        option.addArguments("ignore-certificate-errors");
        option.addArguments("disable-translate");
        option.addArguments("start-maximized");
        option.addArguments("disable-automatic-password-saving");
        option.addArguments("allow-silent-push");
        option.addArguments("disable-infobars");
        option.addArguments("--disable-notifications");
        option.setExperimentalOption("useAutomationExtension", false);
        capabilities.setCapability("browserName", "chrome");
        capabilities.setPlatform(Platform.MAC);
        capabilities.setCapability(ChromeOptions.CAPABILITY, option);


        BaseTest.setDriver(new ChromeDriver(option));

        BaseTest.getDriver().navigate().to(url);
        BaseTest.getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

    }

}
