package StepDefinitions;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass12 {
	// reusable method

	public static WebDriver driver;

	// launch browser
	public void Browserlaunch(String browser) {

		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "opera":
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
			break;

		default:
			System.out.println("invalid browser");

		}
		driver.manage().window().maximize();
	}

	// to launch the url

	public void launchUrl(String url) {
		driver.get(url);
	}

	// to get idlocator
	public WebElement locatorid(String value) {
		WebElement findElement = driver.findElement(By.id(value));
		return findElement;
	}

	// to get namelocator
	private WebElement namelocator(String value) {
		WebElement findElement = driver.findElement(By.name(value));
		return findElement;
	}

	// to get xpath
	private WebElement xpathlocator(String value) {
		WebElement findElement = driver.findElement(By.xpath(value));
		return findElement;
	}

	// to get className
	private WebElement classnamelocator(String value) {
		WebElement findElement = driver.findElement(By.className(value));
		return findElement;
	}

	// to click the button
	public void btnClick(WebElement element) {
		element.click();
	}

	// to get title
	public void getTitlemethod() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	// to get current url
	public void current() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	// to get the pagesource of current webpage
	public void pagesource() {
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}

	// to send keys
	public void sendKeyss(WebElement ref, String data) {
		ref.sendKeys(data);
	}

	// action class
	public void draganddropp(WebElement source, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}

	public void moveToElements(WebElement source) {
		Actions ab = new Actions(driver);
		ab.moveToElement(source).perform();
	}

	public void doubleclickk(WebElement user) {
		Actions aj = new Actions(driver);
		aj.doubleClick(user).perform();
	}

	public void rightclick(WebElement text) {
		Actions ac = new Actions(driver);
		ac.contextClick(text).perform();
	}

	// to clear the text
	public void cleared(WebElement cl) {
		cl.clear();
	}

	// to use navigations
	public void navigateto(String url) {
		driver.navigate().to(url);
	}

	public void forward() {
		driver.navigate().forward();
	}

	public void backward() {
		driver.navigate().back();
	}

	public void refresh() {
		driver.navigate().refresh();
	}

	// to quit the programm
	public void quitt() {
		driver.quit();
	}

	// to close the programm
	public void closee() {
		driver.close();
	}

	// to clear
	public void cleared1(WebElement ref) {
		ref.clear();
	}

	// alert methods
	public void simplealerts() {
		Alert simple = driver.switchTo().alert();
		simple.accept();
	}

	// using robot class
	public void keydown() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);

	}
	// selections

	public void selectionsIndex(WebElement locate, int data) {
		Select s = new Select(locate);
		s.selectByIndex(data);
	}

	public void selectionsValue(WebElement element, String data) {
		Select s1 = new Select(element);
		s1.selectByValue(data);
	}

	public void selectionsVisible(WebElement elements, String data) {
		Select s2 = new Select(elements);
		s2.selectByVisibleText(data);
	}

	// selectall
	public void selectAll(WebElement ref) {
		Select s = new Select(ref);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		System.out.println(allSelectedOptions);

	}

	// deselect
	public void Indexes(WebElement loc, int data) {
		Select s3 = new Select(loc);
		s3.deselectByIndex(data);
	}

	public void Valuess(WebElement loc, String data) {
		Select s4 = new Select(loc);
		s4.deselectByValue(data);
	}

	// takescreenshot
	public void ScreenShot(WebElement ref, String string) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		File file = new File(string);
		FileUtils.copyFile(screenshotAs, file);
	}

	// waits method
	public void waitss() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	// scroll up and scroll down using javascript executor
	public void executescriptsdown(WebElement java) {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("arguments[0].scrollIntoView(true)", java);
	}
	
	public void executescriptsup(WebElement up) {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("arguments[0].scrollIntoView(false)", up);}

	// using FRAMES using webelement ref
	public void framess(WebElement ref) {
		driver.switchTo().frame(ref);
	}

	// frames using INDEX
	public void FrameIndex(int string) {
		driver.switchTo().frame(string);
	}

	// frames using String
	public void FrameString(WebElement findElementss) {
		driver.switchTo().frame(findElementss);
	}

	// using GETOPTIONS
	public void getoptionss(WebElement ref) {
		Select s = new Select(ref);
		List<WebElement> options = s.getOptions();
		System.out.println(options);
	}

	// sendkeys using javascriptexecutor
	public void sendkeysjavascript(String value, WebElement data) {
		JavascriptExecutor jkk = (JavascriptExecutor) driver;
		jkk.executeScript(value, data);
	}

}
