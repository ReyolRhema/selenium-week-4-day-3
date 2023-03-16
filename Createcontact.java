package seleniumclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
        driver.get("http://leaftaps.com/opentaps/cntorol/login");
        
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("REYOL");
		driver.findElement(By.id("lastNameField")).sendKeys("RHEMA");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("REYOL");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("RHEMA");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("MCA");
		driver.findElement(By.id("createContactForm_description")).sendKeys("TEST-LEAF");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("reyol@gmail.com");
		
		WebElement place = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select state = new Select(place);
		state.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Private Sector");
		driver.findElement(By.xpath("//input[@class = 'smallSubmit']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
			
	}
	}