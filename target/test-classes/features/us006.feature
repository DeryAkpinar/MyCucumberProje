@gp1
Feature: US006 Kullanici bilgilerini guncelleyebilmeli

  Scenario: TC01 Kullanici bilgilerinin oldugunu dogrular
    Given Kullanici Medunna anasayfasina gider
   When Kullanici User login'e tiklar
   Then Kullanici Sign in buttonuna tiklar
   And Kullanici 3 saniye bekler
   Then Kullanici gecerli bir username girer
   Then Kullanici gecerli password girer
   And Kullanici 3 saniye bekler
   Then Kullanici sign in butonuna tiklar
   And Kullanici 3 saniye bekler
   Then Kullanici bilgi sekmesine tiklar
   And Kullanici 2 saniye bekler
   Then Settings secenegine tiklar
   And Kullanici 2 saniye bekler
   Then Kullanici "User settings for [cizmelikedi]" sayfasinda oldugunu dogrular
   And Kullanici 2 saniye bekler
   Then Kullanici First Name,Last Name ve Email bilgilerinin oldugunu dogrular
    And Kullanici sayfayi kapatir.












  Scenario: TC02 First Name bilgilerini guncelleyebilirligini dogrular
    Given Kullanici Medunna anasayfasina gider
    When Kullanici User login'e tiklar
    Then Kullanici Sign in buttonuna tiklar
    And Kullanici 3 saniye bekler
    Then Kullanici gecerli bir username girer
    Then Kullanici gecerli password girer
    And Kullanici 2 saniye bekler
    Then Kullanici sign in butonuna tiklar
    And Kullanici 2 saniye bekler
    Then Kullanici bilgi sekmesine tiklar
    And Kullanici 2 saniye bekler
    Then Settings secenegine tiklar
    And Kullanici 2 saniye bekler
    Then Kullanici "User settings for [cizmelikedi]" sayfasinda oldugunu dogrular
    Then Kullanici First Name kutucugunu siler ve guncel bilgisini girer
    And Kullanici 2 saniye bekler
    Then Kullanici save buttonuna tiklar
    And Kullanici Setting saved! yazisinin gorunurlugunu dogrular
    And Kullanici sayfayi kapatir.








  Scenario: TC03 Last Name bilgilerini guncelleyebilirligini dogrular
    Given Kullanici Medunna anasayfasina gider
    When Kullanici User login'e tiklar
    Then Kullanici Sign in buttonuna tiklar
    And Kullanici 3 saniye bekler
    Then Kullanici gecerli bir username girer
    Then Kullanici gecerli password girer
    And Kullanici 2 saniye bekler
    Then Kullanici sign in butonuna tiklar
    And Kullanici 2 saniye bekler
    Then Kullanici bilgi sekmesine tiklar
    And Kullanici 2 saniye bekler
    Then Settings secenegine tiklar
    And Kullanici 2 saniye bekler
    Then Kullanici "User settings for [cizmelikedi]" sayfasinda oldugunu dogrular
    Then Kullanici Last Name kutucugunu siler ve guncel bilgisini girer
    And Kullanici 2 saniye bekler
    Then Kullanici save buttonuna tiklar
    And Kullanici Setting saved! yazisinin gorunurlugunu dogrular
    And Kullanici sayfayi kapatir.







  Scenario: TC04 Last Name bilgilerini guncelleyebilirligini dogrular
    Given Kullanici Medunna anasayfasina gider
    When Kullanici User login'e tiklar
    Then Kullanici Sign in buttonuna tiklar
    And Kullanici 3 saniye bekler
    Then Kullanici gecerli bir username girer
    Then Kullanici gecerli password girer
    And Kullanici 2 saniye bekler
    Then Kullanici sign in butonuna tiklar
    And Kullanici 2 saniye bekler
    Then Kullanici bilgi sekmesine tiklar
    And Kullanici 2 saniye bekler
    Then Settings secenegine tiklar
    And Kullanici 2 saniye bekler
    Then Kullanici "User settings for [cizmelikedi]" sayfasinda oldugunu dogrular
    Then Kullanici Email kutucugunu siler ve guncel bilgisini girer
    And Kullanici 2 saniye bekler
    Then Kullanici save buttonuna tiklar
    And Kullanici Setting saved! yazisinin gorunurlugunu dogrular
    And Kullanici sayfayi kapatir.





