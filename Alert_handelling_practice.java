import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_handelling_practice {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner input=new Scanner(System.in);
		String name=input.nextLine();
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		
		driver.findElement(By.id("name")).sendKeys(name);
		Thread.sleep(2000L);
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000L);
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		
		driver.findElement(By.id("name")).sendKeys(name);
		Thread.sleep(2000L);
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000L);
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
	
		
		
	}

}
