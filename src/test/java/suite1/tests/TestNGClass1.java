package suite1.tests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import tests.base.TesgNGBase;


public class TestNGClass1 extends TesgNGBase {
	
	
	@BeforeClass
	public void Beforeclass(){
		System.out.println("Child 1 Class :: Beforeclass 1");
	}
	
	
	
	@BeforeMethod
	public void Beforemethod(){
		System.out.println("Child 1 Class :: Beforemethod 1 ");
	}
	
	@BeforeGroups(groups={"ui"})
	public void TestCase1Suite1_beforegroup(){
		System.out.println("@BeforeGroups :: TestCase1Suite 1 ");
	}
	
	@Test(groups = {"ui"})
	public void TestCase1Suite1(){
		System.out.println("Child 1 Class :: TestCase1Suite 1 ");
	}
	
	@AfterGroups(groups={"ui"})
	public void TestCase1Suite_aftergroups(){
		System.out.println("@AfterGroups :: TestCase1Suite 1 ");
	}
	
	
	
	@AfterMethod
	public void Aftermethod(){
		System.out.println("Child 1 Class :: Aftermethod 1 ");
	}
	
	@AfterClass
	public void Afterclass(){
		System.out.println("Child 1 Class :: Afterclass 1 ");
	}

}
