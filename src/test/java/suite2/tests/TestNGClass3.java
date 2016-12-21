package suite2.tests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import tests.base.TesgNGBase;
import tests.base.TesgNGBase2;

public class TestNGClass3 extends TesgNGBase2 {
	
	
	@BeforeClass
	public void Beforeclass(){
		System.out.println("Child 3 Class :: Beforeclass 3");
	}
	
	
	
	@BeforeMethod
	public void Beforemethod(){
		System.out.println("Child 3 Class :: Beforemethod 3 ");
	}
	
	@Test
	public void TestCase3Suite3(){
		System.out.println("Child 3 Class :: TestCase3Suite 3 ");
	}
	
	@AfterMethod
	public void Aftermethod(){
		System.out.println("Child 3 Class :: Aftermethod 3 ");
	}
	
	@AfterClass
	public void Afterclass(){
		System.out.println("Child 3 Class :: Afterclass 3 ");
	}

}
