package seleniumclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class assignment02 {
	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/login");
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[contains(text(),' Login')]")).click();
		System.out.println("page title is = "  +  driver.getTitle());
		driver.findElement(By.linkText("Log Out")).click();
		driver.close();
		
		
		
	}

}
