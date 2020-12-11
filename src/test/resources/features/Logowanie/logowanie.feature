# language: pl
@section-Logowanie
@order-2
Funkcja: Logowanie
  Jako Kurier,
  chcę mieć możliwość zalogowania do aplikacji
  oraz wyświetlenia ekranu startowego

  @Auto
  Scenariusz: Logowanie poprawne
    Zakładając, że Kurier jest na ekranie logowania
    Kiedy Kurier loguje się do aplikacji
    Wtedy Strona powitalna z przyciskiem Rozpocznij dzień pracy powinna zostać wyświetlona

  @Auto
  Scenariusz: Trzymanie sesji
    Zakładając, że Kurier jest zalogowany
    Oraz Strona powitalna z przyciskiem Rozpocznij dzień pracy jest wyświetlona
    Kiedy aplikacja pracuje w tle przez 4 sekundy i zostaje przywrócona
    Wtedy Strona powitalna z przyciskiem Rozpocznij dzień pracy powinna zostać wyświetlona
