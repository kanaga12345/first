package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemoCode {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\work-space\\Action\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.greenstechnologys.com/");
		Actions a = new Actions(driver);
		//moveToElement()---->Hover over
		WebElement course = driver.findElement(By.xpath("//a[text()='Online Courses']"));
		a.click(course).perform();
		WebElement testing = driver.findElement(By.xpath("//span[text()='Software Testing']"));
		//click()
		a.click(testing).perform();
		WebElement training = driver.findElement(By.xpath("(//a[text()='Corporate Training'])[1]"));
		//contexClick()
		a.contextClick(training).perform();
		WebElement branch = driver.findElement(By.xpath("(//a[text()='All Branches'])[1]"));
		//doubleClick()
		a.doubleClick(branch).perform();
		
		//dragAndDrop()
		
		System.out.println("Hi Work Done By QA");
		System.out.println("QA Work");
	
		
		
		
		
		
		
		
		
	}

}
