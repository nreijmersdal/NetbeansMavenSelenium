import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewEmptyJUnitTest {
    
    @Test
    public void hello() {
        WebDriver driver  = new FirefoxDriver();
        driver.get("http://sqa.stackexchange.com/questions/13213/how-to-configure-selenium-webdriver-with-netbeans");
        WebElement acceptAnswerLink = driver.findElement(By.id("vote-accepted-13214"));
        acceptAnswerLink.click();
        driver.quit();
    }
}
