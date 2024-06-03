#TASK:
# 3 tane Scenario oluşturunuz
# Amazon sayfasında iphone, samsung ve nokia aratınız.

  Feature: US003 Amazon testi
    Scenario: TC01 arama kutusunda iphone ararılır
      Given kullanici amazon sayfasina gider
      When arama kutusunda iphone aratir
      And sayfayi kapatir

      Scenario: TC02 aramaa kutusunda samsung aratılır
        Given kullanici amazon sayfasina gider
        When arama kutusunda samsung aratir
        And sayfayi kapatir

