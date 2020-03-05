package demo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	public static void main(String[] args)throws IOException
	 {
		 System.setProperty("webdriver.chrome.driver","D:/SeleniumJars/ChromeDriver/chromedriver.exe");
			System.setProperty("webdriver.driver.bin","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://www.prtc.in/PRTCWeb/preUserAuthenticate.do;jsessionid=8DFFF41C70B68513210D6EADE125775A");
			driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[1]/input")).click();
		Alert a = driver.switchTo().alert();
		//System.out.println(a.getText());
		//a.accept();
		//a.dismiss();
		//a.sendKeys("Anjali");
		//a.accept();
		
}
}
