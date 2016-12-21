package waits.timeouts;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sun.corba.se.impl.orbutil.threadpool.TimeoutException;
import com.thoughtworks.selenium.webdriven.commands.Open;

public class ImplicitWait {

	// created reference variable for WebDriver

	       WebDriver drv;
	       String pattern; 
	       SimpleDateFormat simpleDateFormat ;
	       String date;

	       @Test(enabled=false)
	       public void setup(){
	             
	              drv=new FirefoxDriver();
	              drv.get("C:\\Users\\Ramana\\Desktop\\timeout -ex.html");
	              drv.manage().window().maximize();
	              drv.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	              pattern = "HH:mm:ss:SSS";
	              simpleDateFormat = new SimpleDateFormat(pattern);
	              date = simpleDateFormat.format(new Date());
	              System.out.println("waiting for element" +"==>" + date);
		    	  drv.findElement(By.id("btn1")).click();
		    	  System.out.println("found elemenet       ==>" + date);
		    	  
		    	  //drv.navigate().t
		    	  System.out.println("waiting for element 2" +"==>" + date);
		    	  drv.findElement(By.id("btn2")).click();
		    	  System.out.println("found elemenet    2   ==>" + date);

	       }
	       
	       @Test
	       public void ExplicitVsImplicitWaitTest()
	        {
	    	   pattern = "HH:mm:ss:SSS";
	              simpleDateFormat = new SimpleDateFormat(pattern);
	    	   System.out.println("waiting for element" +"==>");
	            drv = new FirefoxDriver();
	            drv.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	            drv.get("https://www.google.com/");
	            drv.manage().window().maximize();
	            System.out.println("waiting for element" +"==>2");
	            date = simpleDateFormat.format(new Date());
	              System.out.println("waiting for element" +"==>" + date);
	              
	              WebDriverWait wdw = new WebDriverWait(drv, 15);
	              wdw.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("")));
	              
	             WebElement we = new WebDriverWait(drv, 15).until(
	  	                ExpectedConditions.presenceOfElementLocated(By.cssSelector("Should Fail")));

//	            try
//	            {
//	                new WebDriverWait(drv, 15).until(
//	                ExpectedConditions.presenceOfElementLocated(By.cssSelector("Should Fail")));
//	               // drv.findElement(By.cssSelector("Should Fail"));
//	            }catch(org.openqa.selenium.TimeoutException ex)
//	            {
//	            	date = simpleDateFormat.format(new Date());
//		              System.out.println("waiting for element" +"==>" + date);
//	            }
	            
	            date = simpleDateFormat.format(new Date());
	              System.out.println("waiting for element" +"==>" + date);

	            drv.quit();

	        }
//	       
//	       @Test
//	       public void test() {
//	    	   
//	    	 //  System.out.println(date);
//	    	   System.out.println("waiting for element" +"==>" + date);
//	    	  //WebElement username = drv.findElement(By.id("my_div1"));
//	    	  drv.findElement(By.id("btn1"));
//	    	  System.out.println("found elemenet ==>" + date);
//	    	   
//	       }
	       
	       @AfterClass
	       public void teardown() {	      
	              // closes all the browser windows opened by web driver	  
	         // drv.quit();     	      
	              }
	    
	       }
