package testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RadioButtonAndCheckbox extends Base {
	
	public void radioButton() {
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement maleButton = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		maleButton.click();
		boolean isMaleButtonIsSelected = maleButton.isSelected();
	}
	
	public void radioButtonGroup() {
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement femaleButton = driver.findElement(By.xpath("//input[@name='student-gender' and @value='Female']"));
		femaleButton.click();
		boolean isFemaleButtonIsSelected = femaleButton.isSelected();
		
		WebElement nineteenToFortyFourButton = driver.findElement(By.xpath("//input[@name='student-age' and @value='19 to 44']"));
		nineteenToFortyFourButton.click();
		boolean isnineteenToFortyFourButtonIsSelected = nineteenToFortyFourButton.isSelected();
		
		WebElement getResultsButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		getResultsButton.click();
		
		WebElement showResultText = driver.findElement(By.xpath("//div[@id='message-two']"));
		String textOfshowResultText = showResultText.getText();
		String actualTextofShowResult ="Gender : Female\nAge group: 19 to 44";
		if(textOfshowResultText.equals(actualTextofShowResult)) {
			String result = "Test Pass";
		}
		else {
			String result = "Test Fail";
		}
	}
	
	public void findElementsSample() {
		String inputMenu = "Checkbox Demo";
		List<WebElement> menu = driver.findElements(By.xpath("//ul[@class='list-group list-group-flush']//li"));
		for (WebElement menuItem : menu) {
			String menuText = menuItem.getText();
			if(inputMenu.equals(menuText)) {
				menuItem.click();
				break ;
			}
				
		}
	
	}
	public void checkbox() {
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement singleCheckbox = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		singleCheckbox.click();
		boolean isCheckboxIsSelected = singleCheckbox.isSelected();
	}
	

	
	public static void main(String[] args) {
		RadioButtonAndCheckbox radioButtonAndCheckbox = new RadioButtonAndCheckbox();
		radioButtonAndCheckbox.initializeBrowser();
		//radioButtonAndCheckbox.radioButton();
		//radioButtonAndCheckbox.checkbox();
		radioButtonAndCheckbox.radioButtonGroup();
		//radioButtonAndCheckbox.findElementsSample();
		radioButtonAndCheckbox.driverQuit();
		
		
		
	}

}
