package com.tka.oct_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;

import com.tka.sep_25.LoginPageOfflineSite;

public class DemoNavigation {

	public static void main(String[] args) {

		// Login
		WebDriver driver = LoginPageOfflineSite.getLogIn();

		System.out.println("<<  Page Title >" + driver.getTitle());

		// inspect to users .html from left slider menu bar
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
		System.out.println("User Page--------------");
		System.out.println("Page Title >" +driver.getTitle());
		
		
		//Users
		
		// 1.adduser-button click
		driver.findElement(By.xpath("//html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
		System.out.println("Page Title >" +driver.getTitle());
		
		Navigation nv =driver.navigate();
		nv.back();
		
		
		System.out.println("back < ");
		System.out.println("Page Title >" +driver.getTitle());
		
		nv.forward();
		nv.refresh();
		
		nv.to("https://www.youtube.com/");
		System.out.println( "navigate().to()--->");
		System.out.println("Page Title >" +driver.getTitle());
		
		
		
	}
}
