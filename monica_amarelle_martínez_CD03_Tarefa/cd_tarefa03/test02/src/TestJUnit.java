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
         System.setProperty("webdriver.chrome.driver", "C:/cd_tarefa03/test02/driver/chromedriver.exe");
         driver = new ChromeDriver();
    }
 
    @Test
    public void busqueda() {
        
        driver.get("https://www.elcorteingles.es/");

        //Guardar en variables el campo de cuadro de búsqueda 
        WebElement searchBox = driver.findElement(By.id("main_search"));

        //Escribir camiseta en el cuadro de búsqueda y pulsar "Enter"
        searchBox.sendKeys("camiseta");
        searchBox.click();
    }
 
    @After
    public void shutdown(){
        driver.quit();
    }
}
