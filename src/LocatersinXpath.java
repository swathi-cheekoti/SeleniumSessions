import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatersinXpath {

	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\cheekoti\\Documents\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();
       driver.findElement( By.xpath("//a[contains(text(),'NCC')]")).click();
		
		
		
		//ncc1=driver.findElement(B
		
	

	}

}
