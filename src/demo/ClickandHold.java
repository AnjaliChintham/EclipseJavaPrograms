package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickandHold {
	public static void main(String[] args)throws IOException
	 {
		 System.setProperty("webdriver.chrome.driver","D:/SeleniumJars/ChromeDriver/chromedriver.exe");
			System.setProperty("webdriver.driver.bin","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://jqueryui.com/selectable/");
			driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
           WebElement a=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
           WebElement b=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]"));
           WebElement c=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]"));
           WebElement d=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]"));
           WebElement e=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[5]"));
           WebElement f=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[6]"));
           WebElement g=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[7]"));
           Actions action= new Actions(driver);
           action.clickAndHold(a).clickAndHold(b).release().build().perform();
	        
	 }
}
