package com.tka.sep_26;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.tka.sep_25.LoginPageOfflineSite;

public class AddUserPage {
	public static void main(String[] args) {
	WebDriver driver =LoginPageOfflineSite.getLogIn();
		
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a")).click();
		System.out.println("Users Page------");
		
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
		System.out.println("<< AddUser Page----" +driver.getTitle());
		
		driver.findElement(By.id("username")).sendKeys("Shruti");
		driver.findElement(By.id("mobile")).sendKeys("8411025472");
		driver.findElement(By.id("email")).sendKeys("Shuti@gmail.com");
		driver.findElement(By.id("course")).sendKeys("Selenium");
		
		driver.findElement(By.id("Male")).click();
		
		WebElement stateElement= driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
		stateElement.sendKeys("p");
		
		
			driver.findElement(By.id("password")).sendKeys("abc123");
			driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[2]/button")).click();
			
		}
		
		
	}


