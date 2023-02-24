package ejecuciones;

import org.openqa.selenium.WebDriver;

import POM.AddDependent;
import POM.AddEmployed;
import POM.CambiarPass;
import POM.addContactEmergency;
import POM.loginPage;
import POM.salaryPage;

public class objetos {

	protected WebDriver driver = hook.getDriver();
	protected loginPage login = new loginPage(driver);
	protected AddEmployed addEmp = new AddEmployed(driver);
	protected addContactEmergency emergencyC = new addContactEmergency(driver);
	protected salaryPage salary = new salaryPage(driver);
	protected AddDependent dependent = new AddDependent(driver);
	protected CambiarPass changePass = new CambiarPass(driver);

}
