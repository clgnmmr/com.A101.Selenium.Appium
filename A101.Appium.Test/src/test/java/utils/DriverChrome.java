package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverChrome {





    private static AppiumDriver<MobileElement>  chromeDriver;


    public static AppiumDriver getChromeDriver()  {
        URL appiumServerURL = null;
        try {
            appiumServerURL = new URL("http:127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        if ( chromeDriver== null) {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, ConfigReader.getProperty("automationName"));
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, ConfigReader.getProperty("platformName"));
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, ConfigReader.getProperty("platformVersion"));
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigReader.getProperty("deviceName"));
            desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
            desiredCapabilities.setCapability("autoAcceptAlert",true);
            desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"60000");

            if (ConfigReader.getProperty("platformName").equals("Android")) {
                //if you do not provide app path so you should provide "appPackage" and "appActivity"
                if (ConfigReader.getProperty("browserName").equals("chrome")) {
                   // desiredCapabilities.setCapability("appPackage","org.chromium.webview_shell");
                    desiredCapabilities.setCapability("appPackage","com.android.chrome");
                    desiredCapabilities.setCapability("appActivity","com.google.android.apps.chrome.Main");
                   // desiredCapabilities.setCapability("appActivity","org.chromium.webview_shell.WebViewBrowserActivity");
                    assert appiumServerURL != null;
                    chromeDriver = new AndroidDriver(appiumServerURL,desiredCapabilities);
                } else if (ConfigReader.getProperty("browserName").equals("firefox")) {
                    desiredCapabilities.setCapability("appPackage","");
                    desiredCapabilities.setCapability("appActivity","");
                    assert appiumServerURL != null;
                    chromeDriver = new AndroidDriver(appiumServerURL,desiredCapabilities);

                } else if (ConfigReader.getProperty("browserName").equals("ie")) {
                    desiredCapabilities.setCapability("appPackage","");
                    desiredCapabilities.setCapability("appActivity","");
                    assert appiumServerURL != null;
                    chromeDriver = new AndroidDriver(appiumServerURL,desiredCapabilities);

                } else if (ConfigReader.getProperty("browserName").equals("safari")) {
                    desiredCapabilities.setCapability("appPackage","");
                    desiredCapabilities.setCapability("appActivity","");
                    assert appiumServerURL != null;
                    chromeDriver = new AndroidDriver(appiumServerURL,desiredCapabilities);

                } else if (ConfigReader.getProperty("browserName").equals("chrome-headless")) {
                    desiredCapabilities.setCapability("appPackage","");
                    desiredCapabilities.setCapability("appActivity","");
                    assert appiumServerURL != null;
                    chromeDriver = new AndroidDriver(appiumServerURL,desiredCapabilities);

                }
            } else if (ConfigReader.getProperty("platformName").equals("iOS")) {
                //if you do not provide app path so you should use "bundleId"
//                desiredCapabilities.setCapability("bundleId",ConfigReader.getProperty("iosBundleId"));
                assert appiumServerURL != null;
                chromeDriver= new IOSDriver(appiumServerURL,desiredCapabilities);
            } else {
                throw new UnsupportedOperationException("Invalid Platform Name " + ConfigReader.getProperty("platformName"));
            }
            chromeDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        }

        return chromeDriver;
    }


    public static void quitChromeDriver(){
        if ( chromeDriver!= null) {
            chromeDriver.quit();
            chromeDriver= null;
        }
    }



}
