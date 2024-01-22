package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Alert extends Base {
	
	@Test
	public void javaScriptAlertBox() {
		driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
		WebElement clickMeGreen = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		clickMeGreen.click();
		String TextofSimpleAlertBox = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		WebElement clickMeYellow = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		clickMeYellow.click();
		driver.switchTo().alert().dismiss();
		WebElement clickForPromptBox = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		clickForPromptBox.click();
		driver.switchTo().alert().sendKeys("Rahul");
		driver.switchTo().alert().accept();
	}

}
