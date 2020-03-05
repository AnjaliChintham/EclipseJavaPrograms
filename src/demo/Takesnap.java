package demo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takesnap {
	public static void main(String[] args)throws IOException
	 {
		 System.setProperty("webdriver.chrome.driver","D:/SeleniumJars/ChromeDriver/chromedriver.exe");
			System.setProperty("webdriver.driver.bin","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://opensource-demo.orangehrmlive.com/");
			TakesScreenshot ts =((TakesScreenshot)driver);
			File Store=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Store, new File("D:\\MaheshCTS\\new\\src\\demonew\\Screenshot\\orange.png"));
			driver.findElement(By.id("txtUsername")).sendKeys("admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			

			
			
}

}
