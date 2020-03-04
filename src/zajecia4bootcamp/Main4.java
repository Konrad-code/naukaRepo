package zajecia4bootcamp;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main4 {
    
    public static int wyrazCiaguFibonacciegoRekurencyjnie(int liczba1){
        
        int a = liczba1;
        int b = 0;
        
        if(a >= 0)
        {
            for(int i = 0; i < a; i++)
            {
                if(a == 0)
                    b = 0;
                else if(a == 1)
                    b = 1;
                else
                {
                    b = wyrazCiaguFibonacciegoRekurencyjnie(a - 1) + wyrazCiaguFibonacciegoRekurencyjnie(a - 2);
//                    System.out.println(b);
                }
            }
        }
        else
            System.out.println("Wprowadziles liczbe ujemna");
        return b;        
    }
    
    public static int wyrazCiaguFibonacciego(int liczba1){
        
        int a = liczba1;
        int b = 0;
        int c = 0;
        int d = 1;
        
        if(a >= 0)
        {
            if(a == 0)
                return 0;
            if(a == 1)
                return 1;
            else 
                for(int i = 1; i < a; i++)
            {
                b = c + d;
                c = d;
                d = b;
            }
        }
        else
            System.out.println("Wprowadziles liczbe ujemna");
        return b;        
    }
    
    public static void wypiszTab(int[] tab){
        System.out.println("Elementy tablicy to: ");
        for(int i = 0; i < tab.length; i++)
            System.out.print(tab[i] + " ");
        System.out.println();
    }
    
    public static void wypiszTab2(int[][] tab){
        System.out.println("Elementy tablicy to: ");
        for (int[] tab1 : tab) {
            for (int j = 0; j < tab1.length; j++) {
                System.out.print(tab1[j] + " ");
            }
        }
        System.out.println();
    }
    
    //  MOJ KLASYCZNY KOD:
    
//            for(int i = 0; i < tab.length; i++)
//                for(int j = 0; j < tab[i].length; j++)
//                System.out.println(tab[i][j] + " ");
    
    public static int najWW(int liczba1, int liczba2){
        
        int a = liczba1;
        int b = liczba2;
        
        while(a != b)
        {
            if(a < b)
                a += liczba1;
            else if(b < a)
                b += liczba2;               
        }
        return a;
    }
    
    public static int zliczaj(int liczba1)
    {
        int a = liczba1;
        int it = 0;
        
        for(int i = 1; i <= a; i++)
        {
            if(a % i == 0)
                it++;
        }
        return it;
    }
    
    public static int[] tablicuj(int liczba1, int liczba2)
    {
        int a = liczba1;
        int it = 0;
        int rozmiar = liczba2;
        int[] tab = new int[rozmiar];
//        System.out.println(rozmiar);
        
        for(int i = 0; i < rozmiar; i++)
        {
            for(int j = 1 + it; j <= a; j++)
            {
                it++;
                if(a % j == 0)
                {
                    tab[i] = j;
//                    System.out.println("Dzielnik do wpisania: " + j + " na indeksie tablicy numer: " + i);
                    break;
                }    
            }
//            System.out.println("Pole w tablicy obsadzone numer: " + i);
        }
        return tab;
    }
    
    public static int[] znajdzWsp(int[] tab, int[] tab2){
        
        // ZLICZANIE ELEMENTOW WSPOLNYCH W CELU OKRESLENIA ROZMIARU NOWEJ TABLICY
        int rozmiarNowej = 0;                                                           // licz - tutaj rozmiar tablicy wspolneAB
        int it = 0;

        for(int i = 0; i < tab.length; i++)
        {
            for(int j = 0; j < tab2.length; j++)
                if(tab[i] == tab2[j])
                {
                    rozmiarNowej++;
                    break;
                }    
        }

        // ZAPISANIE NOWEJ TABLICY WARTOSCIAMI A, KTORE WYSTAPILY TEZ W B
        int[] wspolneAB = new int[rozmiarNowej];                                    // inicjalizacja tablicy wspolneAB o rozmiarze dlugosc
        for(int i = 0; i < tab.length; i++)
        {
            for(int j = 0; j < tab2.length; j++)
            {
                if(tab[i] == tab2[j])
                {
//                    System.out.println("Element wspolny tablicy A " + tab[i] + " z miejsca " + i + " jest rowny elementowi " + tab2[j] + " z polozenia " + j);
                    wspolneAB[it] = tab2[j];
//                    System.out.println("Iterator ma wskazanie: " + it);
                    it++;
                    break;
                }
            }    
        }
        return wspolneAB;
    }
    
    public static int znajdzMax(int[] tab){
        
        int zmienna = 0;
        for(int i = 0; i < tab.length; i++)
            {
                if(tab[i] > zmienna)
                    zmienna = tab[i];
            }
        return zmienna;
    }
    
    public static int najWD(int liczba1, int liczba2){
        
        int a = liczba1;
        int b = liczba2;
        
        int c = zliczaj(a);                                                     // ROZMIAR TABLICY NA DZIELNIKI LICZBY 1
        int d = zliczaj(b);                                                     // ROZMIAR TABLICY NA DZIELNIKI LICZBY 2
        int[] tab = tablicuj(a, c);                                             // TABLICA Z DZIELNIKAMI LICZBY 1
        int[] tab2 = tablicuj(b, d);                                            // TABLICA Z DZIELNIKAMI LICZBY 2
        wypiszTab(tab);
        wypiszTab(tab2);
        int[] tab3 = znajdzWsp(tab, tab2);                                      // STWORZENIE TABLICY WSPOLNYCH DZIELNIKOW
        wypiszTab(tab3);
        int wynik = znajdzMax(tab3);                                            // WYSZUKANIE NWD Z TABLICY WSPOLNYCH DZIELNIKOW 
        
        return wynik;
}
    
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Najmniejsza wspolna wielokrotnosc to: " + najWW(3, 5));
        System.out.println("Najwiekszy wspolny dzielnik to: " + najWD(75, 5));
        System.out.println("Wartosc wyrazu ciagu Fibonacciego dla podanej liczby to: " + wyrazCiaguFibonacciegoRekurencyjnie(8));
        System.out.println("Wartosc wyrazu ciagu Fibonacciego dla podanej liczby to: " + wyrazCiaguFibonacciego(8));
        
            // MNOZENIE TABLICY DWUWYMIAROWEJ PRZEZ WEKTOR W POSTACI TABLICY

            int[][] tablica = {
                {4,3,2},
                {1,1,2},
                {5,2,1}
        };
            int[] mnoznik = {3,2,1};
            for(int i = 0; i < tablica.length; i++)
            {
                for(int j = 0; j < tablica[i].length; j++)
                {
                    tablica[i][j] *= mnoznik[j];
                }
            }
        System.out.println(Arrays.deepToString(tablica));

        // TWORZENIE DWUWYMIAROWEJ TABLICY Z ELEMENTOW OKALAJACYCH SRODKOWY I ZMNIEJSZAJACYCH SIE O W MIARE ODDALANIA OD SRODKA

        int a = 5;
        int[][] tab = new int[2 * a + 1][2 * a + 1];

        for(int i = 0; i < tab.length; i++)
        {
            for(int j = 0; j < tab[i].length; j++)
            {
                if( i + j <= 2 * a)
                    if(i <= j)
                    {
                        tab[i][j] = i;
                    }
                    else
                    {
                        tab[i][j] = j;
                    }
                else
                {
                    if(i >= j)
                    {
                        tab[i][j] = 2 * a - i;
                    }
                    else
                    {
                        tab[i][j] = 2 * a - j;
                    }
                } 
            }
        }

        // WYSWIETLENIE TABLICY
        for(int i = 0; i < tab.length; i++)
        {
            for(int j = 0; j < tab[i].length; j++)
            {
//                System.out.print(tab[i][j] + "  ");
            }
//            System.out.println();
        }
        System.out.println();

//        System.out.println(Arrays.deepToString(tab));

        // ODWROCENIE POPRZEDNIEJ DWUWYMIAROWEJ TABLICY Z POPRZEDNIEGO PRZYKLADU

        int b = 5;
        int[][] tab2 = new int[2 * b + 1][2 * b + 1];

        for(int i = 0; i < tab2.length; i++)
        {
            for(int j = 0; j < tab2[i].length; j++)
            {
                int odGory = i;
                int odLewej = j;
                int odPrawej = 2 * b - j;
                int odDolu = 2 * b - i;

                tab2[i][j] = Math.max(Math.max(odPrawej, odLewej), Math.max(odDolu, odGory)) - b;
//                System.out.print(tab2[i][j] + "  ");
            }
//            System.out.println();
        }
    
    
    }
}
