import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.NewSessionPayload;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.image.Kernel;

public class GoogleTest {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "P:\\Студенты\\Тестирование QA31\\Anoshkin\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver1 = new ChromeDriver();

        //driver1.get("https://the-internet.herokuapp.com/dynamic_controls");

        // String NameTab = driver1.getTitle();
       // System.out.println("Название вкладки: " + NameTab);
        // GoogleTextarea.sendKeys(Keys.ENTER);

        //positive//
        /*
        String SuccessMessage = "You logged into a secure area!";
        String ExpectedUrl = "https://the-internet.herokuapp.com/secure"; // Ожидаемый URL при Login
        String ExpectedUrlTwo = "https://the-internet.herokuapp.com/login"; // Ожидаемый URL при Logout

        WebElement InputUsername = driver1.findElement(By.cssSelector("#username"));    // Cоздаем элемент поля Username по селектору
        InputUsername.sendKeys("tomsmith");                                 // Заполняем поле Username


        WebElement InputPassword = driver1.findElement(By.cssSelector("#password"));
        InputPassword.sendKeys("SuperSecretPassword!");

        WebElement LoginButton = driver1.findElement(By.cssSelector("button[type='submit']"));
        LoginButton.click();                                                                    // Выполняем клик

        String ActualUrl = driver1.getCurrentUrl();        // Помещяем в переменную полученный URL

        WebElement SuccessExpectedMessage = driver1.findElement(By.cssSelector("#flash"));
        String FirstResultText = SuccessExpectedMessage.getText();     // Помещаем в переменную текст элемента,найденного по селектору

        assert FirstResultText.contains(SuccessMessage);       // Утверждаем,что ожидаемый текст будет получен
        assert ActualUrl.equals(ExpectedUrl);                   // Сравниваем ожидаемый и фактический URL

        WebElement LogoutButton = driver1.findElement(By.cssSelector(".button.secondary.radius"));
        LogoutButton.click();

        String ActualUrlTwo = driver1.getCurrentUrl();


        assert ActualUrlTwo.equals(ExpectedUrlTwo); // Сравнение фактического и ожидаемого URL
        assert driver1.findElement(By.cssSelector("button[type='submit']")).isDisplayed(); // Проверка на видимость элемента - true (если ее нет - false и тест упадет)


       if (FirstResultText.contains(expectedResult) ) {
            System.out.println("Тест прошел");
        } else {
            throw new Error("Названия не равны");
        }

        //negative//

        driver1.get("https://the-internet.herokuapp.com/login");
        String ErrorMessage = "Your username is invalid!";


       driver1.findElement(By.cssSelector("#username")).sendKeys("tomsmith1");
       driver1.findElement(By.cssSelector("button[type='submit']")).click();

       assert driver1.findElement(By.cssSelector("#flash")).getText().contains(ErrorMessage);
       assert driver1.findElement(By.cssSelector("#flash")).getAttribute("class").contains("error");


        driver1.close();



         driver1.get("https://the-internet.herokuapp.com/dynamic_controls")


        driver1.findElement(By.cssSelector("#input-example button")).click();
        Thread.sleep(10000);
        driver1.findElement(By.cssSelector("#input-example input")).sendKeys("qwerty");
        System.out.println(driver1.findElement(By.cssSelector("#input-example input")).getAttribute("value"));

    */
        String ExpectedTextClickMeButton = "Can you see me?";

        WebDriverWait wait1 = new WebDriverWait(driver1,10);
         driver1.get("https://play1.automationcamp.ir/expected_conditions.html");
         driver1.findElement(By.cssSelector("#visibility_trigger")).click();
         WebElement TriggerButton = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#visibility_target")));
         TriggerButton.click();

         driver1.findElement(By.cssSelector("#visibility_target")).click();
         driver1.findElement(By.cssSelector("#visibility_target")).click();
         WebElement ClickMeButton = driver1.findElement(By.cssSelector(".popover-header"));
         String TextClickMeButton = ClickMeButton.getText();

         assert TextClickMeButton.contains(ExpectedTextClickMeButton);

         driver1.close();





    }
}



