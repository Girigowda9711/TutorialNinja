package com.orange.Pages;

import org.testng.annotations.Test;

import com.orange.BaseTest.BaseClass;

public class LoginPage extends BaseClass{
	
	@Test
	public void firsttest1() {
		System.out.println("First test case"+Thread.currentThread().getId());
	}
	
	@Test
	public void secondTest2() {
		System.out.println("second test case"+Thread.currentThread().getId());
	}


}
