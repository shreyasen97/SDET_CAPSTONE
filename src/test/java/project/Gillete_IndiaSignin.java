package project;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import capstone.gillete_Landing;
import capstone.gillete_signin;
import resources.baseInitialise;
import resources.dataDriven;

public class Gillete_IndiaSignin extends baseInitialise{
	public static Logger log = LogManager.getLogger(baseInitialise.class.getName());

	@BeforeTest()
	public void initialize() throws IOException {
		driver = InitialiseDriver();
		log.info("Driver is initialised");
		driver.get("https://www.gillette.co.in/en-in");
		log.info("Landing on the gillete India Page ");
		driver.manage().window().maximize();

	}
@Test()
public void IndiaRegisteration() throws IOException, InterruptedException {
	
	gillete_Landing gl= new gillete_Landing(driver);
	gl.getsignin().click();
	
	 dataDriven d=new dataDriven();
	    ArrayList data= d.getData("User1");
	    gillete_signin gs=new gillete_signin(driver);
	    
	    String uname= (String) data.get(3);
	    gs.getusername().sendKeys(uname);
	
	
	    String pwd= (String) data.get(4);
	    gs.getpassword().sendKeys(pwd);
	gs.getsubmit().click();
	
	
	
	
}
@AfterTest
public void TearDown() {
	driver.close();
	driver=null;
}
}