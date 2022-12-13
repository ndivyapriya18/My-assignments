package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ChromeDriver driver=new ChromeDriver();
    driver.get("http://leaftaps.com/opentaps/control/login");
    driver.manage().window().maximize();
    driver.findElement(By.id("username")).sendKeys("DemoCsr");
    driver.findElement(By.id("password")).sendKeys("crmsfa");
    driver.findElement(By.className("decorativeSubmit")).click();
    driver.findElement(By.linkText("CRM/SFA")).click();
    driver.findElement(By.linkText("Leads")).click();
    driver.findElement(By.partialLinkText("Create Lead")).click();
    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Divya");
    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Priya");
    driver.findElement(By.name("firstNameLocal")).sendKeys("Divya");
    driver.findElement(By.name("personalTitle")).sendKeys("Tester");
    driver.findElement(By.name("generalProfTitle")).sendKeys("SoftwareEngineer");
    driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("5000000");
    driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("512011");
    driver.findElement(By.name("description")).sendKeys("Tester");
    driver.findElement(By.name("importantNote")).sendKeys("Tester");
    driver.findElement(By.name("lastNameLocal")).sendKeys("Priya");
    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
    driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("123123123");
    driver.findElement(By.name("tickerSymbol")).sendKeys("*");
    driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("602001");
    driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("1826");
    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ndivyapriya188@gmail.com");
    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9159160785");
    driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Tester");
    driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.website.com");
    driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Yashi");
    driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Velachery");
    driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
    driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("602001");
    driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("0323");
    driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("sita");
    driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Velachery");
    driver.findElement(By.className("smallSubmit")).click();
}

}
