package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\priya\\eclipse-workspace\\Selenium1\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstName.sendKeys("Priyanka");

		WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastName.sendKeys("Sigatapu");
		WebElement address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		address.sendKeys("Perungudi,Chennai");

		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("priyankasigatapu@gmail.com");
		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("9940446166");

		WebElement gender = driver.findElement(By.xpath("//input[@ng-model='radiovalue'][1]"));
		gender.click();
		
		
		
		
		
/*
		WebElement hobbies = driver.findElement(By.xpath("//input[@value='Movies']"));
		hobbies.click();
		
				
	WebElement lang = driver.findElement(By.id("msdd"));
Select s = new Select(lang);
	s.selectByVisibleText("English");
 		WebElement skill = driver.findElement(By.id("Skills"));
		Select s1 = new Select(skill);
		s1.selectByIndex(5);
		
		WebElement country = driver.findElement(By.id("countries"));
		Select s2 = new Select(country);
		s2.selectByIndex(0);
		
		Thread.sleep(3000);
		
		
		WebElement selectCountry = driver.findElement(By.id("countries"));
		Select s3 = new Select(selectCountry);
		s3.selectByIndex(3);
		
		WebElement year = driver.findElement(By.id("yearbox"));
		Select s4= new Select(year);
		s4.selectByIndex(8);
		
		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select s5= new Select(month);
		s5.selectByVisibleText("December");
		
		WebElement day = driver.findElement(By.id("daybox"));
		Select s6= new Select(day);
		s6.selectByVisibleText("5");
		
		WebElement pass1 = driver.findElement(By.id("firstpassword"));
		pass1.click();
		pass1.sendKeys("qwerty666");
		

		WebElement pass2 = driver.findElement(By.id("secondpassword"));
		pass2.sendKeys("qwerty666");
			
		
		WebElement submit = driver.findElement(By.id("submitbtn"));
		submit.click();
		
		
		
	
		
		*/
	}

}
