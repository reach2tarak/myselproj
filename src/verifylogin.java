import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class verifylogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://13.234.33.134:3001/");
		WebElement uname = driver.findElement(By.xpath("/html/body/form/div/div/div/div[1]/div[2]/input"));
        WebElement pass = driver.findElement(By.xpath("/html/body/form/div/div/div/div[1]/div[4]/input"));
        WebElement button = driver.findElement(By.xpath("/html/body/form/div/div/div/div[1]/div[6]/input"));         

        uname.sendKeys("devops");
        pass.sendKeys("test");
        button.submit();
	}

}
