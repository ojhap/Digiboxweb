package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class loginPage {


	WebDriver driver;
	By txt_spacename=By.xpath("//input[@id='workspace']");
	By txt_username=By.xpath("//input[@id='Username']");
	By txt_password=By.xpath("//input[@id='Password']");
	By btn_login=By.xpath("//button[@type='submit']");
	By alrt_clickhere=By.xpath("//*[contains(text(),'Click Here')]");
	By btn_add=By.xpath(" //span[@class='add-btn']");
	By btn_createfolder=By.xpath("//ul[@class='add-pro-opt ng-star-inserted']//child::li [3]");
	By txt_foldername=By.xpath("//input[@id='folderName']");
	By btn_createbutton=By.xpath("//button[@class='start-btn log-btn my-1']");
	By folder_po=By.xpath("//div[@class='folder-box null ng-star-inserted']");
	By choose_file=By.xpath("//ul[@class='add-pro-opt ng-star-inserted']//child::Li [1]");
	By btn_filter=By.xpath("//img[@src='assets/img/icons/icon-filter.svg']");
	By choose_name=By.xpath("(//a[@class='filter-arrow ml-2'])[1]");
	By choose_size=By.xpath("(//a[@class='filter-arrow ml-2'])[2]");
	By click_aaply=By.xpath("//a[@class='apply-btn ml-0']");

	public loginPage(WebDriver driver) {
		this.driver=driver;

	}




	public void enterspacename() {
		driver.findElement(txt_spacename).sendKeys("intern5");

	}
	public void enterusername() {
		driver.findElement(txt_username).sendKeys("testing2510934@gmail.com");
	}

	public void enterpassword() throws InterruptedException {
		driver.findElement(txt_password).sendKeys("Gaurav@123");
		Thread.sleep(1000);
	}

	public void clickloginbtn() {
		driver.findElement(btn_login).click();
	}
	public void clickalert() {
		driver.findElement(alrt_clickhere).click();

	}
	public void clickaddbutton() {
		driver.findElement(btn_add).click();

	}
	public void clickcreatefolderbutton() {
		driver.findElement(btn_createfolder).click();
	}
	public void givefoldername() {
		driver.findElement(txt_foldername).sendKeys("po");
	}
	public void clickcreatebutton() {
		driver.findElement(btn_createbutton).click();
	}
	public void clickfolderpo() throws InterruptedException {
		driver.findElement(folder_po).click();
		Thread.sleep(2000);
	}
	public void choosetheaddbutton() throws InterruptedException {
		driver.findElement(btn_add).click();
		Thread.sleep(2000);
	}

	public void clickonaddfiles() throws InterruptedException {

		driver.findElement(choose_file).click();
		Thread.sleep(2000);

		String fileName = "C:\\Users\\PRATIKSHA\\Downloads\\image0.jpg";
		StringSelection filepath= new StringSelection(fileName);
		Thread.sleep(2000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(10000);	

	}
	public void clickfilterbutton() throws InterruptedException {
		driver.findElement(btn_filter).click();
		Thread.sleep(2000);
	}
	public void choosenameoption() throws InterruptedException {
		driver.findElement(choose_name).click();
		Thread.sleep(2000);
	}
	public void choosesizeoption() throws InterruptedException {
		driver.findElement(choose_size).click();
		Thread.sleep(2000);
	}
	public void clickapply() throws InterruptedException {
		driver.findElement(click_aaply).click();
		Thread.sleep(4000);
	}
}
