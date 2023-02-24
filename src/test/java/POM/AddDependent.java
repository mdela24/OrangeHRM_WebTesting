package POM;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.This;

public class AddDependent extends funcionesBasicas {
	
	By Dependent = By.xpath("//div[@role='tablist']/div[4]");
	By addDependent = By.xpath("//div[@class='orangehrm-action-header']/button");
	By inputName = By.xpath("//form/div[1]/div/div/div/div[2]/input");
	By Relationship_click = By.xpath("//div[@class=\"oxd-grid-item oxd-grid-item--gutters\"][2]/div/div[2]/div/div/div[2]");
	By Relationship_search = By.xpath("//div[@role='option'][contains(.,'Other')]");
	By inputEspecificar = By.xpath("//form/div/div/div[3]/div/div[2]/input");
	By fechaNacimiento = By.xpath("//form/div[2]/div/div/div/div[2]/div/div/input");
	By btnSave = By.xpath("//form/div[@class='oxd-form-actions']/button[2]");
	By AddAttachment = By.xpath("//div[@class='orangehrm-attachment']/div/div/button");
	By inputFile = By.xpath("//form/div[@class=\"oxd-form-row\"]/div/div/div/div[2]/input[@type='file']");
	By btnSave2 = By.xpath("//form/div[3]/button[2]");

	public AddDependent(WebDriver driver) {
		super(driver);
	}

	public void clickBtn_Dependent() throws InterruptedException {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(Dependent));
			this.click(Dependent);
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("El metodo clickBtn_Dependent fallo debido a: ");
		}
	}

	public void clickBtn_Add() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(addDependent));
			this.click(addDependent);
		} catch (Exception e) {
			System.out.println("El metodo clickBtn_Add fallo debido a: ");
		}
	}

	public void datosDependent(String name, String especif, String FNacimiento) throws InterruptedException {
		try {
			this.sendKeys(inputName, name);
			Thread.sleep(1000);
			this.click(Relationship_click);
			Thread.sleep(1000);
			this.click(Relationship_search);
			Thread.sleep(1000);
			this.sendKeys(inputEspecificar, especif);
			Thread.sleep(1000);
			this.sendKeys(fechaNacimiento, FNacimiento);
			Thread.sleep(1000);
			this.click(btnSave);
			Thread.sleep(1000);
			this.click(AddAttachment);
			Thread.sleep(1000);
			File file = new File(".\\src\\test\\resources\\ejemploDoc\\Comandos Docker.docx");
			String path = file.getAbsolutePath();
			this.sendKeys(inputFile, path);
			Thread.sleep(1000);
			this.click(btnSave2);
		} catch (Exception e) {
			System.out.println("El metodo datosDependent fallo debido a: ");
		}

	}

}
