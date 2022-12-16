package week3test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FacebookSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       ChromeDriver driver=new ChromeDriver();
	       driver.get("https://www.facebook.com/'");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       driver.findElement(By.linkText("Create New Account")).click();
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Divya");
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Priya");
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("ndivyapriya188@gmail.com");
			driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("divyapriya@18");
			WebElement birthdayDay = driver.findElement(By.id("day"));
			Select birthday=new Select(birthdayDay);
			birthday.selectByVisibleText("18");
			WebElement birthMonth = driver.findElement(By.id("month"));
			Select birthdayMonth=new Select(birthMonth);
			birthdayMonth.selectByVisibleText("Aug");
			WebElement birthYear = driver.findElement(By.id("year"));
			Select birthdayYear=new Select(birthYear);
			birthdayYear.selectByVisibleText("2001");
			driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
			//driver.close();
			
	}

}
