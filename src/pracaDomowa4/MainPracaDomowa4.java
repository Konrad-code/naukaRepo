package pracaDomowa4;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainPracaDomowa4 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
        // SZYFROWANIE KONRADA
        
        File myFile = new File("C:\\Users\\mHm_MaXi\\Desktop\\AKADEMIA KODU\\doOdszyfrowania.txt");
        try{
            if(myFile.createNewFile()){                                         // JESLI PLIK NIE ISTNIEJE TO Z KONSOLI WPROWADZAMY CIAG ZNAKOW DO ZASZYFROWANIA, KTORY JEST ZAPISANY W ZADANEJ LOKALIZACJI
                System.out.println("Plik utworzony: " + myFile.getName());
                Scanner scanner = new Scanner(System.in);                
                System.out.println("Podaj ciag znakow w Stringu");
                String wyraz = scanner.nextLine();
                System.out.println("Wpisales ciag znakow: " + wyraz);
                
                try{                                                            // ZAPIS DO PLIKU W ZADANEJ LOKALIZACJI
                    FileWriter output = new FileWriter("C:\\Users\\mHm_MaXi\\Desktop\\AKADEMIA KODU\\doOdszyfrowania.txt");
                    output.write(wyraz);
                    output.close();
                    System.out.println("Zapis zakonczony powodzeniem");
                } catch(IOException e){
                    System.out.println("Pojawil sie blad podczas zapisu");
                    e.printStackTrace();
                }
            }
            else
                System.out.println("Plik już istnieje.");
        }catch(IOException e){
            System.out.println("Pojawil sie blad");
            e.printStackTrace();
        }
        
        String wyraz = " ";
        try{                                                                    //  ODCZYT PLIKU Z LOKALIZACJI (wskazuje na nia obiekt myFile)
            Scanner input = new Scanner(myFile);
            while(input.hasNextLine()){
                wyraz = input.nextLine();
                System.out.println("WCZYTANY CIAG ZNAKOW: \n" + wyraz);
            }
            input.close();
        }catch(FileNotFoundException e){
            System.out.println("Pojawil sie problem przy zczytywaniu z pliku");
            e.printStackTrace();
        }
        
        int koder = 0;
        int c = 0;
        int przekroczenie = 0;
        
        StringBuilder sb = new StringBuilder(wyraz);
        StringBuilder sb2 = new StringBuilder(sb);
        
        if((sb.length() % 2) == 0){                                               // 1. PARZYSTA ILOSC ZNAKOW
            sb.reverse();                                                       // ODWROC KOLEJNOSC ZNAKOW W STRINGU
            for(int i = 0; i < sb.length(); i++){
                koder = i - sb.length();                                        // ZASTOSUJ KODER OPARTY O INDEKS ZNAKU ORAZ DLUGOSC STRINGA (ILOSC ZNAKOW)
                c = (int)sb.charAt(i);
                if((c + koder <= 127) && (c + koder > 0)){                      // Jesli znak po zmianie koderem nie wykroczy poza zakres kodow ASCII (0-127)
                    c += koder;
                }else if(c + koder <= 0){                                       // Jesli znak po zmianie koderem wykroczy w dol poza zakres kodow ASCII (0-127)
                    koder *= (-1);
                    przekroczenie = koder - c;
                    c = 127 - (przekroczenie % 127);
                }else if(c + koder > 127){                                      // Jesli znak po zmianie koderem wykroczy w gore poza zakres kodow ASCII (0-127)                   
                    przekroczenie = koder - (127 - c);
                    c = (przekroczenie % 127);
                }
                sb.setCharAt(i, (char)c);
            }
        }else{                                                                  // 2. NIEPARZYSTA ILOSC ZNAKOW - 3 WARIANTY SZYFROWANIA POWTARZAJACE SWOJE ZASTOSOWANIE DLA CO TRZECIEGO ZNAKU
            for(int i = 0; i < sb.length(); i++){
                c = (int)sb.charAt(i);
                if((i %  3) == 2){                                              // 2.1.1. JESLI KOD ASCII ZNAKU PARZYSTY TO PODZIEL GO NA 2
                    if((c > 0) && (c < 33)){
                        koder = 11;
                        if(c + koder > 33)
                            c = koder - (33 - c);
                        else
                            c += koder; 
                    }else if(c > 32 && c < 64)
                        c *= 2;
                    else if(((c % 2) == 0) && (c > 64))
                        c /= 2;
                    else if(sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z'){        // 2.1.2. DLA NIEPARZYSTEGO ASCII ZNAKU W PRZYPADKU DUZEJ LITERY ZMIENI JA NA MALA I PRZESUNIE 2 ZNAKI DALEJ
                        int tmp = (int)Character.toLowerCase(c);                                                     // W PRZYPADKU MALEJ LITERY ZMIENI JA NA DUZA I PRZESUNIE 2 ZNAKI DALEJ
                        tmp += 2;
                        if(tmp == 123)
                            c = 97;
                        else
                            c = tmp;
                    } else if(sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z'){                  
                        int tmp = (int)Character.toUpperCase(c);
                        tmp += 2;
                        if(tmp == 91)
                            c = 65;
                        else
                            c = tmp;
                    }
                }else if((i % 3) == 1){                                         // 2.2. ZASTOSUJ KODER OPARTY O INDEKS ZNAKU ORAZ DLUGOSC STRINGA (ILOSC ZNAKOW)
                    koder = i - sb.length();
                    if((c + koder <= 127) && (c + koder > 0)){                  // Jesli znak po zmianie koderem nie wykroczy poza zakres kodow ASCII (0-127)
                        c += koder;
                    }else if(c + koder <= 0){                                   // Jesli znak po zmianie koderem wykroczy w dol poza zakres kodow ASCII (0-127)
                        koder *= (-1);
                        przekroczenie = koder - c;
                        c = 127 - (przekroczenie % 127);
                    }else if(c + koder > 127){                                  // Jesli znak po zmianie koderem wykroczy w gore poza zakres kodow ASCII (0-127)                   
                        przekroczenie = koder - (127 - c);
                        c = (przekroczenie % 127);
                    }
                }else{                                                          // 2.3. ZASTOSUJ KODER OPARTY O INDEKS ZNAKU ORAZ MODULO (INDEKS ZNAKU)^2 Z LICZBY 2137
                    if(i == 0)
                        koder = (i * i) -  i - 2137 - (2137 % (1 * 1));
                    else
                        koder = (i * i) -  i - 2137 - (2137 % (i * i));
                    if((c + koder <= 127) && (c + koder > 0)){                  // Jesli znak po zmianie koderem nie wykroczy poza zakres kodow ASCII (0-127)
                        c += koder;
                    }else if(c + koder <= 0){                                   // Jesli znak po zmianie koderem wykroczy w dol poza zakres kodow ASCII (0-127)
                        koder *= (-1);
                        przekroczenie = koder - c;
                        c = 127 - (przekroczenie % 127);
                    }else if(c + koder > 127){                                  // Jesli znak po zmianie koderem wykroczy w gore poza zakres kodow ASCII (0-127)                   
                        przekroczenie = koder - (127 - c);
                        c = (przekroczenie % 127);
                    }
                }
                sb.setCharAt(i, (char)c);
            }
        }
        
//        for(int i = 0; i < sb.length(); i++){
//            System.out.print((int)sb.charAt(i) + " ");
//        }
//        System.out.println();
        wyraz = sb.toString();
        System.out.println("\nZASZYFROWANY CIAG ZNAKOW TO: \n--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n" + wyraz + "\n--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        
        try{                                                                    // ZAPIS ZASZYFROWANEGO PLIKU
        FileWriter output = new FileWriter("C:\\Users\\mHm_MaXi\\Desktop\\AKADEMIA KODU\\zaszyfrowany.txt");
        output.write(wyraz);
        output.close();
            System.out.println("Zapis zakonczony powodzeniem");
        } catch(IOException e){
            System.out.println("Pojawil sie blad podczas zapisu");
            e.printStackTrace();
        }
        
        wyraz = "Przerywamy ciaglosc programu\n";                               // WYMIANA ZAWARTOSCI ZMIENNEJ ZEBY NIKT NIE POSADZAL O PRZECHOWANIE W NIEJ PIERWOTNEGO CIAGU ZNAKOW
        System.out.println(wyraz);
      
        // ODSZYFROWYWANIE KONRADA
        
        File odszyfrowywany = new File("C:\\Users\\mHm_MaXi\\Desktop\\AKADEMIA KODU\\zaszyfrowany.txt");
                
        try{                                                                    // ODCZYT PLIKU DO ODSZYFROWANIA
            Scanner input = new Scanner(odszyfrowywany);
            System.out.println("\nODCZYTANY Z PLIKU CIAG ZNAKOW PRZEZNACZONYCH DO ODSZYFROWANIA KONRADA:\n--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            while(input.hasNextLine()){
                wyraz = input.nextLine();
                System.out.println(wyraz);                                      // WYDRUK ODCZYTANEJ ZAWARTOSCI PLIKU DO ODSZYFROWANIA
            }
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
            input.close();
        }catch(FileNotFoundException e){
            System.out.println("Pojawil sie problem przy zczytywaniu z pliku");
            e.printStackTrace();
        }
        
        int warunek1 = 0;                                                       // zmienna dostarczana do warunku dla diagnozy czy odszyfrowujemy przypadek ktory byl zaszyfrowany dla kodera < 0 oraz kodu ASCII znaku c + koder < 0
        int warunek2 = 0;                                                       // zmienna dostarczana do warunku dla diagnozy czy odszyfrowujemy przypadek ktory byl zaszyfrowany dla kodera > 0 oraz kodu ASCII znaku c + koder > 127
        if((sb.length() % 2) == 0){                                             // 1. PARZYSTA ILOSC ZNAKOW
            for(int i = 0; i < sb.length(); i++){
                koder = i - sb.length();                                        // ZASTOSUJ KODER OPARTY O INDEKS ZNAKU ORAZ DLUGOSC STRINGA (ILOSC ZNAKOW)
                c = (int)sb.charAt(i);
                warunek1 = ((koder - (127 - c)) % 127);
                warunek2 = 127 - ((koder - c) % 127);
                if((c - koder <= 127) && (c - koder > 0))                      
                    c -= koder;
                else if((koder < 0) && (warunek1 + koder < 0)){                 
                    przekroczenie = ( - koder) - (127 - c);  
                    c = (przekroczenie % 127);
                }else if((koder > 0)&& (warunek2 + koder > 127)){               
                    przekroczenie = koder - c;
                    c = 127 - (przekroczenie % 127);
                }
                sb.setCharAt(i, (char)c);
            }
            sb.reverse();                                                       // ODWROC KOLEJNOSC ZNAKOW W STRINGU            
        }else{
            for(int i = 0; i < sb.length(); i++){
                c = (int)sb.charAt(i);
                if((i %  3) == 2){                                              // 2.1.1. JESLI KOD ASCII ZNAKU PARZYSTY TO PODZIEL GO NA 2
                    if((c > 0) && (c < 33)){
                        koder = 11;
                        if(c - koder < 0)
                            c = 33 - (koder - c);
                        else
                            c -= koder;
                    }else if(c > 32 && c < 64)
                        c *= 2;
                    else if(((c % 2) == 0) && (c > 64))
                        c /= 2;
                    else if(sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z'){        // 2.1.2. DLA NIEPARZYSTEGO ASCII ZNAKU W PRZYPADKU DUZEJ LITERY ZMIENI JA NA MALA I PRZESUNIE 2 ZNAKI DALEJ
                        int tmp = (int)Character.toLowerCase(c);                                                     // W PRZYPADKU MALEJ LITERY ZMIENI JA NA DUZA I PRZESUNIE 2 ZNAKI DALEJ
                        tmp -= 2;
                        if(tmp == 95)
                            c = 121;
                        else
                            c = tmp;
                    } else if(sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z'){                  
                        int tmp = (int)Character.toUpperCase(c);
                        tmp -= 2;
                        if(tmp == 63)
                            c = 89;
                        else
                            c = tmp;
                    }
                }else if((i % 3) == 1){                                           // 2.2. ZASTOSUJ KODER OPARTY O INDEKS ZNAKU ORAZ DLUGOSC STRINGA (ILOSC ZNAKOW)
                    koder = i - sb.length();
                    warunek1 = ((koder - (127 - c)) % 127);
                    warunek2 = 127 - ((koder - c) % 127);
                    if((c - koder <= 127) && (c - koder > 0))                      
                        c -= koder;
                    else if((koder < 0) && (warunek1 + koder < 0)){                 
                        przekroczenie = ( - koder) - (127 - c);  
                        c = (przekroczenie % 127);
                    }else if((koder > 0)&& (warunek2 + koder > 127)){               
                        przekroczenie = koder - c;
                        c = 127 - (przekroczenie % 127);
                    }
                }else{                                                          // 2.3. ZASTOSUJ KODER OPARTY O INDEKS ZNAKU ORAZ MODULO (INDEKS ZNAKU)^2 Z LICZBY 2137
                    if(i == 0)
                        koder = (i * i) -  i - 2137 - (2137 % (1 * 1));
                    else
                        koder = (i * i) -  i - 2137 - (2137 % (i * i));
                    warunek1 = ((koder - (127 - c)) % 127);
                    warunek2 = 127 - ((koder - c) % 127);
                    if((c - koder <= 127) && (c - koder > 0))                      
                        c -= koder;
                    else if((koder < 0) && (warunek1 + koder < 0)){                 
                        przekroczenie = ( - koder) - (127 - c);  
                        c = (przekroczenie % 127);
                    }else if((koder > 0)&& (warunek2 + koder > 127)){               
                        przekroczenie = koder - c;
                        c = 127 - (przekroczenie % 127);
                    }
                }
                sb.setCharAt(i, (char)c);
            }
        }
            
//        for(int i = 0; i < sb.length(); i++){
//            System.out.print((int)sb.charAt(i) + " ");
//        }
//        System.out.println();
        wyraz = sb.toString();
        System.out.println("ODSZYFROWANY Z POWROTEM CIAG ZNAKOW TO: \n" + wyraz + "\n");
        
        try{                                                                    // ZAPIS ODSZYFROWANEGO PLIKU DO ZADANEJ LOKALIZACJI
        FileWriter output = new FileWriter("C:\\Users\\mHm_MaXi\\Desktop\\AKADEMIA KODU\\zaszyfrowany.txt");
        output.write(wyraz);
        output.close();
            System.out.println("Zapis zakonczony powodzeniem");
        } catch(IOException e){
            System.out.println("Pojawil sie blad podczas zapisu");
            e.printStackTrace();
        }
    }
}