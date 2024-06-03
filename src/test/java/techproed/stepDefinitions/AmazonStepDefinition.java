package techproed.stepDefinitions;

import io.cucumber.java.en.*;
import techproed.pages.AmazonPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class AmazonStepDefinition {

    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @When("arama kutusunda iphone aratir")
    public void arama_kutusunda_iphone_aratir() {

        amazonPage.handleCaptcha();
        amazonPage.searchBox.sendKeys("iphone");
        amazonPage.searchBox.submit();
    }

    @When("arama kutusunda samsung aratir")
    public void arama_kutusunda_samsung_aratir() {
        amazonPage.handleCaptcha();
        amazonPage.searchBox.sendKeys("iphone");
        amazonPage.searchBox.submit();
    }

    @When("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }


    @When("arama kutusunda nokia aratir")
    public void aramaKutusundaNokiaAratir() {
        amazonPage.handleCaptcha();
        amazonPage.searchBox.sendKeys("nokia");
        amazonPage.searchBox.submit();
    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(url);
    }

    @When("arama kutusunda {string} aratir")
    public void aramaKutusundaAratir(String str) {
        amazonPage.handleCaptcha();
        amazonPage.searchBox.sendKeys(str);
        amazonPage.searchBox.submit();
    }
}