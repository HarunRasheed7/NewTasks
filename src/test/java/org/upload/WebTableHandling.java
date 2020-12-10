package org.upload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandling {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//to get value the from third row and second column
		WebElement thirdrow = driver.findElement(By.xpath("//table//tbody//tr[3]/td[2]"));
		String text = thirdrow.getText();
		System.out.println(text);
		
		//to get all the value the from the table
		WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
		String text1 = table.getText();
		System.out.println(text1);
		
}
}