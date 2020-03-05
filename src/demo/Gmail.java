package demo;

	

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Gmail {
		public static void main(String[] args)
		 {
			 System.setProperty("webdriver.chrome.driver","D:/SeleniumJars/ChromeDriver/chromedriver.exe");
				System.setProperty("webdriver.driver.bin","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("http://www.gmail.com");
				driver.findElement(By.id("identifierId")).sendKeys("anjalichintham98@gmail.com");
				

	}
	}



