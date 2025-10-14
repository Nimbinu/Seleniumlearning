import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxExample {

    WebDriver driver;

    @BeforeMethod
    public void openLinkTestPage() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/input.xhtml");
        Thread.sleep(3000);
    }

    @Test
    public void textBoxTests() {
        // Type your name
        WebElement name = driver.findElement(By.id("j_idt88:name"));
        name.sendKeys("Binuri Nimthera");

        // Append country to this City
        WebElement appendText = driver.findElement(By.id("j_idt88:j_idt91"));
        appendText.sendKeys("India");

        // Verify if text box is disabled
        boolean enabled = driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
        System.out.println("Is text box enabled: " + enabled);

        // Clear the typed text
        WebElement clearText = driver.findElement(By.id("j_idt88:j_idt95"));
        clearText.clear();

        // Retrieve the typed text
        WebElement textElement = driver.findElement(By.id("j_idt88:j_idt97")); // Replace with actual ID
        String value = textElement.getAttribute("value");
        System.out.println("Typed text: " + value);

        // Find email and tab to next field
        WebElement emailField = driver.findElement(By.id("j_idt88:j_idt99"));
        emailField.sendKeys("binuthera@gmail.com" + Keys.TAB);
        System.out.println("Tab pressed to move to next element");
    }
}
