import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class App {
    public static void main(String[] args) throws Exception {
        //Instancia de Chrome
        System.setProperty("webdriver.chrome.driver", "C:/cd_tarefa03/test02/driver/chromedriver.exe");
        
        //Abrir la página de El Corte Inglés
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.elcorteingles.es/");

        //Guardar en variables el campo de cuadro de búsqueda 
        WebElement searchBox = driver.findElement(By.id("main_search"));

        //Escribir camiseta en el cuadro de búsqueda y pulsar "Enter"
        searchBox.sendKeys("camiseta");
        Thread.sleep(3000);
        searchBox.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        //Cerrar la página
        driver.quit();
    }
}
