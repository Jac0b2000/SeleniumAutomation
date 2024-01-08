package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    public WebDriver driver;
	
	public void initializeBrowser() {
		driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		}
	public void driverQuit() {
		driver.quit();
		//driver.close();
	}
	public static void main(String[] args) {
		Base base =new Base();
		base.initializeBrowser();
		base.driverQuit();
	}
}