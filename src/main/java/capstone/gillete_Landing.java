package capstone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class gillete_Landing {

	public WebDriver driver;
public gillete_Landing(WebDriver driver) {

		
		this.driver=driver;
	}
	
By register=By.xpath("//a[contains(text(),'REGISTER')]");
By signin=By.xpath("//a[@class='event_profile_login']");
By cookiesDE=By.xpath("//button[@id='onetrust-accept-btn-handler']");
By account=By.xpath("//span[@class='responsiveAccountHeader_openAccountPanelText']");
By registerDE=By.xpath("//a[@class='responsiveAccountHeader_accountRegister']");
By titleDE=By.xpath("//div[@class='responsiveAccountHeader_accountName']");
By loginDE=By.xpath("//a[@class='responsiveAccountHeader_accountLogin js-e2e-sign-in']");
public WebElement getregister() {
	return driver.findElement(register);

}
public WebElement getsignin() {
	return driver.findElement(signin);
}
public WebElement getcookies() {
	return driver.findElement(cookiesDE);

}
public WebElement getaccount() {
	return driver.findElement(account);

}
public WebElement getregisterDE() {
	return driver.findElement(registerDE);

}
public WebElement gettitleDE() {
	return driver.findElement(titleDE);

}
public WebElement getloginDE() {
	return driver.findElement(loginDE);

}
}
