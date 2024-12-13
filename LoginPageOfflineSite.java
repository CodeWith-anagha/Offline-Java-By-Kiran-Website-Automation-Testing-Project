package com.tka.sep_25;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageOfflineSite {
	public static WebDriver getLogIn() {

		final String offlineSiteUrl = "file:///C:/Users/Shrutiiiiii/Downloads/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html";

		WebDriver driver = new ChromeDriver();
		driver.get(offlineSiteUrl);
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		// driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		

		System.out.println("Login successful.................>");

		return driver;

	}

}
