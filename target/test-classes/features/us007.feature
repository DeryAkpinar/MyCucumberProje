Feature: US007 Hastalar randevu tarihi oluşturabilmeli

  Scenario: TC01 Hastalar guncel tarihi girerek randevu tarihi oluşturabilmeli

    Given Kullanici "medunnaUrl" gider
    When Kullanici login'e tiklar
    Then Kullanici Sign in butonuna tiklar
    And Kullanici 3 sn bekler
    Then Kullanici gecerli olan username girer
    Then Kullanici gecerli bir password girer.
    And Kullanici 3 sn bekler
    Then Kullanici sign in buttonuna tiklar
    And Kullanici 3 sn bekler
    Then Kullanici Welcome to Medunna yazisinin gorunurlugunu dogrular
    Then Kullanici My Pages butonuna tiklar
    And Kullanici 3 sn bekler
    Then Kullanici Make an Appointment secenegine tiklar
    And Kullanici 3 sn bekler
    Then Kullanici Make an Appointment sayfasinin gorunurlugunu dogrular
    And Kullanici 3 sn bekler
    Then Kullanici phone kutucuguna telefon numarasini yazar
    And Kullanici 3 sn bekler
    Then Kullanici guncel tarihi secer
    And Kullanici 2 sn bekler
    Then Kullanici Send an Appointment Request butonuna basar
    Then Kullanici Kullanici "Appointment registration saved!" yazisini gorundugunu dogrular.
   And Kullanici 2 sn bekler
   And Kullanici sayfayi kapatir







 Scenario: TC02 Hastalar gelecekteki tarihi girerek randevu tarihi oluşturabilmeli

   Given Kullanici "medunnaUrl" gider
   When Kullanici login'e tiklar
   Then Kullanici Sign in butonuna tiklar
   And Kullanici 3 sn bekler
   Then Kullanici gecerli olan username girer
   Then Kullanici gecerli bir password girer.
   And Kullanici 3 sn bekler
   Then Kullanici sign in buttonuna tiklar
   And Kullanici 3 sn bekler
   Then Kullanici Welcome to Medunna yazisinin gorunurlugunu dogrular
   Then Kullanici My Pages butonuna tiklar
   And Kullanici 3 sn bekler
   Then Kullanici Make an Appointment secenegine tiklar
   And Kullanici 3 sn bekler
   Then Kullanici Make an Appointment sayfasinin gorunurlugunu dogrular
   And Kullanici 3 sn bekler
   Then Kullanici phone kutucuguna telefon numarasini yazar
   And Kullanici 3 sn bekler
   Then Kullanici gelecekteki bir tarihi secer
   And Kullanici 2 sn bekler
   Then Kullanici Send an Appointment Request butonuna basar
   And Kullanici 1 sn bekler
   Then Kullanici Kullanici "Appointment registration saved!" yazisini gorundugunu dogrular.
   And Kullanici 2 sn bekler
   And Kullanici sayfayi kapatir







 Scenario: TC03 Tarih sirasinin gun/ay/yil seklinde oldugunu dogrular

   Given Kullanici "medunnaUrl" gider
   When Kullanici login'e tiklar
   Then Kullanici Sign in butonuna tiklar
   And Kullanici 3 sn bekler
   Then Kullanici gecerli olan username girer
   Then Kullanici gecerli bir password girer.
   And Kullanici 3 sn bekler
   Then Kullanici sign in buttonuna tiklar
   And Kullanici 3 sn bekler
   Then Kullanici Welcome to Medunna yazisinin gorunurlugunu dogrular
   Then Kullanici My Pages butonuna tiklar
   And Kullanici 3 sn bekler
   Then Kullanici Make an Appointment secenegine tiklar
   And Kullanici 3 sn bekler
   Then Kullanici Make an Appointment sayfasinin gorunurlugunu dogrular
   And Kullanici 2 saniye bekler
   Then Kullanici randevu tarihinin "gun/ay/yil" seklinde oldugunu dogrular
   And Kullanici sayfayi kapatir






  #Scenario: TC03 Hastalar gecmis bir tarihi girdiginde randevu  oluşturamamali

 # Given Kullanici "medunnaUrl" gider
# When Kullanici login'e tiklar
# Then Kullanici Sign in butonuna tiklar
# And Kullanici 3 sn bekler
# Then Kullanici gecerli olan username girer
# Then Kullanici gecerli bir password girer.
# And Kullanici 3 sn bekler
# Then Kullanici sign in buttonuna tiklar
# And Kullanici 3 sn bekler
 # Then Kullanici Welcome to Medunna yazisinin gorunurlugunu dogrular
 # Then Kullanici My Pages butonuna tiklar
 # And Kullanici 3 sn bekler
 # Then Kullanici Make an Appointment secenegine tiklar
 # And Kullanici 3 sn bekler
 # Then Kullanici Make an Appointment sayfasinin gorunurlugunu dogrular
 # And Kullanici 3 sn bekler
 # Then Kullanici phone kutucuguna telefon numarasini yazar
 # And Kullanici 3 sn bekler
 # Then Kullanici gecmis bir tarihi secer
 # And Kullanici 2 sn bekler
 # Then Kullanici Send an Appointment Request butonuna basar
 # And Kullanici 1 sn bekler
 #  Then Randevu olusturulamadigini dogrular
 #  And Kullanici sayfayi kapatir



































