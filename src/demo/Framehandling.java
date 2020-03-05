package demo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framehandling {
	public static void main(String[] args)throws IOException
	 {
		 System.setProperty("webdriver.chrome.driver","D:/SeleniumJars/ChromeDriver/chromedriver.exe");
			System.setProperty("webdriver.driver.bin","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://jqueryui.com/draggable/");
			driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
			System.out.println(driver.findElement(By.id("draggable")).isDisplayed());
			driver.switchTo().defaultContent();
			driver.findElement(By.linkText("Droppable")).click();
			
	 }
	
}
