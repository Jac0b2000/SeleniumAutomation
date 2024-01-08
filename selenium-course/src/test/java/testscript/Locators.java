package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	public void locators() {
		WebElement showMessageButton = driver.findElement(By.id("button-one"));
		WebElement headElement = driver.findElement(By.className("header-top"));
		WebElement linkElement = driver.findElement(By.linkText("Checkbox Demo"));
		WebElement partialLinkElement = driver.findElement(By.partialLinkText("Checkbox"));
		WebElement namElement = driver.findElement(By.name("description"));
		WebElement cssElement = driver.findElement(By.cssSelector("button#button-one"));
		WebElement cssElement2 = driver.findElement(By.cssSelector("div.header-top"));
		WebElement cssElement3 = driver.findElement(By.cssSelector("button[id=button-one]"));
		WebElement cssElement4 = driver.findElement(By.xpath("//a[@href='radio-button-demo.php']"));
		WebElement tagElement = driver.findElement(By.tagName("div"));
		
	}
	
	public static void main(String[] args) {
		Locators locate = new Locators();
		locate.initializeBrowser();
		locate.locators();
		locate.driverQuit();
	}

}
