package com.tka.sep_23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPage {

	
	public static void main(String[] args) {
		
		
		final String offlineSiteUrl="file:///C:/Users/Shrutiiiiii/Downloads/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html";
		
		
		WebDriver driver=new ChromeDriver();
		driver.get(offlineSiteUrl);	
		
		WebElement emailTxtBx= driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input"));
		emailTxtBx.sendKeys("kiran@gmail.com");
		
		WebElement passwordTxtBx= driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input"));
		 passwordTxtBx.sendKeys("123456");
		
		 WebElement btnsignin= driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button"));
		 btnsignin.click() ;
		 
		 System.out.println("Thanks...............>");
		
		
	}
}
