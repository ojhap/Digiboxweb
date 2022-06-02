//package stepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//
//public class loginSteps {
//	WebDriver driver=null;
//	public void browseSetup() {
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project path is:"+projectPath );
//		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");	
//		driver= new ChromeDriver()
//	
//	}
//}
////	
//
////
////	@Given("user is on login page")
////	public void user_is_on_login_page() {
////		System.out.println("InsideStep: user is on login page");
////		String projectPath = System.getProperty("user.dir");
////		System.out.println("Project path is:"+projectPath );
////		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
////        driver= new ChromeDriver();
////		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
////		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
////		driver.manage().window().maximize();
////		driver.navigate().to("https://apptest.digiboxx.com/login");
////	}
////
////	@When("^user passes valid (.*) (.*) and (.*)$")
////	public void user_passes_valid_spacename_username_and_password(String spacename, String username, String password) throws InterruptedException {
////		driver.findElement(By.xpath("//input[@id='workspace']")).sendKeys(spacename);
////		Thread.sleep(2000);
////		driver.findElement(By.xpath("//input[@id='Username']")).sendKeys(username);
////		Thread.sleep(2000);
////		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
////		Thread.sleep(2000);
////	    System.out.println("InsideStep: user passes valid credetials");
////
////	}
////
////	@And("clicks on login button")
////	public void clicks_on_login_button() {
////		driver.findElement(By.xpath("//button[@type='submit']")).click();
////		driver.findElement(By.xpath("//*[contains(text(),'Click Here')]")).click();
////		System.out.println("InsideStep: user clicks on login button");
////	}
////
////	@Then("user is navigated to homepage")
////	public void user_is_navigated_to_homepage() {
////		System.out.println("InsideStep: user is on homepage");
////	}
////}
