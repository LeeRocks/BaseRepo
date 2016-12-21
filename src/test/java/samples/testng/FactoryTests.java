package samples.testng;

import org.testng.annotations.Factory;

public class FactoryTests  {
		
   
    @Factory
    public Object[] dataProviderMethod2() {
        return new Object[] {new FactoryDataTests(1),new FactoryDataTests(2)};
    }
    
    


}
