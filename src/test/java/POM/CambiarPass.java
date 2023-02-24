package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CambiarPass extends funcionesBasicas {

	By btnPerfilHeader1 = By.xpath("//header/div/div[2]/ul/li");
	By btnChangePAss= By.xpath("//a[contains(.,'Change Password')]");
	By inputCurrentPass = By.xpath("//form/div/div/div[2]/div/div[2]/input");
	By inputNewPass = By.xpath("//form/div[2]/div/div/div/div[2]/input");
	By inputConfPass= By.xpath("//form/div[2]/div/div[2]/div/div[2]/input");
	By btnSave = By.xpath("//form/div[3]/button[2]");
	By btnLogout = By.xpath("//a[contains(.,'Logout')]");
	
	public CambiarPass(WebDriver driver) {
		super(driver);
	}

	public void clickCambiarPass() {
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.elementToBeClickable(btnPerfilHeader1));
			this.click(btnPerfilHeader1);
			Thread.sleep(1000);

			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait2.until(ExpectedConditions.elementToBeClickable(btnChangePAss));
			this.click(btnChangePAss);
		} catch (Exception e) {
			System.out.println("El metodo clickCambiarPass fallo debido a: ");
		}
	}

	public void ingresarDatos_changePass(String currentPass, String newPass, String confNewPass) {
		try {
			this.sendKeys(inputCurrentPass, currentPass);
			Thread.sleep(1000);
			this.sendKeys(inputNewPass, newPass);
			Thread.sleep(1000);
			this.sendKeys(inputConfPass, confNewPass);
			Thread.sleep(1000);
			this.click(btnSave);
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("El metodo ingresarDatos_changePass fallo debido a: ");
		}
	}

	public void closeSesion() {
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.elementToBeClickable(btnPerfilHeader1));
			this.click(btnPerfilHeader1);
			Thread.sleep(1000);

			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait2.until(ExpectedConditions.elementToBeClickable(btnLogout));
			this.click(btnLogout);
		} catch (Exception e) {
			System.out.println("El metodo closeSesion fallo debido a: ");
		}
	}
}
