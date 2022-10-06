package stepDefinitions;

import com.github.javafaker.Faker;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import screens.A101Chrome;
import utils.ConfigReader;
import utils.DriverChrome;
import utils.ReusableMethods;

import java.time.Duration;
import java.util.Set;

import static utils.ReusableMethods.*;

public class FirstCaseChromeApp {

    A101Chrome a101Chrome=new A101Chrome();
    TouchAction touchAction=new TouchAction(DriverChrome.getChromeDriver());
    Faker fk=new Faker();

    JavascriptExecutor js=(JavascriptExecutor) DriverChrome.getChromeDriver();
    @Given("kullanici chrome ile {string} sayfasına gider")
    public void kullanici_chrome_ile_sayfasına_gider(String url) throws InterruptedException {
        DriverChrome.getChromeDriver().navigate().to(ConfigReader.getProperty(url));

        String contrext=DriverChrome.getChromeDriver().getContext();
        System.out.println("1 "+contrext);
        Set contextList=DriverChrome.getChromeDriver().getContextHandles();

        for (Object context:contextList) {
            Thread.sleep(2000);
            System.out.println(context.toString());
            if (context.toString().contains("NATIVE_APP")){
                DriverChrome.getChromeDriver().context((String) context);
                Thread.sleep(10000);

            }

        }
        System.out.println("2 "+ DriverChrome.getChromeDriver().getContext());

    }

    @And("kullanici chrome ile {string} tiklar")
    public void kullaniciChromeIleTiklar(String title) {
       waitJava(15);
       try {
           if (a101Chrome.cerez.isDisplayed()) {
               a101Chrome.cerez.click();
           }
       }catch (NoSuchElementException e){
           e.printStackTrace();
       }
        waitJava(5);
      a101Chrome.menu.click();
    }

    @And("kullanici chrome ile {string} > {string} > {string}  bolumunu acar")
    public void kullaniciChromeIleBolumunuAcar(String title1, String title2, String title3) {
       tapOnChrome(a101Chrome.giyim);
        tapOnChrome(a101Chrome.kadinIc);
        tapOnChrome(a101Chrome.dizalti);
    }

    @Then("kullanici chrome ile {string} oldugunu dogrular")
    public void kullaniciChromeIleOldugunuDogrular(String text) throws InterruptedException {

       /* tapOnChrome(a101Chrome.filtre);

        for (int i = 0; i <2 ; i++) {
            Thread.sleep(3000);
            touchAction.press(PointOption.point(950,1770))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(850,220)).release().perform();
        }

        for (int i = 0; i <a101Chrome.filtreRenkListesi.size() ; i++) {
           // js.executeScript("arguments[0].scrollIntoView(true);",a101Chrome.filtreRenkListesi.get(i));
            if (a101Chrome.filtreRenkListesi.get(i).getText().contains("SİYAH")){
                a101Chrome.filtreRenkListesi.get(i).click();
                break;
            }
        }*/

        waitJava(5);

        a101Chrome.sepetEkle.click();


        waitJava(5);
        Assert.assertTrue(a101Chrome.siyahYazisi.getText().contains("Siyah"));


    }

    @When("kullanici chrome ile Sepete ekler")
    public void kullaniciChromeIleSepeteEkler() throws InterruptedException {

        waitJava(5);
        touchAction.press(PointOption.point(850,1460))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(850,900)).release().perform();

       waitJava(5);
        a101Chrome.sepetEkle2.click();


    }

    @And("kullanici chrome ile SEPETI GORUNTULE butonuna tiklar")
    public void kullaniciChromeIleSEPETIGORUNTULEButonunaTiklar() throws InterruptedException {
       waitJava(5);

      a101Chrome.sepetGoruntule.click();
    }

    @And("kullanici chrome ile Sepet Onaylar")
    public void kullaniciChromeIleSepetOnaylar() throws InterruptedException {
        waitJava(15);
        touchAction.press(PointOption.point(850,1530))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(850,550)).release().perform();
        waitJava(5);
        a101Chrome.sepetOnayla.click();
    }

    @When("kullanici chrome ile UYE OLMADAN DEVAM ET butonuna tiklar")
    public void kullaniciChromeIleUYEOLMADANDEVAMETButonunaTiklar() throws InterruptedException {
        waitJava(10);

        touchAction.press(PointOption.point(550,1730))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(550,1400)).release().perform();

        waitJava(5);
        a101Chrome.uyeOlmadanDevamEt.click();
    }

    @And("kullanici chrome ile mail girer")
    public void kullaniciChromeIleMailGirer() throws InterruptedException {
        String email=fk.internet().emailAddress();
       waitJava(10);
        a101Chrome.emailInput.sendKeys(email);
    }

    @And("kullanici chrome ile DEVAM ET butonuna tiklar")
    public void kullaniciChromeIleDEVAMETButonunaTiklar() throws InterruptedException {
        waitJava(5);
        a101Chrome.devamEt.click();
    }

    @And("kullanici chrome ile yeni adress ekler ve kaydet Devam et butonuna Basar")
    public void kullaniciChromeIleYeniAdressEklerVeKaydetDevamEtButonunaBasar() {
        waitJava(5);
        a101Chrome.yeniAdresOlustur.click();
        waitJava(10);
        a101Chrome.adresBasligi.sendKeys("Evim");
        a101Chrome.isim.sendKeys("Kadir");
        a101Chrome.soyisim.sendKeys("Tepecik");
        a101Chrome.telefon.sendKeys("5443314959");
        waitJava(5);
        secinizChrome();
        waitJava(1);
        a101Chrome.ilSecme.click();
        waitJava(1);
        secinizChrome();
        waitJava(1);
        a101Chrome.ilceSecme.click();
        waitJava(3);
        scrollUpChrome();
        secinizChrome();
        waitJava(1);
        a101Chrome.mahalleSecme.click();
        a101Chrome.adres.sendKeys(fk.address().streetAddress());
        a101Chrome.kaydet.click();

        waitJava(4);
        touchAction.press(PointOption.point(550,1460))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(550,970)).release().perform();
        waitJava(3);
        a101Chrome.kargo.click();
        waitJava(5);
        a101Chrome.kaydetVeDevamEt.click();


    }

  /*  @When("kullanici chrome ile kredi kartı bilgilerini girip Sipariş tamamlar")
    public void kullaniciChromeIleKrediKartıBilgileriniGiripSiparişTamamlar() {
     a101Chrome.odemeAdSoyad.sendKeys(ConfigReader.getProperty("adSoyad"));
        a101Chrome.odemeKartNo.click();

        waitJava(2);
        setCardNumberChrome(ConfigReader.getProperty("kartno"));


        touchAction.tap(PointOption.point(790,560)).perform();

        a101Chrome.odemeSonay.click();

        clickOfTheDateChrome(ConfigReader.getProperty("sonAy"));

        a101Chrome.odemeSonyil.click();


        clickOfTheDateChrome(ConfigReader.getProperty("sonYil"));

        a101Chrome.odemeCVC.sendKeys(ConfigReader.getProperty("CVC"));
        touchAction.press(PointOption.point(550,1600))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(550,500)).release().perform();

       a101Chrome.onBilgilendirme.click();
        a101Chrome.siparisTamamla.click();




    }*/

    @Then("kullanici chrome ile  odeme sayfasında oldugunu dogrular")
    public void kullaniciChromeIleOdemeSayfasındaOldugunuDogrular() {

       scrollDownChrome();
        waitJava(5);

            Assert.assertTrue(a101Chrome.dogrulamaBaslik.isDisplayed());
            String expectedData="Masterpass ile Ödeme";
            String actualData=a101Chrome.dogrulamaBaslik.getText();
            Assert.assertTrue(actualData.contains(expectedData));




    }

    @And("kullanici chrome ile uygulamayı kapatir")
    public void kullaniciChromeIleUygulamayıKapatir() {

        DriverChrome.quitChromeDriver();

    }
}
