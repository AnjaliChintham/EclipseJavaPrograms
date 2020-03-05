package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousemovement {
	public static void main(String[] args)
	 {
		 System.setProperty("webdriver.chrome.driver","D:/SeleniumJars/ChromeDriver/chromedriver.exe");
			System.setProperty("webdriver.driver.bin","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
           driver.get("https://www.hdfcbank.com/");
           WebElement a=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[13]/div[3]/div[3]/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/a/span[3]"));
           WebElement b=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[13]/div[3]/div[3]/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/ul/li[1]/ul/li[3]/a/span"));
           Actions act=new Actions(driver);
           act.moveToElement(a);
           act.moveToElement(b).click().build().perform();
           
	 
	 }
	


}
