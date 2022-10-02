package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class A101Page {

    public A101Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    // All Locate

    @FindBy(xpath = "//div[@class='closePopupPersona']")
    public WebElement cookie1;
    @FindBy(xpath = "(//button[@class='CybotCookiebotDialogBodyButton'])[2]")
    public WebElement cookie2;
    @FindBy(xpath = "(//*[@title='GİYİM & AKSESUAR'])[1]")
    public WebElement giyimAksesuarButton;
    @FindBy(xpath = "//ul[4]//li[@class='checkbox']")
    public List<WebElement> renkListe;
    @FindBy(xpath = "//div[@class='count']")
    public List<WebElement> adetEkleList;
    @FindBy(xpath = "//h1")
    public WebElement siyahYazisi;
    @FindBy(xpath = "//button[@class='add-to-basket button green block with-icon js-add-basket']")
    public WebElement sepetEkle;
    @FindBy(xpath = "(//*[contains(text(),'Sepeti Görüntüle')])[2]")
    public WebElement sepetGoruntule;
    @FindBy(xpath = "//a[contains(text(),'Sepeti Onayla')]")
    public WebElement sepetOnayla;
    @FindBy(xpath = "//input[@name='user_email']")
    public WebElement email;
    @FindBy(xpath = "(//input[@name='name'])[2]")
    public WebElement odemeAdSoyad;
    @FindBy(xpath = "(//div/label/input)[5]")
    public WebElement odemeKrediKart;
    @FindBy(xpath = "(//input[@class='js-payment-cvv'])[2]")
    public WebElement odemeCVC;
    @FindBy(xpath = "(//div[@class='section-hero'])[5]")
    public WebElement dogrulama;
    @FindBy(xpath = "//a[contains(text(),'İşlemi')]")
    public List<WebElement> islemList;


}
