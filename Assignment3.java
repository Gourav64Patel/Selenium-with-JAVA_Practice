import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Multiple Windows")).click();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
		
		Set<String> window=driver.getWindowHandles();
		Iterator<String> it=window.iterator();
		String Parent=it.next();
		String Child=it.next();
		
		driver.switchTo().window(Child);
		
		String win2=driver.findElement(By.xpath("//html/body/div[@class='example']/h3")).getText();
		System.out.println(win2);
		
		driver.switchTo().window(Parent);
		
		String win1=(driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3"))).getText();
		
		System.out.println(win1);
		
		driver.quit();
	}

}
