package com.tka.sep_23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintErrormsg {

public static void main(String[] args) {
		
		
		final String offlineSiteUrl="file:///C:/Users/Shrutiiiiii/Downloads/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html";
		
		
		WebDriver driver=new ChromeDriver();
		driver.get(offlineSiteUrl);	
		
		WebElement emailTxtBx= driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input"));
		emailTxtBx.sendKeys("shruti@gmail.com");
		
		WebElement passwordTxtBx= driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input"));
		 passwordTxtBx.sendKeys("12345");
		
		 WebElement btnsignin= driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button"));
		 btnsignin.click() ;
		 
		 
		 WebElement errormsg01= driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/div"));
		 System.out.println("errormsg01 >" + errormsg01.getText());
		 
		 WebElement errormsg02= driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div"));
		 System.out.println("errormsg01 >" + errormsg02.getText());
		 
		 System.out.println("Thanks...............>");
}
}
