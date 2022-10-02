package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.A101Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import static utilities.ReusableMethods.*;

public class FirstCase {
    A101Page ap=new A101Page();
    Actions ac=new Actions(Driver.getDriver());
    Faker fk=new Faker();

    JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();

    String filePath=System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\renkData.txt";
    @Given("kullanici {string} gider")
    public void kullanici_gider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
        waitFor(2);
        tapOn(ap.cookie2);
    }
    @And("kullanici {string} basligina tiklar")
    public void kullaniciBasliginaTiklar(String title) {titleWithClick(title);
    }
    @And("kullanici {string} butonuna tiklar")
    public void kullaniciButonunaTiklar(String kategoriIcBaslik) {
        textWithClick(kategoriIcBaslik);
    }
    @When("kullanici {string} oldugunu test eder")
    public void kullaniciOldugunuTestEder(String text) {

      waitFor(3);
        ac.sendKeys(Keys.PAGE_DOWN).perform();
        for (int i = 0; i <ap.renkListe.size() ; i++) {
            if (ap.renkListe.get(i).getText().contains("SİYAH")){
                WriteToTxt.saveAllData(filePath,ap.renkListe.get(i).getText());
                ap.renkListe.get(i).click();
                break;
            }

        }

        for (int i = 0; i <ap.adetEkleList.size() ; i++) {

            if (ap.adetEkleList.get(i).isEnabled()){
                waitFor(2);
                ap.adetEkleList.get(i).click();
                break;
            }

        }


        Assert.assertTrue(ap.siyahYazisi.getText().contains(text));



    }

    @And("kullanici Sepet Ekle butonuna tiklar")
    public void kullaniciSepetEkleButonunaTiklar() {tapOn(ap.sepetEkle);}

    @And("kullanici Sepet Onayla butonuna tiklar")
    public void kullaniciSepetOnaylaButonunaTiklar() {tapOn(ap.sepetOnayla);
    }

    @And("kullanici Email kutusunu doldurur")
    public void kullaniciEmailKutusunuDoldurur() {enterText(ap.email,fk.internet().emailAddress());
    }

    @And("kullanici yeni adres icin  {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string} bilgileri doldurur")
    public void kullaniciYeniAdresIcinBilgileriDoldurur(String baslik, String ad, String soyad, String tel, String il, String ilce, String mah, String adres) {
        adressInText("title",baslik);
        adressInText("first_name",ad);
        adressInText("last_name",soyad);
        adressInText("phone_number",tel);
        dropDownSelectByText("city",il);
        dropDownSelectByText("township",ilce);
        dropDownSelectByText("district",mah);
        adressInText("line",adres);
    }



    @Then("kullanici odeme sayfasına gittigini dogrular")
    public void kullaniciOdemeSayfasınaGittiginiDogrular() {
        waitForVisibility(ap.dogrulama,10);
        String expectedData="Masterpass ile Ödeme";
        String actualData=ap.dogrulama.getText();
        System.out.println(actualData);
        Assert.assertTrue(actualData.contains(expectedData));

    }

    @Then("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
}
