package capstone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Email_login {
	
	public WebDriver driver;
public Email_login(WebDriver driver) {

		
		this.driver=driver;
		
}
By mailusername=By.xpath("//input[@type='email']");
By mailnext=By.xpath("//span[@class='RveJvd snByac']");
By mailpassword=By.xpath("//input[@type='password']");
By passwordnext=By.xpath("//span[contains(text(),'Next')]");
By unreadmail=By.xpath("//tr[@class='zA zE']");


By reset=By.xpath("//a[contains(text(),'Reset password')]");

//By resetDE=By.xpath("//a[contains(text(),'Setzen Sie Ihr Passwort zurück')]");	
public WebElement getmailUsername() {
	return driver.findElement(mailusername);

}
public WebElement getmailpassword() {
	return driver.findElement(mailpassword);

}
public WebElement getmailnext() {
	return driver.findElement(mailnext);

}
public WebElement getpasswordnext() {
	return driver.findElement(passwordnext);

}

public List<WebElement> getUnreadmail() {
	List<WebElement> unreademail= driver.findElements(unreadmail);
	
	for(int i=0;i<unreademail.size();i++) {
		unreademail.get(0).click();
		
	}
	
	return unreademail;
	
}
public WebElement getresetpassword() {
	return driver.findElement(reset);

}
/*
 * public WebElement getresetpasswordDE() { return driver.findElement(resetDE);
 * 
 * }
 */
}
