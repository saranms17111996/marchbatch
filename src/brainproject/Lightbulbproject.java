package brainproject;

import java.time.Duration;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public final class Lightbulbproject {
	
	ChromeDriver driver;
	@Before
	public void setup()
	{
		
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void steptest() {
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		   WebElement electronics=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/a"));
		   
		   Actions ac= new Actions(driver);
		   ac.moveToElement(electronics);
		   ac.perform();
		   System.out.print("finish");
		   driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
		   System.out.print("finish2");
		   
		   WebElement e = driver.findElement(By.id());

		   System.out.println(e.getText());
		   
	}
}
