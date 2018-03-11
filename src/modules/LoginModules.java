package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import constants.AssertionConstants;

public class LoginModules {

	public void login(WebDriver driver) {
		driver.findElement(By.id("btnlogin")).click();
		driver.findElement(By.id("txtuname")).sendKeys("techcanvassuser@techcanvass.co.in");
		driver.findElement(By.id("txtpwd")).sendKeys("user1234");
		driver.findElement(By.id("loginbtn")).click();
	}
	
	public boolean checkLogin(WebDriver driver) {
		String expectedResult = AssertionConstants.CHECK_LOGIN;
		String actualResult = driver.findElement(By.id("ctl00_Label23")).getText();
		return expectedResult.equals(actualResult);
	}
}