package com.orange.Pages;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.orange.BaseTest.BaseClass;

public class IndexPage extends BaseClass {
	@Parameters("browser")
	@Test(groups= {"sanity","smoke","functional"})
	public void firsttest() {
		System.out.println("First test case"+Thread.currentThread().getId());
		Assert.fail();
	}
	
	@Test(dependsOnMethods ="firsttest",alwaysRun =true)
	public void secondTest() {
		System.out.println("second test case"+Thread.currentThread().getId());
	}

}
