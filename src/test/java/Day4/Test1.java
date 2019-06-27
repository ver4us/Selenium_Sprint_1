package Day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver dr = new ChromeDriver();
        dr.get("http://practice.cybertekschool.com/forgot_password");
        dr.findElement(By.name("email")).sendKeys("ver@me.com");
        dr.findElement(By.id("form_submit")).click();
      /*  WebElement submit=        dr.findElement(By.id("form.submit"));
submit.click();*/

        String str = dr.findElement(By.name("confirmation_message")).getText();

        Thread.sleep(200);
        dr.close();
        dr.quit();
        if (str.equals("Your e-mail's been sent!"))
            System.out.println("your test is passed");


        System.exit(0);
    }
}
