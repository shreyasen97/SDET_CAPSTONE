package project;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import capstone.gillete_Registeration;
import capstone.gillete_Landing;
import resources.baseInitialise;
import resources.dataDriven;

public class Gillete_India_Registeration_ExcelDriven extends baseInitialise {

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
		
		gl.getregister().click();
		
        dataDriven d=new dataDriven();
    ArrayList data= d.getData("User1");
    gillete_Registeration gr=new gillete_Registeration(driver);
    
    String fname= (String) data.get(1);
    gr.getfirstname().sendKeys(fname);
    String lname= (String) data.get(2);
    gr.getlastname().sendKeys(lname);
    String mailid = (String) data.get(3); 
    gr.getemail().sendKeys(mailid);
	 String pwd = (String) data.get(4);
	 gr.getpassword().sendKeys(pwd);
	  
	 String cnfpwd = (String) data.get(5);
	  gr.getconfirmpassword().sendKeys(cnfpwd);
	  
	  String zip = (String) data.get(6);
	  gr.getzipcode().sendKeys(zip);
		 
		  Select month = new Select(gr.getmonth()); 
		  month.selectByValue("02");
		  
		  Select year = new Select(gr.getyear());
		  year.selectByValue("1997");
		  
		  gr.getAgree().click();
		  gr.getsubmit().click();
		  
	
	}

	/*
	 * @AfterTest public void TearDown() { driver.close(); driver = null; }
	 */
}
