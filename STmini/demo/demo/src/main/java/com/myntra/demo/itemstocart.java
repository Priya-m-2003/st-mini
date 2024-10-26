package com.myntra.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class itemstocart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/inventory.html");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 

		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(500);
		
		
		driver.findElement(By.xpath("//img[@alt='Sauce Labs Onesie']")).click();	
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[@id='add-to-cart']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[@id='continue-shopping']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//img[@alt='Test.allTheThings() T-Shirt (Red)']")).click();
		Thread.sleep(500);

		driver.findElement(By.xpath("//button[@id='add-to-cart']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		Thread.sleep(500);

		driver.close();
	}

}
