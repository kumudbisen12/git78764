package model15;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookSynchroniz 
{
	public static void main(String[] args) 
	{ 
		System.out.println("the current url 121212");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ab\\Desktop\\Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String url=driver.getCurrentUrl();
		System.out.println("the current url is:"+ url);
		
		String Title = driver.getTitle();
		System.out.println("The Title is:"+ Title);
		
		driver.findElement(By.linkText("Forgotten account?")).click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String Title1 = driver.getTitle();
		System.out.println("The Title of forgot page is"+ Title1);
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Megha");
		
	    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bisen");
	    
	    driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("meghabisen@gmail.com");
	    
	    /*WebDriverWait wait = new WebDriverWait(driver,15);
	    
	    wait.until(Expected condition.visibility of element located ("//input[@name='reg_email']")).sendKey
	    */
	    
		
		
		
	}

}
