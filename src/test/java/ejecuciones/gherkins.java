package ejecuciones;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class gherkins extends objetos {
	
	@Given("^ingresamos el usuario \"(.*?)\"$")
	public void ingresamos_el_usuario(String usuario) throws Throwable {
		login.sendUSername(usuario);
	}

	@When("^ingresamos la contraseña \"(.*?)\" y damos clic a btn login$")
	public void ingresamos_la_contraseña_y_damos_clic_a_btn_login(String contraseña) throws Throwable {
        login.sendPass(contraseña);
        login.clickBtnLogin();
	}

	@Then("^entramos a la pagina principal$")
	public void entramos_a_la_pagina_principal() throws Throwable {
	    login.comparacion();
	}
	
	@When("^Damos click al boton PIM$")
	public void damos_click_al_boton_PIM() throws Throwable {
		addEmp.clickBtnPIM();

	}

	@When("^Damos click al boton AddEmployed$")
	public void damos_click_al_boton_AddEmployed() throws Throwable {
		addEmp.clickBtnAddEmployed();
	}

	
	@When("^agregamos foto empleado$")
	public void agregamos_foto_empleado() throws Throwable {
		addEmp.AddPicture();
	}

	@When("^agregamos datos del empleado \"(.*?)\",\"(.*?)\" y \"(.*?)\"$")
	public void agregamos_datos_del_empleado_y(String nombre, String segundoNom, String apeliido) throws Throwable {
		addEmp.datosPersonales_Emp(nombre, segundoNom, apeliido);
	}

	@When("^damos click a checkBox$")
	public void damos_click_a_checkBox() throws Throwable {

	}
	
	@When("^ingresamos los datos del nuevo usuario \"(.*?)\", su clave \"(.*?)\" y la confirmacion \"(.*?)\"$")
	public void ingresamos_los_datos_del_nuevo_usuario_su_clave_y_la_confirmacion(String usuario, String pass, String confPass) throws Throwable {
		addEmp.ingresarD_NuevosUsuarios(usuario, pass, confPass);
		addEmp.mensaje_empleadoSuccessAdd();
	}

//--------------AGREGAR CONTACTO DE EMERGENCIA-----------------//
	
	@Given("^ingresamos elnuevo usuario \"(.*?)\", el pawssword \"(.*?)\" y damos click a login$")
	public void ingresamos_elnuevo_usuario_el_pawssword_y_damos_click_a_login(String nuevousuario, String contraseña) throws Throwable {
		login.sendUSername(nuevousuario);
		login.sendPass(contraseña);
	    login.clickBtnLogin();
	}

	@When("^Damos click al boton My Info$")
	public void damos_click_al_boton_My_Info() throws Throwable {
		emergencyC.menuBtn_MyInfo();

	}
	
	@When("^buscamos al empleado \"(.*?)\" por el buscador$")
	public void buscamos_al_empleado_por_el_buscador(String empleado) throws Throwable {
		emergencyC.btnList_Employed();
		emergencyC.buscarEmployed(empleado);
		emergencyC.btnEdit();
	}

	@When("^Damos click al boton Emergency Contact$")
	public void damos_click_al_boton_Emergency_Contact() throws Throwable {
		emergencyC.clickContactEmerg();
	}

	@When("^Damos click al boton \\+Add$")
	public void damos_click_al_boton_Add() throws Throwable {
		emergencyC.clickAddContact();
	}
	
	@When("^ingresamos los datos del contact Emergency; nombre \"(.*?)\", relacion \"(.*?)\" y telefono \"(.*?)\", mobile \"(.*?)\" y telefono del trabajo \"(.*?)\"$")
	public void ingresamos_los_datos_del_contact_Emergency_nombre_relacion_y_telefono_mobile_y_telefono_del_trabajo(String name, String relation, String telepHome, String mobile, String workTeleph) throws Throwable {
		emergencyC.ingresarDatos1(name, relation, telepHome);
		emergencyC.ingresarDatos2(mobile, workTeleph);
	}
	
	@When("^agregamos archivo con indormacion especial del contacto de emergencia$")
	public void agregamos_archivo_con_indormacion_especial_del_contacto_de_emergencia() throws Throwable {
		emergencyC.addFile_ContacEmerg();
		emergencyC.btnSave();
	}
	
	@When("^damos click al boton Salary y boton ADD para agregar el salario$")
	public void damos_click_al_boton_Salary_y_boton_ADD_para_agregar_el_salario() throws Throwable {
		salary.clickBtn_Salary();
		salary.clickBtnAdd();
	}

	@When("^ingresamos el Componente salarial \"(.*?)\", escogemos la frecuencia de pago, escogemos la moneda y agregamos el pago \"(.*?)\"$")
	public void ingresamos_el_Componente_salarial_escogemos_la_frecuencia_de_pago_escogemos_la_moneda_y_agregamos_el_pago(String salario, String amount) throws Throwable {
		 salary.datosSalary(salario, amount);
	}
	
	@When("^damos click a boton Dependent y al \\+Add$")
	public void damos_click_a_boton_Dependent_y_al_Add() throws Throwable {
		dependent.clickBtn_Dependent();
		dependent.clickBtn_Add();
	}
	
	@When("^ingresamos el nombre del dependiente \"(.*?)\", escogemos la relación, especificarla \"(.*?)\" y fecha d enacimiento \"(.*?)\"$")
	public void ingresamos_el_nombre_del_dependiente_escogemos_la_relación_especificarla_y_fecha_d_enacimiento(String name, String especif, String FNacimiento) throws Throwable {
		dependent.datosDependent(name, especif, FNacimiento);
	}

	@When("^damos click al boton visto en el header y despues escogemos la opcion de cambiar contraseña$")
	public void damos_click_al_boton_visto_en_el_header_y_despues_escogemos_la_opcion_de_cambiar_contraseña() throws Throwable {
		changePass.clickCambiarPass();
	}
	
	@When("^ingresamos la contraseña actual \"(.*?)\", ingresamos la nueva contraseña \"(.*?)\" y conformamos la contraseña \"(.*?)\"$")
	public void ingresamos_la_contraseña_actual_ingresamos_la_nueva_contraseña_y_conformamos_la_contraseña(String currentPass, String newPass, String confNewPass) throws Throwable {
		changePass.ingresarDatos_changePass(currentPass, newPass, confNewPass);
	}
	
	@Then("^cerramos sesion$")
	public void cerramos_sesion() throws Throwable {
		changePass.closeSesion();
	}
}
