package MavenTest.NewAppium;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Session2Activity1 {
	AppiumDriver<MobileElement> driver = null;
WebDriverWait wait;
@BeforeClass
public void GoogletaskPrep() throws InterruptedException, IOException {
	
    // Set the Desired Capabilities
    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("deviceId", "BIFQONBQCEL7SGEU");
    caps.setCapability("deviceName", "vivo vivo 1901");
    caps.setCapability("platformName", "android");
    caps.setCapability("appPackage", "com.android.chrome");
    caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
    caps.setCapability("noReset", "true");
	driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
}
@Test
public void GoogleChrome() 
{
	driver.get("https://www.training-support.net/");
	String title = driver.findElementByXPath("//android.view.View[@text='Training Support']").getText();
	System.out.println("Current title is:"+title);
	driver.findElementByXPath("//android.view.View[@content-desc=\"About Us\"]/android.widget.TextView").click();
	String newtitle = driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]").getText();
	System.out.println("Current title is:"+newtitle);
	Assert.assertEquals(title, "Training Support");
	Assert.assertEquals(newtitle, "About Us");

}
@AfterClass

public void tearDown() {

    driver.quit();

}
}
