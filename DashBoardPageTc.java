package com.tka.sep_24;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DashBoardPageTc {

	WebDriver driver=null;
	
	
public DashBoardPageTc(){
	driver =new ChromeDriver();
}
WebDriver getDashBoardPage() throws Exception
{
	
		final String offlineSiteUrl="file:///C:/Users/Shrutiiiiii/Downloads/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html";
		
		
		WebDriver driver=new ChromeDriver();
		driver.get(offlineSiteUrl);	
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		Thread.sleep(1000);
		
		 driver.findElement(By.id("password")).sendKeys("123456");
		 Thread.sleep(1000);
		
		 driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click() ;
		 System.out.println("DashBoard Page testing started.................>");
		 return driver;
		
}

 public void tc001CheckingTitle() throws Exception
 {
	 System.out.println("\n\n========tc001CheckingTitle==========");
	 driver =getDashBoardPage();
	 String actTitle=driver.getTitle();
	 String expTitle="JavaByKiran | Dashboard";
	 if (actTitle.equals(expTitle)) {
		 System.out.println("Dashboard title test case passed");
		
	} else {

		System.out.println("Dashboard title test case failed");
	}
	 
 } 
	 public void tc002CheckingUrl() throws Exception
	 {
		 System.out.println("\n\n========tc002CheckingUrl==========");
		 driver =getDashBoardPage();
		 String actUrl=driver.getCurrentUrl();
		 String expUrl="offlineSite-dashboardpage.html";
		 if (actUrl.equals(expUrl)) {
			 System.out.println("Dashboard title test case passed");
			
		} else {

			System.out.println("Dashboard title test case failed");
		}
 }
	 public void tc003Checkingcaption() throws Exception
	 {
		 System.out.println("\n\n========tc003Checkingcaption============");
		 driver =getDashBoardPage();
		 String actcaption=driver.getCurrentUrl();
		 String expcaption="/html/body/div/div[1]/section[1]/h1";
		 if (actcaption.equals(expcaption)) {
			 System.out.println("Dashboard title test case passed");
			
		} else {

			System.out.println("Dashboard title test case failed");
		}
}
}