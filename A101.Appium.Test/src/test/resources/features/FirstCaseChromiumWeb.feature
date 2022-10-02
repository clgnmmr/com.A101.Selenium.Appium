@chromiumWeb
Feature: FirstCase kullanici aldigi urune ozellik secmeli ve odeme yapabilmeli

  Scenario: TestCase kullanici odeme yapabilir
    Given kullanici browser ile "A101Url" sayfasına gider
    And   kullanici browser ile menu acar
    And   kullanici browser ile GIYIM & AKSESUAR > Kadin Ic Giyim > Dizalti Corap bolumunu acar
    Then  kullanici browser ile "SİYAH" oldugunu dogrular
    When  kullanici browser ile Sepete ekler
    And   kullanici browser ile SEPETE GIT butonuna tiklar
    And   kullanici browser ile Sepet Onaylar
    When  kullanici browser ile UYE OLMADAN DEVAM ET butonuna tiklar
    And   kullanici browser ile mail girer
    And   kullanici browser ile  DEVAM ET butonuna tiklar
    And   kullanici browser ile  yeni adress ekler ve kaydet Devam et butonuna Basar
    Then  kullanici browser ile odeme sayfasında oldugunu dogrular
    Then  kullanici browser kapatir