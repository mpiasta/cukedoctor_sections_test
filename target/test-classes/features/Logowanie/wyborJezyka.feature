# language: pl
@section-Language
@order-1
Funkcja: Wybór języka
  Jako Kurier,
  chcę mieć możliwość wyboru języka aplikacji
  przed rozpoczęciem dnia pracy

  @Auto
  Szablon scenariusza: Wybór języka
    Zakładając, że Kurier jest na ekranie logowania
    Kiedy wybiera "<język>" w aplikacji
    Wtedy język aplikacji zmienia się na "<język>"
    Przykłady:
      |język    |
      |Polski   |
      |Rosyjski |
      |Ukraiński|