# [AK] Konrad Żołyński - praca domowa z czwartych zajec - Szyfr Konrada

Algorytm szyfrowania jest dosyć złożony i nie ukrywam, że pracowałem nad nim kilka dobrych dni.
Funkcjonalność programu przewiduje odczyt pliku z zadanej lokalizacji (osoba uzytkująca program musi ją zmienić)
Nazwa pliku to "Odszyfrowania". Jeśli taki plik .txt nie istnieje, to program poprosi użytkownika
o wprowadzenie tekstu do zaszyfrowania. Zostanie on zapisany pod powyższą nazwą pliku w powyższej lokalizacji.
Wprowadzony ciąg znaków do zakodowania powinien zawierać się w obrębie znaków ASCII 
(czyli chociażby brak polskich znaków). Następnie dochodzi do odczytu danych z pliku.

Na potrzeby testu poprawności działania programu oraz obydwu systemów szyfrowania w pełnym zakresie
zaleca się wykonanie programu dla pliku "doOdszyfrowania" (o parzystej ilości znaków),
a następnie dla pliku "doOdszyfrowania — kopia" (o nieparzystej ilości znaków) po zmianie jego nazwy na wymaganą:
"doOdszyfrowania" i usunięciu poprzedniego pliku o takiej nazwie z folderu, na który wskazuje lokalizacja odczytu.

Algorytm ma następujące poziomy szyfrowania:
1. Dla wprowadzonego ciągu znaków o parzystej ilości znaków
-> zamienia kolejność znaków a następnie stosuje koder przesunięcia o wartości 
   różnicy indeksu znaku i długości wprowadzonego ciągu znaków do zaszyfrowania
2. Dla wprowadzonego ciągu znaków o parzystej ilości znaków
	a.) Jeśli znak jest na indeksie spełniającym zależność (indeks % 3 == 1)
	-> zastosuj kodowanie z punktu 1.
	b.) Jeśli znak jest na indeksie spełniającym zależność (indeks % 3 == 2)
	-> stosuje koder przesunięcia o wartości: | indeks^2 -  indeks - 2137 - (2137 % (indeks^2))
	c.) Jeśli znak jest na indeksie spełniającym zależność (indeks % 3 == 0)
		- Dla znaków o kodzie ASCII z przedziału <1,32> stosuje koder przesunięcia o wartości 11
		- Dla znaków o kodzie ASCII z przedziału <33,63> mnoży wartość kodu ASCII razy 2
		- Dla znaków o parzystym kodzie ASCII i z zakresu powyżej 64 podzieli wartosc kodu ASCII na 2
		- Dla znaków o nieparzystym kodzie ASCII z przedziału małych liter konwertuje znak na dużą
		literę i przesuwa o 2 (na następny o kodzie nieparzystym)
		- Dla znaków o nieparzystym kodzie ASCII z przedziału dużych liter konwertuje znak na małą
		literę i przesuwa o 2 (na następny o kodzie nieparzystym)

Całość szyfrowania zabezpiecza ewentualność, że koder przesunięcia przekroczy zakres outputowego 
kodu ASCII po poddaniu znaku przesunięciu o koder zarówno w górę (ponad 127) jak i w dół (poniżej 1, bo nie
przydzielamy znakom żadnego nulla ukrytego w ASCII pod 1, który jest znakiem zakończenia pliku) o dowolną
wielokrotność przekroczenia tego zakresu; co również obowiązuje sytuacji dla modyfikacji małych/dużych liter
w 2 ostatnich podpunktach wariantu c.). Kod dodatkowo jest dosyć obficie komentowany i programista zadbał
o przejrzystość formy wypisu w konsoli.

Program poddaje wczytany z pliku ciąg znaków i poddaje je szyfrowaniu zgodnie z algorytmem.
Dochodzi do zapisu zaszyfrowanego ciągu znaków do nowego pliku o nazwie "zaszyfrowany" oraz wyczyszczenia 
zmiennych przechowujących ciąg znaków.
Program odczytuje z pliku "zaszyfrowany" (znajdującego się pod zadaną lokalizacją) ciąg znaków, które mają 
zostać poddane procesowi odszyfrowania algorytmem odwrotnym do algorytmu Konrada.
Następnie dochodzi do odszyfrowania i ponownego zapisu do pliku "zaszyfrowany".

