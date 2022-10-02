package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;


public class A101Screen {
    public A101Screen(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()),this);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
    public MobileElement menu;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='GİYİM & AKSESUAR']")
    public MobileElement giyim;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Kadın İç Giyim']")
    public MobileElement kadinIc;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Dizaltı Çorap']")
    public MobileElement dizAlti;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Filtrele']")
    public MobileElement filtre;
    @AndroidFindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.TextView")
    public List<MobileElement> filtreRenkler;
    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[1]")
    public List<MobileElement> siyahYaziListesi;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='SEPETE EKLE']")
    public List<MobileElement> sepetEkleListesi;
    @AndroidFindBy(xpath = "(//android.view.ViewGroup[2])[5]")
    public MobileElement sepetEkle;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='SEPETE GİT']")
    public MobileElement sepetGit;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2])[2]")
    public MobileElement sepetOnayla;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='ÜYE OLMADAN DEVAM ET']")
    public MobileElement uyeOlmadanDevamEt;
    @AndroidFindBy(xpath = "//android.widget.EditText")
    public MobileElement emailInput;
    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]")
    public MobileElement kisiselButon;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='GÖNDER']")
    public MobileElement gonderButon;
    @AndroidFindBy(xpath = "(//android.widget.ListView/android.view.View)[5]")
    public MobileElement yeniAdressEkle;
    @AndroidFindBy(xpath = "(//android.widget.EditText)[1]")
    public MobileElement adressAdi;
    @AndroidFindBy(xpath = "(//android.widget.EditText)[2]")
    public MobileElement isim;
    @AndroidFindBy(xpath = "(//android.widget.EditText)[3]")
    public MobileElement soyisim;
    @AndroidFindBy(xpath = "(//android.widget.EditText)[4]")
    public MobileElement telefon;
    @AndroidFindBy(xpath = "(//android.widget.Spinner)[1]")
    public MobileElement il;
    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='İSTANBUL']")
    public MobileElement ilSecme;
    @AndroidFindBy(xpath = "(//android.widget.Spinner)[2]")
    public MobileElement ilce;
    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='ARNAVUTKÖY']")
    public MobileElement ilceSecme;
    @AndroidFindBy(xpath = "(//android.widget.Spinner)[3]")
    public MobileElement mahalle;
    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='ARNAVUTKÖY MERKEZ MAH']")
    public MobileElement mahalleSecme;
    @AndroidFindBy(xpath = "(//android.widget.EditText)[5]")
    public MobileElement adressKutusu;
    @AndroidFindBy(xpath = "(//android.widget.Button)[2]")
    public MobileElement kaydetAdress;
    @AndroidFindBy(xpath = "//android.widget.RadioButton")
    public List<MobileElement> kargoListesi;
    @AndroidFindBy(xpath = "//android.widget.Button")
    public MobileElement kaydetVeDevamEt;
    @AndroidFindBy(xpath = "//android.view.View[@text='Masterpass ile Ödeme']")
    public MobileElement dogrulamaKoduBaslik;
    @AndroidFindBy(xpath = "(//android.widget.EditText)[1]")
    public MobileElement odemeAdSoyad;
    @AndroidFindBy(xpath = "(//android.widget.EditText)[2]")
    public MobileElement odemeKartNo;
    @AndroidFindBy(xpath = "(//android.widget.Spinner)[1]")
    public MobileElement odemeSonay;
    @AndroidFindBy(xpath = "(//android.widget.Spinner)[2]")
    public MobileElement odemeSonyil;
    @AndroidFindBy(xpath = "(//android.widget.EditText)[3]")
    public MobileElement odemeCVC;
    @AndroidFindBy(xpath = "//android.view.View[@text='']")
    public MobileElement onBilgilendirme;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Siparişi Tamamla']")
    public MobileElement siparisTamamla;
    @AndroidFindBy(xpath = "//android.view.View[@text='İşlemi İptal Et']")
    public MobileElement islemIptalEt;
    @AndroidFindBy(xpath = "(//android.view.View[@text='İşlemi İptal Et'])[2]")
    public MobileElement islemIptalEt2;




}
