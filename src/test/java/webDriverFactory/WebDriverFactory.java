package webDriverFactory;
import browserOptions.BrowserOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WebDriverFactory {
    public static WebDriver create(String browser){
        String optionChrome = BrowserOptions.CHROME.getOpt();
        String optionFirefox = BrowserOptions.FIREFOX.getOpt();
        String optionOpera = BrowserOptions.OPERA.getOpt();

        switch (browser){
            case "CHROME":
                if(browser.matches(optionChrome)) {
                    WebDriverManager.chromedriver().setup();
                    return new ChromeDriver();
                }
            case "OPERA":
                if(browser.matches(optionOpera)) {
                    WebDriverManager.operadriver().setup();
                    return new OperaDriver();
                }
            case "FIREFOX":
                if(browser.matches(optionFirefox)) {
                    WebDriverManager.firefoxdriver().setup();
                    return new FirefoxDriver();
                }
            default:
                System.out.println("запустите браузер");
        }
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
