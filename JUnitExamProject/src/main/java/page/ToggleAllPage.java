package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

public class ToggleAllPage {

	WebDriver driver;

	// Every Page must have a constructor to invite the driver
	public ToggleAllPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.NAME, using = "allbox")
	WebElement ToggleAll;
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox']")
	WebElement ToggleAllList;

	@FindBys(@FindBy(how = How.XPATH, using = "//input[@type='checkbox']"))
	List<WebElement> checkboxes;

	public void ToToggleAll() {

		ToggleAll.click();
//		driver.close();
	}

	// just added need to add elements in the element library
	public boolean isToggleAllCheckBoxSelected() {
		return ToggleAll.isSelected();
	}

	public boolean checkAllBoxesIfSelected() {
		int NotCheckedBoxes = 0;
		for (int i = 0; i < checkboxes.size(); i++) {
			if (checkboxes.get(i).isSelected() == false) {
				NotCheckedBoxes++;
			}
		}
		if (NotCheckedBoxes > 0) {
			return false;
		} else {
			return true;
		}
	}

}
