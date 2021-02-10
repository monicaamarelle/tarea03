import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestJUnit {
    WebDriver driver;
    @Before
    public void setUp(){
         //Instancia de Chrome
         System.setProperty("webdriver.chrome.driver", "C:/cd_tarefa03/test03/driver/chromedriver.exe");
         driver = new ChromeDriver();
    }
 
    @Test
    public void tallas(){
        
    //Abrir la página de El Corte Inglés
    driver.get("https://www.elcorteingles.es/moda/mujer/abrigos/");
    //Desplegar el menú de tallas para elegir las tallas
    WebElement abrircheckTalla = driver.findElement(By.xpath("//li[@ class='filters-item _unset']"));
    abrircheckTalla.click();

    //Guardar en variables las tallas
    WebElement checkTalla = driver.findElement(By.xpath("//a[@ href='/moda/mujer/abrigos/size1::32/']"));
    WebElement checkTalla2 = driver.findElement(By.xpath("//a[@ href='/moda/mujer/abrigos/size1::32-34/']"));

    //Seleccionar las tallas
    checkTalla.click();
    checkTalla2.click();

    //Guardar en la variable aplicarCheck el "Botón Aplicar"
    WebElement aplicarCheck = driver.findElement(By.xpath("//a[@ class='filters-apply js-filters-apply']"));

    //Pulsar el botón "APLICAR"
    aplicarCheck.sendKeys(Keys.ENTER);
    }
 
    @After
    public void shutdown(){
        driver.quit();
    }
}
