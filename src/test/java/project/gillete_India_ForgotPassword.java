package project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import capstone.Email_Reset_Page;
import capstone.Email_login;
import capstone.gillete_Landing;
import capstone.gillete_Reset_password_page;
import capstone.gillete_signin;
import resources.baseInitialise;
import resources.dataDriven;

public class gillete_India_ForgotPassword  extends baseInitialise {
	
	public static Logger log = LogManager.getLogger(baseInitialise.class.getName());

	@BeforeTest()
	public void initialize() throws IOException {
		driver = InitialiseDriver();
		log.info("Driver is initialised");
		driver.get("https://www.gillette.co.in/en-in");
		log.info("Landing on the gillete India Page ");
		driver.manage().window().maximize();

	}
	public void forgot() throws IOException, InterruptedException {
		gillete_Landing gl= new gillete_Landing(driver);
	
		gl.getsignin().click();
		 gillete_signin gs=new gillete_signin(driver);
		
		gs.getfpwd().click();
		dataDriven d=new dataDriven();
	    ArrayList data= d.getData("User1");
	    String mail= (String) data.get(3);
	    gs.getforgotmail().sendKeys(mail);
		
		gs.getcreatepwd().click();
		
	Email_login el=new Email_login(driver);
   
 
	
	el.getmailUsername().sendKeys(mail);
	el.getmailnext().click();
	Thread.sleep(3000);
	 String pwd= (String) data.get(4);
	el.getmailpassword().sendKeys(pwd);
	el.getpasswordnext().click();
	Thread.sleep(3000);
		
	el.getUnreadmail();
	el.getresetpassword().click();
	Email_Reset_Page er=new Email_Reset_Page(driver);
	Set<String> set =driver.getWindowHandles();
	Iterator<String> itr= set.iterator();
		String MainWindow=itr.next();
		String Childwindow = itr.next();
		driver.switchTo().window(Childwindow);

	er.getresetpwd().sendKeys("Gaurav@123");
	er.getresetcnfpwd().sendKeys("Gaurav@123");
	
	er.getcreatenewpwd().click();
	driver.switchTo().window(MainWindow);
	Thread.sleep(3000);
	er.getclearmail().click();
		
		
		
	}
	
	
	@AfterTest
	public void TearDown() {
		driver.close();
		driver=null;
	}
	
	
	
	

}
