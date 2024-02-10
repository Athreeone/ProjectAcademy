import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTest {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\athre\\IdeaProjects\\chromedriver-win64\\chromedriver.exe");
        WebDriver Web = new ChromeDriver();
        WebDriverWait  Wwait = new WebDriverWait( Web,15);

        Web.get("https://play1.automationcamp.ir/expected_conditions.html");
        Web.findElement(By.cssSelector("#visibility_trigger")).click();
        WebElement ButtonClickMe = Wwait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#visibility_target")));
        ButtonClickMe.click();
        //Web.findElement(By.cssSelector("#visibility_target")).click();


        assert Web.findElement(By.cssSelector(".popover-header")).getText().contains("Can you see me?");

        Web.close();
    }
}
