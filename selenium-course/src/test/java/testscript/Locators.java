package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	public void locators() {
		WebElement showMessageButton = driver.findElement(By.id("button-one"));
		WebElement showMessageButton1 = driver.findElement(By.id("value-b"));
		WebElement showMessageButton2 = driver.findElement(By.id("message-two"));
		WebElement showMessageButton3 = driver.findElement(By.id("single-input-field"));
		WebElement showMessageButton4 = driver.findElement(By.id("button-two"));
		
		WebElement headElement = driver.findElement(By.className("header-top"));
		WebElement headElement1 = driver.findElement(By.className("copyright"));
		WebElement headElement2 = driver.findElement(By.className("clearfix"));
		WebElement headElement3 = driver.findElement(By.className("navbar-toggler-icon"));
		WebElement headElement4 = driver.findElement(By.className("navbar-brand"));
		
		WebElement linkElement = driver.findElement(By.linkText("Checkbox Demo"));
		WebElement linkElement1 = driver.findElement(By.linkText("Simple Form Demo"));
		WebElement linkElement2 = driver.findElement(By.linkText("Select Input"));
		WebElement linkElement3 = driver.findElement(By.linkText("Jquery Select2"));
		WebElement linkElement4 = driver.findElement(By.linkText("Ajax Form Submit"));
		
		WebElement partialLinkElement = driver.findElement(By.partialLinkText("Checkbox"));
		WebElement partialLinkElement1 = driver.findElement(By.partialLinkText("Jquery"));
		WebElement partialLinkElement2 = driver.findElement(By.partialLinkText("Ajax"));
		WebElement partialLinkElement3 = driver.findElement(By.partialLinkText("Simple"));
		WebElement partialLinkElement4 = driver.findElement(By.partialLinkText("Input"));
		
		WebElement namElement = driver.findElement(By.name("description"));
		WebElement namElement1 = driver.findElement(By.name("keywords"));
		WebElement namElement2 = driver.findElement(By.name("author"));
		WebElement namElement3 = driver.findElement(By.name("viewport"));
		
		
		WebElement cssElement = driver.findElement(By.cssSelector("button#button-one"));
		WebElement cssElement11 = driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement cssElement12 = driver.findElement(By.cssSelector("div#collapsibleNavbar"));
		WebElement cssElement13 = driver.findElement(By.cssSelector("input#value-a"));
		WebElement cssElement14 = driver.findElement(By.cssSelector("input#value-b"));
		
		WebElement cssElement2 = driver.findElement(By.cssSelector("div.header-top"));
		WebElement cssElement21 = driver.findElement(By.cssSelector("section.clearfix"));
		WebElement cssElement22 = driver.findElement(By.cssSelector("ul.navbar-nav"));
		WebElement cssElement23 = driver.findElement(By.cssSelector("button.navbar-toggler"));
		WebElement cssElement24 = driver.findElement(By.cssSelector("span.navbar-toggler-icon"));
		
		WebElement cssElement3 = driver.findElement(By.cssSelector("button[id=button-one]"));
		WebElement cssElement31 = driver.findElement(By.cssSelector("button[id=button-two]"));
		WebElement cssElement32 = driver.findElement(By.cssSelector("input[id=value-b]"));
		WebElement cssElement33 = driver.findElement(By.cssSelector("div[id=message-two]"));
		WebElement cssElement34 = driver.findElement(By.cssSelector("input[id=single-input-field]"));
		
		WebElement cssElement4 = driver.findElement(By.xpath("//a[@href='radio-button-demo.php']"));
		WebElement cssElement41 = driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		WebElement cssElement42 = driver.findElement(By.xpath("//a[@href='select-input.php']"));
		WebElement cssElement43 = driver.findElement(By.xpath("//a[@href='radio-button-demo.php']"));
		WebElement cssElement44 = driver.findElement(By.xpath("//a[@href='jquery-select.php']"));
		
		WebElement tagElement = driver.findElement(By.tagName("div"));
		WebElement tagElement1= driver.findElement(By.tagName("input"));
		WebElement tagElement2 = driver.findElement(By.tagName("link"));
		WebElement tagElement3 = driver.findElement(By.tagName("script"));
		WebElement tagElement4 = driver.findElement(By.tagName("span"));
		
	}
	
	public static void main(String[] args) {
		Locators locate = new Locators();
		locate.initializeBrowser();
		locate.locators();
		locate.driverQuit();
	}

}
