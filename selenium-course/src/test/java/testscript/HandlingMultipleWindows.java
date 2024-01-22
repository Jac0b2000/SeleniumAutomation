package testscript;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandlingMultipleWindows extends Base {
	@Test
	public void handlingMultipleWindowsSample() {
		driver.navigate().to("https://selenium.obsqurazone.com/window-popup.php");
		WebElement likeUsButtton = driver.findElement(By.xpath("//a[@href='https://www.facebook.com/obsqurazone/']"));
		likeUsButtton.click();
		
		String MainWindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		
		while (i1.hasNext()) {
			String ChildWindow = i1.next();
			if(!MainWindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
			}
			
		}
		
		WebElement logInButton = driver.findElement(By.xpath("//div[@aria-label='Accessible login button' and @class='x1i10hfl xjbqb8w x6umtig x1b1mbwd xaqea5y xav7gou x1ypdohk xe8uvvx xdj266r x11i5rnm xat24cr x1mh8g0r xexx8yu x4uap5 x18d9i69 xkhd6sd x16tdsg8 x1hl2dhg xggy1nq x1o1ewxj x3x9cwd x1e5q0jg x13rtm0m x87ps6o x1lku1pv x1a2a7pz x9f619 x3nfvp2 xdt5ytf xl56j7k x1n2onr6 xh8yej3']"));
		logInButton.click();
	}
}
