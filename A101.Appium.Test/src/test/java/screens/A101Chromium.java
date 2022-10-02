package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class A101Chromium {
    public A101Chromium(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getBrowserDriver()),this);

    }
    @FindBy(xpath = "//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
    public MobileElement cerez;

    @FindBy(xpath = "//a[@class='menu-toggle js-navigation-toggle visible-xs']")
    public MobileElement menu;
    @FindBy(xpath = "//a[@title='GİYİM & AKSESUAR']")
    public MobileElement giyimAksesuar;
    @FindBy(xpath = "(//ul[@class='sub-navigation js-sub-navigation shown']//a)[3]")
    public MobileElement kadinIcGiyim;
    @FindBy(xpath = "//ul[@class='sub-navigation js-sub-navigation shown']//li[9]//a")
    public MobileElement dizAlti;
    @FindBy(xpath = "//div[@class='filter-mobile visible-xs']")
    public MobileElement filtre;
    @FindBy(xpath = "//li[@class='checkbox']")
    public List<MobileElement> filtreRenkList;
    @FindBy(xpath = "//div[@class='count']")
    public MobileElement sepetEkle1;
    @FindBy(xpath = "//li[@class='breadcrumb-item active']//span")
    public MobileElement siyahYazisi;
    @FindBy(xpath = "//button[@class='add-to-basket button green block with-icon js-add-basket']")
    public MobileElement sepetEkle2;
    @FindBy(xpath = "//a[@class='go-to-shop']")
    public MobileElement sepetGoruntule;
    @FindBy(xpath = "//a[@class='button green checkout-button block js-checkout-button']")
    public MobileElement sepetOnayla;
    @FindBy(xpath = "//a[@class='auth__form__proceed js-proceed-to-checkout-btn']")
    public MobileElement uyeOlmadanDevamEt;
    @FindBy(xpath = "(//input[@class='js-form-input'])[2]")
    public MobileElement emailKutusu;
    @FindBy(xpath = "//button[@class='button block green']")
    public MobileElement devamEtButonu;
    @FindBy(xpath = "(//li[@class='half'])[1]")
    public MobileElement yeniAdresOlustur;
    @FindBy(xpath = "//input[@name='title']")
    public MobileElement adresBasligi;
    @FindBy(xpath = "//input[@name='first_name']")
    public MobileElement ad;
    @FindBy(xpath = "//input[@name='last_name']")
    public MobileElement soyadi;
    @FindBy(xpath = "//input[@name='phone_number']")
    public MobileElement telefon;
    @FindBy(xpath = "//textarea[@class='js-address-textarea']")
    public MobileElement adressButton;
    @FindBy(xpath = "//button[contains(text(),'KAYDET')]")
    public MobileElement kaydet;
    @FindBy(xpath = "//ul[@class='js-shipping-list']//li//div[2]")
    public List<MobileElement> kargo;
    @FindBy(xpath = "//button[contains(text(),'Kaydet ve')]")
    public MobileElement kaydetVeDevamEt;
    @FindBy(xpath = "//div[contains(text(),'Masterpass ile Ödeme')]")
    public MobileElement dogrulamaBaslik;
    @FindBy(xpath = "(//input[@name='name'])[2]")
    public MobileElement odemeAdSoyad;
    @FindBy(xpath = "(//div/label/input)[5]")
    public MobileElement odemeKrediKart;
    @FindBy (xpath = "(//select[@name='card_month'])[2]")
    public MobileElement odemeSonAy;
    @FindBy (xpath = "(//select[@name='card_year'])[2]")
    public MobileElement odemeSonYil;
    @FindBy(xpath = "(//input[@class='js-payment-cvv'])[2]")
    public MobileElement odemeCVC;
    @FindBy (xpath = "(//button[@class='button block green continue-button'])[2]")
    public MobileElement siparisTamamla;
    @FindBy(xpath = "//iframe[@class='checkout-redirect-iframe']")
    public MobileElement odemeSayfasiIframe;
    @FindBy(xpath = "//div[@class='action-col left']")
    public MobileElement islemIptal1;
    @FindBy(xpath = "//div/a[@id='cancelbutton']")
    public MobileElement islemIptal2;

}
