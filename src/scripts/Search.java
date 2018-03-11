package scripts;

import org.openqa.selenium.WebDriver;
import modules.AdmissionDashboardModules;
import modules.HomePageModules;
import modules.LoginModules;
import utils.WebElementUtils;

public class Search {
	public void search() {
		LoginModules lm = new LoginModules();
		AdmissionDashboardModules am = new AdmissionDashboardModules();
		HomePageModules hm = new HomePageModules();
		WebDriver driver = WebElementUtils.setBrowserDriverAndLaunch("Chrome");
		hm.navigateToBaseURL(driver);
		lm.login(driver);
		lm.checkLogin(driver);
		am.searchAnyString(driver);
		am.assertSearchResults(driver);
		WebElementUtils.close(driver);
		WebElementUtils.quit(driver);
	}
}