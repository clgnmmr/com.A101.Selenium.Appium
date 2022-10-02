@firstCase
Feature: FirstCase kullanici aldigi urune ozellik secmeli ve odeme yapabilmeli

  Scenario Outline: TestCase kullanici odeme yapabilir
    Given kullanici "A101Url" gider
    And   kullanici "GİYİM & AKSESUAR" basligina tiklar
    And   kullanici "Kadın İç Giyim" butonuna tiklar
    And   kullanici "Dizaltı Çorap" butonuna tiklar
    Then  kullanici "Siyah" oldugunu test eder
    When  kullanici Sepet Ekle butonuna tiklar
    And   kullanici "Sepeti Görüntüle" butonuna tiklar
    And   kullanici "Sepeti Onayla" butonuna tiklar
    And   kullanici "ÜYE OLMADAN DEVAM ET" basligina tiklar
    And   kullanici Email kutusunu doldurur
    And   kullanici "DEVAM ET" butonuna tiklar
    When  kullanici "Yeni adres oluştur" basligina tiklar
    And   kullanici yeni adres icin  "<Adres Basligi>" , "<Ad>" , "<Soyad>" , "<Telefon>" , "<il>" , "<ilce>" , "<Mahalle>" , "<Adres>" bilgileri doldurur
    And   kullanici "KAYDET" butonuna tiklar
    And   kullanici "Kaydet ve Devam Et" butonuna tiklar
    Then  kullanici odeme sayfasına gittigini dogrular
    Then  kullanici sayfayi kapatir
    Examples:
      | Adres Basligi | Ad       | Soyad       |Telefon          |il             |ilce          |Mahalle           |Adres                                     |
      | Evim          | Kadir    | Tepecik     | 5658585858      |İSTANBUL       |EYÜPSULTAN    |KARADOLAP MAH     | cicek sokak gul caddesi no:105/8         |