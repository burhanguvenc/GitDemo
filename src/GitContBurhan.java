import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitContBurhan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Burhan's work");
		System.out.println("Burhan s codeeeeeeee");
		System.out.println("What up?");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("google.com");
		driver.findElement(By.id("serch"));
		driver.close();

	}

}
