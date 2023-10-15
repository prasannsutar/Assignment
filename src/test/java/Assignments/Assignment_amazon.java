package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_amazon {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//driver.findElement(By.xpath("(//span[text()='Apple iPhone 13 (128GB) - Midnight'])[1]")).click();
		WebElement price = driver.findElement(By.xpath("(//span[text()='Apple iPhone 13 (128GB) - Midnight'])[1]/../../../../../..//span[@class='a-price-whole']"));
		System.out.println("Price of iPhone 13 is "+price.getText());
	}

}
