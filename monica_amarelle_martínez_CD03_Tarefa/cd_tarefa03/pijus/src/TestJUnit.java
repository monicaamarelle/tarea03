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
         System.setProperty("webdriver.chrome.driver", "C:/cd_tarefa03/pijus/driver/chromedriver.exe");
         driver = new ChromeDriver();
    }
 
    @Test
    public void busqueda() {
        
        driver.get("https://www.pijusmagnifikus.com/tenda/es/");

        WebElement searchBox = driver.findElement(By.name("s"));

        WebElement botonBusqueda = driver.findElement(By.xpath("//button[@type='submit']"));
        searchBox.sendKeys("camiseta");
        botonBusqueda.sendKeys(Keys.ENTER);
    }
 
    @After
    public void shutdown(){
        driver.quit();
    }
}
