import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestve_dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner n=new Scanner(System.in);
		System.out.println("enter partial or full name in dropdown");
		String name=n.nextLine();
		System.out.println("enter correct name or option to be clicked");
		String correct_name=n.nextLine();
		
		System.setProperty("webdriver.chrome.driver","C:/Program Files/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		String x_path_options="//ul[@id='ui-id-1'] //li[@class='ui-menu-item']/a[@class='ui-corner-all']";
	//Case1- taking input from user as a full correct value
		
		driver.findElement(By.id("autosuggest")).sendKeys(name);
		Thread.sleep(2000L);
		
		List<WebElement> options =driver.findElements(By.xpath(x_path_options));
		
		
		for(WebElement input :options) {
			if(input.getText().equalsIgnoreCase(correct_name)) {
				
				input.click();
				break;
				
			}
		}
		
	}
	}
	


