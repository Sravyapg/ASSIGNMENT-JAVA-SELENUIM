
//Write the script for open flipkart close the login popup go to deal of the and try to get the first link in that
package com.javasel.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FlipCartDeal {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath(("//button[@class='_2KpZ6l _2doB4z']"))).click();
		driver.findElement(By.xpath("//div[@class='EiX-pS']/..//a[.='VIEW ALL']")).click();
		//click on first link
		driver.findElement(By.xpath("(//div[@class='_3LU4EM'])[1]")).click();
		driver.close();

	}
}

