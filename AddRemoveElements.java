package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddRemoveElements {
    private WebDriver driver;

    public AddRemoveElements(WebDriver driver) {
        this.driver = driver;
    }
    public void OpenPage () {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
    }
    public void aRElementsButtonClick () {
        driver.findElement(By.cssSelector(".example > button")).click();    //button[type = 'submit']
    }
    public void someClickAddElements (int n) {
        for ( int i = 0; i < n; i++) {
            aRElementsButtonClick();
        }
    }
    public void someClickDeleteButtons (int a) {
        for ( int i = 0; i < a; i++) {
            deleteButtonClick();
        }
    }
    public void deleteButtonClick () {
        driver.findElement(By.cssSelector(".added-manually")).click();
    }
    public List<WebElement> getDeleteButtonsClick () {
        return driver.findElements(By.cssSelector(".added-manually"));
    }
    public int countDeleteButton () {
       return  driver.findElements(By.cssSelector(".added-manually")).size();
    }


}
