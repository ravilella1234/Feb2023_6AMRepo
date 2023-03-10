package selenium;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest 
{
	public static WebDriver driver;
	public static String ProjectRootPath = System.getProperty("user.dir")+"/src/test/resources";
	public static FileInputStream fis;
	public static Properties p;
	public static Properties mainProp;
	public static Properties childProp;
	
	public static void init() throws Exception
	{
		System.out.println(System.getProperty("user.dir"));
		//FileInputStream fis = new FileInputStream("D:\\April2022WD\\March2023_6AM_SeleniumBatch\\src\\test\\resources\\data.properties");
		fis = new FileInputStream(ProjectRootPath+"/data.properties");
		p = new Properties();
		p.load(fis);
		
		fis = new FileInputStream(ProjectRootPath+"/environment.properties");
		mainProp = new Properties();
		mainProp.load(fis);
		String e = mainProp.getProperty("env");
		System.out.println(e);
		
		fis = new FileInputStream(ProjectRootPath+"/"+e+".properties");
		childProp = new Properties();
		childProp.load(fis);
		System.out.println(childProp.getProperty("amazonurl"));
		
	}
	
	public static void launch(String browser)
	{
		if(p.getProperty(browser).equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(p.getProperty(browser).equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(p.getProperty(browser).equals("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
	}
	
	public static void navigateUrl(String url)
	{
		//driver.get(childProp.getProperty(url));
		driver.navigate().to(childProp.getProperty(url));
	}

}
