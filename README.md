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
yardımcı clasımız bu dosyamızda bize sürekli lazım olan classlrımız ve methodalrımız bulunmaktadır içerisinde  projemizi daha anlaşılır hale getirecek classlarımız ve methodalrımız vardır bunlar
<b> Driver.class </b> , <b> ConfigReader.class</b> , <b> ReusableMehod.class </b> vb. claslarımız vardır 

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
<a href="https://www.maven.com" target="_blank" rel="noreferrer"> <img src="[https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg](https://koraypeker.com/wp-content/uploads/2018/06/1_xsrKVt69q3JsZzLD-ldekQ.jpeg)" alt="git" width="100" height="40"/> </a>

<hr/>

# Appium testi

<br/>

Java11  ve Maven projesi oluşturulup cucumber BDD framework kullanılarak oluşturulmuştur. 

<br/>

<a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="50" height="50"/> </a>
<a href="https://git-scm.com/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg" alt="git" width="40" height="40"/> </a>
<a href="https://www.selenium.com" target="_blank" rel="noreferrer"> <img src="https://camo.githubusercontent.com/4b95df4d6ca7a01afc25d27159804dc5a7d0df41d8131aaf50c9f84847dfda21/68747470733a2f2f73656c656e69756d2e6465762f696d616765732f73656c656e69756d5f6c6f676f5f7371756172655f677265656e2e706e67" alt="Selenium" width="50" height="50"/> </a>
<a href="https://www.intelj.com" target="_blank" rel="noreferrer"> <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQak-N8W03mK25slV1lwM80i0y1obRPPJOaLA&usqp=CAU" alt="intelj" width="80" height="40"/> </a>
<a href="https://www.maven.com" target="_blank" rel="noreferrer"> <img src="[https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg](https://koraypeker.com/wp-content/uploads/2018/06/1_xsrKVt69q3JsZzLD-ldekQ.jpeg)" alt="git" width="100" height="40"/> </a>


