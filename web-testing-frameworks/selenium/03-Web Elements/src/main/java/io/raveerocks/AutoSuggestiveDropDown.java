package io.raveerocks;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestiveDropDown {

    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://www.makemytrip.com/");
        try{
            WebElement popup = webDriver.findElement(new By.ByCssSelector("div.autopop__wrap.makeFlex.column.defaultCursor"));
            if (popup.isDisplayed())
                System.out.println("popup");
            webDriver.findElement(new By.ByCssSelector("div.loginModal.displayBlock.modalLogin.dynHeight.personal")).click();
        }
        catch (NoSuchElementException e){ }
        webDriver.findElement(new By.ById("fromCity")).click();
        WebElement from = webDriver.findElement(new By.ByCssSelector("input[placeholder='From']"));
        from.clear();
        from.sendKeys("Mumbai");
        from.sendKeys(Keys.DOWN);
        from.sendKeys(Keys.ENTER);

        WebElement to = webDriver.findElement(new By.ByCssSelector("input[placeholder='To']"));
        to.clear();
        to.sendKeys("Chennai MAA");
        Thread.sleep(2000);
        to.sendKeys(Keys.DOWN);
        to.sendKeys(Keys.ENTER);
    }
}
