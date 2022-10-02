package utils;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class ReusableMethods {

         public static void tapOnElementWithText(String text) {
            List<MobileElement> mobileElementList = Driver.getAppiumDriver().findElementsByClassName("android.widget.TextView");
            for (MobileElement page: mobileElementList) {
                if (page.getText().equals(text)){
                    page.click();
                }else{
                    scrollWithUiScrollableClick(text);
                }
                break;
            }
        }

//ikinci alternatif bir method
        public static void clickOnElementWithText(String elementText) throws InterruptedException {
            Thread.sleep(4000);
            List<MobileElement> mobileElementList = Driver.getAppiumDriver().findElementsByXPath("//android.widget.TextView[@text='"+elementText+"']");
            if (mobileElementList.size()>0){
                mobileElementList.get(0).click();
            }else scrollWithUiScrollableClick(elementText);
        }


    public static boolean isElementPresent(String text) {
        boolean elementFound = false;
        List<MobileElement> mobileElementList = Driver.getAppiumDriver().findElementsByXPath("//android.widget.TextView[@text='" + text + "']");
        for (MobileElement el : mobileElementList) {
            if (el.getText().equals(text)) {
                waitToBeVisible(el, 10);
                if (el.isDisplayed()) {
                    elementFound = true;
                }
            }
        }
        return elementFound;
    }

    public static void waitJava(int second) {
        try {
            Thread.sleep(second * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void tapOn(MobileElement element) {
        waitToBeClickable(element, 15);
        element.click();
    }
    public static void tapOnText(String text) {
        waitToBeClickable((MobileElement) Driver.getAppiumDriver().findElementByXPath("//android.widget.TextView[@text='" + text + "']"), 10);
        Driver.getAppiumDriver().findElementByXPath("//android.widget.TextView[@text='" + text + "']").click();
    }
    public static void tapOnBrowser(MobileElement element) {
        waitToBeClickableBrowser(element, 15);
        element.click();
    }
    public static void tapOnChrome(MobileElement element) {
        waitToBeClickableChrome(element, 20);
        element.click();
    }

    public static void enterText(MobileElement element, String text) {
        waitToBeClickable(element, 15);
        element.sendKeys(text);
    }
    public static void enterTextBrowser(MobileElement element, String text) {
        waitToBeClickableBrowser(element, 15);
        element.sendKeys(text);
    }

    public static void enterText(MobileElement element, String text, boolean needClear) {
        waitToBeClickable(element, 15);
        if (needClear) {
            element.clear();
        }
        element.sendKeys(text);
    }

    public static boolean isElementPresent(MobileElement mobileElement) {
        boolean elementFound = false;
        waitToBeVisible(mobileElement, 10);
        if (mobileElement.isDisplayed()) {
            elementFound = true;
        }
        return elementFound;
    }

    public static void waitToBeVisible(MobileElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getAppiumDriver(), timeout);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitToBeClickable(MobileElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getAppiumDriver(),timeout);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public static void waitToBeClickableBrowser(MobileElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getBrowserDriver(),timeout);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public static void waitToBeClickableChrome(MobileElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(DriverChrome.getChromeDriver(),timeout);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitToBeClickableSendKeysBrowser(MobileElement element, int timeout, String text) {
        WebDriverWait wait = new WebDriverWait(Driver.getBrowserDriver(),timeout);
        wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(text);
    }

    public static void scrollWithUiScrollableClick(String elementText) {
        AndroidDriver<MobileElement> driver = (AndroidDriver) Driver.getAppiumDriver();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+elementText+"\"))");
        tapOn(driver.findElementByXPath("//android.widget.TextView[@text='" + elementText + "']"));
    }
    public static void scrollWithUiScrollableChrome(String elementText) {
        AndroidDriver<MobileElement> driver = (AndroidDriver) DriverChrome.getChromeDriver();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+elementText+"\"))");
    }
    public static void scrollWithUiScrollable(String elementText) {
        AndroidDriver<MobileElement> driver = (AndroidDriver) Driver.getAppiumDriver();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+elementText+"\"))");
    }

    public static void scrollUp() {
        Dimension dimension= Driver.getAppiumDriver().manage().window().getSize();

        int start_x= (int) (dimension.width*0.5);
        int start_y= (int) (dimension.height*0.8);

        int end_x= (int) (dimension.width*0.5);
        int end_y= (int) (dimension.height*0.2);
        TouchAction touchAction=new TouchAction<>(Driver.getAppiumDriver());
        touchAction.press(PointOption.point(start_x,start_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(end_x,end_y)).perform();

    }

    public static void scrollUpChrome() {
        Dimension dimension= DriverChrome.getChromeDriver().manage().window().getSize();

        int start_x= (int) (dimension.width*0.5);
        int start_y= (int) (dimension.height*0.7);

        int end_x= (int) (dimension.width*0.5);
        int end_y= (int) (dimension.height*0.3);
        TouchAction touchAction=new TouchAction<>(DriverChrome.getChromeDriver());
        touchAction.press(PointOption.point(start_x,start_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(end_x,end_y)).perform();

    }
    public static void scrollDownChrome() {
        Dimension dimension= DriverChrome.getChromeDriver().manage().window().getSize();

        int start_x= (int) (dimension.width*0.5);
        int start_y= (int) (dimension.height*0.2);

        int end_x= (int) (dimension.width*0.5);
        int end_y= (int) (dimension.height*0.8);
        TouchAction touchAction=new TouchAction<>(DriverChrome.getChromeDriver());
        touchAction.press(PointOption.point(start_x,start_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(end_x,end_y)).perform();

    }


    public static void clickOfTheDate(String tarih) {
             scrollWithUiScrollable(tarih);
        Driver.getAppiumDriver().findElementByXPath("//android.widget.CheckedTextView[@text='"+tarih+"']").click();

    }
    public static void clickOfTheDateChrome(String tarih) {
        DriverChrome.getChromeDriver().findElementByXPath("//android.widget.CheckedTextView[@text='"+tarih+"']").click();

    }
    public static void pageAfter(){

        try {
            Driver.getAppiumDriver().findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10)"));
        } catch (InvalidSelectorException e) {
            // ignore
        }

    }
    public static void pageAfterChrome(){

        try {
            DriverChrome.getChromeDriver().findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(15)"));
        } catch (InvalidSelectorException e) {
            // ignore
        }

    }

public static void pageAfterBrowser(){

    try {
        Driver.getBrowserDriver().findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10)"));
    } catch (InvalidSelectorException e) {
        // ignore
    }

}
    public static void pageAfter(AppiumDriver driver){
        if (driver==DriverChrome.getChromeDriver()) {
            try {
                DriverChrome.getChromeDriver().findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(25)"));
            } catch (InvalidSelectorException e) {
                // ignore
            }
        }else  if (driver==Driver.getAppiumDriver()) {
            try {
                Driver.getAppiumDriver().findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10)"));
            } catch (InvalidSelectorException e) {
                // ignore
            }
        }else  if (driver==Driver.getBrowserDriver()) {
            try {
                Driver.getBrowserDriver().findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10)"));
            } catch (InvalidSelectorException e) {
                // ignore
            }
        }

    }


//attribute check

    public static void setCardNumber(String cardNo){
             TouchAction touchAction=new TouchAction(Driver.getAppiumDriver());
        for (int i = 0; i <cardNo.length() ; i++) {
            ReusableMethods.waitJava(2);
            switch (cardNo.charAt(i)){
                case '0':
                    touchAction.tap(PointOption.point(570,2750)).perform();
                    break;
                case '1':
                    touchAction.tap(PointOption.point(220,2075)).perform();
                    break;
                case '2':
                    touchAction.tap(PointOption.point(580,2075)).perform();
                    break;
                case '3':
                    touchAction.tap(PointOption.point(975,2075)).perform();
                    break;
                case '4':
                    touchAction.tap(PointOption.point(220,2300)).perform();
                    break;
                case '5':
                    touchAction.tap(PointOption.point(580,2300)).perform();
                    break;
                case '6':
                    touchAction.tap(PointOption.point(975,2300)).perform();
                    break;
                case '7':
                    touchAction.tap(PointOption.point(220,2530)).perform();
                    break;
                case '8':
                    touchAction.tap(PointOption.point(580,2530)).perform();
                    break;
                case '9':
                    touchAction.tap(PointOption.point(975,2530)).perform();
                    break;
            }

        }
    }

    public static void setCardNumberChrome(String cardNo){
        TouchAction touchAction=new TouchAction(DriverChrome.getChromeDriver());
        for (int i = 0; i <cardNo.length() ; i++) {
            ReusableMethods.waitJava(2);
            switch (cardNo.charAt(i)){
                case '0':
                    touchAction.tap(PointOption.point(400,1715)).perform();
                    break;
                case '1':
                    touchAction.tap(PointOption.point(140,1265)).perform();
                    break;
                case '2':
                    touchAction.tap(PointOption.point(400,1265)).perform();
                    break;
                case '3':
                    touchAction.tap(PointOption.point(655,1265)).perform();
                    break;
                case '4':
                    touchAction.tap(PointOption.point(140,1400)).perform();
                    break;
                case '5':
                    touchAction.tap(PointOption.point(400,1400)).perform();
                    break;
                case '6':
                    touchAction.tap(PointOption.point(655,1400)).perform();
                    break;
                case '7':
                    touchAction.tap(PointOption.point(140,1570)).perform();
                    break;
                case '8':
                    touchAction.tap(PointOption.point(400,1570)).perform();
                    break;
                case '9':
                    touchAction.tap(PointOption.point(655,1570)).perform();
                    break;
            }

        }
    }

    public static void adressClick(String text){
             Driver.getBrowserDriver().findElementByXPath("//*[text()='"+text+"']").click();

    }

   public static void chromePartialTextTitleClick(String title){
            tapOnChrome((MobileElement) DriverChrome.getChromeDriver().findElement(By.xpath("//android.view.View[@content-desc='"+title+"']")));

   }


    public static void tapSepet() {
        Dimension dimension= DriverChrome.getChromeDriver().manage().window().getSize();

        int start_x= (int) (dimension.width*0.5);
        int start_y= (int) (dimension.height*0.95);

        TouchAction touchAction=new TouchAction(DriverChrome.getChromeDriver());


        touchAction.tap(PointOption.point(550,1730)).perform();
    }

    public static void secinizChrome(){

             DriverChrome.getChromeDriver().findElement(By.xpath("//android.view.View[@text='Seçiniz']")).click();
    }
}
