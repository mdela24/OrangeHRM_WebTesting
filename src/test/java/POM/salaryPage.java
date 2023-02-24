package POM;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class salaryPage extends funcionesBasicas {


	By btnSalary = By.xpath("//div[@class='orangehrm-edit-employee-navigation']/div[2]/div[7]");
	By btnAdd = By.xpath("(//button[@type='button'])[2]");
	By SalaryComponent = By.xpath("//form/div/div/div/div/div[2]/input");
	By PayFrequency_click = By.xpath("//form/div/div/div[3]/div/div[2]/div/div/div/i");
	By PayFrequency_search = By.xpath("(//div[@role='option'][contains(.,'Monthly')])[1]");
	By Currency_click = By.xpath("//form/div/div/div[4]/div/div[2]/div/div/div/i");
	By Currency_search = By.xpath("//div[@role='option'][contains(.,'Chilean Peso')]");
	By Amount = By.xpath("//form/div/div/div[5]/div/div[2]/input");
	By btnSave = By.xpath("//div[@class='oxd-form-actions']/button[2]");
	By btnAddAttachments = By.xpath("//div[@class='orangehrm-attachment']/div/div/button");
	By inputFile = By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']/div[2]/input[@type='file']");
	By btnSave2 = By.xpath("//form/div[3]/button[2]");
	
	public salaryPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickBtn_Salary() {
		WebDriverWait wd = new WebDriverWait(driver, Duration.ofSeconds(10));
		wd.until(ExpectedConditions.elementToBeClickable(btnSalary));
		this.click(btnSalary);
	}
	
	public void clickBtnAdd () {
		WebDriverWait wd = new WebDriverWait(driver, Duration.ofSeconds(10));
		wd.until(ExpectedConditions.elementToBeClickable(btnAdd));
		this.click(btnAdd);
		
	}
	
	public void datosSalary(String salario, String amount) throws InterruptedException {
		this.sendKeys(SalaryComponent, salario);
		Thread.sleep(1000);
		this.click(PayFrequency_click);
		Thread.sleep(1000);
		this.click(PayFrequency_search);
		Thread.sleep(1000);
		this.click(Currency_click);
		Thread.sleep(1000);
		this.click(Currency_search);
		Thread.sleep(1000);
		double numero = Double.parseDouble(amount);
		driver.findElement(Amount).sendKeys(amount);
		Thread.sleep(1000);
		this.click(btnSave);
		Thread.sleep(1000);
		this.click(btnAddAttachments);
		Thread.sleep(1000);
		File file = new File (".\\src\\test\\resources\\ejemploDoc\\Comandos Docker.docx");
		String path = file.getAbsolutePath();
		this.sendKeys(inputFile, path);
		Thread.sleep(1000);
		this.click(btnSave2);
	}
}
