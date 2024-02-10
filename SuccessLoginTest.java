import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuccessLoginTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\athre\\IdeaProjects\\chromedriver-win64\\chromedriver.exe");
        WebDriver Web = new ChromeDriver();

        Web.get("https://the-internet.herokuapp.com/login");
        Web.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
        Web.findElement(By.cssSelector("#password")).sendKeys("SuperSecretPassword!");
        Web.findElement(By.cssSelector("button[type = 'submit']")).click();

        assert Web.findElement(By.cssSelector("#flash")).getText().contains("You logged into a secure area!");
        assert Web.getCurrentUrl().equals("https://the-internet.herokuapp.com/secure");


        Web.quit();




    }
}
