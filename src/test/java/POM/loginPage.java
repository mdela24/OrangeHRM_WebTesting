package POM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class loginPage extends funcionesBasicas {


	By inputUsername = By.xpath("//form/div/div/div[2]/input");
	By inputPass = By.xpath("//form/div[2]/div/div[2]/input");
	By btnLogin = By.xpath("//form/div[3]/button");
	By dashBorad = By.xpath("//header/div/div/span/h6");
	
	
	public loginPage(WebDriver driver) {
		super(driver);
	}

	public void sendUSername(String usuario) throws InterruptedException {
		try {
			Thread.sleep(2000);
			this.sendKeys(inputUsername, usuario);
		}catch(Exception e) {
			System.out.println("El método sendUSername ha cambiado debido a" + e);	
		}
	}

	public void sendPass(String contraseña) throws InterruptedException {
		try {
			Thread.sleep(1000);
			this.sendKeys(inputPass, contraseña);
		}catch(Exception e) {
			System.out.println("El método sendPass ha cambiado debido a" + e);	
		}
	}

	public void clickBtnLogin () throws InterruptedException {
		try {
			Thread.sleep(1000);
			this.click(btnLogin);
		} catch (Exception e) {
			System.out.println("El método clickBtnLogin ha cambiado debido a" + e);			
		}
	}

	public void comparacion () {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(dashBorad));

			String textCompration = driver.findElement(dashBorad).getText();
			String _dashBoard = "Dashboard";

			if (driver.findElement(dashBorad).isDisplayed()) {
				if (textCompration.equals(_dashBoard)) {
					System.out.println("Bienbenido a la página principal");
				}
			}
		} catch (Exception e) {
			System.out.println("El método ha cambiado debido a" + e);			
		}
	}
}
