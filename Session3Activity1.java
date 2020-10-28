package MavenTest.NewAppium;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class Session3Activity1 {
	AppiumDriver<MobileElement> driver = null;
	 WebDriverWait wait;
    @BeforeClass
    public void calc() throws InterruptedException, IOException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceId", "BIFQONBQCEL7SGEU");
        caps.setCapability("deviceName", "vivo vivo 1901");
        caps.setCapability("platformName", "android");
        caps.setCapability("appPackage", "com.android.mms");
        caps.setCapability("appActivity", ".ui.ConversationList");
        caps.setCapability("noReset", true);
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    }
  @Test
  public void sendSMS() throws InterruptedException {
	  
	  driver.findElementByXPath("//android.widget.LinearLayout[3]/android.widget.Button[2]").click();
	
	  driver.findElementByAccessibilityId("Add Contact").click();
	  driver.findElementByXPath("//android.widget.EditText[@text = 'Search among 3209 contacts']").click();
	  driver.findElementByXPath("//android.widget.EditText[@text = 'Search among 3209 contacts']").sendKeys("Myself");
	  driver.findElementByXPath("//android.widget.TextView[@text = 'Myself']").click();
	  driver.findElementByXPath("//android.widget.Button[@text = 'Done']").click();
	  driver.findElementById("com.android.mms:id/embedded_text_editor").sendKeys("Dear me, stay strong");
	  driver.findElementById("com.android.mms:id/send_button").click();
	  driver.findElementByXPath("//android.widget.LinearLayout[2]/android.widget.Button").click();
	  String contactName = driver.findElementById("com.android.mms:id/from").getText();
	  String msg = driver.findElementById("com.android.mms:id/subject").getText();
	  new WebDriverWait(driver, 10);
	  Assert.assertEquals(contactName, "Myself(1) ");
	  Assert.assertEquals(msg, "Dear me, stay strong");
	  
	  
  }

}
