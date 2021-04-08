package capstone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class gillete_signin {

	public WebDriver driver;
public gillete_signin(WebDriver driver) {

		
		this.driver=driver;
	}
	

By username= By.xpath("//input[@id='phdesktopbody_0_username']");
By usernameDE=By.xpath("//input[@id='username']");
By password=By.xpath("//input[@type='password']");
By submit=By.xpath("//input[@type='submit']");
By forgotpassword=By.xpath("//a[@id='phdesktopbody_0_forgotpassword']");
By mailforgot=By.xpath("//input[@id='phdesktopbody_0_username']");
By createpwd=By.xpath("//input[@id='phdesktopbody_0_Create Your New Password']");
By submitDE=By.xpath("//button[@id='login-submit']");
By forgotpasswordDE=By.xpath("//div[@class='forgottenPasswordModal']");
By mailforgotpwd=By.xpath("//input[@id='forgotten-password-email-field']");
By submitmail=By.xpath("//input[@class='forgottenPasswordModal_dialog_form_submit']");
By confirm=By.xpath("//h2[@class='forgottenPasswordModal_dialog_form_title']");
public WebElement getusername() {
	return driver.findElement(username);

}
public WebElement getusernameDE() {
	return driver.findElement(usernameDE);

}
public WebElement getpassword() {
	return driver.findElement(password);

}
public WebElement getsubmit() {
	return driver.findElement(submit);

}
public WebElement getfpwd() {
	return driver.findElement(forgotpassword);

}

public WebElement getforgotmail() {
	return driver.findElement(mailforgot);

}
public WebElement getcreatepwd() {
	return driver.findElement(createpwd);

}
public WebElement getsubmitDE() {
	return driver.findElement(submitDE);

}
public WebElement getforgotpasswordDE() {
	return driver.findElement(forgotpasswordDE);

}
public WebElement getmailforgotpwdDE() {
	return driver.findElement(mailforgotpwd);

}
public WebElement getmailsubmitDE() {
	return driver.findElement(submitmail);

}
public WebElement getconfirmDE() {
	return driver.findElement(confirm);

}
}
