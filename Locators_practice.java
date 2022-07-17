import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		
		
		driver.findElement(By.id("username")).sendKeys("student");
		
		driver.findElement(By.id("password")).sendKeys("Password123");
		
		driver.findElement(By.className("btn")).click();
		
		String s=driver.findElement(By.className("post-title")).getText();
		System.out.println(s);
		
		
	}

}
