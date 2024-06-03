
@US004
Feature: US004 Amazon testi

  Background:
    Given kullanici "https://amazon.com" sayfasina gider

  Scenario: TC01 arama kutusunda iphone aratilir
    When arama kutusunda "iphone" aratir
    And sayfayi kapatir

  Scenario: TC02 arama kutusunda java aratilir
    When arama kutusunda "java" aratir
    And sayfayi kapatir

  Scenario: TC03 arama kutusunda selenium aratilir
    When arama kutusunda "selenium" aratir
    And sayfayi kapatir


#    Feature: file i daha dynamic hale getirebilmek icin gitmek istedigimiz url i yada aratmak istedigimiz bir ifadeyi cift tirnka "" icinde belirtebiliriz
#  cunku tirnak icinde yazdigimiz deger stepDefinition clasindaki method icin artik bir parametreye donusur,
#  böylece tekrar tekrar method olusturmak zorunda kalmadan istedigimiz url e gidebilir istedigimiz kelimeyi aratabilirz