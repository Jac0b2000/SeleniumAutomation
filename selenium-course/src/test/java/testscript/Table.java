package testscript;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Table extends Base{
	
	@Test
	public void verifyTheHeaderOfTable() {
		List<String> actualTableHeaderElements = new ArrayList<String>();
		actualTableHeaderElements.add(0, "Name");
		actualTableHeaderElements.add(1, "Position");
		actualTableHeaderElements.add(2, "Office");
		actualTableHeaderElements.add(3, "Age");
		actualTableHeaderElements.add(4, "Start date");
		actualTableHeaderElements.add(5, "Salary");
		
		WebElement tableButton = driver.findElement(By.xpath("//a[@class='nav-link' and @href=\"table-pagination.php\"]"));
		tableButton.click();
		List<WebElement> tableHeaderElements = driver.findElements(By.xpath("//tr[@role='row']//th"));
		List<String> expectedTableHeaderElements = new ArrayList<String>();
		for(WebElement headerItem : tableHeaderElements ) {
			expectedTableHeaderElements.add(headerItem.getText());
		}
		//if(expectedTableHeaderElements.equals(actualTableHeaderElements)) {
		//	String result ="headers of the table match";
		//}
		//else {
		//	String result="headers of the table does not match";
		//}
		assertEquals(expectedTableHeaderElements, actualTableHeaderElements, "header is not expected");
	}
	@Test
	public void verifyNameElement() {
		String requiredTextOfNameElement ="Ashton Cox";
		boolean flag = false;
		WebElement tableButton = driver.findElement(By.xpath("//a[@class='nav-link' and @href=\"table-pagination.php\"]"));
		tableButton.click();
		List<WebElement> coulumnItems = driver.findElements(By.xpath("//tr[@class='odd']//td"));
		for(WebElement nameElement : coulumnItems) {
			String textOfNameElement = nameElement.getText();
			if(requiredTextOfNameElement.equals(textOfNameElement)) {
				flag = true;
				break;
			}
		}
		assertTrue(flag, "Searched item" + requiredTextOfNameElement + "not found");
	}
	
	public void assertSample() {
		boolean flag = false;
		int a=5, b=6;
		String str = "abcd";
		String s= null;
		assertNotNull(str, "str is null");
		assertNull(s, "s is not null");
		assertNotEquals(a, b, "a & b are equal");
		assertFalse(flag, "Flag is true");
		
	}
}
