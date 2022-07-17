import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ecart_multiple_options {

	
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String[] vegetable = { "Brocolli", "Tomato", "Pumpkin", "Corn", "Musk Melon", "Raspberry" };
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// all the elements have same class name so wehave to list the webelements and
		// iterate
		// through each of them and hit the desired element
		// covert array to arrayList

		List<WebElement> all_items = driver.findElements(By.xpath("//h4[@class='product-name']"));

		int len = all_items.size();

		for (int i = 0; i < len; i++) {
			// convert to string array because split function returns array

			String[] veg = all_items.get(i).getText().split("-");
			
			String veg_needed = veg[0].trim();
			// Cashews - 1 Kg need to split and get name of vegetable only

			List new2 = Arrays.asList(vegetable);

			if (new2.contains(veg_needed)) {

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			}
			
		}
		driver.findElement(By.cssSelector("a.cart-icon")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button")).click();
		
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		Thread.sleep(5000L);
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		
		
	}

}
