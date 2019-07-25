import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class frame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new firefoxdriver();
		driver.get("http://toolsqa.com/iframe-practice-page/");
		driver.switchTo().frame("IF1");
		
		driver.findElement(By.xpath("//input[@id='sex-1']")).click();
	}

}
