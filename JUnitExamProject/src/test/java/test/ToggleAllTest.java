package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import page.AddCategoryPage;
import page.ToggleAllPage;
import util.BrowserFactory;

public class ToggleAllTest {

	WebDriver driver;

	@Test
	public void UserShouldBeAbleToGoToSite() throws InterruptedException {

		driver = BrowserFactory.startBrowser();
		driver.get("http://techfios.com/test/104/");

//		AddCategoryPage addingCategory = PageFactory.initElements(driver, AddCategoryPage.class);
		ToggleAllPage toggleAll  = PageFactory.initElements(driver, ToggleAllPage.class);
		
//		addingCategory.UserShldBeAbleToAddText();
		
//		See if it works
		
		toggleAll.ToToggleAll();
		
		Boolean result = toggleAll.isToggleAllCheckBoxSelected();
		System.out.println("All select boxes are checked"  +  result);
			if(!result) {
				toggleAll.ToToggleAll();
				Assert.assertTrue(result, "Box selected");
			}
		Assert.assertTrue(toggleAll.checkAllBoxesIfSelected(), "All boxes are selected");
		WebElement checkbox = driver.findElement(By.name("allbox"));
	
		Assert.assertEquals(true, checkbox.isSelected());
		
		driver.close();
		driver.quit();
	} 
}
