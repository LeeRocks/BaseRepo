package samples.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParameterizedTests  {
	
	
   // @Test(dataProvider="data-provider")
	@Test
    @Parameters("raman")
	public void D(@Optional("Optional") String val) {		    	
		System.out.println(val);
	}
	
    @DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod1() {
        return new Object[][] { { "data one" }, { "data two" } };
    }
    
    @DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod2() {
        return new Object[][] { { "data one" }, { "data two" } };
    }
    
    


}
