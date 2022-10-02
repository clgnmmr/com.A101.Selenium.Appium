@chromeApp
Feature: FirstCase kullanici aldigi urune ozellik secmeli ve odeme yapabilmeli

  Scenario: TestCase kullanici odeme yapabilir
    Given kullanici chrome ile "A101Url" sayfasına gider
    And   kullanici chrome ile "Menü" tiklar
    And   kullanici chrome ile "AKSESUAR" > "Kadın İç" > "Dizaltı"  bolumunu acar
    Then  kullanici chrome ile "SİYAH" oldugunu dogrular
    When  kullanici chrome ile Sepete ekler
    And   kullanici chrome ile SEPETI GORUNTULE butonuna tiklar
    And   kullanici chrome ile Sepet Onaylar
    When  kullanici chrome ile UYE OLMADAN DEVAM ET butonuna tiklar
    And   kullanici chrome ile mail girer
    And   kullanici chrome ile DEVAM ET butonuna tiklar
    And   kullanici chrome ile yeni adress ekler ve kaydet Devam et butonuna Basar
    Then  kullanici chrome ile  odeme sayfasında oldugunu dogrular
    And   kullanici chrome ile uygulamayı kapatir