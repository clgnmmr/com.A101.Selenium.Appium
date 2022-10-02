package stepDefinitions;



import com.github.javafaker.Faker;
import io.appium.java_client.TouchAction;
import io.cucumber.java.en.*;
import org.junit.Assert;
import screens.A101Screen;
import utils.Driver;

import static org.junit.Assert.assertTrue;
import static utils.ReusableMethods.*;


public class FirstCaseA101App {
    Faker faker=new Faker();
    A101Screen a101Screen=new A101Screen();
    TouchAction touchAction = new TouchAction<>(Driver.getAppiumDriver());

    @Given("Appium ile uygulama acilir")
    public void appium_ile_uygulama_acilir() {
        Driver.getAppiumDriver();


    }
    @Given("kullanici menu acar")
    public void kullanici_menu_acar() {

        tapOn(a101Screen.menu);


    }
    @And("kullanici {string} > {string} > {string}  bolumunu acar")
    public void kullaniciBolumunuAcar(String arg0, String arg1, String arg2) {
        tapOnText(arg0);
        tapOnText(arg1);
        tapOnText(arg2);
    }
    @Then("kullanici {string} oldugunu dogrular")
    public void kullanici_oldugunu_dogrular(String text) throws InterruptedException {
        tapOn(a101Screen.filtre);
        for (int i = 0; i < a101Screen.filtreRenkler.size() ; i++) {
            Thread.sleep(3000);
            if (a101Screen.filtreRenkler.get(i).getText().contains(text)){
                a101Screen.filtreRenkler.get(i).click();
                break;
            }

        }

        for (int i = 0; i <a101Screen.siyahYaziListesi.size() ; i++) {
            Thread.sleep(3000);
            assertTrue(a101Screen.siyahYaziListesi.get(i).getText().contains("Siyah"));

        }


    }
    @When("kullanici Sepete ekler")
    public void kullanici_sepete_ekler() throws InterruptedException {

        for (int i = 0; i <a101Screen.sepetEkleListesi.size() ; i++) {
            Thread.sleep(3000);
            if (a101Screen.sepetEkleListesi.get(i).isEnabled()){
                a101Screen.sepetEkleListesi.get(i).click();
                break;
            }

        }

        waitJava(5);
    a101Screen.sepetEkle.click();


    }
    @And("kullanici {string} butonuna tiklar")
    public void kullaniciButonunaTiklar(String buton) {
     scrollWithUiScrollableClick(buton);
    }
    @When("kullanici Sepet Onaylar")
    public void kullanici_sepet_onaylar() throws InterruptedException {
     tapOn(a101Screen.sepetOnayla);

    }
    @And("kullanici mail girer")
    public void kullaniciMailGirer() {
        String email=faker.internet().emailAddress();
        enterText(a101Screen.emailInput,email);
       tapOn(a101Screen.kisiselButon);

    }
    @When("kullanici yeni adress ekler ve kaydet Devam et butonuna Basar")
    public void kullanici_yeni_adress_ekler_ve_kaydet_devam_et_butonuna_basar() throws InterruptedException {

        a101Screen.yeniAdressEkle.click();
        a101Screen.adressAdi.sendKeys("evim");
        a101Screen.isim.sendKeys("kadir");
        a101Screen.soyisim.sendKeys("tepecik");
        a101Screen.telefon.sendKeys("5443314959");
        a101Screen.il.click();
        a101Screen.ilSecme.click();
        a101Screen.ilce.click();
        a101Screen.ilceSecme.click();
        a101Screen.mahalle.click();
        a101Screen.mahalleSecme.click();
        a101Screen.adressKutusu.sendKeys(faker.address().streetAddress());
        pageAfter();
        a101Screen.kaydetAdress.click();

       waitJava(10);
        for (int i = 1; i <a101Screen.kargoListesi.size() ; i++) {
            if (a101Screen.kargoListesi.get(i).isDisplayed()){
                a101Screen.kargoListesi.get(i).click();
                break;
            }

        }
        tapOn(a101Screen.kaydetVeDevamEt);
    }
  /*  @When("kullanici kredi kartı bilgilerini girip Sipariş tamamlar")
    public void kullanici_kredi_kartı_bilgilerini_girip_sipariş_tamamlar() throws InterruptedException {

        enterText(a101Screen.odemeAdSoyad, ConfigReader.getProperty("adSoyad"));
        a101Screen.odemeKartNo.click();

        setCardNumber(ConfigReader.getProperty("kartno"));


        touchAction.tap(PointOption.point(940,1400)).perform();

        tapOn(a101Screen.odemeSonay);

       clickOfTheDate(ConfigReader.getProperty("sonAy"));

        tapOn(a101Screen.odemeSonyil);


        clickOfTheDate(ConfigReader.getProperty("sonYil"));

        enterText(a101Screen.odemeCVC, ConfigReader.getProperty("CVC"));
       pageAfter();

        tapOn(a101Screen.onBilgilendirme);
        tapOn( a101Screen.siparisTamamla);

    }*/
    @Then("kullanici odeme sayfasında oldugunu dogrular")
    public void kullanici_odeme_sayfasında_oldugunu_dogrular() {

        assertTrue(a101Screen.dogrulamaKoduBaslik.isDisplayed());
        String expectedData="Masterpass ile Ödeme";
        String actualData=a101Screen.dogrulamaKoduBaslik.getText();
        Assert.assertTrue(actualData.contains(expectedData));

    }


    @And("kullanici uygulamayı kapatir")
    public void kullaniciUygulamayıKapatir() {

        Driver.quitAppiumDriver();
    }
}
