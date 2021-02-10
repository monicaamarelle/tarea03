import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {
        //Instancia de Chrome
        System.setProperty("webdriver.chrome.driver", "C:/cd_tarefa03/test05/driver/chromedriver.exe");

        //Abrir la página de El Corte Inglés en la sección de moda/mujer
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.elcorteingles.es/moda/mujer/");

        //Guardar en la variable voz el botón "Búsqueda por voz"
        WebElement voz = driver.findElement(By.id("js-search-trigger-voice"));

        //Pulsar el botón de búsqueda por voz
        voz.click();
        Thread.sleep(5000);

        //Cerrar la ventana
        driver.quit();
     
    }
}
