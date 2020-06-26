package pkg;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
	public static Properties prop;
	public static FileInputStream f;

	@BeforeSuite
	public void openBrowser() throws IOException {
		
		f=new FileInputStream("D:\\ENCLIPS\\MAVENandTESTNG\\dataDriven\\src\\test\\resources\\config.properties");
		prop=new Properties();
		prop.load(f);
		if(prop.getProperty("Browser").contentEquals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();	
		}else {
			System.out.println("Browser not found");
		}
		driver.get("https://ncpfeedbackform.web.app/#/form");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		}
}
