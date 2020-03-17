package com.niyo.mobiles.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.niyo.mobiles.method.methodclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class testclass  {
	
	
	public RemoteWebDriver  driver;
	


	
	@BeforeTest
	public void createAndroidDriver()  {
		
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "resourceapp/");
		File app = new File(appDir, "app-debug.apk");
	
		
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		

			try {
				driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		


	}
	
	

	@Test
	public void verifystatictextOnHomepage()
	{
		methodclass obj=new methodclass(driver);
		
		obj.verifyMenuText();
		obj.verifyTextOnHomePage();
		
		
		
	}

}
