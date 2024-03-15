package Test.Testing;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
   @SuppressWarnings("deprecation")
@Test
	public void Sample() throws IOException {
	   WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String playlist_url = "https://www.youtube.com/playlist?list=PLLS0D9-W-1dn4XIO9MmGsU9mvgG2TM4b8";
				driver.get(playlist_url);
				JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		        // Wait for a few seconds to load more videos (You may need to fine-tune this)
		        try {
		            Thread.sleep(3000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }

		        // Find all the video links in the playlist
		        List<WebElement> videoLinks = driver.findElements(By.tagName("a"));

		        // Print the links
		        for (WebElement link : videoLinks) {
		            String href = link.getAttribute("href");
		            if(href == null || href.isEmpty()){
						System.out.println("URL is either not configured for anchor tag or it is empty");
						                continue;
					}
		            if (href.startsWith("https://www.youtube.com/watch?v=")) {
//		                System.out.println(href);
		                String idForTxtFile = new SimpleDateFormat("dd.MM.yyyy_HH.mm.ss").format(new Date());  
		  			  File file = new File("Filename" + idForTxtFile);
		  			  
		  			  FileWriter fw = new FileWriter(file, true);
						String lineSeparator = System.getProperty("line.separator"); 
					 fw.write(lineSeparator); 
						 fw.write(href);
						 
						 fw.flush(); fw.close();
						 

		  			  
}
		        
}
		        driver.quit();

}
}