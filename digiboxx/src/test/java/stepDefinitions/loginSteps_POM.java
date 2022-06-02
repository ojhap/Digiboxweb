package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage;


public class loginSteps_POM {
	WebDriver driver=null;
	loginPage login;
	@Before
	public void browseSetup() {
		System.out.println("I am inside browser setup");
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is:"+projectPath );
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@After
	public void teardown() {
		System.out.println("I am inside teardown");
		driver.close();
		driver.quit();
	}


	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("InsideStep: user is on login page");
		driver.navigate().to("https://apptest.digiboxx.com/login");
	}

	@When("user passes valid spacename username and password")
	public void user_passes_valid_spacename_username_and_password() throws InterruptedException {
		login =new loginPage(driver);
		login.enterspacename();
		login.enterusername();
		login.enterpassword();
		Thread.sleep(2000);
		System.out.println("InsideStep: user passes valid credetials");

	}

	@Then("clicks on login button")
	public void clicks_on_login_button() throws InterruptedException {
		login.clickloginbtn();
		login.clickalert();
		Thread.sleep(5000);
		System.out.println("InsideStep:user is on homepage");
	}




	@When("user clicks on add button")
	public void user_clicks_on_add_button() {
		login.clickaddbutton();
		System.out.println("InsideStep: user clicks on add button");

	}

	@Then("clicks on add folder")
	public void clicks_on_add_folder() {
		login.clickcreatefolderbutton();
		System.out.println("InsideStep: user clicks on add folder");

	}

	@And("user gives folder name")
	public void user_gives_folder_name() {
		login.givefoldername();
		System.out.println("InsideStep: user gives folder name");

	}

	@Then("click on create  button")
	public void click_on_create_button() throws InterruptedException {
		login.clickcreatebutton();
		System.out.println("InsideStep: user is able to create folder");
		Thread.sleep(2000);

	}


	@When("user clicks on desired folder")
	public void user_clicks_on_desired_folder() throws InterruptedException {
		login.clickfolderpo();
		System.out.println("InsideStep: user clicks on desired folder");

	}
	@And("choose the add option")
	public void choose__the_add_option() throws InterruptedException {
		login.choosetheaddbutton();

	}


	@Then("clicks on upload files")
	public void clicks_on_upload_files() throws InterruptedException {
		login.clickonaddfiles();
		System.out.println("InsideStep: user is able to upload files");

	}
	@When("user clicks on filter option")
	public void user_clicks_on_filter_option() throws InterruptedException {
		login.clickfilterbutton();
		System.out.println("InsideStep: user is able to click on filter button");
	}

	@Then("choose the name filter option")
	public void choose_the_name_filter_option() throws InterruptedException {
		login.choosenameoption();
		System.out.println("InsideStep: user is able to click on name filter ");

	}

	@And("choose the size filter option")
	public void choose_the_size_filter_option() throws InterruptedException {
		login.choosesizeoption();
		System.out.println("InsideStep: user is able to click on size filter ");

	}

	@Then("clicks on apply button")
	public void clicks_on_apply_button() throws InterruptedException {
		login.clickapply();
		System.out.println("InsideStep: user is able to apply filter ");

	}

}
