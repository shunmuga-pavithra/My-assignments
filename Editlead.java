package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Editlead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//driver.close();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
driver.findElement(By.id("password")).sendKeys("crmsfa");
//Thread.sleep(3000);
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.partialLinkText("CRM")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Optisol Bussiness Solution");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pavithra");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Pradeep");
driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("NITHIN");
driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("NILA");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("aws");
driver.findElement(By.id("createLeadForm_description")).sendKeys("teamlead");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("paviece28@gmail.com");
//ebElement web=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
//Select sec = new Select(web);
//sec.selectByVisibleText("California");
driver.findElement(By.name("submitButton")).click();
//driver.findElement(By.id("Edit")).click();

driver.findElement(By.linkText("Edit")).click();
driver.findElement(By.name("description")).clear();
driver.findElement(By.name("importantNote")).sendKeys("personal info");

driver.findElement(By.name("submitButton")).click();
String e = driver.getTitle();
System.out.println(e);


	}

}
