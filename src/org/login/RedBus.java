package org.login;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\priya\\eclipse-workspace\\Selenium1\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		/*.WebElement user= driver.findElement(By.id("signin-block"));
		user.click();
		
		WebElement signIn= driver.findElement(By.id("signInLink"));
		signIn.click();*/
		driver.findElement(By.id("mobileNoInp")).sendKeys("768900543");
	}
}
		
	/*	String login= driver.getWindowHandle();
		System.out.println(login);
		Set<String> all=driver.getWindowHandles();
		System.out.println(all);
		for (String x : all) {
			
		if (!all.equals(x) ) {
			driver.switchTo().window(x);
		}
		}
		
		
		//Thread.sleep(3000);
		WebElement ph=driver.findElement(By.className("mobileInputContainer clearfix contact-box"));
		ph.click();
		
		WebElement phone= driver.findElement(By.id("mobileNoInp"));
		//phone.click();
		phone.sendKeys("9497052159");
		
		WebElement captcha= driver.findElement(By.className("recaptcha-checkbox-checkmark"));
		captcha.click();*/
		

