package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class AdactinLogin {
	public static WebDriver driver;

	@Given("user goes to login page")
	public void user_goes_to_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@When("User enters correct {string}  and {string}")
	public void a(String username, String password) {
		WebElement username1 = driver.findElement(By.id("username"));
		username1.sendKeys(username);
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys(password);
	}

	@When("Clicks the login button")
	public void b() {
		driver.findElement(By.id("login")).click();
	}

	@When("Select the {string}")
	public void a(String string) {
		WebElement loc = driver.findElement(By.id("location"));
		Select s = new Select(loc);
		s.selectByValue(string);
	}

	@When("we can Select the {string}")
	public void b(String string) {
		WebElement loc = driver.findElement(By.id("hotels"));
		Select s1 = new Select(loc);
		s1.selectByValue(string);
	}

	@When("we  Select the {string}")
	public void c(String string) {
		WebElement loca = driver.findElement(By.id("room_type"));
		Select s2 = new Select(loca);
		s2.selectByValue(string);
	}

	@When("we can  Select the {string}")
	public void d(String string) {
		WebElement loc = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(loc);
		s3.selectByValue(string);
	}

	@When("we  can Select the {string}")
	public void e(String string) {
		WebElement loc = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(loc);
		s4.selectByValue(string);
	}

	@When("we want to select {string}")
	public void we_want_to_select(String string) {
		WebElement loc2 = driver.findElement(By.id("child_room"));
		Select s4 = new Select(loc2);
		s4.selectByValue(string);
	}

	@When("Click the Search Btn")
	public void g() {
		WebElement loc = driver.findElement(By.id("Submit"));
		loc.click();
	}

	@When("Select the hotel button")
	public void h() {
		WebElement locator = driver.findElement(By.id("radiobutton_0"));
		locator.click();
	}

	@When("Click the Continue button")
	public void i() {
		WebElement locf = driver.findElement(By.id("continue"));
		locf.click();
	}

	@When("Enter the {string} and {string}")
	public void enter_the_and(String firstname, String lastname) {
		WebElement findElement1 = driver.findElement(By.id("first_name"));
		findElement1.sendKeys(firstname);
		WebElement findElement2 = driver.findElement(By.id("last_name"));
		findElement2.sendKeys(lastname);
	}

	@When("user enter the {string} and {string}")
	public void m(String string, String string2) {
		WebElement locf = driver.findElement(By.id("cc_exp_month"));
		Select s = new Select(locf);
		s.selectByValue(string);
		WebElement lo = driver.findElement(By.id("cc_exp_year"));
		Select s1 = new Select(lo);
		s1.selectByValue(string2);
	}

	@When("User Enter the address {string}")
	public void user_enter_the_address(String string) {
		WebElement findElement3 = driver.findElement(By.id("address"));
		findElement3.sendKeys(string);
	}

	@When("User Enter credit number  {string}")
	public void user_enter_credit_number(String string) {
		WebElement findElement4 = driver.findElement(By.id("cc_num"));
		findElement4.sendKeys(string);
	}

	@When("Select the credit card  {string}")
	public void select_the_credit_card(String string) {
		WebElement l = driver.findElement(By.id("cc_type"));
		Select s1 = new Select(l);
		s1.selectByValue(string);
	}

	@When("user enter the expiry month and year{string} and {string}")
	public void user_enter_the_expiry_month_and_year_and(String string2, String string5) {
		WebElement findElement = driver.findElement(By.id("cc_exp_month"));
		Select s = new Select(findElement);
		s.selectByValue(string2);
		WebElement findElement8 = driver.findElement(By.id("cc_exp_year"));
		Select s1 = new Select(findElement8);
		s1.selectByValue(string5);
	}

	@When("User Enter the cvv {string}")
	public void user_enter_the_cvv(String string) {
		WebElement findElement5 = driver.findElement(By.id("cc_cvv"));
		findElement5.sendKeys(string);
	}

	@When("User wants to click the book button")
	public void user_wants_to_click_the_book_button() throws InterruptedException {
		WebElement findElement6 = driver.findElement(By.id("book_now"));
		findElement6.click();
	}

	@When("click My iternary Page")
	public void click_my_iternary_page() {
		WebElement findElement9 = driver.findElement(By.xpath("//input[@id='my_itinerary']"));
		findElement9.click();
	}

	@When("click the check box")
	public void click_the_check_box() {
		WebElement findElement = driver.findElement(By.name("ids[]"));
		findElement.click();
	}

	@When("Cancel the booking")
	public void cancel_the_booking() {
		WebElement findElement = driver.findElement(By.name("cancelall"));
		findElement.click();

	}

	@When("Handle the alert")
	public void handle_the_alert() {
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}

}
