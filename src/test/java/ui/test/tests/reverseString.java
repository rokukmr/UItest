package ui.test.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.rmi.CORBA.Util;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeMethod;

public class reverseString {
	String ch = "";
	WebDriver driver;
	String url ;
	
	/*
	 * public void reverseString() throws IOException { File file = new
	 * File("E:\\Audio song\\TestData.xlsx"); FileInputStream input = new
	 * FileInputStream(file); XSSFWorkbook web = new XSSFWorkbook(input); XSSFSheet
	 * sheet = web.getSheet("Sheet1"); XSSFRow Row1 = sheet.getRow(0); url =
	 * Row1.getCell(0).getStringCellValue();
	 * 
	 * }
	 * 
	 * public void reverseString(String name) { String [] arr = name.split(" ");
	 * for(int i=0; i<arr.length-1; i++) { for (int j=arr[i].length()-1; j>=0; j--)
	 * { ch = ch + arr[i].charAt(j); } ch = ch + " "; } System.out.print(ch); }
	 * 
	 * public void takeScreenshot() { System.setProperty("webdriver.chrome.driver",
	 * "C:\\SeleniumDrivers\\chromedriver.exe"); driver = new ChromeDriver();
	 * driver.get("http://demo.guru99.com/popup.php"); TakesScreenshot scr =
	 * (TakesScreenshot)driver; File scrind = scr.getScreenshotAs(OutputType.FILE);
	 * File dest = new File("E:\\Audio song\\Rohit"); try {
	 * FileUtils.copyFile(scrind, dest); } catch (IOException e) {
	 * e.printStackTrace(); }
	 * 
	 * }
	 */
	
	@Test
	public void windowHandle() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.cssSelector("[target='_blank']")).click();
		Set<String> str = driver.getWindowHandles();
		Iterator <String> itr = str.iterator();
		while(itr.hasNext()) {
			String childString = itr.next();
			if(!(childString.equals(parentWindow))){
				driver.switchTo().window(childString);
			}
		}
		driver.findElement(By.cssSelector("[name='emailid']")).sendKeys("ROhit");
		driver.switchTo().window(parentWindow);
		driver.findElement(By.cssSelector("[target='_blank']")).click();
	}

}
