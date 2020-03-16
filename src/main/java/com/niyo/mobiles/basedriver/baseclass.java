package com.niyo.mobiles.basedriver;


import java.net.MalformedURLException;
import java.net.URL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.annotations.BeforeClass;



import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.remote.MobileCapabilityType;

public class baseclass {
	
public RemoteWebDriver  driver=null;



@BeforeClass
public void initDriverBaseSetup()
{
	createAndroidDriver();
}



	public RemoteWebDriver createAndroidDriver()  {
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		
	
		capabilities.setCapability(MobileCapabilityType.APP, "/Users/atulsingh/Documents/app-debug.apk");
		

			try {
				driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4724/wd/hub"), capabilities);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		

		return driver;

	}
	
	
	
	
	
	
	


}
