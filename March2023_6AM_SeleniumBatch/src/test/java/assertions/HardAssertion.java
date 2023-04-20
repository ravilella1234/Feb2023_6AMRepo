package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssertion 
{

	public static void main(String[] args) 
	{
		ChromeOptions option  = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		String expectedlink = "Customer Serv";
		String actuallink =driver.findElement(By.linkText("Customer Service")).getText();
		
		//Assert.assertEquals(actuallink, expectedlink);
		Assert.assertTrue(actuallink.equals(expectedlink), "Both links are not equal...");
		
		driver.findElement(By.linkText("Customer Service")).click();
	}

}
