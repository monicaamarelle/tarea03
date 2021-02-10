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
         System.setProperty("webdriver.chrome.driver", "C:/cd_tarefa03/test04/driver/chromedriver.exe");
         driver = new ChromeDriver();
    }
 
    @Test
    public void busqueda() {
        
        //Abrir la página
        driver.get("https://www.elcorteingles.es/");

        //Guardar en variables los campos de cuadro de búsqueda y botón de lupa
        WebElement searchBox = driver.findElement(By.id("main_search"));
        WebElement searchButton = driver.findElement(By.xpath("//button[@class='_search js_search-store ']"));

        //Escribir .. en el cuadro de búsqueda y pulsar la lupa para que busque
        searchBox.sendKeys("..");
        searchButton.click();
    }
 
    @After
    public void shutdown(){
        driver.quit();
    }
}
