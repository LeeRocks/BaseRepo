package samples.testng;

import org.testng.annotations.Test;

@Test
public class ClassLevelAnnotations  {
 
	
  public void A() {
	  System.out.println("Helloo.. Im in method A()::" + Thread.currentThread().getName());
  }
  
  public void B() {
		System.out.println("Helloo.. Im in method adding numbers::" + Thread.currentThread().getName());
	}

    
	public void D() {
		System.out.println("Helloo.. Im in method divided by zero::" +Thread.currentThread().getName());
		int e = 1 / 0;
	}

	@Test(dependsOnMethods={"D"})
	public void C() {
		System.out.println("Helloo.. Im in method skip::"+ Thread.currentThread().getName());
	}
}
