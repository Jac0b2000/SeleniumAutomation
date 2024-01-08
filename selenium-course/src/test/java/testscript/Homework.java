package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
	    public WebDriver driver;
		
		public void intBrowse() {
			driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			}
		
		public void locate() {
			WebElement showMesButton = driver.findElement(By.id(""));
			WebElement headEle = driver.findElement(By.className(""));
			WebElement linkEle = driver.findElement(By.linkText(""));
			WebElement partialLinkEle = driver.findElement(By.partialLinkText(""));
			WebElement namEle = driver.findElement(By.name(""));
			WebElement cssEle = driver.findElement(By.cssSelector(""));
			WebElement cssEle2 = driver.findElement(By.cssSelector(""));
			WebElement cssEle3 = driver.findElement(By.cssSelector(""));
			WebElement cssEle4 = driver.findElement(By.xpath(""));
			WebElement tagEle = driver.findElement(By.tagName(""));
		}
		
		public void main(String[] args) {
			Homework loc =new Homework();
			loc.intBrowse();
			loc.locate();
			
		}

}
