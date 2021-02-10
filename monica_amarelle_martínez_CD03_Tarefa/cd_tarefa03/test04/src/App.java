import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class App {
    public static void main(String[] args) throws Exception {
        //Instancia de Chrome
        System.setProperty("webdriver.chrome.driver", "C:/cd_tarefa03/test04/driver/chromedriver.exe");

        //Abrir la página de El Corte Inglés
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.elcorteingles.es/");

        //Guardar en variables los campos de cuadro de búsqueda y botón de lupa
        WebElement searchBox = driver.findElement(By.id("main_search"));
        WebElement searchButton = driver.findElement(By.xpath("//button[@class='_search js_search-store ']"));

        //Escribir .. en el cuadro de búsqueda y pulsar la lupa para que busque
        searchBox.sendKeys("..");
        Thread.sleep(3000);
        searchButton.click();
        Thread.sleep(5000);

        //Cerrar la página
        driver.quit();
    }
}

