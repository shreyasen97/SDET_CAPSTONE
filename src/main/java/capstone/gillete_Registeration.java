package capstone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class gillete_Registeration {

	public WebDriver driver;
public gillete_Registeration(WebDriver driver) {

		
		this.driver=driver;
	}
	

By firstname=By.xpath("//input[@id='phdesktopbody_0_grs_consumer[firstname]']");
By lastname =By.xpath("//input[@id='phdesktopbody_0_grs_consumer[lastname]']");
By email=By.xpath("//input[@id='phdesktopbody_0_grs_account[emails][0][address]']");
By pwd=By.xpath("//input[@id='phdesktopbody_0_grs_account[password][password]']");
By cnfpwd=By.xpath("//input[@id='phdesktopbody_0_grs_account[password][confirm]']");
By month=By.xpath("//select[@id='phdesktopbody_0_grs_consumer[birthdate][month]']");
By year= By.xpath("//select[@id='phdesktopbody_0_grs_consumer[birthdate][year]']");
By zip=By.xpath("//input[@id='phdesktopbody_0_grs_account[addresses][0][postalarea]']");
By allow=By.xpath("//input[@id='phdesktopbody_0_ctl44']");
By submit=By.xpath("//input[@id='phdesktopbody_0_submit']");
By fullname=By.xpath("//input[@id='customerName']");
By EmailDE=By.xpath("//input[@id='customerEmail']");
By cnfEmailDE=By.xpath("//input[@id='confirmCustomerEmail']");
By pwdDE=By.xpath("//input[@id='customerPassword']");
By cnfpwdDE=By.xpath("//input[@id='confirmPassword']");
By marketingDE =By.xpath("//input[@id='OptInReceiveNewsLetterRadio2']");
By RegisterDE=By.xpath("//button[@class='accountSignUp_submitButton']");



public WebElement getfirstname() {
	return driver.findElement(firstname);

}
public WebElement getlastname() {
	return driver.findElement(lastname);
}
public WebElement getemail() {
	return driver.findElement(email);
}
public WebElement getpassword() {
	return driver.findElement(pwd);
}
public WebElement getconfirmpassword() {
	return driver.findElement(cnfpwd);
}

public WebElement getmonth() {
	return driver.findElement(month);
}
public WebElement getyear() {
	return driver.findElement(year);
}
public WebElement getzipcode() {
	return driver.findElement(zip);
}
public WebElement getAgree() {
	return driver.findElement(allow);
}
public WebElement getsubmit() {
	return driver.findElement(submit);
}
public WebElement getfullname() {
	return driver.findElement(fullname);
}
public WebElement getEmailDE() {
	return driver.findElement(EmailDE);
}
public WebElement getcnfEmailDE() {
	return driver.findElement(cnfEmailDE);
}
public WebElement getpasswordDE() {
	return driver.findElement(pwdDE);
}
public WebElement getcnfpasswordDE() {
	return driver.findElement(cnfpwdDE);
}
public WebElement getmarketingDE() {
	return driver.findElement(marketingDE);
}
public WebElement getregisterDE() {
	return driver.findElement(RegisterDE);
}
}
