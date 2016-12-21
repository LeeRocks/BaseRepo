package waits.timeouts;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.google.common.base.Predicate;

public class ExplicitWait {

	// created reference variable for WebDriver

	       WebDriver drv;
	       String pattern; 
	       SimpleDateFormat simpleDateFormat ;
	       String date;

	       @Test
	       public void setup(){
	             
	    	   pattern = "HH:mm:ss:SSS";
	              simpleDateFormat = new SimpleDateFormat(pattern);
	             // date = simpleDateFormat.format(new Date());
	              drv=new FirefoxDriver();
	              drv.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
	              drv.get("C:\\Users\\Ramana\\Desktop\\timeout-ex.html");
	              //drv.get("http://www.amazon.in");
	              
	              WebElement input = drv.findElement(By.id("btn1"));
	              
	              Predicate<WebElement> function = new Predicate<WebElement>() {
						
						@Override
						public boolean apply(WebElement input) {
							// TODO Auto-generated method stub
							return false;
						}
					};
	              
	              FluentWait<WebElement> fWait = new FluentWait<WebElement>(input)
	            		  .withTimeout(10, TimeUnit.SECONDS)
	            		  .pollingEvery(1, TimeUnit.SECONDS)
	            		  .ignoring(org.openqa.selenium.NoSuchElementException.class);
                          
	            		                               
	             
	            		                               
	              
	              //drv.manage().window().maximize();
	        /*    	              
	            FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(drv)
	            		  												   .withTimeout(10, TimeUnit.SECONDS)
	            		                                                   .pollingEvery(1, TimeUnit.SECONDS)
	            		                                                   .ignoring(NoSuchElementException.class);
	          
	          Function<WebDriver, WebElement> function = new Function<WebDriver, WebElement>() {

					@Override
					public WebElement apply(WebDriver input) {
						// TODO Auto-generated method stub
						System.out.println("waiting for element btn1==>" + simpleDateFormat.format(new Date()));
						return input.findElement(By.id("btn1"));
					}
	          };
	            
	           // element.click();
	            
	            fluentWait.until(function);
	              
	              Predicate<WebDriver> predicate = new Predicate<WebDriver>() {

					@Override
					public boolean apply(WebDriver input) {
						// TODO Auto-generated method stub
						return false;
					}
				};
	              
	              
				  fluentWait.until(predicate);
				  */
	              drv.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	              System.out.println("waiting for element btn1==>" + simpleDateFormat.format(new Date()));
				  
	             WebDriverWait wait = new WebDriverWait(drv, 10);
	              //FluentWait<WebElement> wait = new FluentWait<WebElement>(drv.findElement(By.id(id)));
	              //Wait
	              wait.until( new Predicate<WebDriver>() {
			            public boolean apply(WebDriver driver) {
			            	System.out.println(((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete"));			            			
			                return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
			            }
			        }
			    );
	              
	              wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btn1")));
		            
				  System.out.println("found element btn1==>" + simpleDateFormat.format(new Date()));
	              
	              wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn1")));
	            
				  System.out.println("found element btn1==>" + simpleDateFormat.format(new Date()));
				 
				 
	              
	              /*
	              pattern = "HH:mm:ss:SSS";
	              simpleDateFormat = new SimpleDateFormat(pattern);
	              date = simpleDateFormat.format(new Date());
	              System.out.println("waiting for element" +"==>" + date);
		    	  drv.findElement(By.id("btn1")).click();
		    	  System.out.println("found elemenet       ==>" + date);
		    	  
		    	  System.out.println("waiting for element 2" +"==>" + date);
		    	  drv.findElement(By.id("btn2")).click();
		    	  System.out.println("found elemenet    2   ==>" + date);*/

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
