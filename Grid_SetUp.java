import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid_SetUp {
    public static RemoteWebDriver driver;

    public static void main(String[]  args) throws MalformedURLException, InterruptedException{

        String URL = "https://www.google.com";
        String Node = "http://192.168.158.10:4455/wd/hub";
        InternetExplorerOptions cap=new InternetExplorerOptions();


        driver = new RemoteWebDriver(new URL(Node), cap);

        driver.navigate().to(URL);
        System.out.println("Navigated successfully!");
        Thread.sleep(5000);
        driver.quit();
    }
}