package Test.Testing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testtxtfile {
	@SuppressWarnings("deprecation")
	@Test
	public void Testscenorio() throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);

		/*
		 * ChromeOptions opt = new ChromeOptions();
		 * opt.addArguments("--remote-allow-origins=*");
		 */
		// implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// URL launch
		driver.get("https://www.youtube.com/");

		// identify element
		driver.findElement(By.name("search_query")).sendKeys("learn automation tamil");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']/yt-icon[1]/yt-icon-shape[1]/icon-shape[1]/div[1]")).click();
		driver.findElement(By.xpath("//yt-formatted-string[text()='Learn Automation Online']")).click();
		driver.findElement(By.xpath("//div[text()='Playlists']")).click();
//		driver.findElement(By.linkText("BackToBasics")).click();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		 Iterator<WebElement> it = links.iterator();
		while (it.hasNext()) {
			for(WebElement li:links) {
//				String TextLinks = li.getText();
				String url = li.getAttribute("href");
			System.out.println(url);
//			String info = url;
			if(url == null || url.isEmpty()){
				System.out.println("URL is either not configured for anchor tag or it is empty");
				                continue;
			}
			
			  String idForTxtFile = new SimpleDateFormat("dd.MM.yyyy_HH.mm.ss").format(new Date());  
			  File file = new File("Filename" + idForTxtFile);
			  
			  try { FileWriter fw = new FileWriter(file, true);
			 
			  //if you want to write the linesperator ("\n) as they are in the txt you
			  //should use the following Code:
			  
			  
				String lineSeparator = System.getProperty("line.separator"); /*
																				 * String[] ouput = url.split("\n");
																				 */
			  
				
//				  for (int i = 0; i <= url.length()-1; i++) { fw.write(url);
				 fw.write(lineSeparator); 
				 
			 
			 
			 //instead you could only use:
			 fw.write(url);
			 
			 fw.flush(); fw.close(); } catch (IOException e) { e.printStackTrace();
			 System.out.println(e); }
			 
			
			/*
			 * FileWriter writer = new FileWriter("MyFile.txt", true); BufferedWriter
			 * bufferedWriter = new BufferedWriter(writer); bufferedWriter.write(url);
			 */
			 
			/*
			 * FileWriter writer = new FileWriter("MyFile.txt", true); writer.write(url);
			 */
			/*
			 * File f = new File("savetxt.txt"); try{ FileUtils.writeStringToFile(f, url,
			 * Charset.defaultCharset()); }catch(IOException exc){ exc.printStackTrace();
			 */
			/*
			 * for (WebElement d :it) { String attribute = d.getAttribute("href"); //
			 * System.out.println(((WebElement) d).getText());
			 * 
			 * String attribute = d.getAttribute("href"); FileWriter writer = new
			 * FileWriter("MyFile.txt", true); BufferedWriter bufferedWriter = new
			 * BufferedWriter(writer); bufferedWriter.write(attribute);
			 * 
			 * 
			 * //if you want to write the linesperator ("\n) as they are in the txt you
			 * should use the following Code:
			 * 
			 * 
			 * fw.write(attribute);
			 */
			
		}

		// obtain text

		// write text to file
			driver.quit();
		
	}
}
}

