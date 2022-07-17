import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Handelling_Dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:/Program Files/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        
       //way to automate static dropdown, and is identified by <select> tag name
       // first we need to invoke the webelement
        
        WebElement dropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select staticdropdown=new Select(dropdown);//created object for Select Class
        
        staticdropdown.selectByIndex(3);// index(3) is USD we want to select USD
        String selOpt=staticdropdown.getFirstSelectedOption().getText();//getFirstSelectedOption() is used to select the first selected element in single option dropdown
        
        Assert.assertEquals(selOpt,"USD");
        
        staticdropdown.selectByVisibleText("AED");
        Assert.assertEquals(staticdropdown.getFirstSelectedOption().getText(), "AED");
        
	}

}
