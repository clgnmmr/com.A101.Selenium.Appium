@a101app
Feature: FirstCase kullanici aldigi urune ozellik secmeli ve odeme yapabilmeli

  Scenario: TestCase kullanici odeme yapabilir
    Given Appium ile uygulama acilir
    And   kullanici menu acar
    And   kullanici "GİYİM & AKSESUAR" > "Kadın İç Giyim" > "Dizaltı Çorap"  bolumunu acar
    Then  kullanici "SİYAH" oldugunu dogrular
    When  kullanici Sepete ekler
    And   kullanici "SEPETE GİT" butonuna tiklar
    And   kullanici Sepet Onaylar
    When  kullanici "ÜYE OLMADAN DEVAM ET" butonuna tiklar
    And   kullanici mail girer
    And   kullanici "GÖNDER" butonuna tiklar
    And   kullanici yeni adress ekler ve kaydet Devam et butonuna Basar
    Then  kullanici odeme sayfasında oldugunu dogrular
    And   kullanici uygulamayı kapatir
