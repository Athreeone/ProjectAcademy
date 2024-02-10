import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class OpenWindowTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\athre\\IdeaProjects\\chromedriver-win64\\chromedriver.exe");
        WebDriver web = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(web,10);
        String OriginalWindow = web.getWindowHandle();

        web.get("https://the-internet.herokuapp.com/windows");
        WebElement OpenWindow =  web.findElement(By.cssSelector("a[href = '/windows/new']"));
        OpenWindow.click();

        for (String CurrentWindow : web.getWindowHandles()) {
            if (!CurrentWindow.equals(OriginalWindow))
                web.switchTo().window(CurrentWindow);
            break;
        }

         // WebElement h3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3")));
        // String hh3 = h3.getText();
       // assert  hh3.contains("New Window");

        assert web.findElement(By.xpath("//h3")).getText().contains("New Window");

        web.quit();
    }
}
