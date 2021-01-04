//package stepdefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class contacts {
//	WebDriver driver;
//	@Given("^user is already on loginpage$")
//	public void user_is_already_on_loginpage() {
//		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.get("https://freecrm.co.in/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
//	}
//
//	@When("^title of the login page is Free CRM$")
//	public void title_of_the_login_page_is_Free_CRM() {
//		String title=driver.getTitle();
//		System.out.println("title="+title);
//		Assert.assertEquals("Cogmento CRM", title);
//	}
//
//	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_and(String username, String password) {
//		driver.findElement(By.name("email")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password );
//	}
//
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button() {
//		WebElement loginbtn=driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]"));
//		JavascriptExecutor jse=(JavascriptExecutor)driver;
//		jse.executeScript("arguments[0].click();",loginbtn);
//	}
//
//	@Then("^user is on homepage$")
//	public void user_is_on_homepage() {
//		String htitle=driver.getTitle();
//		System.out.println(htitle);
//		
//		Assert.assertEquals("Cogmento CRM", htitle);
//	}
//
//	@Then("^user clicks on new contact link$")
//	public void user_clicks_on_new_contact_link() throws InterruptedException {
//		Actions act=new Actions(driver);
//		act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Contacts')]"))).build().perform();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
//		
//		driver.findElement(By.xpath("(//*[@class='ui linkedin button'])[3]")).click();
//	}
//
//	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_and_and(String firstname, String lastname, String company) { 
//		driver.findElement(By.name("first_name")).sendKeys(firstname);
//		driver.findElement(By.name("last_name")).sendKeys(lastname);
//		driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[2]/div[2]/div/div/input")).sendKeys(company);
//	}
//
//	@Then("^user clicks on save button$")
//	public void user_clicks_on_save_button() {
//		driver.findElement(By.xpath("//*[@class='ui linkedin button']")).click();
//	}
//
//	@Then("^close the browser$")
//	public void close_the_browser() {
//		driver.quit();
//	}
//
//
//
//}
