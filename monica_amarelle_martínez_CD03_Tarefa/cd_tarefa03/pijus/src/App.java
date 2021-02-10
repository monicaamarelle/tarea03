import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {
        //Instanciar Chrome
        System.setProperty("webdriver.chrome.driver", "C:/cd_tarefa03/pijus/driver/chromedriver.exe");
        //Abrir la página de Pijus
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.pijusmagnifikus.com/tenda/es/");

        Thread.sleep(1000);
        WebElement searchBox = driver.findElement(By.name("s"));

        WebElement botonBusqueda = driver.findElement(By.xpath("//button[@type='submit']"));
        searchBox.sendKeys("camiseta");
        botonBusqueda.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.quit();
    }
}
