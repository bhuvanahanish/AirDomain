package org.airline;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class AirBalticProject {
	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GAWTHAM HANISH\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\bhuvanaselenium\\MyMaven\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}

	@AfterClass
	public static void afterClass() {
	driver.quit();
	}

	@Before
	public void beforeMethod() {
		Date date = new Date();
		System.out.println(date);
	}

	@After
	public void afterMethod() {
		Date date = new Date();
		System.out.println(date);
	}

	@Test
	public void test1() throws InterruptedException, AWTException  {
		driver.get("https://www.airbaltic.com/en-ZZ/index");
		Thread.sleep(3000);
		WebElement  onewaydropdown = driver.findElement(By.xpath("(//div[@class='dropdown-field'])[1]"));
		onewaydropdown.click();
		
		WebElement  oneway = driver.findElement(By.xpath("//li[contains(text(),'One-way')]"));
		oneway.click();
		
		WebElement  Passengerdropdown = driver.findElement(By.xpath("//div[@class='pax-count-dropdown']"));
		Passengerdropdown.click();
		
		WebElement  Adult = driver.findElement(By.xpath("(//span[@class='button increase'])[1]"));
		Adult.click();
		
		WebElement  Donebtn = driver.findElement(By.xpath("//button[contains(text(),'Done')]"));
		Donebtn.click();
		
		WebElement  Frombtn = driver.findElement(By.xpath("//input[@placeholder='Choose your origin']"));
		Frombtn.click();
		WebElement  airportsnearby = driver.findElement(By.xpath("//li[contains(text(),'Airports nearby')]"));
		airportsnearby.click();
		
		WebElement  AbuDhabi = driver.findElement(By.xpath("//div[contains(text(),'Abu Dhabi (AUH)')]"));
		AbuDhabi.click();
		
		WebElement  Tobtn = driver.findElement(By.xpath("//input[@placeholder='Choose your destination']"));
		Tobtn.click();
		
		WebElement  airbalticdestinations = driver.findElement(By.xpath("(//li[contains(text(),'airBaltic destination')])[1]"));
		airbalticdestinations.click();
		
		WebElement  scrolldown = driver.findElement(By.xpath("//div[contains(text(),'Paris (CDG)')]"));

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",scrolldown);

		WebElement  Riga = driver.findElement(By.xpath("(//div[contains(text(),'Riga (RIX)')])[2]"));
		Riga.click();
		
		WebElement  selectdate = driver.findElement(By.xpath("//div[@class='rectangle']"));
		selectdate.click();
		
		Thread.sleep(5000);
		//date selection page
		WebElement  Jan30 = driver.findElement(By.xpath("(//span[contains(text(),'30')])[1]"));
		Jan30.click();
		
		Thread.sleep(5000);

		//WebElement  cabin = driver.findElement(By.xpath("//div[@class='dropdown__select']"));
		//cabin.click();
		//WebElement  bussinesscabin = driver.findElement(By.xpath("//li[contains(text(),'Business')]"));
		//bussinesscabin.click();
		
		
		//WebElement  showotherflights = driver.findElement(By.xpath("//div[@class='flights__element-show-other-flights']"));
		//showotherflights.click();
		
		//WebElement  fastest = driver.findElement(By.xpath("(//span[contains(text(),'Fastest')])[2]"));
		//fastest.click();
		
		//direct flight
		WebElement  directflight = driver.findElement(By.xpath("//span[text()='Direct flight']"));
		directflight.click();
		
		WebElement  continuebtn = driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
		continuebtn.click();
		
		//premium fare
		WebElement  premium = driver.findElement(By.xpath("(//span[@class='upsl__option-check'])[3]"));
		premium.click();

		WebElement  continuebtn2 = driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
		continuebtn2.click();
		Thread.sleep(10000);
		
		//passenger details page
		
		WebElement  title1= driver.findElement(By.xpath("(//div[@class='jq-selectbox__select needsclick'])[1]"));
		title1.click();
		
		WebElement  Ms1= driver.findElement(By.xpath("(//li[text()='Ms.'])[1]"));
		Ms1.click();
		
		WebElement  firstname = driver.findElement(By.xpath("//input[@name='firstname_ADT_0']"));
		firstname.sendKeys("bhuvana");
		String name1 = firstname.getAttribute("value");
		Assert.assertEquals("verify firstname1", "bhuvana", name1);
		

		WebElement  surname = driver.findElement(By.xpath("//input[@name='lastname_ADT_0']"));
		surname.sendKeys("seeyalam");
		String surname1 = surname.getAttribute("value");
		Assert.assertEquals("verify surname1", "seeyalam", surname1);
		
		
		WebElement  title2= driver.findElement(By.xpath("(//div[@class='jq-selectbox__select-text needsclick'])[5]"));
		title2.click();
		
		WebElement  Ms2= driver.findElement(By.xpath("(//li[text()='Mr.'])[2]"));
		Ms2.click();
		
		
		WebElement  firstname2 = driver.findElement(By.xpath("//input[@name='firstname_ADT_1']"));
		firstname2.sendKeys("deiva");
		String name2 = firstname2.getAttribute("value");
		Assert.assertEquals("verify firstname2", "deiva", name2);

		WebElement  surname2 = driver.findElement(By.xpath("//input[@name='lastname_ADT_1']"));
		surname2.sendKeys("sigamani");
		String surname3 = surname2.getAttribute("value");
		Assert.assertEquals("verify surname2", "sigamani", surname3);
		
		

		WebElement  emailid = driver.findElement(By.xpath("//input[@name='email_0']"));
		emailid.sendKeys("bhuvanadh@gmail.com");		
		String email1 = emailid.getAttribute("value");
		Assert.assertEquals("verify emailid", "bhuvanadh@gmail.com", email1);

		WebElement  phno = driver.findElement(By.xpath("//input[@name='phone_M']"));
		phno.sendKeys("2435668");
		String phno1 = phno.getAttribute("value");
		Assert.assertEquals("verify phno", "2435668", phno1);

		
		WebElement  paymentoptions = driver.findElement(By.xpath("(//div[text()='Select'])[2]"));
		paymentoptions.click();

		WebElement  creditcard = driver.findElement(By.xpath("//li[text()='Debit/credit card']"));
		creditcard.click();

		WebElement  continue2 = driver.findElement(By.xpath("//span[text()='Continue']"));
		continue2.click();
		Thread.sleep(6000);

		//seat selection page
		
		WebElement select1 = driver.findElement(By.xpath("//button[@class='seat_button_ADT_1_0_0 btn button-green seat-select no-word-spacing seatSelector']"));
		select1.click();
		
		List <WebElement> li = driver.findElements(By.xpath("//div[contains(@data-seat,'F')]"));
		for(int i =0;i<1;i++){
		WebElement seat1 = li.get(i);
		seat1.click();
		}
		
		WebElement select2 = driver.findElement(By.xpath("//button[@class='seat_button_ADT_0_0_0 btn button-green seat-select no-word-spacing seatSelector']"));
		select2.click();
		
		List <WebElement> li2 = driver.findElements(By.xpath("//div[contains(@data-seat,'E')]"));
		for(int j=0;j<1;j++){
		WebElement seat2 = li2.get(j);
		seat2.click();
		}
		Thread.sleep(3000);
		WebElement continuebooking = driver.findElement(By.xpath("(//button[@id='btn-continue-booking'])[1]"));
		continuebooking.click();
		
		Thread.sleep(4000);
		
		WebElement Termsandconditions = driver.findElement(By.xpath("//span[@id='conditions-styler']"));
		Termsandconditions.click();

		WebElement finalsubmit = driver.findElement(By.xpath("(//label[@for='btnSubmit'])[1]"));
		finalsubmit.click();
	}
}



		