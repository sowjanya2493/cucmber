package stepdefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class dealsMaps {
	WebDriver driver;
	@Given("^user is already on loginpage$")
	public void user_is_already_on_loginpage() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://freecrm.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
	}

	@When("^title of the login page is Free CRM$")
	public void title_of_the_login_page_is_Free_CRM() {
		String title=driver.getTitle(); 
		System.out.println("title="+title);
		Assert.assertEquals("Cogmento CRM", title);
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) {
		List<Map<String,String>> data = credentials.asMaps();
		driver.findElement(By.name("email")).sendKeys(data.get(0).get("username"));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get("password")); 
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		WebElement loginbtn=driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();",loginbtn);
	}

	@Then("^user is on homepage$")
	public void user_is_on_homepage() {
		String htitle=driver.getTitle();
		System.out.println(htitle);
		
		Assert.assertEquals("Cogmento CRM", htitle);
	}
	@Then("^user clicks on new deals link$")
	public void user_clicks_on_new_deals_link() throws InterruptedException {
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Deals')]"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Deals')]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a[3]/button")).click();
	}

	@Then("^user enters Title and AssignedTo and company and amount$")
	public void user_enters_Title_and_AssignedTo_and_company_and_amount(DataTable dealdata) {
		List<Map<String,String>> data1=dealdata.asMaps();
		driver.findElement(By.name("title")).sendKeys(data1.get(0).get("title"));
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[2]/div[1]/div/div")).sendKeys(data1.get(0).get("assignedTo"));
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[2]/div[2]/div/div/input")).sendKeys(data1.get(0).get("company"));
		driver.findElement(By.name("amount")).sendKeys(data1.get(0).get("amount"));
	}
	@Then("^user clicks on save button$")
	public void user_clicks_on_save_button() {
		driver.findElement(By.xpath("//*[@class='ui linkedin button']")).click();
	}

	@Then("^close the browser$")
	public void close_the_browser() {
		driver.quit();
	}
}
