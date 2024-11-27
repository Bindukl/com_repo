package newscriptTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaTest {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("bindulokesh9@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.id("pass")).sendKeys("bindulokesh9@gmail.com");
		driver.manage().window().minimize();
	}

}
