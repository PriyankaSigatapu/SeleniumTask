package org.login;

import java.awt.List;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Register {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\priya\\eclipse-workspace\\Selenium1\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/ ");
        
        driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("priya@gmail.com");








//String parent = driver.getWindowHandle();
//System.out.println("Parent id:" +parent);
//Set<String> all = driver.getWindowHandles();
//System.out.println("all:" +all);
//for (String x : all) {
//	if (!parent.equals(x)) {
//		System.out.println("first id:" );
//		driver.switchTo().window(x);
//		
		
	
	
	//}
//}



}
}