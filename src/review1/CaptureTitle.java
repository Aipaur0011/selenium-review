package review1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTitle {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");//chrome
        driver.navigate().to("https://www.facebook.com/");

        String pageTitle=driver.getTitle();
        System.out.println(pageTitle);
    }
}
