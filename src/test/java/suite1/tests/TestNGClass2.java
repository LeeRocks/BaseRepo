package suite1.tests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import tests.base.TesgNGBase;

public class TestNGClass2 extends TesgNGBase {
	
	
	@BeforeClass
	public void Beforeclass(){
		System.out.println("Child 2 Class :: Beforeclass 2");
	}
	
	
	
	@BeforeMethod
	public void Beforemethod(){
		System.out.println("Child 2 Class :: Beforemethod 2 ");
	}
	
	@Test(groups = {"db"})
	public void TestCase2Suite2(){
		System.out.println("Child 2 Class :: TestCase2Suite 2 ");
	}
	
	@AfterMethod
	public void Aftermethod(){
		System.out.println("Child 2 Class :: Aftermethod 2 ");
	}
	
	@AfterClass
	public void Afterclass(){
		System.out.println("Child 2 Class :: Afterclass 2 ");
	}

}
