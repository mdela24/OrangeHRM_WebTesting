package POM;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddEmployed extends funcionesBasicas {
	
By btnPIM = By.xpath("//ul/li[2]");
By btnAddEmployed = By.xpath("//div[@class='oxd-topbar-body']/nav/ul/li[3]");
By btnAddPicture = By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']/div[2]/input[@type='file']");
By inputNom = By.xpath("//form/div/div[2]/div/div/div/div/div[2]/div/div[2]/input");
By inputSegundNom = By.xpath("//form/div/div[2]/div/div/div/div/div[2]/div[2]/div[2]/input");
By inputApellido = By.xpath("//form/div/div[2]/div/div/div/div/div[2]/div[3]/div[2]/input");
By checkBox = By.xpath("//form/div/div[2]/div[2]/div/label");
By inputUsername = By.xpath("//form/div/div[2]/div[3]/div/div/div/div[2]/input");
By inputPass = By.xpath("//form/div/div[2]/div[4]/div/div/div/div[2]/input");
By inputConfPass = By.xpath("//form/div/div[2]/div[4]/div/div[2]/div/div[2]/input");
By btnSabe = By.xpath("//button[contains(.,'Save')]");
By mensajeSucces = By.xpath("//div[@class='oxd-toast-content oxd-toast-content--success']");
By listaMEnu = By.tagName("li");


	public AddEmployed(WebDriver driver) {
		super(driver);
	}
	
	public void clickBtnPIM() throws InterruptedException {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(listaMEnu));
			List<WebElement> btnPim = driver.findElements(listaMEnu);
			for (int i = 0; i < btnPim.size(); i++) {
				if (i == 1) {
					btnPim.get(i).click();
				}
			}
		} catch (Exception e) {
			System.out.println("El metodo clickBtnPIM fallo debido a: ");
		}
	}

	public void clickBtnAddEmployed() throws InterruptedException {
		try {
			Thread.sleep(1000);
			this.click(btnAddEmployed);
		} catch (Exception e) {
			System.out.println("El metodo clickBtnAddEmployed fallo debido a: ");
		}
	}

	public void AddPicture() throws InterruptedException {
		try {
			Thread.sleep(1000);
			File file = new File(".\\src\\test\\resources\\foto\\perfil (2).png");
			String path = file.getAbsolutePath();
			this.sendKeys(btnAddPicture, path);
		} catch (Exception e) {
			System.out.println("El metodo AddPicture fallo debido a: ");
		}
	}

	public void datosPersonales_Emp(String nombre, String segundoNom, String apellido) throws InterruptedException {
		try {
			Thread.sleep(1000);
			this.sendKeys(inputNom, nombre);
			Thread.sleep(1000);
			this.sendKeys(inputSegundNom, segundoNom);
			Thread.sleep(1000);
			this.sendKeys(inputApellido, apellido);
			Thread.sleep(1000);
			this.click(checkBox);
		} catch (Exception e) {
			System.out.println("El metodo datosPersonales_Emp fallo debido a: ");
		}

	}

	public void ingresarD_NuevosUsuarios(String usuario, String pass, String confPass) throws InterruptedException {
		try {
			Thread.sleep(1000);
			this.sendKeys(inputUsername, usuario);
			Thread.sleep(1000);
			this.sendKeys(inputPass, pass);
			Thread.sleep(1000);
			this.sendKeys(inputConfPass, confPass);
			Thread.sleep(1000);
			this.click(btnSabe);
		} catch (Exception e) {
			System.out.println("El metodo ingresarD_NuevosUsuarios fallo debido a: ");
		}
	}

	public void mensaje_empleadoSuccessAdd() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(mensajeSucces));

			if (driver.findElement(mensajeSucces).isEnabled()) {
				System.out.println("El empleado se ha agregado co éxito");
			} else {
				System.out.println("La creación del empleado ha fallado");
			}
		} catch (Exception e) {
			System.out.println("El metodo mensaje_empleadoSuccessAdd fallo debido a: ");
		}
	}
}
