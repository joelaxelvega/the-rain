
package pruebaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PruebaSelenium {

    private static WebDriver driver = null;
  
    public static void main(String[] args) throws InterruptedException {
        String Datos[][] =new String[3][2];
        
        Datos [0][0] = "Vale";
        Datos [0][1] = "cuando";
        
        Datos [1][0] = "te ";
        Datos [1][1] = "vas";
        
        Datos [2][0] = "a casar";             //contraseña
        Datos [2][1] = "estas vieja jajaja";  //incorrecta
        
        Datos [3][0] = "Admin";  //contraseña 
        Datos [0][1] = "1234";   // correcta
        
        System.setProperty("webdriver.chrome.driver"
                , "chromedriver.exe");
        driver = new ChromeDriver();//si el for colocas antes de este renglos se genera 3 ventanas
         // Test name: nelafranco
    // Step # | name | target | value | comment
    // 1 | open | /testing/ |  |
    
     driver.get("http://ifts20.com.ar/testing/");//sacamos el link por que no es necesario que vuelva a llamar a la pagina 
     
     driver.manage().window().fullscreen(); //muestra la pantalla agrandado
     
     String resultado;
     
        for (int i = 0; i < 3; i++) {  //colocamos en este lugar para que la automatisacion sea seguida las 3 pruebas
  
   // driver.findElement(By.id("usuario")).click(); no se requiere esta accion por que automaticamente se escribe el usuario
 
    driver.findElement(By.id("usuario")).sendKeys(Datos[i][0]); //usamos la automatisacion para que a los valores les sume 1 
   
    driver.findElement(By.id("clave")).sendKeys(Datos[i][1]);  // cada ves que completa un ciclo
   
    Thread.sleep(3000); //esperar 3 segundos
    
    driver.findElement(By.id("Ingresar")).click();  //click en ingresar
    
     resultado = driver.getPageSource(); //me puede devolver el mensaje de toda la pagina 
     
     resultado.indexOf("Ingreso INCorrecto");
    
    driver.findElement(By.id("Volver")).click();  //click en volver a la pagina principal
    
    
    }   //levamos la llave del for abajo para que todo se repita 3 veces
        
    driver.close(); //cierra la prueva al finalizarse
        
    }
    //carga de los datos,asercion de los datos,
    
    
}
