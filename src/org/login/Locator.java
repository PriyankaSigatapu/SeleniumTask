package org.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\priya\\" + "eclipse-workspace\\Selenium1\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");

		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("priyanka");
		
		WebElement pass= driver.findElement(By.id("password"));
		pass.sendKeys("qwerty");
	}
}
