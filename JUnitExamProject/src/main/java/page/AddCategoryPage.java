package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCategoryPage  {

	WebDriver driver; // Global

	// Every Page must have a constructor to invite the driver
	public AddCategoryPage(WebDriver driver) {
		this.driver = driver;
		
	}
		//Element library	
		@FindBy (how = How.NAME, using = "data")
		WebElement AddTextField;
		@FindBy (how = How.XPATH, using = "//input[@value='Add']")
		WebElement AddButton;
		
		public void UserShldBeAbleToAddText() throws InterruptedException {
			Random rnd = new Random();
			int randomNumber = rnd.nextInt(23);
			AddTextField.sendKeys("Paris" + randomNumber );
			AddButton.click();
			 
//			Thread.sleep(2000);
//			driver.close();
//			driver.quit();
		}
		
		
		
}
