package kartkowka1;

// WYLICZANIE ILOSCI NACIEC DO WYKONANIA ZALEZNIE OD WYNIKOW GESTOSCI PROBEK I DOPUSZCZALNEJ ILOSCI NACIEC DLA POSZCZEGOLNEGO PACJENTA

public class MainKartkowka {
    
    public static void wypiszTab(int[] tab){
//        System.out.println("Elementy tablicy to: ");
        for(int i = 0; i < tab.length; i++)
            System.out.print(tab[i] + " ");
        System.out.println();
    }
    
    public static void wyswietlWynik(int iloscDopuszczalna, int[] tab)
    {
        int a = podajIlosc(tab);
        System.out.println("Biorac pod uwage dopuszczalna ilosc naciec dla stanu pacjenta w wysokosci: " + iloscDopuszczalna + " pacjent moze miec wykonane " + czySpelnia(iloscDopuszczalna, a) + " naciec.\n");
    }
    
    public static int podajIlosc(int[] tablica)
    {
        int ilosc = 0;                          // ILOSC NACIEC
        int odleglosc = 1;
        int poprzedniaOdleglosc = 0;
        
        for(int i = 1; i < tablica.length; i++)
        {
            if(tablica[i - 1] < tablica[i] && tablica[i] > tablica[i + 1] && poprzedniaOdleglosc < odleglosc)
            {
                    ilosc++;
                    poprzedniaOdleglosc = odleglosc;
                    odleglosc = 0;
            }
            if(ilosc > 0)
            odleglosc++;
        }
        System.out.println("Dla pacjenta o zestawie gestosci probek badanych pod katem stwardnienia bocznego: ");
        wypiszTab(tablica);
        System.out.println("Ilosc naciec do wykonania to: " + ilosc);
        return ilosc;
    }
    
    public static int czySpelnia(int max, int aktualna)
    {
        if(aktualna < max)
            return aktualna;
        else
            return max;
    }
    
    public static void main(String[] args) {
        
        System.out.println("WYLICZANIE ILOSCI NACIEC DO WYKONANIA ZALEZNIE OD WYNIKOW GESTOSCI PROBEK I DOPUSZCZALNEJ ILOSCI NACIEC DLA POSZCZEGOLNEGO PACJENTA\n");
        
        int iloscDopuszczalna1 = 3;
        int iloscDopuszczalna2 = 4;
        int iloscDopuszczalna3 = 3;
        int iloscDopuszczalna4 = 2;

        int[] tab1 = {4,2,3,1,9,6,5,2,1};
        int[] tab2 = {9,2,3,3,2,1,7,2,1,1,6,1,6,0,2,4,5,2};
        int[] tab3 = {6,4,3,4,2,1,4,2,8,1,0};
        int[] tab4 = {6,4,3,4,2,1,4,2,8,1,0};

        
        wyswietlWynik(iloscDopuszczalna1, tab1);
        wyswietlWynik(iloscDopuszczalna2, tab2);
        wyswietlWynik(iloscDopuszczalna3, tab3);
        wyswietlWynik(iloscDopuszczalna4, tab4);
    }
}