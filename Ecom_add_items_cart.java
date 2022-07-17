import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecom_add_items_cart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String vegetable=s.nextLine();
	
		
		System.setProperty("webdriver.chrome.driver","C:/Program Files/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		//all the elements have same class name so wehave to list the webelements and iterate
		//through each of them and hit the desired element
		
		List<WebElement> all_items=driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		int len=all_items.size();
		
		for(int i=0;i<len;i++) {
			String veg=all_items.get(i).getText();
			
		if(veg.contains(vegetable)) {
			
			driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
		}
		}
		
	}

}
