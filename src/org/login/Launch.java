package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Launch {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\eclipse-workspace\\Selenium1\\Chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement create = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	create.click();
	Thread.sleep(5000);
	WebElement date= driver.findElement(By.id("day"));
	Select s= new Select(date);
	s.selectByValue("4");
}
}
