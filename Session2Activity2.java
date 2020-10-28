package MavenTest.NewAppium;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Session2Activity2 {
	AppiumDriver<MobileElement> driver = null;
    @BeforeClass
    public void calc() throws InterruptedException, IOException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceId", "BIFQONBQCEL7SGEU");
        caps.setCapability("deviceName", "vivo vivo 1901");
        caps.setCapability("platformName", "android");
        caps.setCapability("appPackage", "com.android.bbkcalculator");
        caps.setCapability("appActivity", "com.android.bbkcalculator.Calculator");
        caps.setCapability("noReset", true);
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    }
    
    
  @Test (priority = 0)
  public void add() 
  {
	  driver.findElementByAccessibilityId("5").click();
	     driver.findElementById("plus").click();
		 driver.findElementByAccessibilityId("9").click();
		 driver.findElementById("equal").click();
		 
		 String addResult = driver.findElementById("input_edit").getText();
		
     System.out.println("Calculation result of addition is:"+addResult);
     Assert.assertEquals(addResult, "14");
  }
  
  @Test (priority = 1)
  public void Sub() 
  {	     driver.findElementById("clear").click();
	     driver.findElementByAccessibilityId("1").click();
	     driver.findElementByAccessibilityId("0").click();
		 driver.findElementById("minus").click();
		 driver.findElementByAccessibilityId("5").click();
		 driver.findElementById("equal").click();
		 
		 String subResult = driver.findElementById("input_edit").getText();
		
     System.out.println("Calculation result of Subtraction is:"+subResult);
     Assert.assertEquals(subResult, "5");
  }
  
  @Test (priority = 2)
  public void Mult() 
  
  {      driver.findElementById("clear").click();
	     driver.findElementByAccessibilityId("5").click();
	 	 driver.findElementById("mul").click();
		 driver.findElementByAccessibilityId("1").click();
		 driver.findElementByAccessibilityId("0").click();
		 driver.findElementByAccessibilityId("0").click();
		 driver.findElementById("equal").click();
		 
		 String multResult = driver.findElementById("input_edit").getText();
		
     System.out.println("Calculation result of multiplication is:"+multResult);
     Assert.assertEquals(multResult, "500");
  }
  @Test (priority = 3)
  public void div() 
  {
	  driver.findElementById("clear").click();
		 
	  driver.findElementByAccessibilityId("5").click();
	  driver.findElementByAccessibilityId("0").click();
		 driver.findElementById("div").click();
		 driver.findElementByAccessibilityId("2").click();
		 driver.findElementById("equal").click();
		 
		 String divResult = driver.findElementById("input_edit").getText();
		 
     System.out.println("Calculation result of division is:"+divResult);
     Assert.assertEquals(divResult, "25");
  }

  @AfterClass
  public void tearDown() {

	    driver.quit();

	}

}
