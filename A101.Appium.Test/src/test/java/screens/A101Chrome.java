package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.DriverChrome;

import java.util.List;

public class A101Chrome {

    public A101Chrome(){
        PageFactory.initElements(new AppiumFieldDecorator(DriverChrome.getChromeDriver()),this);
    }
    @AndroidFindBy(xpath = "//android.widget.Button[@text='KABUL ET']")
    public MobileElement cerez;
    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Menü')]")
    public MobileElement menu;
    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'AKSESUAR')]")
    public MobileElement giyim;
    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Kadın İç')]")
    public MobileElement kadinIc;
    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Dizaltı')]")
    public MobileElement dizalti;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Filtrele']")
    public MobileElement filtre;

    @AndroidFindBy(xpath = "//android.widget.ListView[2]/android.view.View")
    public List<MobileElement> filtreRenkListesi;
    @AndroidFindBy(xpath = "//android.widget.ListView/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]")
    public List<MobileElement> sepetEkleList;

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Siyah')]")
    public MobileElement sepetEkle;

    @AndroidFindBy(xpath = "//android.widget.ListView/android.view.View[5]")
    public MobileElement siyahYazisi;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='X']")
    public  MobileElement aradCikanCerez;

    @AndroidFindBy(xpath = "//android.widget.Button")
    public MobileElement sepetEkle2;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Sepeti Görüntüle']")
    public MobileElement sepetGoruntule;
    //android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[4]
    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Sepeti Onayla')]")
    public MobileElement sepetOnayla;

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'ÜYE OLMADAN DEVAM ET')]")
    public MobileElement uyeOlmadanDevamEt;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[2]")
    public MobileElement emailInput;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='DEVAM ET']")
    public MobileElement devamEt;

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Yeni adres oluştur')]")
    public MobileElement yeniAdresOlustur;
    @AndroidFindBy(xpath = "(//android.widget.EditText)[1]")
    public MobileElement adresBasligi;
    @AndroidFindBy(xpath = "(//android.widget.EditText)[2]")
    public MobileElement isim;
    @AndroidFindBy(xpath = "(//android.widget.EditText)[3]")
    public MobileElement soyisim;
    @AndroidFindBy(xpath = "(//android.widget.EditText)[4]")
    public MobileElement telefon;
    @AndroidFindBy(xpath = "//android.view.View[@text='Seçiniz']")
    public MobileElement il;
    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='İSTANBUL']")
    public MobileElement ilSecme;
    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='ARNAVUTKÖY']")
    public MobileElement ilceSecme;
    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='ARNAVUTKÖY MERKEZ MAH']")
    public MobileElement mahalleSecme;
    @AndroidFindBy(xpath = "//android.view.View[6]/android.view.View/android.widget.EditText")
    public MobileElement adres;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='KAYDET']")
    public MobileElement kaydet;
    @AndroidFindBy(xpath = "(//android.widget.RadioButton)[2]")
    public MobileElement kargo;
    @AndroidFindBy(xpath = "//android.widget.Button")
    public MobileElement kaydetVeDevamEt;
    @AndroidFindBy(xpath = "(//android.widget.EditText)[1]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Masterpass ile Ödeme']")
    public MobileElement dogrulamaBaslik;
    public MobileElement odemeAdSoyad;
    @AndroidFindBy(xpath = "(//android.widget.EditText)[2]")
    public MobileElement odemeKartNo;
    @AndroidFindBy(xpath = "//android.view.View[@text='1']")
    public MobileElement odemeSonay;
    @AndroidFindBy(xpath = "//android.view.View[@text='2022']")
    public MobileElement odemeSonyil;
    @AndroidFindBy(xpath = "(//android.widget.EditText)[3]")
    public MobileElement odemeCVC;
    //android.widget.TextView[@text='']
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='']")
    public MobileElement onBilgilendirme;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Siparişi Tamamla']")
    public MobileElement siparisTamamla;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc='İşlemi İptal Et']")
    public MobileElement islemIptalEt;
    @AndroidFindBy(xpath = "(//android.view.View[@content-desc='İşlemi İptal Et'])[2]")
    public MobileElement islemIptalEt2;








}
