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

public class TestNGClass4 extends TesgNGBase2 {
	
	
	@BeforeClass
	public void Beforeclass(){
		System.out.println("Child 4 Class :: Beforeclass 4");
	}
	
	
	
	@BeforeMethod
	public void Beforemethod(){
		System.out.println("Child 4 Class :: Beforemethod 4 ");
	}
	
	@Test
	public void TestCase4Suite4(){
		System.out.println("Child 4 Class :: TestCase4Suite 4 ");
	}
	
	@AfterMethod
	public void Aftermethod(){
		System.out.println("Child 4 Class :: Aftermethod 4 ");
	}
	
	@AfterClass
	public void Afterclass(){
		System.out.println("Child 4 Class :: Afterclass 4 ");
	}

}
