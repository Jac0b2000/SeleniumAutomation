package testscript;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Commands extends Xpath {

	public String webElementsCommands() {
		String input="hello";
		WebElement singleInputTextField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputTextField.sendKeys(input);
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String classValueOfShowMessageButton =  showMessageButton.getAttribute("class");
		boolean isShowMessageButtonDisplayed = showMessageButton.isDisplayed();
		
		assertTrue(isShowMessageButtonDisplayed, "show message button is not displayed");
		
		WebElement yourMessageText = driver.findElement(By.xpath("//div[@id='message-one']"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20) );
		wait.until(ExpectedConditions.elementToBeClickable(showMessageButton));
		
		showMessageButton .click();
		
	    String textInYourMessageText = yourMessageText.getText();
	    textInYourMessageText = textInYourMessageText.substring(15);
	    
	    if(textInYourMessageText.equals(input)) {
	    	String result = "Test Pass";
	    	return result;
	    }
	    else {
	    	String result = "Test Fail";
	    	return result;
	    }
	    		    
	}
	
	public static void main(String[] args) {
		Commands commands = new Commands();
		commands.initializeBrowser();
		commands.xpathTypes();
		commands.webElementsCommands();
		//webElementsCommands.driverQuit();

	}
}