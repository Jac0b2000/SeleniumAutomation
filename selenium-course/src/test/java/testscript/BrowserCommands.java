package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrowserCommands extends Base {
	public void navigationCommands() {
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
	}
	public void browserCommands() {
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		String pageSource = driver.getPageSource();
	}
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
		BrowserCommands browsercommands = new BrowserCommands();
		browsercommands.initializeBrowser();
		browsercommands.browserCommands();
		browsercommands.navigationCommands();
		//browsercommands.driverQuit();
		browsercommands.locators();
	}
}