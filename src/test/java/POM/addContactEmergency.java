package POM;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addContactEmergency extends funcionesBasicas {
	
	By btnMyInfo = By.tagName("li");
    By contactEmerg = By.xpath("//div[@class='orangehrm-edit-employee-navigation']/div[@role='tablist']/div[3]");
    By btnAdd = By.xpath("(//button[@type='button'])[2]");
    By inputName = By.xpath("//form/div/div/div/div/div[2]/input");
    By inputRelat = By.xpath("//form/div/div/div[2]/div/div[2]/input");
    By inputTelpHome = By.xpath("//form/div[2]/div/div/div/div[2]/input");
    By inputMobile = By.xpath("//form/div[2]/div/div[2]/div/div[2]/input");
    By inputWotkTeleph = By.xpath("//form/div[2]/div/div[3]/div/div[2]/input");
    By btnSave = By.xpath("//form/div[3]/button[2]");
    By btnAdd2 = By.xpath("(//button[@type='button'])[5]");
    By btnFile = By.xpath("//div/input[@type='file' or @class='oxd-file-input']");
    By btnSave2 = By.xpath("//form/div[3]/button[2]");
    By listaMEnu = By.tagName("li");
    By btnEmployedList= By.xpath("//nav [@class='oxd-topbar-body-nav']/ul/li[2]");
    By inputNameBuscador = By.xpath("//form/div/div/div/div/div[2]/div/div/input");
    By btnSearch = By.xpath("//form/div[2]/button[2]");
    By btnEdit = By.xpath("//div[@class='orangehrm-container']/div/div[2]/div/div[@role='row']");
	
	public addContactEmergency(WebDriver driver) {
		super(driver);
	}

	public void menuBtn_MyInfo() throws InterruptedException {
		try {
			Thread.sleep(2000);
			List<WebElement> btn_MyInfo = driver.findElements(listaMEnu);
			for (int i = 0; i < btn_MyInfo.size(); i++) {
				if (i == 1) {
					btn_MyInfo.get(i).click();
				}
			}
		} catch (Exception e) {
			System.out.println("El metodo menuBtn_MyInfo fallo debido a: ");
		}
	}

	public void btnList_Employed() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(btnEmployedList));
			this.click(btnEmployedList);
		} catch (Exception e) {
			System.out.println("El metodo btnList_Employed fallo debido a: ");
		}
	}

	public void buscarEmployed(String name) throws InterruptedException {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(inputNameBuscador));
			this.sendKeys(inputNameBuscador, name);
			Thread.sleep(1000);
			this.click(btnSearch);
		} catch (Exception e) {
			System.out.println("El metodo buscarEmployed fallo debido a: ");
		}
	}

	public void btnEdit() throws InterruptedException {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(btnEdit));

			WebElement element = driver.findElement(btnEdit);
			if (element.isEnabled()) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", element);
				element.click();
			}
		} catch (Exception e) {
			System.out.println("El metodo buscarEmployed fallo debido a: ");
		}
	}

	public void clickContactEmerg() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(contactEmerg));
			this.click(contactEmerg);
		} catch (Exception e) {
			System.out.println("El metodo clickContactEmerg fallo debido a: ");
		}
	}

	public void clickAddContact() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(btnAdd));
			this.click(btnAdd);
		} catch (Exception e) {
			System.out.println("El metodo clickAddContact fallo debido a: ");
		}
	}

	public void ingresarDatos1(String name, String relation, String telepHome) throws InterruptedException {
		try {
			this.sendKeys(inputName, name);
			Thread.sleep(1000);
			this.sendKeys(inputRelat, relation);
			Thread.sleep(1000);
			this.sendKeys(inputTelpHome, telepHome);
		} catch (Exception e) {
			System.out.println("El metodo ingresarDatos1 fallo debido a: ");
		}
	}

	public void ingresarDatos2(String mobile, String workTeleph) throws InterruptedException {
		try {
			this.sendKeys(inputMobile, mobile);
			Thread.sleep(1000);
			this.sendKeys(inputWotkTeleph, workTeleph);
			Thread.sleep(1000);
			this.click(btnSave);
		} catch (Exception e) {
			System.out.println("El metodo ingresarDatos2 fallo debido a: ");
		}
	}

	public void addFile_ContacEmerg() throws InterruptedException {
		try {
			WebDriverWait wd = new WebDriverWait(driver, Duration.ofSeconds(10));
			wd.until(ExpectedConditions.elementToBeClickable(btnAdd2));

			WebElement element = driver.findElement(btnAdd2);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
			this.click(btnAdd2);

			File file = new File(".\\src\\test\\resources\\ejemploDoc\\Comandos Docker.docx");
			String path = file.getAbsolutePath();
			this.sendKeys(btnFile, path);
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("El metodo addFile_ContacEmerg fallo debido a: ");
		}
	}

	public void btnSave() {
		try {
			this.click(btnSave2);
		} catch (Exception e) {
			System.out.println("El metodo btnSave fallo debido a: ");
		}
	}
}
