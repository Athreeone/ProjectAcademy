import Pages.AddRemoveElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MethodTest {
        WebDriver driver;
        AddRemoveElements addRemoveElements ;

        @BeforeMethod
      public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\athre\\IdeaProjects\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        addRemoveElements = new AddRemoveElements(driver);
        addRemoveElements.OpenPage();
}

        @Test
      public void checksingleclick() {
        addRemoveElements.aRElementsButtonClick();

        assert addRemoveElements.countDeleteButton() == 1;
}
        @Test
      public void checkMoreClickAddElements() {
          addRemoveElements.someClickAddElements(100);
          addRemoveElements.someClickDeleteButtons(50);
              assert  addRemoveElements.countDeleteButton() == 50;
        }

}
