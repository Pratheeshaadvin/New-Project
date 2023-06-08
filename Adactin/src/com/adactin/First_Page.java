package com.adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v109.debugger.Debugger.ContinueToLocationTargetCallFrames;
import org.openqa.selenium.interactions.Actions;

public class First_Page {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Adactin\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		WebElement account = driver.findElement(By.xpath("(//span[text()='My Account'])"));
		account.click();
		WebElement Register = driver.findElement(By.xpath("(//a[text()='Register'])"));
		Register.click();
		WebElement firstname = driver.findElement(By.id("input-firstname"));
		firstname.sendKeys("Pratheesha");
		WebElement lastname = driver.findElement(By.id("input-lastname"));
		lastname.sendKeys("Advin");
		WebElement email = driver.findElement(By.id("input-email"));
		email.sendKeys("pratheeshaadvin04@gmail.com");
		WebElement password = driver.findElement(By.id("input-password"));
		password.sendKeys("prathee04");
		WebElement newsletter = driver.findElement(By.id("input-newsletter-yes"));
		newsletter.click();
		
		Thread.sleep(3000);
		WebElement checkbox = driver.findElement(By.xpath("(//input[@name='agree'])"));
		checkbox.click();
		WebElement continue_btn = driver.findElement(By.xpath("(//button[text()='Continue'])"));
		continue_btn.click();
		//WebElement account1 = driver.findElement(By.xpath("(//span[text()='My Account'])"));
		//account1.click();
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.xpath("(//a[text()='Login'])[2]"));
		login.click();
		WebElement email_login = driver.findElement(By.xpath("(//input[@name='email'])"));
		email_login.sendKeys("pratheeshaadvin04@gmail.com");
		WebElement passwordlogin = driver.findElement(By.xpath("(//input[@name='password'])"));
		passwordlogin.sendKeys("prathee04");
		WebElement login_submit = driver.findElement(By.xpath("(//button[@type='submit'])"));
		login_submit.click();
		Thread.sleep(2000);
		WebElement desktop = driver.findElement(By.xpath("(//a[text()='Desktops'])"));
		Actions action = new Actions(driver);
		action.moveToElement(desktop).build().perform();
		WebElement pc = driver.findElement(By.xpath("(//a[text()='PC (0)'])"));
		pc.click();
		WebElement software = driver.findElement(By.xpath("(//a[text()='Software (0)'])"));
		software.click();
		WebElement soft_continue = driver.findElement(By.xpath("(//a[text()='Continue'])"));
		soft_continue.click();
		WebElement search = driver.findElement(By.xpath("(//input[@name='search'])"));
		search.sendKeys("oppo");
		//WebElement search_btn = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		//search_btn.click();
		WebElement phone = driver.findElement(By.xpath("(//a[text()='Phones & PDAs'])[1]"));
		phone.click();
		Thread.sleep(2000);
		WebElement cart = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		cart.click();
		}
}
