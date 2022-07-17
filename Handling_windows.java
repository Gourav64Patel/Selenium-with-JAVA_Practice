import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		getlink(driver);
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> move=windows.iterator();
		String Parent=move.next();
		String child=move.next();
		driver.switchTo().window(child);
		
		String text=driver.findElement(By.xpath("//*[@id=\"interview-material-container\"]/div/div[2]/p[2]")).getText();
		//Please email us at mentor@rahulshettyacademy.com with below template to receive response
		text=text.split("at")[1].split("with")[0].strip();
		System.out.println(text);
		
		driver.switchTo().window(Parent);
		
		driver.findElement(By.id("username")).sendKeys(text);
		
	}
	
	public static void getlink(WebDriver driver) {
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		
	}
	
	

}
