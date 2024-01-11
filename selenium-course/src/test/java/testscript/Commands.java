package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Commands extends Xpath {

	public String webElementsCommands() {
		String input="hello";
		WebElement singleInputTextField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputTextField.sendKeys(input);
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement yourMessageText = driver.findElement(By.xpath("//div[@id='message-one']"));
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