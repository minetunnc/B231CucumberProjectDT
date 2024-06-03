@US006
Feature: US006 Google Testi Scenrio Outline

  Scenario Outline: : TC01 Google sayfasinda arama kutusunda arac aratilir
    Given kullanici "https://google.com" sayfasina gider
    When arama kutusunda "<araclar>" aratilir
    Then sayfa basliginin "<araclar>" icerdigini test eder
    But kullanici 1 saniye bekler
    And sayfayi kapatir
    Examples:
      | araclar |
      | honda   |
      | ford    |
      | volvo   |


