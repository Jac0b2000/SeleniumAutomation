package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends Base{
	public void xpathTypes() {
		//Dynamic xpath types
		WebElement xContains = driver.findElement(By.xpath("//a[contains(@href,'sub')]"));
		WebElement xContains1 = driver.findElement(By.xpath("//meta[@charset='UTF-8']"));
		WebElement xContains2 = driver.findElement(By.xpath("//meta[contains(@name,'descrip')]"));
		WebElement xContains3 = driver.findElement(By.xpath("//div[contains(@id,'torrent')]"));
		WebElement xContains4 = driver.findElement(By.xpath("//div[contains(@class,'exam')]"));
		
		WebElement xAnd = driver.findElement(By.xpath("//meta[@http-equiv='X-UA-Compatible' and @content='IE=edge']"));
		WebElement xAnd2 = driver.findElement(By.xpath("//div[@id='torrent-scanner-popup' and @style='display: none;']"));
		WebElement xAnd3 = driver.findElement(By.xpath("//button[@id='button-one' and @class='btn btn-primary']"));
		WebElement xAnd4 = driver.findElement(By.xpath("//button[@type='button' and @class='btn btn-primary']"));
		
		WebElement xOr = driver.findElement(By.xpath("//div[@id='torrent-scanner-popup' or @class='nav-btn']"));
		WebElement xOr2 = driver.findElement(By.xpath("//button[@type='abcd' or @class='btn btn-primary']"));
		WebElement xOr3 = driver.findElement(By.xpath("//meta[@http-equiv='123' or @content='IE=edge']"));
		WebElement xOr4 = driver.findElement(By.xpath("//meta[@http-equiv='X-UA-Compatible' or @content='IE=edge']"));
		
		WebElement xStartsWith = driver.findElement(By.xpath("//a[starts-with(@href,'simple-')]"));
		WebElement xStartsWith1 = driver.findElement(By.xpath("//a[starts-with(@href,'form')]"));
		WebElement xStartsWith2 = driver.findElement(By.xpath("//div[starts-with(@class,'head')]"));
		WebElement xStartsWith3 = driver.findElement(By.xpath("//span[starts-with(@class,'nav')]"));
		WebElement xStartsWith4 = driver.findElement(By.xpath("//a[starts-with(@class,'nav-')]"));
		
		WebElement xTextOf = driver.findElement(By.xpath("//a[text()='Checkbox Demo']"));
		WebElement xTextOf1 = driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']"));
		WebElement xTextOf2 = driver.findElement(By.xpath("//a[text()='Form Submit']"));
		WebElement xTextOf3 = driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement xTextOf4 = driver.findElement(By.xpath("//a[text()='Home']"));
		
		//xpath axes methods
		WebElement xAncestor = driver.findElement(By.xpath("//li[@class='list-group-item']//ancestor::a"));
		WebElement xAncestor1 = driver.findElement(By.xpath("//a[@href='simple-form-demo.php']//ancestor::div"));
		WebElement xAncestor2 = driver.findElement(By.xpath("//li[@class='list-group-item']//ancestor::html"));
		WebElement xAncestor3 = driver.findElement(By.xpath("//div[@class='row']//ancestor::div"));
		WebElement xAncestor4 = driver.findElement(By.xpath("//div[@class='row']//ancestor::nav"));
		
		WebElement xParent = driver.findElement(By.xpath("//nav[@class='navbar navbar-expand-md navbar-dark']//parent::div"));
		WebElement xParent1 = driver.findElement(By.xpath("//a[@class='navbar-brand']//parent::nav"));
		WebElement xParent2 = driver.findElement(By.xpath("//img[@alt='logo']//parent::a"));
		WebElement xParent3 = driver.findElement(By.xpath("//li[@class='nav-item']//parent::ul"));
		WebElement xParent4 = driver.findElement(By.xpath("//a[@class='nav-link']//parent::li"));
		
		WebElement xChild = driver.findElement(By.xpath("//ul[@class='navbar-nav']//child::li"));
		WebElement xChild1 = driver.findElement(By.xpath("//li[@class='nav-item ']//child::a"));
		WebElement xChild2 = driver.findElement(By.xpath("//div[@class='navbar-collapse collapse show']//child::ul"));
		WebElement xChild3 = driver.findElement(By.xpath("//nav[@class='navbar navbar-expand-md navbar-dark']//child::a"));
		WebElement xChild4 = driver.findElement(By.xpath("//li[@class='list-group-item']//child::a"));
		
		}
	public static void main(String[] args) {
		Xpath xpath = new Xpath();
		xpath.initializeBrowser();
		xpath.xpathTypes();
		xpath.driverQuit();
	}
}
