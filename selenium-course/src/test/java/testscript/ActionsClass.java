package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass extends Base {
	
	@Test
	public void actionClassSample() {
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		WebElement dragggableNOne = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement dropElement = driver.findElement(By.xpath("//div[@id='mydropzone']"));
		
		Actions actions = new Actions(driver);
		//actions.moveToElement(dragggableNOne).build().perform();
		//actions.doubleClick(dragggableNOne).build().perform();
		//actions.contextClick(dragggableNOne).build().perform();
		actions.dragAndDrop(dragggableNOne, dropElement).build().perform();
	}

}
