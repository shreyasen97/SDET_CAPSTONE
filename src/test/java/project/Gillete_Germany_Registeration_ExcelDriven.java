package project;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import capstone.gillete_Registeration;
import capstone.gillete_Landing;
import resources.baseInitialise;
import resources.dataDriven;

public class Gillete_Germany_Registeration_ExcelDriven extends baseInitialise {

	public static Logger log = LogManager.getLogger(baseInitialise.class.getName());

	@BeforeTest()
	public void initialize() throws IOException {
		driver = InitialiseDriver();
		log.info("Driver is initialised");
		driver.get("https://www.gillette.de/");
		log.info("Landing on the gillete India Page ");
		driver.manage().window().maximize();

	}

	@Test()
	public void IndiaRegisteration() throws IOException, InterruptedException {
		
		gillete_Landing gl= new gillete_Landing(driver);
		gl.getcookies().click();
    	Actions action = new Actions(driver);
    	action.moveToElement(gl.getaccount()).build().perform();
   gl.getregisterDE().click();
		
        dataDriven d=new dataDriven();
    ArrayList data= d.getData("User2");
    gillete_Registeration gr=new gillete_Registeration(driver);
    
    String fname= (String) data.get(7);
    gr.getfullname().sendKeys(fname);
 
    String mailid = (String) data.get(3); 
    gr.getemail().sendKeys(mailid);
   
    String cnfmailid = (String) data.get(3); 
    gr.getcnfEmailDE().sendKeys(cnfmailid);
   
	 String pwd = (String) data.get(4);
	 gr.getpassword().sendKeys(pwd);
	  
	 String cnfpwd = (String) data.get(5);
	  gr.getcnfpasswordDE().sendKeys(cnfpwd);
	  
	  gr.getmarketingDE().click();
	gr.getregisterDE().click();
	
	}

	@AfterTest
	public void TearDown() {
		driver.close();
		driver=null;
	}
}
