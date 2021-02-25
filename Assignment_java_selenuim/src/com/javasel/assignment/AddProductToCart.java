
//Write a script for selecting a product in the Drop down list, Add the product to the cart, and verify the purchase.
package com.javasel.assignment;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddProductToCart {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Actions a = new Actions(driver);
		WebElement home = driver.findElement(By.xpath("//div[@class='xtXmba' and text()='Home']"));
		a.moveToElement(home).perform();
		driver.findElement(By.xpath("//div[@class='_3XS_gI _7qr1OC']/a[1]")).click();
		driver.findElement(By.xpath("//div[.='Bestselling Bean Bag']")).click();
		driver.findElement(By.xpath("(//div[@class='_4ddWXP'])[1]")).click();

		String parent=driver.getWindowHandle();
		Set<String> alltab = driver.getWindowHandles();
		Iterator<String> it = alltab.iterator();
		while(it.hasNext()) {
			String child_window=it.next();

			if(!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
				Thread.sleep(5000);
				WebElement actual = driver.findElement(By.xpath("//div[@class='_2-uG6-']"));

				if((actual.getText()).contains("MTV XL Teardrop Bean Bag"))
				{
					System.out.println("successfully added to cart");
				}
			}
		}
		driver.quit();

	}
}

