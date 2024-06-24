package brainproject;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@BeforeClass
		ChromeDriver driver=new ChromeDriver();
		@test
		
		driver.get("https://www.jotun.com/in-en");
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div/button/svg[1]")).click();
}
}
//WebElement p=driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
////getText() to obtain text
//p.click();
//
//WebElement q=driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div/button"));
//q.click();
//System.out.print("finish");
//driver.findElement(By.xpath("//*[@id=\"header-menu\"]/div[2]/div/ul[1]/li[1]/a")).click();
//
//System.out.print("finish");
//WebElement op=driver.findElement(By.xpath("//*[contains(text(), 'Explore Colours')]"));
//
//op.click();
//System.out.print("finish3");