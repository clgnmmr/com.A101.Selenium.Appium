# com.A101.Selenium.Appium

<hr/>

www.A101.com.tr sitesinin testlerini gerçekleştirdiğimiz bu projemizde 
Cucumber BDD framework ile çalışıldı
Cucumber Framework'ünde OOP(object oriented programming) konseptine uyarak  POM(page object model) dizayn modeli kullanılmıştır

<br/>

### pages dosyası <br/>
bu dosyamızda elimizde bulunan sitenin testlerini gerçekleştireceğimiz elemenlerin locatelerini sakladığımız classlarımız bulunmakta.İstediğimiz locate almak için oluşturduğumuz clasın adında constructar oluşturuyoruz ve içine <b> PageFactory </b> clasını çağırıp
içerisine oluşturduğumuz driver çağırıp burada olduğunu belli ettiğimiz <b> this </b> key kullanılır. locatelerimizinde çağırabilinmesi için de <b> FindBy </b> notasyonu ile locatelerimizi oluşturabiliriz

### runner dosyası <br/>
runner clasımızda kullandığımız notasyonlar sayesinde burda çalıştırabildiğimiz <b>feature</b>  dosyalarının hem raporlarını alabiliyoruz hemde istenilen methodalrın oluşturulması sağlanabiliyor 

### stepDefinitons dosyası <br/>
burda ise tüm kodlarımızın çalışmasını sağlayan methodlarımızın bulunduğu classlarımız vardır.Locatelerimizi , driverımız buraya çağırarak yapmak istediğimiz adımların kodlarını burda yazıyoruz
 
### Utilities dosyası <br/>
yardımcı classımız bu dosyamızda bize sürekli lazım olan classlarımız ve methodlarımız bulunmaktadır. İçerisinde  projemizi daha anlaşılır hale getirecek classlarımız ve methodalrımız vardır bunlar
<b> Driver.class </b> , <b> ConfigReader.class</b> , <b> ReusableMehod.class </b> vb.  dosyalarımız bulunmaktadır. 

### resources dosyası <br/>
<b> feature </b> dosyalarımızın bulunduğu dosyamızdır burda <b>BDD</b> (behavior Driven Development) kullanılarak ve <b> Gherking </b> dili kullanılarak featuremiz oluşturuluyor.oluşturduğumuz adımları direk 
method olarak oluşturma fırsatı tanımakta bu sayede java dili yada yazılım ile alakası olmayan kişilerinde yapılanları daha anlaşılır bir hale getirrilmesini sağlamaktadır 

### <b> Configuration.properties </b>
properties dosyamızda sürekli kullandığımız variablelarımız bulunmakta , bu veriabları kullanmak için properties dosyası <b> Key  =  value </b> olaraka oluşturulmakta ,burdaki bilgileri başaka classlara çağırabilmek için utilities dosyasından
<b> ConfigReader </b> classı çağırırlara içindeki method saysınde bu bosyada bulunan bilgileri istediğimiz yerlere çağırabiliriz.

## pom.xml
tüm çalışmlaraımızın ve kodlarımızın bilgilerinin bulunduğu bu dosyada aslında kullanmak istediğimiz kodalrın kütüphanesini  <b> dependencies </b> tagının içerisine yerleştirip güncel bilgilerini sürekli olarak kendimizde tutabiliriz.
burası sayaesinde tüm kodlara erişimi sağlayabiliriz.

<hr/>

# Selenium Testi

<br/>

Java11  ve Maven projesi oluşturulup cucumber BDD framework kullanılarak oluşturulmuştur. 

<br/>

<a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="50" height="50"/> </a>
<a href="https://git-scm.com/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg" alt="git" width="40" height="40"/> </a>
<a href="https://www.selenium.com" target="_blank" rel="noreferrer"> <img src="https://camo.githubusercontent.com/4b95df4d6ca7a01afc25d27159804dc5a7d0df41d8131aaf50c9f84847dfda21/68747470733a2f2f73656c656e69756d2e6465762f696d616765732f73656c656e69756d5f6c6f676f5f7371756172655f677265656e2e706e67" alt="Selenium" width="50" height="50"/> </a>
<a href="https://www.intelj.com" target="_blank" rel="noreferrer"> <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQak-N8W03mK25slV1lwM80i0y1obRPPJOaLA&usqp=CAU" alt="intelj" width="80" height="40"/> </a>
<a href="https://www.maven.com" target="_blank" rel="noreferrer"> <img src="https://koraypeker.com/wp-content/uploads/2018/06/1_xsrKVt69q3JsZzLD-ldekQ.jpeg" alt="git" width="100" height="40"/> </a>

<hr/>

# Appium testi

<br/>

Java8  ve Maven projesi oluşturulup cucumber BDD framework kullanılarak oluşturulmuştur. 

<br/>

<a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="50" height="50"/> </a>
<a href="https://git-scm.com/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg" alt="git" width="40" height="40"/> </a>
<a href="https://www.appium.com" target="_blank" rel="noreferrer"> <img src="https://miro.medium.com/max/698/0*Ar7dArTvLIGrRs2n.png" alt="Selenium" width="100" height="50"/> </a>
<a href="https://www.selenium.com" target="_blank" rel="noreferrer"> <img src="https://camo.githubusercontent.com/4b95df4d6ca7a01afc25d27159804dc5a7d0df41d8131aaf50c9f84847dfda21/68747470733a2f2f73656c656e69756d2e6465762f696d616765732f73656c656e69756d5f6c6f676f5f7371756172655f677265656e2e706e67" alt="Selenium" width="50" height="50"/> </a>
<a href="https://www.intelj.com" target="_blank" rel="noreferrer"> <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQak-N8W03mK25slV1lwM80i0y1obRPPJOaLA&usqp=CAU" alt="intelj" width="80" height="40"/> </a>
<a href="https://www.maven.com" target="_blank" rel="noreferrer"> <img src="https://koraypeker.com/wp-content/uploads/2018/06/1_xsrKVt69q3JsZzLD-ldekQ.jpeg" alt="maven" width="100" height="40"/> </a>

<br/>

## Appium testinde yapılan üc test <br/>

### A101 uygulaması <br/>

GENYMOTİON uygulası kurularak burda <br/>
Samsung Galaxy S10 kuruldu<br/>
özellikler = Android 10(Api29) yüklendi ,   ekran  1440 X 3040  , 560 Dpi <br/>
A101 uygulamsı telefona sürükleyip bırakıldı kurulduktan sonra test işlemleri başlatıldı.<br/>
<b>LÜTFEN BU ÖZELLİKLERE SAHİP TELEFONU KURUP TEST YAPINIZ.</b>
<br/>

![Screenshot_11](https://user-images.githubusercontent.com/101714396/193453938-0b47e3db-66fb-4b47-a868-7014f91fc477.jpg)
![Screenshot_12](https://user-images.githubusercontent.com/101714396/193454042-81b9d8df-b639-47cc-8493-3e085344d838.jpg)


<br/>

### Chrome uygulamasından A101 sitesine gidiş (NATİVE_APP) <br/>
ANDROİD STUDİO kuruldu<br/>
Pixel 2 API 29 <br/>
özellikler= Android 10 (Api29) yüklendi, ekran 1080 X 1920 
bu testimizde ise CHROME uygulamsı yüklendi chrome(105.0.5195.127).exe kullanıldı yeni güncelleme geldiyse driver dosyasında bulunan chromedriver.exe güncellenmesi gerekmektedir.burda oluşturduğumuız driverda <b> context </b> kullanılarak <b>NATİVE_APP</b> geçildi ve uygulama üzerinde <b>AndroidFindBy</b> notasyonu kullanılarak elementlerin locateleri alınmıştır

<br/>

### Chrome ile direk browser bağlanma (CHROMİUM) <br/>
ANDROİD STUDİO kuruldu<br/>
Pixel 2 API 29 <br/>
özellikler= Android 10 (Api29) yüklendi, ekran 1080 X 1920 
bu testimizde ise CHROME uygulamsı yüklendi chrome(105.0.5195.127).exe kullanıldı yeni güncelleme geldiyse driver dosyasında bulunan chromedriver.exe güncellenmesi gerekmektedir.burda oluşturduğumuız driverda <b> context </b> kullanılarak <b> CHROMİUM </b> geçildi ve uygulama üzerinde <b>FindBy</b> notasyonu kullanılarak elementlerin locateleri alınmıştır. bu sayede burda direk  webden test yapılır gibi <b> Selenium <b/> özellikleri kullanılarak telefondada testler yapıldı
 <b>LÜTFEN BU ÖZELLİKLERE SAHİP TELEFONU KURUP TEST YAPINIZ.</b>
<br/>
![Screenshot_13](https://user-images.githubusercontent.com/101714396/193454329-4e6dcdf8-67a8-4278-8144-5d4a2920323e.jpg)

![Screenshot_14](https://user-images.githubusercontent.com/101714396/193454341-0f9a51ae-9a8f-425b-ab94-3eff2409916e.jpg)
