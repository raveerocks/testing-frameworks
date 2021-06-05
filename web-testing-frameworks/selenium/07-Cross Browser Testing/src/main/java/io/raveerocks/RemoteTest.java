package io.raveerocks;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.server.handler.CaptureScreenshot;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteTest {

    public static void main(String[] args) {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setBrowserName(BrowserType.CHROME);
        desiredCapabilities.setPlatform(Platform.WINDOWS);
        URL hubURL = null;
        try {
            hubURL = new URL("http://localhost:4444/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        WebDriver driver = new RemoteWebDriver(hubURL,desiredCapabilities);
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.quit();
    }
}
