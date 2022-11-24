Feature:
 Scenario Outline: US007Api Kullanici randevulari goruntuleyebilmeli

   Given Kullanici(Patient) Medunna url gider
   When Kullanici request istegini gonderir ve yaniti alir
   And Kullanici Api ile beklenen datalari dogrular "<createdBy>", "<createdDate>","<startDate>","<endDate>"
   Examples:
     | createdBy | createdDate | startDate | endDate |