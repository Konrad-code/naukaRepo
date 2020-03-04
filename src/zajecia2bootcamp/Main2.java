package zajecia2bootcamp;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
            
        // XXXXXXX OOOOOOOO V1
        
        for(int i = 0; i < 5; i++)
        {
            for(int g = 0; g < 5; g++)
            {
                if(i % 2 == 1)
                System.out.print(" x ");
                else
                    System.out.print(" o ");
            }
            System.out.println("");
        }
            
        System.out.println("");
            
        // XXXXXXX OOOOOOOO V2
        
        for(int i = 0; i < 5; i++)
        {
            for(int g = 0; g < 5; g++)
            {
                if(g % 2 == 1)
                    System.out.print(" x ");
                else
                    System.out.print(" o ");
                }
                System.out.println("");
            }
        System.out.println("");    
    
        // XOXOXOXO V1
        
        for(int i = 0; i < 5; i++)
        {
            for(int g = 0; g < 5; g++)
            {
                if((g + i) % 2 == 1)
                    System.out.print(" x ");
                else
                    System.out.print(" o ");
            }
                System.out.println("");
        }
        System.out.println("");
        
        // XOXOXOXO V2
        
        for(int i = 0; i < 5; i++)
        {
            for(int g = 0; g < 5; g++)
            {
                if((g + i) % 2 == 0)
                    System.out.print(" x ");
                else
                    System.out.print(" o ");
            }
                System.out.println("");
        }
        System.out.println("");     
        
        // XXXXXXX PRZEKATNE DLA WYMIARU PARZYSTEGO
        
        int n = 8;
        for(int i = 0; i < n; i++)
        {
            for(int g = 0; g < n; g++)
            {
                if(i == g || n - i == g + 1)
                    System.out.print(" x ");
                else
                    System.out.print(" o ");
            }
                System.out.println("");
        }
        System.out.println("");    
        
        // XXXXXXX PRZEKATNE DLA WYMIARU NIEPARZYSTEGO
        
        n = 9;
        for(int i = 0; i < n; i++)
        {
            for(int g = 0; g < n; g++)
            {
                if(i == g || n - i == g + 1)
                    System.out.print(" x ");
                else
                    System.out.print(" o ");
            }
                System.out.println("");
        }
        System.out.println("");
        
        // 1 ZADANIE Z LISTY
        
        String warunek = new String("T");
        String potwierdzenie = new String("N");
        Scanner scanner = new Scanner(System.in);
        
//        do
//        {      
//            System.out.println("Podaj swoje imie: ");
//            String imie = scanner.nextLine();
//            System.out.println("Podaj swoje nazwisko: ");
//            String nazwisko = scanner.nextLine();
//            System.out.println("Podaj swoj wiek: ");
//            int wiek = Integer.parseInt(scanner.nextLine());
//            System.out.println("Podaj swoja pensje: ");
//            double pensja = (double)Integer.parseInt(scanner.nextLine());
//
//            System.out.printf("Twoje dane to:\nImie: %s\nNazwisko %s\nWiek: %d\nPensja: %f\n", imie, nazwisko, wiek, pensja);
//            System.out.println("Potwierdz dane wpisujac T");
//
//            potwierdzenie = scanner.nextLine();
//        }while(warunek.equals(potwierdzenie) != true);
        
        // 2 ZADANIE Z LISTY
        
//        System.out.println("Wprowadz pierwsza zmienna");
//        int pierwsza = Integer.parseInt(scanner.nextLine());
//        System.out.println("Wprowadz druga zmienna");
//        int druga = Integer.parseInt(scanner.nextLine());
//        
//        System.out.println((pierwsza + druga)/2);

        // 3 ZADANIE Z LISTY
        
//        System.out.println("Wprowadz liczbe miejsc");
//        int miejsca = Integer.parseInt(scanner.nextLine());
//        System.out.println("Wprowadz liczbe rzedow");
//        int rzedy = Integer.parseInt(scanner.nextLine());
//        
//        if(miejsca % rzedy == 0)
//            System.out.println("W jednym rzedzie mozna usadzic " + miejsca / rzedy + " osob");
//        else
//        {
//            int i = 0, j = 0;
//            i = miejsca / (rzedy - 1);
//            j = miejsca % (rzedy - 1);
//            System.out.printf("W samolocie jest %d rzedow obsadzonych po %d osob a w ostatnim rzedzie znajduje sie %d osob", rzedy - 1, i, j);
//        }
//        System.out.println();
        
        // 4 ZADANIE Z LISTY
        
//        System.out.println("Wprowadz pierwsza zmienna");
//        int pierwszaLiczba = Integer.parseInt(scanner.nextLine());
//        System.out.println("Wprowadz druga zmienna");
//        int drugaLiczba = Integer.parseInt(scanner.nextLine());
//        System.out.println("Wprowadz trzecia zmienna");
//        int trzeciaLiczba = Integer.parseInt(scanner.nextLine());
//        
//        if(pierwszaLiczba > drugaLiczba && drugaLiczba > trzeciaLiczba)
//            System.out.println(trzeciaLiczba);
//        else if(pierwszaLiczba > trzeciaLiczba && trzeciaLiczba > drugaLiczba)
//            System.out.println(drugaLiczba);
//        else
//            System.out.println(pierwszaLiczba);
        
        // 5 ZADANIE Z LISTY
        
//        System.out.println("Wprowadz zmienna do zbadania podzielnosci przez 3");
//        int zmienna = Integer.parseInt(scanner.nextLine());
//        if(zmienna % 3 == 0)
//            System.out.println("Liczba " + zmienna + " jest podzielna przez 3");
//        else
//            System.out.println("Liczba " + zmienna + " jest niepodzielna przez 3");
        
        // 6 ZADANIE Z LISTY
        
        System.out.println((int)(Math.random() * 100 - 25));
        
        // 1 ZADANIE LISTY STRINGOW
        
//        System.out.println("Podaj wyraz ");
//        String wyraz = scanner.nextLine();
//        System.out.println("Wpisales wyraz: \"" + wyraz + "\" a jego dlugosc wynosi: " + wyraz.length());
        
        // 2 ZADANIE LISTY STRINGOW
        
//        System.out.println("Podaj wyraz ");
//        String wyraz1 = scanner.nextLine();
//        System.out.println("Wprowadz pierwsza zmienna");
//        int iloscZnakow = Integer.parseInt(scanner.nextLine());
//        System.out.println(wyraz1.substring(wyraz1.length() - iloscZnakow));
        
        // 3 ZADANIE LISTY STRINGOW
        
//        System.out.println("Podaj wyraz ");
//        String wyraz2 = scanner.nextLine();
//        if(wyraz2.contains("m") || wyraz2.contains("M"))
//            System.out.println("Wyraz zawiera \"m\" lub \"M\"");
//        else
//            System.out.println("Wyraz jest pozbawiony \"m\" lub \"M\"");
        
        // 4 ZADANIE LISTY STRINGOW
        
//        System.out.println("Podaj wyraz ");
//        String wyraz3 = scanner.nextLine();
//        System.out.println((int)wyraz3.charAt(1));
//        if((int)wyraz3.charAt(0) >= 48 && (int)wyraz3.charAt(0) <= 57)
//            System.out.println("Na pierwszej pozycji Stringa znajduje sie cyfra");
//        else
//            System.out.println("Na pierwszej pozycji Stringa nie ma cyfry");
        
        // 5 ZADANIE LISTY STRINGOW
        
//        System.out.println("Podaj wyraz ");
//        String wyraz4 = scanner.nextLine();
//        if((int)wyraz4.charAt(wyraz4.length() - 1) == (int)wyraz4.charAt(0))
//            System.out.println("Na pierwszej pozycji Stringa znajduje sie ten sam znak co na końcu");
//        else
//            System.out.println("Na pierwszej pozycji Stringa nie ma takiego samego znaku co na końcu");
        
        // 6 ZADANIE LISTY STRINGOW        
        
//        String wyraz5 = "Arkadiusz Ssaczopencinski";
//        System.out.println("Podany wyraz " + wyraz5);        
//        String str1 = wyraz5.split(" ")[0];
//        String str2 = wyraz5.split(" ")[1];
//        System.out.println("Imie: " + str1 + "\nNazwisko: " + str2);

        // 7 ZADANIE LISTY STRINGOW
        
        System.out.println("\"Mowa jest srebrem, a milczenie złotem\"");
        
        // 8 ZADANIE LISTY STRINGOW

//        System.out.println("Podaj pierwszy wyraz ");
//        String wyraz6 = scanner.nextLine();
//        System.out.println("Podaj drugi wyraz ");
//        String wyraz7 = scanner.nextLine();
//        
//        if(wyraz6.equals(wyraz7) == true)
//            System.out.println("Wyrazy sa identyczne");
//        else
//            System.out.println("Wyrazy sa rozne");
        
        // ZADANIE Z TROJKATEM V1
        
        int N = 10;
        for(int i = 0; i <= N; i ++){
            for(int j = i; j < N; j++)
                System.out.print(" ");
            if(i % 2 == 0){
                for(int j = 1; j <= i / 2; j++)
                    System.out.print(j + " ");
                for(int j = i / 2; j >= 1; j--)
                    System.out.print(j + " ");
            }
            else{
                for(int j = 1; j <= i / 2; j++)
                        System.out.print(j + " ");
                for(int j = (i + 1) / 2; j >= 1; j--)
                    System.out.print(j + " ");
            }
            System.out.println();
        }
            
        // przykladowe zadanie - jakich liter (duze czy male) jest wiecej w Stringu
        
//        System.out.println("Podaj pierwszy wyraz ");
//        String wyraz8 = scanner.nextLine();
//        int suma1 = 0, suma2 = 0;
//        
//        for(int i = 0; i < wyraz8.length(); i++)
//        {
//            if(wyraz8.charAt(i) >= 'A' && wyraz8.charAt(i) <= 'Z')      // DUZE LITERY
//                suma1++;
//            if(wyraz8.charAt(i) >= 'a' && wyraz8.charAt(i) <= 'z')     // MALE LITERY
//                suma2++;
//        }
//        if(suma1 > suma2)
//            System.out.println("W podanym Stringu jest wiecej duzych liter");
//        else if(suma1 < suma2)
//            System.out.println("W podanym Stringu jest wiecej malych liter");
//        else
//            System.out.println("W podanym Stringu jest tyle samo duzych liter co malych");

        // SZYFROWANIE CEZARA
        
        System.out.println("Podaj ciag znakow w Stringu");
        String wyraz9 = scanner.nextLine();
        System.out.println("Wpisales ciag znakow: " + wyraz9);
        int koder = 5;
        int c = 0;
        
        StringBuilder sb = new StringBuilder(wyraz9);
        StringBuilder sb2 = new StringBuilder(sb);
        for(int i = 0; i < sb.length(); i++)
        {
            c = (int)sb.charAt(i);
            if(sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z')
            {
                if(c + koder > 122)
                {
                    c = 96 + (koder - (122 - c));
                }
                else
                {
                    c += koder;
                }
            }
            if(sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z')
            {
                if(c + koder > 90)
                {
                    c = 64 + (koder - (90 - c));
                }
                else
                {
                    c += koder;
                }
            }
            sb.setCharAt(i, (char)c);
        }

        wyraz9 = sb.toString();
        System.out.println("Zaszyfrowany ciag znakow to: " + wyraz9);

        // ODSZYFROWYWANIE CEZARA
        
        for(int i = 0; i < sb.length(); i++)
        {
            c = (int)sb.charAt(i);
            if(sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z')
            {
                c = (int)sb.charAt(i);
                if(c - koder < 97)
                {
                    c = 123 - (koder - (c - 97));
                }
                else
                {
                    c -= koder;
                }
            }
            if(sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z')
            {
                c = (int)sb.charAt(i);
                if(c - koder < 65)
                {
                    c = 91 - (koder - (c - 65));
                }
                else
                {
                    c -= koder;
                }
            }
            sb.setCharAt(i, (char)c);
        }

        wyraz9 = sb.toString();
        System.out.println("Odszyfrowany z powrotem ciag znakow to: " + wyraz9);
        
        
        scanner.close();
    }
}