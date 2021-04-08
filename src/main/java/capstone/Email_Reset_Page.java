package capstone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Email_Reset_Page{
	public WebDriver driver;
	public Email_Reset_Page(WebDriver driver) {

			
			this.driver=driver;
			
	}
By resetpwd=By.xpath("//input[@id='phdesktopbody_0_grs_account[password][password]']");
By resetcnfpwd=By.xpath("//input[@name='phdesktopbody_0$phdesktopbody_0_grs_account[password][confirm]']");

By mailaddressDE=By.xpath("//input[@id='customerEmail']");
By newpwdDE=By.xpath("//input[@id='newPassword']");
By newcnfpwdDE=By.xpath("//input[@id='confirmPassword']");
By savechangesDE=By.xpath("//button[@class='passwordReset_button resetPassword_button']");


By createnewpwd=By.xpath("//input[@type='submit']");


By clearmail=By.xpath("//div[@class='iH bzn']//div[@class='T-I J-J5-Ji nX T-I-ax7 T-I-Js-Gs mA']");

public WebElement getresetpwd() {
	return driver.findElement(resetpwd);

}
public WebElement getresetcnfpwd() {
	return driver.findElement(resetcnfpwd);

}
public WebElement getcreatenewpwd() {
	return driver.findElement(createnewpwd);

}
public WebElement getclearmail() {
	return driver.findElement(clearmail);

}

public WebElement getmailaddressDE() {
	return driver.findElement(mailaddressDE);

}
public WebElement getnewpwdDE() {
	return driver.findElement(newpwdDE);

}
public WebElement getnewcnfpwdDE() {
	return driver.findElement(newcnfpwdDE);

}
public WebElement getsavechangesDE() {
	return driver.findElement(savechangesDE);

}
}
