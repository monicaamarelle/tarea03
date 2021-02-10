import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class App {
    public static void main(String[] args) throws Exception {
        //Instancia de Chrome
        System.setProperty("webdriver.chrome.driver", "C:/cd_tarefa03/test02/driver/chromedriver.exe");

        //Abrimos la página de El Corte Inglés
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.elcorteingles.es/moda/MP_0611830_KK300278003-zapatillas-de-piel-de-hombre-camper-con-tecnologia-gore-tex-ultraligeras-en-marron/");
       
        //Seleccionar la talla de zapato que queremos. La 43
        Select comboboxSimple = new Select(driver.findElement(By.className("js-select")));
        WebElement botonCesta = driver.findElement(By.xpath("//button[@class='c12 button _normal js-buy-button js-add-to-cart _enabled']"));
        //comboboxSimple.selectByValue("8431319094756"); //Elige la talla 43
        //comboboxSimple.selectByIndex(4); // Elige la talla 43
        comboboxSimple.selectByVisibleText("43");
  
        //Pulsar el botón "Añadir a la cesta"
        botonCesta.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.quit();



    }
}
