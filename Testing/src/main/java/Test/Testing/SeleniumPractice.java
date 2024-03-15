package Test.Testing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumPractice {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		//EdgeDriver driver= new EdgeDriver();
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.youtube.com/");
		
		System.out.println("test");
	}

}
