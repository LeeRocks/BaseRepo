package samples.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;


public class FactoryDataTests{
	
	private int val;
	
	@Factory(dataProvider="providerFactory")
	 public FactoryDataTests(int data) {
		// TODO Auto-generated constructor stub
		 this.val=data;
		 //System.out.println("In CONSTRUCTOR.." + this.val);
	}	
	
	@BeforeClass
    public void beforeclass() {		    	
		//System.out.println("before class." + this.val);
	}
   
	@Test
    public void D() {		    	
		System.out.println("In Dd.............." + this.val);
	}

	
	@DataProvider
	public static Object[][] providerFactory(){
		return new Object[][]{{5},{6},{7}};
	}
	
		
}
