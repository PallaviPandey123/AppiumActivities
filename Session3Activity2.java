package MavenTest.NewAppium;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Session3Activity2 {

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
  public void getImage() throws InterruptedException {
		driver.get("https://www.training-support.net/selenium/lazy-loading");
	  //  MobileElement pageTitle = driver.findElementByClassName("android.widget.TextView");
      //  wait.until(ExpectedConditions.textToBePresentInElement(pageTitle, "Lazy Loading"));
		  
	  List<MobileElement> numberOfImages2 = driver.findElementsByClassName("android.widget.Image");
	  System.out.println("Number of Images :"+numberOfImages2.size());
	 
	  
	  driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollIntoView(text(\"helen\"))"));
	//  driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector()).scrollTextIntoView(\"helen\")"));
	  List<MobileElement> numberOfImages1 = driver.findElementsByXPath("//android.view.View/android.view.View/android.widget.Image");
	  	System.out.println("Number of Images after helen :"+numberOfImages1.size());
	  	 Assert.assertEquals(numberOfImages1.size(), 4);
  }
  
  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
