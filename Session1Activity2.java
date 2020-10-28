package MavenTest.NewAppium;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Session1Activity2 {
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
	    
	    @Test
	    public void multiply()
	    	{    
	    		 driver.findElementByAccessibilityId("9").click();
	    		 driver.findElementById("mul").click();
	    		 driver.findElementById("digit6").click();
	    		 driver.findElementById("equal").click();
	    		 
	    		 String result = driver.findElementById("input_edit").getText();
	    		 
	            System.out.println("Calculation result is:"+result);
	           
	        	
	        
	            
	            
	        } 
	}

