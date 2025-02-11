package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

public class RemoveOnePage {
	WebDriver driver;

	// Every Page must have a constructor to invite the driver
	public RemoveOnePage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library

	@FindBys(@FindBy(how = How.XPATH, using = "//input[@type='checkbox']"))
	List<WebElement> checkboxes;
	@FindBy(how = How.NAME, using = "todo[18]")
	WebElement CheckboxChecked;
	@FindBy(how = How.XPATH, using = "//input[@value='Remove']")
	WebElement remove;

	public boolean UserShldBeAbleToDeleteOne () throws InterruptedException {

		CheckboxChecked.click();
		Thread.sleep(5000);
		remove.click();
//		CheckboxChecked.click();
//		driver.close();
//		driver.quit();
		return false;
	}
}
