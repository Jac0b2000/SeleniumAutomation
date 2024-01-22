package testscript;

import java.util.NoSuchElementException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class GetTotal extends Base {
	public void twoInputFields() {
		String valueA = "10";
		WebElement enterValueA = driver.findElement(By.xpath("//input[@id='value-a']"));
		enterValueA.sendKeys(valueA);
		
		String valueB = "30";
		WebElement enterValueB = driver.findElement(By.xpath("//input[@id='value-b']"));
		enterValueB.sendKeys(valueB);
		
		WebElement getTotalButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(30))
				  .pollingEvery(Duration.ofSeconds(5))
				  .ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.elementToBeClickable(getTotalButton));
		getTotalButton.click();
		
		 
		int actualTotal = Integer.parseInt(valueA)+Integer.parseInt(valueB);
		
		WebElement totalText = driver.findElement(By.xpath("//div[@id='message-two']"));
		String totalValueText = totalText.getText();
		totalValueText = totalValueText.substring(14);
		int totalValue = Integer.parseInt(totalValueText);
		
		if(totalValue == actualTotal) {
			String Result = "Test Pass";
		}
		else {
			String Result = "Test Fail";
		}
		
		
		}
	
	public static void main(String[] args) {
		GetTotal getTotal =new GetTotal();
		getTotal.initializeBrowser();
		getTotal.twoInputFields();
	}
}
