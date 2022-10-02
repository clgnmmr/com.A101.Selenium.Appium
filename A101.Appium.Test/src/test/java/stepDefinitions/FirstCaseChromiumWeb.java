package stepDefinitions;

import com.github.javafaker.Faker;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import screens.A101Chromium;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;
import java.util.Set;
import static org.junit.Assert.assertTrue;
import static utils.ReusableMethods.*;

public class FirstCaseChromiumWeb {
   A101Chromium a101Chromium=new A101Chromium();
    JavascriptExecutor js=(JavascriptExecutor) Driver.getBrowserDriver();
    Faker fk=new Faker();
    TouchAction touchAction=new TouchAction(Driver.getBrowserDriver());
    Actions ac=new Actions(Driver.getBrowserDriver());
    @Given("kullanici browser ile {string} sayfasına gider")
    public void kullanici_browser_ile_sayfasına_gider(String url) throws InterruptedException {


        Driver.getBrowserDriver().get(ConfigReader.getProperty(url));

        String contrext= Driver.getBrowserDriver().getContext();
        System.out.println("1 "+contrext);
        Set contextList= Driver.getBrowserDriver().getContextHandles();

        for (Object context:contextList) {
            System.out.println(context.toString());
            Thread.sleep(2000);
            if (context.toString().contains("CHROMIUM")){
                Driver.getBrowserDriver().context((String) context);
                Thread.sleep(10000);

            }

        }
        System.out.println("2 "+ Driver.getBrowserDriver().getContext());

    }

    @And("kullanici browser ile menu acar")
    public void kullaniciBrowserIleMenuAcar() {
        if (a101Chromium.cerez.isDisplayed()) {
            tapOnBrowser(a101Chromium.cerez);
        }
        touchAction.tap(PointOption.point(910,1070)).perform();
        tapOnBrowser(a101Chromium.menu);
    }

    @And("kullanici browser ile GIYIM & AKSESUAR > Kadin Ic Giyim > Dizalti Corap bolumunu acar")
    public void kullaniciBrowserIleGIYIMAKSESUARKadinIcGiyimDizaltiCorapBolumunuAcar() {
        tapOnBrowser(a101Chromium.giyimAksesuar);
        tapOnBrowser(a101Chromium.kadinIcGiyim);
        tapOnBrowser(a101Chromium.dizAlti);
    }

    @Then("kullanici browser ile {string} oldugunu dogrular")
    public void kullaniciBrowserIleOldugunuDogrular(String text) {
        tapOnBrowser(a101Chromium.filtre);

        for (int i = 0; i < a101Chromium.filtreRenkList.size() ; i++) {
            js.executeScript("arguments[0].scrollIntoView(true);", a101Chromium.filtreRenkList.get(i));
            if (a101Chromium.filtreRenkList.get(i).getText().contains(text)){
                a101Chromium.filtreRenkList.get(i).click();
                break;
            }

        }




    }


    @When("kullanici browser ile Sepete ekler")
    public void kullaniciBrowserIleSepeteEkler() {
        tapOnBrowser(a101Chromium.sepetEkle1);
        assertTrue(a101Chromium.siyahYazisi.getText().contains("Siyah"));
        tapOnBrowser(a101Chromium.sepetEkle2);

    }

    @And("kullanici browser ile SEPETE GIT butonuna tiklar")
    public void kullaniciBrowserIleSEPETEGITButonunaTiklar() {
        tapOnBrowser(a101Chromium.sepetGoruntule);
    }

    @And("kullanici browser ile Sepet Onaylar")
    public void kullaniciBrowserIleSepetOnaylar() {
        tapOnBrowser(a101Chromium.sepetOnayla);
    }

    @When("kullanici browser ile UYE OLMADAN DEVAM ET butonuna tiklar")
    public void kullaniciBrowserIleUYEOLMADANDEVAMETButonunaTiklar() {
        ac.sendKeys(Keys.DOWN).perform();
        tapOnBrowser(a101Chromium.uyeOlmadanDevamEt);
    }

    @And("kullanici browser ile mail girer")
    public void kullaniciBrowserIleMailGirer() {
        String email=fk.internet().emailAddress();
        enterTextBrowser(a101Chromium.emailKutusu,email);

    }

    @And("kullanici browser ile  DEVAM ET butonuna tiklar")
    public void kullaniciBrowserIleDEVAMETButonunaTiklar() {
        tapOnBrowser(a101Chromium.devamEtButonu);
    }

    @And("kullanici browser ile  yeni adress ekler ve kaydet Devam et butonuna Basar")
    public void kullaniciBrowserIleYeniAdressEklerVeKaydetDevamEtButonunaBasar() {
        tapOnBrowser(a101Chromium.yeniAdresOlustur);
        a101Chromium.adresBasligi.sendKeys("Evim");
        a101Chromium.ad.sendKeys("Kadir");
        a101Chromium.soyadi.sendKeys("Tepecik");

        String no="5655855858";
        String [] no1=no.split("");
        for (int i = 0; i <no1.length ; i++) {
            a101Chromium.telefon.sendKeys(no1[i]);

        }
        ReusableMethods.adressClick("İSTANBUL");
        ReusableMethods.adressClick("EYÜPSULTAN");
        ReusableMethods.adressClick("MERKEZ MAH");
        a101Chromium.adressButton.sendKeys(fk.address().streetAddress());
        waitJava(2);
       tapOnBrowser(a101Chromium.kaydet);
       tapOnBrowser(a101Chromium.kargo.get(0));
       tapOnBrowser(a101Chromium.kaydetVeDevamEt);

    }

   /* @When("kullanici browser ile kredi kartı bilgilerini girip Sipariş tamamlar")
    public void kullaniciBrowserIleKrediKartıBilgileriniGiripSiparişTamamlar() {
        enterTextBrowser(a101Chromium.odemeAdSoyad, ConfigReader.getProperty("adSoyad")+ Keys.TAB);
        String kartno= ConfigReader.getProperty("kartno");
        String [] no1=kartno.split("");
        for (int i = 0; i <no1.length ; i++) {
           waitToBeClickableSendKeysBrowser(a101Chromium.odemeKrediKart,10,no1[i]);

        }

        Select sc=new Select(a101Chromium.odemeSonAy);
        sc.selectByVisibleText(ConfigReader.getProperty("sonAy"));
        Select sc1=new Select(a101Chromium.odemeSonYil);
        sc1.selectByVisibleText(ConfigReader.getProperty("sonYil"));
        enterTextBrowser(a101Chromium.odemeCVC, ConfigReader.getProperty("CVC"));

        String el = "document.getElementById('agrement2').click()";
        js.executeScript(el);

        tapOnBrowser(a101Chromium.siparisTamamla);

    }*/

    @Then("kullanici browser ile odeme sayfasında oldugunu dogrular")
    public void kullaniciBrowserIleOdemeSayfasındaOldugunuDogrular() {

        ac.sendKeys(Keys.PAGE_UP).perform();
        Assert.assertTrue(a101Chromium.dogrulamaBaslik.isDisplayed());

    }
    @Then("kullanici browser kapatir")
    public void kullaniciBrowserKapatir() {
        Driver.getBrowserDriver().close();
    }
}
