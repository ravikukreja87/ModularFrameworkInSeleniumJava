package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import constants.AssertionConstants;
import pages.AdmissionDashboardPage;
import utils.RandomUtils;
import utils.WaitUtils;

public class AdmissionDashboardModules {
	

	

	public void searchAnyString(WebDriver driver) {
		driver.findElement(AdmissionDashboardPage.searchText).sendKeys(RandomUtils.randomString(5));
		driver.findElement(By.name(AdmissionDashboardPage.SEARCH_BUTTON_LOCATOR_STRING)).click();
	}
	
	public void assertSearchResults(WebDriver driver) {
		WaitUtils.waitForSeconds(2);
		String actualHeadingLabel = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Label2")).getText();
		Assert.assertEquals(actualHeadingLabel, AssertionConstants.EXPECTED_HEADING_LABEL);
		String actualText = driver.findElement(By.xpath("//table[@id='ctl00_ContentPlaceHolder1_grdsrchlead']/tbody/tr/td")).getText();
		Assert.assertEquals(actualText, AssertionConstants.EXPECTED_TEXT);
	}
}
