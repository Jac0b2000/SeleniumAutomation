package testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertSample extends Base {
	@Test
	public void softAssertSample() {
		String input = "Hello";
		SoftAssert softassert = new SoftAssert();
		WebElement singleElementInputTextField = driver.findElement(By.id("single-input-field"));
		singleElementInputTextField.sendKeys(input);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		WebElement showMessageButton = driver.findElement(By.id("button-one"));
		showMessageButton.click();
		
		WebElement youtMessageText = driver.findElement(By.id("message-one"));
		String messageText = youtMessageText.getText();
		messageText = messageText.substring(16);
		softassert.assertEquals(input, messageText, "yoit message is not" + input);
		
		boolean isShowMessageButtonDisplayed = showMessageButton.isDisplayed();
		softassert.assertTrue(isShowMessageButtonDisplayed, "show message button is not displayed");
		
	}

}
