package Academy;

import java.awt.FontFormatException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemotestNG {

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
	@Test(priority = -1, expectedExceptions = FontFormatException.class)
	public void test()
	{
		System.out.println("Main Test");
	}
	@Test
	public void test1()
	{
		System.out.println("Main Test1");
	}
	@Test
	public void test2()
	{
		System.out.println("Main Test2");
	}
	@Test(priority = 0)
	public void test3()
	{
		System.out.println("Main Test3");
	}
	@Test
	public void test4()
	{
		System.out.println("Main Test4");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After method");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("after Class");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("after test");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After suite");
	}
	
	
}

