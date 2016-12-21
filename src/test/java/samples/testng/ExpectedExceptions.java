package samples.testng;

import java.io.File;
import org.testng.annotations.Test;


public class ExpectedExceptions  {
	
 
    @Test(expectedExceptions=NullPointerException.class)
	public void D() {		
    	String j=null;
		File f = new File(j);
		System.out.println(f);
	}


}
