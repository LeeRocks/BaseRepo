package tests.base;
import org.testng.annotations.*;

/**
 * 
 */

/**
 * @author Ramana
 *
 */
public abstract class TesgNGBase2 {

	/**
	 * 
	 */
	public TesgNGBase2() {
		// TODO Auto-generated constructor stub
	}
	
	@BeforeSuite
	public void BeforeSuite1(){
		System.out.println("Base Class :: BeforeSuite 2");
	}
	
	@AfterSuite
	public void AftereSuite1(){
		System.out.println("Base Class :: AftereSuite 2");
	}
	
	@BeforeTest
	public void BeforeTest(){
		System.out.println("Base Class :: suite 2 - BeforeTest 1");
	}
	
	@AfterTest
	public void AfterTest(){
		System.out.println("Base Class :: suite 2 - AfterTest 1");
	}

}
