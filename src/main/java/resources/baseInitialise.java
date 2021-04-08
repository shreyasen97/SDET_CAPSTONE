package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseInitialise {
	public WebDriver driver;
	public WebDriver InitialiseDriver() throws IOException {
		
		Properties prop=new Properties();
		FileInputStream file=new FileInputStream("D:\\Garv\\Gaurav\\src\\main\\java\\resources\\Data.properies");
		
		prop.load(file);
		String browserName= prop.getProperty("browser");
		System.out.println(browserName);
	
	if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Me\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
	}
	else if(browserName.equals("firefox")){
		
		System.setProperty("webdriver.gecko.driver","D:\\Garv\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	}
public void getScreenshot( String testCaseName,WebDriver driver) throws IOException {
	TakesScreenshot ts=(TakesScreenshot) driver;
	
File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
String destinationFile=System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";

FileUtils.copyFile(source, new File(destinationFile));

	
	
}
	
	
}
