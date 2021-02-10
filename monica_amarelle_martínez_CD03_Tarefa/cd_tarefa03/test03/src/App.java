import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {
    //Instancia de Chrome
    System.setProperty("webdriver.chrome.driver", "C:/cd_tarefa03/test03/driver/chromedriver.exe");

    //Abrir la página de El Corte Inglés
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.elcorteingles.es/moda/mujer/abrigos/");
    Thread.sleep(2000);
    
    //Desplegar el menú de tallas para elegir las tallas
    WebElement abrircheckTalla = driver.findElement(By.xpath("//li[@ class='filters-item _unset']"));
    abrircheckTalla.click();
    Thread.sleep(1000);

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
    Thread.sleep(2000);
    
    //Cerrar la página
    driver.quit();
    }
}
