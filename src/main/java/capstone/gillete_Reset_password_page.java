package capstone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class gillete_Reset_password_page {
	
	public WebDriver driver;
public gillete_Reset_password_page(WebDriver driver) {

		
		this.driver=driver;
}
By emailaddress=By.xpath("//input[@id='phdesktopbody_0_username']");
By submitnewpassword=By.xpath("//input[@id='phdesktopbody_0_Create Your New Password']");
public WebElement getEmailAddress() {
	return driver.findElement(emailaddress);

}

public WebElement getsubmitnewpassword() {
	return driver.findElement(submitnewpassword);

}


}
