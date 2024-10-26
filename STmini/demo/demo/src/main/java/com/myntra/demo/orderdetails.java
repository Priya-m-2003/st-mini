package com.myntra.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orderdetails {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/inventory.html");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 

		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(500);
		
		
		driver.findElement(By.xpath("//img[@alt='Sauce Labs Fleece Jacket']")).click();	
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[@id='add-to-cart']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[text()='Checkout']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.id("first-name")).sendKeys("kruthika");
		driver.findElement(By.id("last-name")).sendKeys("priya");
		driver.findElement(By.id("postal-code")).sendKeys("725274");
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.xpath("//button[text()='Finish']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[text()='Back Home']")).click();
		Thread.sleep(500);
		
		driver.close();
		
		
	}

}
