import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://byjus.com/");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@class='dropdown-toggle']"))).build().perform();
		
		driver.findElement(By.xpath("//img[@class='search-icon']")).click();
		
		a.moveToElement(driver.findElement(By.xpath("//input[@class='form-control input-error header-search-input']"))).click().keyDown(Keys.SHIFT).sendKeys("Ncert").build().perform();
		

}}

