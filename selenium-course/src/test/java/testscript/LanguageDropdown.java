package testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LanguageDropdown {

	public WebDriver driver;
	
	public void intBrowser() {
		driver = new ChromeDriver();
		driver.navigate().to("https://www.selenium.dev/");
		driver.manage().window().maximize();
	}
	
	public void driverQuit() {
		driver.quit();
	}
	
	public void languageToPortugese() {
		WebElement languageButton = driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle' and text()='English']"));
		languageButton.click();
		String languageMenu = "Português (Brasileiro)";
		List<WebElement> languages = driver.findElements(By.xpath("//ul[@class='dropdown-menu show']//li"));
		for(WebElement menuItem : languages) {
			String menuText = menuItem.getText();
			if(languageMenu.equals(menuText)) {
				menuItem.click();
			}
		}
	}
	
	public static void main(String[] args) {
		LanguageDropdown languageDropdown = new LanguageDropdown();
		languageDropdown.intBrowser();
		languageDropdown.languageToPortugese();
		languageDropdown.driverQuit();
		}
		
	}


