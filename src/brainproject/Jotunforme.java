package brainproject;

import java.time.Duration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Jotunforme {
	
	
	ChromeDriver driver;
	@Before
	public void setup()
	{
		
		driver=new ChromeDriver();
		driver.get("https://www.sonatawatches.in/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void steptest() {
		 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		 	driver.findElement(By.xpath("//*[@id=\"evg-exit-intent-popup-email-capture\"]/div/div/button")).click();
		 	driver.findElement(By.xpath("//*[@id=\"moe-dontallow_button\"]")).click();
		 	System.out.print("pinish");
		 	driver.findElement(By.xpath("//*[@id=\"Group_19494\"]")).click();
		 	driver.findElement(By.xpath("//a[@id='mens-watches']")).click();
		 	System.out.print("finish");
		   driver.findElement(By.xpath("//*[@id=\"product-search-results\"]/div[10]/div[3]/div[2]/div[2]/div[2]/div/div/div[1]/a/div/img")).click();
		   System.out.print("finish2");
		   
		
		// Locating the element 

		   WebElement e = driver.findElement(By.xpath("//*[@id=\"tw-pdpTab-tech-specs\"]/div/div/ul/li[3]/span[2]"));

		    String actualElementText = e.getText();
		    System.out.print(actualElementText);
		   //using getText method the retrieve the text of the element

		   String expectedElementText = "Men";
		   
		    //Assert to verify the actual and expected values

		   Assert.assertEquals(actualElementText, expectedElementText);
		   driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[3]/div/div[3]/div[2]/div/div[4]/div[1]/div[4]/div[1]/div[1]")).click();
		   System.out.print("finish");
		   driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[3]/div/div[3]/div[2]/div/div[4]/div[1]/div[4]/div[1]/div[2]/a")).click();
		   System.out.print("mens clothing from a link works ");
		   
		   
		   WebElement bag =driver.findElement(By.xpath("//*[@id=\"order-totals-container\"]/div[1]/div[1]/div[1]/span[2]"));
		   String expectednextText = "(1 Item)";
//
		   String iteminbag = bag.getText();
		   System.out.print(iteminbag);
		   Assert.assertEquals(iteminbag,expectednextText);
		   System.out.print("cart works fine"); 
		   driver.navigate().back();  
		   driver.findElement(By.xpath("//*[@id=\"Group_20185\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"emailinput\"]")).sendKeys("abcds");
		driver.findElement(By.xpath("//*[@id=\"orderno\"]")).sendKeys("sad424");
		   driver.findElement(By.xpath("//*[@id=\"trackOrderPopUp\"]/div/div/div[3]/button")).click();
		   System.out.print("dont except invalid data");  
		  
	}

}
