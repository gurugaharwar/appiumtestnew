package com.niyo.mobiles.method;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.niyo.mobiles.basedriver.baseclass;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class methodclass  {
	
	
	
	public RemoteWebDriver driver;
	
	@AndroidFindBy(xpath = "//*[@text='Hello World!']")
	public WebElement statictext_ele;
	@AndroidFindBy(xpath = "//*[contains(@text,'Application')]")
	public WebElement menutext_ele;
	
	
	
	;
	
	public methodclass(RemoteWebDriver driver) {
		
		this.driver =  driver;
	    //PageFactory.initElements(this.driver, this);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
		
	}
	
	public void verifyTextOnHomePage()
	{
		Assert.assertEquals(statictext_ele.getText().trim(), "Hello World!");
		System.out.println("Hello World! verfiy");
		
	}
	
	public void verifyMenuText()
	{
		
		
		Assert.assertEquals(menutext_ele.getText().trim(), "TestApplication");
		System.out.println("TestApplication verfiy");
	}
}
