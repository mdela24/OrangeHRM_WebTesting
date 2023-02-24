Feature: Ejemplo dos
  
@Logearnos
  Scenario Outline: Title of your scenario outline
    Given ingresamos el usuario <usuario>
    When ingresamos la contraseña <contraseña> y damos clic a btn login
    And entramos a la pagina principal
    When Damos click al boton PIM
    And Damos click al boton AddEmployed
    And agregamos foto empleado
    And agregamos datos del empleado <nombre>,<segundoNom> y <apellido>
    And damos click a checkBox
    When ingresamos los datos del nuevo usuario <nuevoUs>, su clave <clave> y la confirmacion <confirmacion>
    
    Examples: 
      | usuario  | contraseña | nombre     | segundoNom | apellido   | nuevoUs     | clave      | confirmacion |
      | "Admin"  | "admin123" | "Emerson"  | "Carlos"   | "Oliveras" | "Emerson"   | "Mdela24." | "Mdela24."   |


@Logearnos2
  Scenario Outline: El usuario agrega contacto de emergencia y mas
    Given ingresamos elnuevo usuario <nuevousuario>, el pawssword <password> y damos click a login
    When Damos click al boton My Info
    And buscamos al empleado <empleado> por el buscador
    And Damos click al boton Emergency Contact
    And Damos click al boton +Add
    And ingresamos los datos del contact Emergency; nombre <nombre>, relacion <relacion> y telefono <telefono>, mobile <mobile> y telefono del trabajo <workPhone>
    And agregamos archivo con indormacion especial del contacto de emergencia
    When damos click al boton Salary y boton ADD para agregar el salario
    And ingresamos el Componente salarial <SalaryCom>, escogemos la frecuencia de pago, escogemos la moneda y agregamos el pago <pago>
    When damos click a boton Dependent y al +Add
    And ingresamos el nombre del dependiente <nameDepen>, escogemos la relación, especificarla <especif> y fecha d enacimiento <Fnacimiento>
  
    Examples:  
      | nuevousuario | password   | empleado  | nombre | relacion  | telefono    | mobile         | workPhone   | SalaryCom | pago      | nameDepen  | especif | Fnacimiento  |
      | "Admin"      | "admin123" | "emerson" | "Eder" | "Hermano" | "222898525" | "+56988803875" | "223454675" | "básico"  | "900.000" | "Veronica" | "Madre" | "1995-05-08" |

@Logearnos
  Scenario Outline: Cambiar contraseña del usuario creado
    Given ingresamos el usuario <usuario>
    When ingresamos la contraseña <contraseña> y damos clic a btn login
    And damos click al boton visto en el header y despues escogemos la opcion de cambiar contraseña
    When ingresamos la contraseña actual <contraseñaAct>, ingresamos la nueva contraseña <nuevaCont> y conformamos la contraseña <confirmarCont>
    Then cerramos sesion
    
    Examples: 
      | usuario   | contraseña | contraseñaAct | nuevaCont     | confirmarCont |
      | "Emerson" | "Mdela24." | "Mdela24."    | "Mdela24rap." | "Mdela24rap." |
      
@Logearnos
  Scenario Outline: Logearnos con la nueva contraseña del usuario creado
    Given ingresamos el usuario <usuario>
    When ingresamos la contraseña <contraseña> y damos clic a btn login
    
     Examples: 
      | usuario   | contraseña    |
      | "Emerson" | "Mdela24rap." | 

