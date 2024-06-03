@US005
  Feature: US005 Google Testi
    Scenario: TC01 Google sayfasinda arama kutusunda arac aratilir
      Given kullanici "https://google.com" sayfasina gider
      When arama kutusunda "ford" aratilir
      Then sayfa basliginin "ford" icerdigini test eder
      But kullanici 2 saniye bekler
      And sayfayi kapatir

    Scenario: TC01 Google sayfasinda arama kutusunda arac aratilir
      Given kullanici "https://google.com" sayfasina gider
      When arama kutusunda "toyota" aratilir
      Then sayfa basliginin "toyota" icerdigini test eder
      But kullanici 2 saniye bekler
      And sayfayi kapatir

    Scenario: TC01 Google sayfasinda arama kutusunda arac aratilir
      Given kullanici "https://google.com" sayfasina gider
      When arama kutusunda "volvo" aratilir
      Then sayfa basliginin "volvo" icerdigini test eder
      But kullanici 3 saniye bekler
      And sayfayi kapatir
