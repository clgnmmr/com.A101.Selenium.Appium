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


public class Driver {

    private static AppiumDriver<MobileElement> appiumDriver;
    private static AppiumDriver<MobileElement> browserDriver;


    public static AppiumDriver getAppiumDriver()  {
        URL appiumServerURL = null;
        try {
            appiumServerURL = new URL("http:127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        if (appiumDriver == null) {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, ConfigReader.getProperty("automationName"));
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, ConfigReader.getProperty("platformName"));
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, ConfigReader.getProperty("platformVersion"));
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigReader.getProperty("deviceName"));
            desiredCapabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+ConfigReader.getProperty("appPath"));
            desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
            desiredCapabilities.setCapability("autoAcceptAlert",true);
            desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"60000");

            if (ConfigReader.getProperty("platformName").equals("Android")) {
            //if you do not provide app path so you should provide "appPackage" and "appActivity"
            desiredCapabilities.setCapability("appPackage","org.studionord.a101");
            desiredCapabilities.setCapability("appActivity","org.studionord.a101.MainActivity");
                assert appiumServerURL != null;
                appiumDriver = new AndroidDriver(appiumServerURL,desiredCapabilities);
            } else if (ConfigReader.getProperty("platformName").equals("iOS")) {
                //if you do not provide app path so you should use "bundleId"
//                desiredCapabilities.setCapability("bundleId",ConfigReader.getProperty("iosBundleId"));
                assert appiumServerURL != null;
                appiumDriver = new IOSDriver(appiumServerURL,desiredCapabilities);
            } else {
                throw new UnsupportedOperationException("Invalid Platform Name " + ConfigReader.getProperty("platformName"));
            }
        }
        appiumDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return appiumDriver;
    }


        public static void quitAppiumDriver(){
            if (appiumDriver != null) {
                appiumDriver.quit();
                appiumDriver = null;
            }
        }







    public static AppiumDriver getBrowserDriver()  {
        URL appiumServerURL = null;
        try {
            appiumServerURL = new URL("http:127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        if (browserDriver == null) {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, ConfigReader.getProperty("automationName"));
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, ConfigReader.getProperty("platformName"));
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, ConfigReader.getProperty("platformVersion"));
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigReader.getProperty("deviceName"));
            desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
            desiredCapabilities.setCapability("autoAcceptAlert", true);
            desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60000");
            if (ConfigReader.getProperty("browserName").equals("chrome")) {
                desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
                desiredCapabilities.setCapability("chromedriverExecutable", System.getProperty("user.dir")+ConfigReader.getProperty("appPathChrome"));
                assert appiumServerURL != null;
                browserDriver = new AndroidDriver(appiumServerURL,desiredCapabilities);
            } else if (ConfigReader.getProperty("browserName").equals("firefox")) {
                desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"firefox");
                desiredCapabilities.setCapability("", "");
                assert appiumServerURL != null;
                browserDriver = new AndroidDriver(appiumServerURL,desiredCapabilities);

            } else if (ConfigReader.getProperty("browserName").equals("ie")) {
                desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"ie");
                desiredCapabilities.setCapability("", "");
                assert appiumServerURL != null;
                browserDriver = new AndroidDriver(appiumServerURL,desiredCapabilities);

            } else if (ConfigReader.getProperty("browserName").equals("safari")) {
                desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"safari");
                desiredCapabilities.setCapability("", "");
                assert appiumServerURL != null;
                browserDriver = new AndroidDriver(appiumServerURL,desiredCapabilities);

            } else if (ConfigReader.getProperty("browserName").equals("chrome-headless")) {
                desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome-headless");
                desiredCapabilities.setCapability("", "");
                assert appiumServerURL != null;
                browserDriver = new AndroidDriver(appiumServerURL,desiredCapabilities);

            }
        }
       // browserDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return browserDriver;
    }
}