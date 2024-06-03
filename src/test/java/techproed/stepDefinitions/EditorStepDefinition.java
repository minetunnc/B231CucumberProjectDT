package techproed.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.EditorPage;

import java.security.Key;

public class EditorStepDefinition {
    EditorPage editorPage = new EditorPage();
    @When("kullanici sayfadaki new butonuna basar")
    public void kullaniciSayfadakiNewButonunaBasar() {
        editorPage.newButton.click();
    }

    @And("kullanici verilen bilgileri girer {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void kullaniciVerilenBilgileriGirer(String name, String lastName, String position, String ofiice, String extension, String dates, String salary) {
    editorPage.firstName.sendKeys(
            name, Keys.TAB,
            lastName,Keys.TAB,
            position,Keys.TAB,
            ofiice,Keys.TAB,
            extension,Keys.TAB,
            dates,Keys.TAB,
            salary,Keys.TAB);

    }

    @And("create butonuna basar")
    public void createButonunaBasar() {
        editorPage.createButton.click();
    }

    @And("kullanici search bolumune {string} bilgisini girer")
    public void kullaniciSearchBolumuneBilgisiniGirer(String name) {
        editorPage.searchName.sendKeys(name);
    }

    @Then("kullanici {string} ile basarili bir kayit yapildigini dogrular")
    public void kullaniciIleBasariliBirKayitYapildiginiDogrular(String name) {
        Assert.assertTrue(editorPage.firstCell.getText().contains(name));
    }
}
