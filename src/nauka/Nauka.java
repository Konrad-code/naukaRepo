package nauka;

public class Nauka {

    public static void main(String[] args) {
        
        //TABLICE
        
        int i = 0;
        int[] tab;
        tab = new int[5];
        int[] tab2 = {4, 14, 2, 21, 23, 2};
        
        System.out.println(tab[2]);
        System.out.println(tab2.length);
        System.out.println(tab2[tab2.length - 1]);
        
        int[][] tab3 = new int[4][3];
        
        tab3[0][0] = 21;
        tab3[1][1] = 4;
        tab3[0][1] = 69;
        
        System.out.println(tab3[1][1]);
        System.out.println(tab3[0][0]);
        System.out.println(tab3[0][1]);
        
        int[][] tab4 =
        {
            {4, 15, 17},
            {5, 12, 125},
            {651, 1256, -24}
        };
        
        System.out.println(tab4[1][1]);
        System.out.println(tab4[0][0]);
        System.out.println(tab4[2][2]);
        
        //PĘTLE
        
        String[][] tab5 =
        {
            {"JAVA"},
            {"JAVA APLIKACJE"},
            {"JAVA STRUMIENIE"},
            {"JAVA ASPEKTY ZAAWANSOWANE"},
            {"JAVA ANDROID"},
            {"C#"},
            {"C# TWORZENIE APLIKACJI"},
        };
        
        while(i<tab5.length)
        {
            if(i % 2 == 0)
            System.out.println("W tablicy tab5 pod komorka [" + i + "][0] znajduje sie zawartosc " + tab5[i][0]);
            i++;
        }
    
        for(int b = 0; b < tab5.length; b++)
        {
            System.out.println(tab5[b][0]);
        }
        
        int m = 0;
        int[] tabWielDzies = new int[10];
        while(m<10)
        {
            tabWielDzies[m] = (m + 1) * 10;
            //System.out.println(tabWielDzies[m]);
            m++;
        }
        
        System.out.println(tabWielDzies[8]);
        
        String[] tracklistaMuzykaWspolczesna =
        {
            "Intro (Niki)",
            "Magenta",
            "Obrazy Pollocka",
            "5.07 (Interlude)",
            "2K30 (Ft. Taco Hemingway)",
            "Braincell (Interlude)",
            "Gorzka Woda",
            "Nauczysz się czekać",
            "Zły śpi spokojnie (Ft. Lua Preta & Oskar)",
            "Одиночество (Interlude)",
            "Nie Zobaczysz Łez",
            "Dom",
            "Outro (Ft. Bryndal)",
            "Gorzka Woda (Remix 1) (Ft. KęKę, Paluch, Sokół (PL) & Ten Typ Mes)",
            "Gorzka Woda (Remix 2) (Ft. Jan-rapowanie, Oki, Otsochodzi & Zdechły Osa)",
        };
        
        for(String nazwaUtworu: tracklistaMuzykaWspolczesna)
        {
            System.out.println(nazwaUtworu);
        }
        
        for(String[] zmiennaPierwszegoPoziomu: tab5)
            for(String zmiennaDrugiegoPoziomu: zmiennaPierwszegoPoziomu)
            {
                System.out.println(zmiennaDrugiegoPoziomu);
            } 
    
        for(int pierwszyCzynnik = 1; pierwszyCzynnik <= 10; pierwszyCzynnik++)
        {    
            if(pierwszyCzynnik % 2 == 1)
                continue;
            for(int drugiCzynnik = 1; drugiCzynnik <= 10; drugiCzynnik++)
            {
                if(drugiCzynnik % 2 == 1)
                    continue;
                System.out.print(pierwszyCzynnik * drugiCzynnik + " ");
            }
            System.out.println();
        }
        
        int[] liczby = {1, 12, 41, 12, 51, 12};
        int suma = 0;
        
        /*
        for(int c = 0; c < liczby.length; c++)
        {
            suma = liczby[c] + suma;
        }
        */
        
        for(int zmienna: liczby)
        {
            suma += zmienna;
        }
        
        System.out.println(suma);
    }
    
}
