package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import  org.apache.commons.io.FileUtils;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	
public WebDriver intilization() throws IOException {
	
	 prop = new Properties();
	
	FileInputStream fis = new FileInputStream("C:\\Users\\vaibh\\eclipse-workspace\\TestNgE2E\\src\\main\\java\\resources\\data.properties");
	
	prop.load(fis);
	
	System.out.println(prop.getProperty("browser"));
	
	String browserName = prop.getProperty("browser");

	if (browserName.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/vaibh/Downloads/chromedriver_win32 (3)/chromedriver.exe");
		 driver = new ChromeDriver();
		
		
	}
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	return driver;
	
	
	
}

public void get_screenShot(String testcasename, WebDriver driver) throws IOException {
	
	File srcfile = ((TakesScreenshot)driver).getScreenshotAs((OutputType.FILE));
			
	String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testcasename+".png";
	
	//FileUtils.copyFile(srcfile, new File("./target/screenshot/screen.png" +srcfile));
			
	FileUtils.copyFile(srcfile, new File(destinationFile));
			
	
			
			/*TakesScreenshot  ts = ((TakesScreenshot)driver);
	   File file =ts.getScreenshotAs(OutputType.FILE);
	   
	   //FileUtils.copyFile(Source,new File());*/
	
	
	
}




}
