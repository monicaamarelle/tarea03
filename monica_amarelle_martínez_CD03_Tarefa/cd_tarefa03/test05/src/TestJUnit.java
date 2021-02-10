import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestJUnit {
    WebDriver driver;

    @Before
    public void setUp(){
        //Instancia de Chrome
        System.setProperty("webdriver.chrome.driver", "C:/cd_tarefa03/test05/driver/chromedriver.exe");
        driver=new ChromeDriver();
    }

    @Test
    public void botonVoz(){
        driver.get("https://www.elcorteingles.es/moda/mujer/");

         //Guardar en la variable voz el botón "Búsqueda por voz"
         WebElement voz = driver.findElement(By.id("js-search-trigger-voice"));

         //Pulsar el botón de búsqueda por voz
         voz.click();

    }

    @After
    public void shutdown(){
        driver.quit();
    }
}
