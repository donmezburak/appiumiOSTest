import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Start {

    public IOSDriver driver;

    @BeforeSuite
    public void setUp() {
        URL url = null;
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();

            ClassLoader classLoader = new Start().getClass().getClassLoader();
            File file = new File(classLoader.getResource("sahibinden_ios.ipa").getFile());
            String absolutePath = file.getAbsolutePath();

            capabilities.setCapability(MobileCapabilityType.APP, absolutePath);
            capabilities.setCapability(MobileCapabilityType.UDID, "c982d5dc9436a8dc176843de8f7cea4001bc9cfa");
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS);
            capabilities.setCapability("autoGrantPermissions", true);
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Xs");
            capabilities.setCapability("appPushTimeout", 60000);

            int port =  Integer.valueOf(System.getProperty("roboticPort", "4723"));

            String urlString = "http://127.0.0.1:" + port + "/wd/hub";
            url = new URL(urlString);

            driver = new IOSDriver(url, capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @AfterSuite
    public void finish() {
        driver.quit();
    }

    @Test(priority = 0)
    public void aLogin() {

        try {
            Thread.sleep(5000);
            takeScreenshot();
            driver.findElement(By.xpath("/XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTabBar/XCUIElementTypeButton[6]")).click();
            Thread.sleep(2000);
            takeScreenshot();

            driver.findElement(By.xpath("/XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]")).click();
            Thread.sleep(2000);
            takeScreenshot();

            driver.findElement(By.xpath("/XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")).sendKeys("osmanraifgunes@gmail.com");
            Thread.sleep(2000);
            takeScreenshot();
            driver.findElement(By.xpath("/XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeSecureTextField")).sendKeys("19761976Ra!f");
            Thread.sleep(2000);
            takeScreenshot();
            driver.findElement(By.xpath("/XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[3]")).click();
            Thread.sleep(5000);
            takeScreenshot();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test(priority = 1)
    public void bHomeSearch() {
        try {
            aLogin();
            driver.findElement(By.xpath("/XCUIElementTypeApplication/XCUIElementTypeWindow[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSheet/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton")).click();
            Thread.sleep(2000);
            takeScreenshot();
            driver.findElement(By.xpath("/XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTabBar/XCUIElementTypeButton[3]")).click();
            Thread.sleep(2000);
            takeScreenshot();
            driver.findElement(By.xpath("/XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell")).click();
            Thread.sleep(2000);
            takeScreenshot();
            driver.findElement(By.xpath("/XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell")).click();
            Thread.sleep(2000);
            takeScreenshot();
            driver.findElement(By.xpath("/XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]")).click();
            Thread.sleep(2000);
            takeScreenshot();
            driver.findElement(By.xpath("/XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell")).click();
            Thread.sleep(5000);
            takeScreenshot();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 2)
    public void cClickAndFavAd() {

        try {
            bHomeSearch();
            driver.findElement(By.xpath("/XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]")).click();
            Thread.sleep(2000);
            takeScreenshot();
            driver.findElement(By.xpath("/XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeNavigationBar/XCUIElementTypeButton[3]")).click();
            Thread.sleep(5000);
            takeScreenshot();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public boolean takeScreenshot() {
        String screenshotDirectory = System.getProperty("appium.screenshots.dir", System.getProperty("java.io.tmpdir", ""));
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        return screenshot.renameTo(new File(screenshotDirectory, String.format("%s.png", formatter.format(date))));
    }

}

