package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class GooglePage {

    /*
     PageFactory.initElements(Driver.getDriver(),this); kodu bu classtaki ögeleri
     webdriver ile eslestirir, bu sayede classtaki webelemenetlere erismek icin @FindBy
     gibi PageFactory ye yardimci notasyonlar kullanilablir hale gelir
     */
    public GooglePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "APjFqb")
    public WebElement searchBox;









}
