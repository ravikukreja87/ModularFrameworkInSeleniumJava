package modules;

import org.openqa.selenium.WebDriver;

import constants.PageConstants;

public class HomePageModules {
	public void navigateToBaseURL(WebDriver driver) {
		driver.get(PageConstants.URL);
	}

}
