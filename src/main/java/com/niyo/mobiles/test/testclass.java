package com.niyo.mobiles.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.niyo.mobiles.basedriver.baseclass;
import com.niyo.mobiles.method.methodclass;

public class testclass extends baseclass {
	
	
	
	methodclass methodcalassobj = null;

	@BeforeMethod
	@BeforeClass
	public void setUp(ITestContext context) {

		context.setAttribute("driver", driver);
		methodcalassobj = new methodclass(driver);
		

	}

	@Test
	public void verifystatictextOnHomepage()
	{
		methodcalassobj.verifyMenuText();
		methodcalassobj.verifyTextOnHomePage();
		
		
		
	}

}
