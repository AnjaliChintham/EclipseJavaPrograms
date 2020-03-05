package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {
	public static void main(String[] args)
	 {
		 System.setProperty("webdriver.chrome.driver","D:/SeleniumJars/ChromeDriver/chromedriver.exe");
			System.setProperty("webdriver.driver.bin","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.findElement(By.id("txtUsername")).sendKeys("admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			//driver.findElement(By.xpath("//*[@id='btnLogin' or @name='Submit'] ")).click();
			//driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
			driver.findElement(By.xpath("//input[starts-with(@id,'btnLogin')]")).click();
			//driver.findElement(By.id("id=\"menu_admin_UserManagement\"")).click();
			//driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
			//driver.findElement(By.id("name=\"searchSystemUser[userName]\"")).sendKeys("Anjali");
			

}
}
