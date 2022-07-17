import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2_udemy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/div[1]/input")).sendKeys("Gourav Patel");
		driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/div[2]/input")).sendKeys("contact@rahulshettyacademy.com");
		//contact@rahulshettyacademy.com
		driver.findElement(By.xpath("//input[@class='form-control'][@id='exampleInputPassword1']")).sendKeys("rahulshetty");
		
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement gender=driver.findElement(By.id("exampleFormControlSelect1"));
		
		Select MF=new Select(gender);
		MF.selectByVisibleText("Male");
		
		driver.findElement(By.xpath("//*[@id=\"inlineRadio1\"]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/div[7]/input")).sendKeys("06/26/1997");
		
		driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/input")).click();
		
		String s=driver.findElement(By.xpath("/html/body/app-root/form-comp/div/div[2]/div")).getText();
		System.out.println(s);
	}

}
