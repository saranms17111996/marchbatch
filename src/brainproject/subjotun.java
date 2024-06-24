package brainproject;

import java.time.Duration;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class subjotun {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		
		driver=new ChromeDriver();
		driver.get("https://www.sonatawatches.in/product/sonata-poze-quartz-analog-black-dial-watch-for-men-with-black-metal-strap-sp70028nm01w.html?lang=en_IN&plp=true&catID=mens-watches");
		driver.manage().window().maximize();
		
	}
	public void steptest() {
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	 	driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[3]/div/div[3]/div[2]/div/div[4]/div[1]/div[4]/div[1]/div[2]/a/button")).click();
	 	
	}
}
driver.findElement(By.xpath("//*[@id=\"Group_20185\"]")).click();
//driver.findElement(By.xpath("//*[@id=\"emailinput\"]")).sendKeys("abcds");
//driver.findElement(By.xpath("//*[@id=\"orderno\"]")).sendKeys("sad424");