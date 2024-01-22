package testscript;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;

import javax.naming.directory.DirContext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ElementCommands extends Xpath{
	
	public String fontWeight() {
		//to verify the Font Weight of Show Message Button
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String fontWeightOfShowMesasageButton = showMessageButton.getCssValue("font-weight");
		String actualFontWeight = "400";
		if(fontWeightOfShowMesasageButton.equals(actualFontWeight)) {
			String result = "Test Pass";
			return result;
		}
		else{
			String result = "Test Fail";
			return result;
		}
	}
	public String fontcolour() {
		//to verify the Font Colour of Show Message Button
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String fontColourOfShowMesasageButton = showMessageButton.getCssValue("color");
		String actualFontColourCode = "rgba(255, 255, 255, 1)";
		if(fontColourOfShowMesasageButton.equals(actualFontColourCode)) {
		String result = "Test Pass";
		return result; 
		}
		else {
		String result = "Test Fail";
		return result;
		}

	}
	
	public String borderRadius() {
		//to verify the Border Raduis of Get Total Button
		WebElement getTotalButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		String borderRadiusOfGetTotalButton = getTotalButton.getCssValue("border-radius");
		String actualBorderRadius = "4px";
		if(borderRadiusOfGetTotalButton.equals(actualBorderRadius)) {
			String result = "Test Pass";
			return result;
		}
		else {
			String result = "Test Fail";
			return result;
		}
	}

	public static void main(String[] args) {
		ElementCommands elementcommands = new ElementCommands();
		elementcommands.initializeBrowser();
		elementcommands.fontWeight();
		elementcommands.fontcolour();
		elementcommands.borderRadius();
		
	}
}
