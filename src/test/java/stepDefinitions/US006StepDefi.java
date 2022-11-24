package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DeryaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReasubleMethod;

public class US006StepDefi {
    DeryaPage deryaPage=new DeryaPage();


    @Given("Kullanici Medunna anasayfasina gider")
    public void kullaniciMedunnaAnasayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @When("Kullanici User login'e tiklar")
    public void kullaniciUserLoginETiklar() {
        deryaPage.userLogin.click();


    }

    @Then("Kullanici Sign in buttonuna tiklar")
    public void kullaniciSignInButtonunaTiklar() {
        deryaPage.signIn1.click();
    }

    @Then("Kullanici gecerli bir username girer")
    public void kullaniciGecerliBirUsernameGirer() {
        deryaPage.userName.sendKeys(ConfigReader.getProperty("hastaUserName"));
    }


    @And("Kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int istenenSure) {
        ReasubleMethod.waitFor(istenenSure);
    }

    @Then("Kullanici gecerli password girer")
    public void kullaniciGecerliPasswordGirer() {
        deryaPage.password.sendKeys(ConfigReader.getProperty("hastaPassword"));
    }

    @Then("Kullanici sign in butonuna tiklar")
    public void kullaniciSignInButonunaTiklar() {
        deryaPage.signIn2.click();

    }

    @Then("Kullanici bilgi sekmesine tiklar")
    public void kullaniciBilgiSekmesineTiklar() {
        deryaPage.kullaniciBilgiSekmesi.click();
    }

    @Then("Settings secenegine tiklar")
    public void settingsSecenegineTiklar() {
        deryaPage.settingsButton.click();
    }

    @Then("Kullanici {string} sayfasinda oldugunu dogrular")
    public void kullaniciSayfasindaOldugunuDogrular(String arg0) {
        Assert.assertTrue(deryaPage.userSettingsForYazisi.isDisplayed());


    }

    @Then("Kullanici First Name kutucugunu siler ve guncel bilgisini girer")
    public void kullaniciFirstNameKutucugunuSilerVeGuncelBilgisiniGirer() {
        deryaPage.firstName.clear();
        deryaPage.firstName.sendKeys(ReasubleMethod.getFaker().name().firstName());
    }


    @Then("Kullanici save buttonuna tiklar")
    public void kullaniciSaveButtonunaTiklar() {
        deryaPage.save.click();
    }

    @And("Kullanici Setting saved! yazisinin gorunurlugunu dogrular")
    public void kullaniciSettingSavedYazisininGorunurlugunuDogrular() {
        Assert.assertTrue(deryaPage.settingSaved.isDisplayed());
    }


    @Then("Kullanici First Name,Last Name ve Email bilgilerinin oldugunu dogrular")
    public void kullaniciFirstNameLastNameVeEmailBilgilerininOldugunuDogrular() {

        String firstNameValue=deryaPage.firstName.getAttribute("value");
        System.out.println("emailValue = " + firstNameValue);
        Assert.assertFalse(firstNameValue.isEmpty());


        String lastNameValue=deryaPage.lastName.getAttribute("value");
        System.out.println("emailValue = " + lastNameValue);
        Assert.assertFalse(lastNameValue.isEmpty());


        String emailValue=deryaPage.email.getAttribute("value");
        System.out.println("emailValue = " + emailValue);
        Assert.assertFalse(emailValue.isEmpty());

    }
   //==========#===============TC03 methodu==========#=============//
    @Then("Kullanici Last Name kutucugunu siler ve guncel bilgisini girer")
    public void kullaniciLastNameKutucugunuSilerVeGuncelBilgisiniGirer() {
        deryaPage.lastName.clear();
        deryaPage.lastName.sendKeys(ReasubleMethod.getFaker().name().lastName());

    }


    //==========#===============TC04 methodu==========#=============//

    @Then("Kullanici Email kutucugunu siler ve guncel bilgisini girer")
    public void kullaniciEmailKutucugunuSilerVeGuncelBilgisiniGirer() {

        deryaPage.email.clear();
        deryaPage.email.sendKeys(ReasubleMethod.getFaker().internet().emailAddress());

    }


    @And("Kullanici sayfayi kapatir.")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
}
