import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames_handelling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		//store webelement in another variable
		WebElement frame1=driver.findElement(By.id("frm1"));
		
		driver.switchTo().frame(frame1);
		
		WebElement drp1=driver.findElement(By.id("course"));
		
		Select drop1=new Select(drp1);
		
		drop1.selectByVisibleText("Java");
		
		driver.switchTo().defaultContent();
		
		String name=driver.findElement(By.xpath("//h1[@class='post-title entry-title']")).getText();
		System.out.println(name);
	}

}
