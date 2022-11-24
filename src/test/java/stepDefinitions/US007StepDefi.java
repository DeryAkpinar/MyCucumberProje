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

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

import static java.lang.Integer.parseInt;

public class US007StepDefi {
    DeryaPage deryaPage=new DeryaPage();
    @Given("Kullanici {string} gider")
    public void kullaniciGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));

    }

    @When("Kullanici login'e tiklar")
    public void kullaniciLoginETiklar() {
        deryaPage.userLogin.click();

    }

    @Then("Kullanici Sign in butonuna tiklar")
    public void kullaniciSignInButonunaTiklar() {
        deryaPage.signIn1.click();
    }

    @And("Kullanici {int} sn bekler")
    public void kullaniciSnBekler(int istenenSure) {
        ReasubleMethod.waitFor(istenenSure);
    }

    @Then("Kullanici gecerli olan username girer")
    public void kullaniciGecerliOlanUsernameGirer() {
        deryaPage.userName.sendKeys(ConfigReader.getProperty("hastaUserName"));

    }


    @Then("Kullanici gecerli bir password girer.")
    public void kullaniciGecerliBirPasswordGirer() {
        deryaPage.password.sendKeys(ConfigReader.getProperty("hastaPassword"));

    }


    @Then("Kullanici sign in buttonuna tiklar")
    public void kullaniciSignInButtonunaTiklar() {
        deryaPage.signIn2.click();
    }

    @Then("Kullanici Welcome to Medunna yazisinin gorunurlugunu dogrular")
    public void kullaniciWelcomeToMedunnaYazisininGorunurlugunuDogrular() {
        Assert.assertTrue(deryaPage.welcome.isDisplayed());
    }


    @Then("Kullanici My Pages butonuna tiklar")
    public void kullaniciMyPagesButonunaTiklar() {
        deryaPage.myPages.click();
    }


    @Then("Kullanici Make an Appointment secenegine tiklar")
    public void kullaniciMakeAnAppointmentSecenegineTiklar() {
        deryaPage.makeAnApp.click();
    }


    @Then("Kullanici Make an Appointment sayfasinin gorunurlugunu dogrular")
    public void kullaniciMakeAnAppointmentSayfasininGorunurlugunuDogrular() {
        Assert.assertTrue(deryaPage.makeAnAppYazisi.isDisplayed());
    }


    @Then("Kullanici phone kutucuguna telefon numarasini yazar")
    public void kullaniciPhoneKutucugunaTelefonNumarasiniYazar() {

   //  deryaPage.phone.sendKeys(ReasubleMethod.getFaker().phoneNumber().cellPhone()); //==>istenilen formatta gondermiyor hata verdi
        deryaPage.phone.sendKeys("5555555555");
    }

    @Then("Kullanici guncel tarihi secer")
    public void kullaniciGuncelTarihiSecer() {

        LocalDate date =LocalDate.now();
        System.out.println("date = " + date);
       String guncelTarih=  date.toString();

        System.out.println("=======================================================================");

        String appointmentDate=deryaPage.appoDate.getAttribute("value"); //Medunna sayfasindaki guncel tarih
        System.out.println("appointmentDate = " + appointmentDate);

        Assert.assertEquals(guncelTarih,appointmentDate);

/*
        LocalDate date =LocalDate.now();
        System.out.println(date);
        String guncelTarihDinamik=date.getYear()+"-"+ date.getMonthValue()+"-"+ date.getDayOfMonth();
        System.out.println("guncelTarihDinamik = " + guncelTarihDinamik);

 */
        // DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
     //   System.out.println(df.format(guncelTarih));





        }



    @Then("Kullanici Send an Appointment Request butonuna basar")
    public void kullaniciSendAnAppointmentRequestButonunaBasar() {
        deryaPage.sendAnApp.click();
    }


    @Then("Kullanici Kullanici {string} yazisini gorundugunu dogrular.")
    public void kullaniciKullaniciYazisiniGorundugunuDogrular(String randevuAlma) {
        Assert.assertTrue(deryaPage.appoRegistrationSaved.isDisplayed());

    }


    @And("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {

        //Driver.closeDriver();
    }



    //=========================#==========================TC02======================================#=====================//

    @Then("Kullanici gelecekteki bir tarihi secer")
    public void kullaniciGelecektekiBirTarihiSecer() {

        deryaPage.appoDate.sendKeys("11/30/2022");


      /*  Date simdikiZaman = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("df.format(simdikiZaman) = " + df.format(simdikiZaman));

       */

        // "plus***" metodu ile eldeki bir LocalDate için gün, ay, yıl alanları artırılabilir

    /*    LocalDate date1=LocalDate.now();//guncel tarih
        System.out.println("date1-(Mevcut Tarih) = " + date1.toString()); // 2022/11//23
        System.out.println("========================================#=====================================================");
        LocalDate date2 = LocalDate.now().plusDays(1); //guncel tarihten 1 gun sonrasi 2022/11/24
        System.out.println("date2-(Mevcut tarihten 1 gun sonrasi) = " + date2.toString());
        ReasubleMethod.waitFor(2);


          DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM");
        System.out.println("formatter-(date2'nin ay/gun/yil formatinda) ="+formatter.format(date2));

        ReasubleMethod.waitFor(2);
        deryaPage.appoDate.clear();
      deryaPage.appoDate.sendKeys(formatter.toString());

     */

    }




    @Then("Kullanici randevu tarihinin {string} seklinde oldugunu dogrular")
    public void kullaniciRandevuTarihininSeklindeOldugunuDogrular(String arg0) {

        String appointmentDate=deryaPage.appoDate.getAttribute("value"); //Medunna sayfasindaki guncel tarih
        System.out.println("appointmentDate = " + appointmentDate); //2022-11-23

        String actualData="2022-11-23";
        Assert.assertEquals(appointmentDate,actualData);


    }
}









