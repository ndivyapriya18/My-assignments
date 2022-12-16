package week3test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UbiBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://uibank.uipath.com/register-account");
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.linkText("Register For Account")).click();
		driver.findElement(By.id("firstName")).sendKeys("Divya");
		WebElement title = driver.findElement(By.id("title"));
		Select titleDropDrop=new Select(title);
		titleDropDrop.selectByVisibleText("Mrs");
		driver.findElement(By.id("middleName")).sendKeys("N");
		driver.findElement(By.id("lastName")).sendKeys("Priya");
		WebElement element = driver.findElement(By.id("sex"));
		Select day=new Select(element);
		day.selectByVisibleText("Female");
		WebElement element1 = driver.findElement(By.id("employmentStatus")); 
		Select month=new Select(element1);
		month.selectByValue("Unemployed");
		driver.findElement(By.id("username")).sendKeys("Divya");
		driver.findElement(By.id("email")).sendKeys("ndivyapriya188@gmail.com");
		driver.findElement(By.name("password")).sendKeys("divyapriya@18");  
        //driver.close();
	}

}
