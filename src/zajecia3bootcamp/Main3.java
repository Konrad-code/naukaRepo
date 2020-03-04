package zajecia3bootcamp;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        String str1 = "Komputer";
        
        System.out.println(str1.charAt(1));
        System.out.println(str1.contains("uter"));
        str1 = str1.concat(" jest firmy Lenovo");
        System.out.println(str1);
        System.out.println(str1.endsWith("er"));
        
        str1 = "Java";
        System.out.println(str1.equals("JaVa"));
        System.out.println(str1.equalsIgnoreCase("jaVa"));
        System.out.println(str1.indexOf("a"));
        System.out.println(str1.lastIndexOf("a"));
        System.out.println(str1.length());
        
        str1 = str1.replace('a', '+');
        str1 = str1.replace("v", "");
        System.out.println(str1);
        
        String strJava = "Java";
        
        //strJava = strJava.replace(strJava.charAt(0), strJava.charAt(2));
        //System.out.println(strJava);
        
        System.out.println(strJava.replaceAll("a", "j"));
        System.out.println(strJava.startsWith("Jav"));
        
        strJava = strJava.concat(" jest firmy Lenovo");
        
        System.out.println(strJava.substring(1));
        System.out.println(strJava.substring(5, 10));
        System.out.println(strJava.toLowerCase());
        System.out.println(strJava.toUpperCase());
        System.out.println(Arrays.toString(strJava.split(" ")));
        System.out.println(Arrays.toString(strJava.toCharArray()));
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("Java");
        sb.append(" to");
        sb.append(" moj");
        sb.append(" ulubiony jezyk programowania!");
        
        String wynik = sb.toString();
        System.out.println(wynik);
        
        sb.delete(5, 10);
        System.out.println(sb);
        
        sb.insert(5, "to mo");
        System.out.println(sb);
        
        sb.reverse();
        System.out.println(sb);
        
        int[] pierwszaTablica = new int[10];
        int wynik2 = 0;
        int wynik3 = 0;
        for(int i = 0; i < pierwszaTablica.length; i++){
            pierwszaTablica[i] = (int)((Math.random() * 11) - 5);
        }
        System.out.println("\nPierwsza tablica sklada sie z elementow: ");
        for(int i = 0; i < pierwszaTablica.length; i++){
            System.out.print(pierwszaTablica[i] + " ");
            wynik2 += pierwszaTablica[i];
        }
        System.out.println("Suma elementow tablicy to: " + wynik2);
        wynik3 = wynik2 / 10;
        System.out.println("Srednia arytmetyczna elementow tablicy to: " + wynik3);
        
        for(int i = pierwszaTablica.length - 1; i >= 0; i--){
            if(pierwszaTablica[i] >= 0)
            System.out.print(pierwszaTablica[i] + " ");
        }
        System.out.println();
        
        // TABLICE CZESC NIEWSPOLNA A i B DO DOMU oraz A - B DO DOMU
        
        // TABLICE WSPOLNE A i B
        
        //int[] tab1 = new int[]{1, 10, 20, 30, 0, 30, 20, 10, 1, 1, 2, 3, 4, 105, 109, 110};                 // 12
        //int[] tab2 = new int[]{1, 10, 2, 0, 0, 30, 20, 10, 1, 1, 2, 4, 3, 15, 19, 20, 20, 20, 20, 20};      // 19
        
        int[] tab1 = new int[]{1, 10, 20};
        int[] tab2 = new int[]{10, 15, 12, 30, 45, 0, 1, 20}; 
        System.out.println("Tablica A sklada sie z elementow: " + Arrays.toString(tab1));
        System.out.println("Tablica A sklada sie z elementow: " + Arrays.toString(tab2));
        
        int rozmiar = 0, it = 0;
        
        // ZLICZANIE ELEMENTOW WSPOLNYCH W CELU OKRESLENIA ROZMIARU NOWEJ TABLICY
        for(int i = 0; i < tab1.length; i++)
        {
            for(int j = 0; j < tab2.length; j++)
                if(tab1[i] == tab2[j])
                {
                    rozmiar++;
                    break;
                }    
        }
        
        // ZAPISANIE NOWEJ TABLICY WARTOSCIAMI A, KTORE WYSTAPILY TEZ W B
        int[] wspABTab = new int[rozmiar];
        for(int i = 0; i < rozmiar; i++)
        {
            for(int j = 0; j < tab2.length; j++)
                if(tab1[i] == tab2[j])
                {
                    wspABTab[it] = tab2[j];
                    it++;
                    break;
                }
        }
        
        //WYSWIETLENIE TABLICY ELEMENTOW WSPOLNYCH A i B
        System.out.println("Rozmiar tablicy A suma B (alfa) to: " + rozmiar);
        System.out.println("Tablica elementow wspolnych dla A i B: ");
        for(int i = 0; i < wspABTab.length; i++)
        {
            System.out.print(wspABTab[i] + " ");
        }
        System.out.println();
        
        // TABLICE A - B
        
//        for(int i = 0; i < tab1.length; i++)
//        {
//            for(int j = 0; j < tab2.length; j++)
//                if(tab1[i] == tab2[j])
//                {
//                    System.out.println(tab1[i]);
//                    counter1++;
//                    System.out.println(counter1);
//                    break;
//                }    
//        }
//        int[] counter = new int[counter1];
//        for(int i = 0; i < counter1; i++)
//        {
//            for(int j = 0; j < tab2.length; j++)
//                if(tab1[i] == tab2[j])
//                {
//                    counter[it] = tab2[j];
//                    it++;
//                    break;
//                }
//        }
//        
//        System.out.println(counter1);
//        
//        for(int i = 0; i < counter.length; i++)
//        {
//            System.out.print(counter[i] + " ");
//        }
        
        
        
        
        // TABLICE SUMA A i B
        
        int[] tab3 = new int[]{1, 2, 2, 5, 2, 7 , 7, 19};
        int[] tab4 = new int[]{0, 3, 2, 3, 3, 7, 5, 10, 10, 8, 89, 1};
        
        System.out.println("\nNowa tablica A sklada sie z elementow: " + Arrays.toString(tab3));
        System.out.println("Nowa tablica B sklada sie z elementow: " + Arrays.toString(tab4));
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        // NAJPIERW LICZYMY CZESC WSPOLNA ZBIOROW A i B
        // ZLICZANIE ELEMENTOW WSPOLNYCH W CELU OKRESLENIA ROZMIARU NOWEJ TABLICY
        int licz = 0;                                                           // licz - tutaj rozmiar tablicy wspolneAB
        it = 0;
//        int przechowalnik = 0;
        for(int i = 0; i < tab3.length; i++)
        {
            for(int j = 0; j < tab4.length; j++)
                if(tab3[i] == tab4[j])
                {
                    licz++;
                    break;
                }    
        }
        
        // ZAPISANIE NOWEJ TABLICY WARTOSCIAMI A, KTORE WYSTAPILY TEZ W B
        int[] wspolneAB = new int[licz];                                    // inicjalizacja tablicy wspolneAB o rozmiarze dlugosc
        for(int i = 0; i < tab3.length; i++)
        {
            for(int j = 0; j < tab4.length; j++)
                if(tab3[i] == tab4[j])
                {
                    // System.out.println("Element wspolny tablicy A " + tab3[i] + " z miejsca " + i + " jest rowny elementowi " + tab4[j] + " z polozenia " + j);
                    wspolneAB[it] = tab4[j];
                    // System.out.println("Iterator ma wskazanie: " + it);
                    it++;
                    break;
                }
        }
        
        //WYSWIETLENIE TABLICY ELEMENTOW WSPOLNYCH A i B
        System.out.println("Rozmiar tablicy A suma B (alfa) to: " + licz);
        System.out.println("Tablica elementow wspolnych dla A i B: ");
        for(int i = 0; i < wspolneAB.length; i++)
        {
            System.out.print(wspolneAB[i] + " ");
        }
        System.out.println();  
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        int dlugosc = 0;                                                           // WYCZYSZCZENIE ZMIENNEJ WYMIARU TABLICY POMOCNICZEJ dlugosc
        it = 0;
        int przesuniecie = 0;
        dlugosc += (tab3.length + tab4.length);
        
        // ZLICZANIE WIELKOSCI TABLICY NA SUME A i B
        for(int i = 0; i < tab3.length; i++)
        {
            for(int j = 0; j < tab4.length; j++)
                if(tab3[i] == tab4[j])
                {   
                    dlugosc--;
                    System.out.println("dlugosc tablicy " + dlugosc);
                    break;
                }
        }
        
        int[] sumaAB = new int[dlugosc];                                     // INICJALIZACJA TABLICY POMOCZNICZEJ sumaAB DLA SUMY A i B O ROZMIARZE counter1
        
        // PRZEPISANIE TABLICY B
        for(int i = 0; i < tab4.length; i++){
            sumaAB[i] = tab4[i]; 
        }
        
        // WPISANIE TABLICY A DO NOWEJ TABLICY JESLI ELEMENT NIE WYSTEPUJE W CZESCI WSPOLNEJ
        for(int i = tab4.length; i < sumaAB.length; i++)                        // tab3.length = 8;    sumaAB.length = 13
        {
            System.out.println("///////////////////////////////////////PETLA I" + i);
            for(int j = 0 + przesuniecie; j < tab3.length; j++)                 // tab4.length = 12
            {
                System.out.println(j);
                it = 0;
                for(int k = 0; k < wspolneAB.length; k++)                       // wspolneAB.length = 7
                {
                    //System.out.println(tab3[j]);
                    System.out.println(wspolneAB[k] + " PETLA J " + tab3[j]);
                    if(tab3[j] == wspolneAB[k])
                    {
                        it++; 
                        System.out.print("Petla K " + it);
                    }
                }
                if(it == 0)
                {
                    przesuniecie++;
                    System.out.println(j + " " + tab3[j] + "TO TU" + i);
                    sumaAB[i] = tab3[j];
                    System.out.println(sumaAB[i]);
                    break;
                }  
                System.out.println("Pozdrawiam mame i tate " + j);
            }   
        }
        
        // WYSWIETLANIE TABLICY CZESCI A SUMA B
        System.out.println("Tablice A i B maja sume " + dlugosc + " elementow\n");
        System.out.println("Tablica A suma B: ");
        for(int i = 0; i < sumaAB.length; i++)
        {
            System.out.print(sumaAB[i] + " ");
        }
    /*
        
        // STATKI

        String p = new String();
        String d = new String();
        int a = 10;
        char b = 'J';
        char s = 'A';
        int c = 0;
        int x = (b - 'A' + 1);
        //System.out.println(x);
        int[] inty = new int[a];
        String[][] statki = new String[a][x];
        for(int i = 0; i < inty.length; i++)
        {
            inty[i] = i + 1;
        }
        
        char[] chary = new char[a];
        for(int i = 0; i <= chary.length-1; i++)
        {
            c = (int)(s++);
            chary[i] = (char)c;
        }
//        for(int i = 0; i < chary.length; i++)
//        {
//            System.out.print(chary[i]);
//        }
        for(int i = 0; i < inty.length; i++)
        {
            d = String.valueOf(inty[i]);
            for(int j = 0; j < chary.length; j++)
            {
                p = Character.toString(chary[j]);
                statki[i][j] = p.concat(d);
                System.out.print(statki[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        // KOLEJNE TABLICE
        
        // IMPLEMENTACJA TABLICY
        a = 5;
        int[][] tab5 = new int[a][a];
        for(int i = 0; i < a; i++)
        {
            for(int j = 0; j < a; j++)
            {
                tab5[i][j] = (int)(Math.random() * 100);
                System.out.print(tab5[i][j] + " ");
            }
            System.out.println();
        }
        
        // REALIZACJA SUMY WIERSZY 
        System.out.println();
        int[] tabWier = new int[a];
        for(int i = 0; i < a; i++)
        {
            c = 0;
            for(int j = 0; j < a; j++)
            {
                c += tab5[i][j];
            }
            tabWier[i] = c;
        }
        
        System.out.println("TABLICA SUM Z WIERSZY");        
        // TABLICA SUM Z WIERSZY
        for(int i = 0; i < tabWier.length; i++)
        {
            System.out.print(tabWier[i] + " ");
        }
        
        // REALIZACJA SUMY KOLUMN 
        int iterator = 0;
        int[] tabKol = new int [a];
        for(int k = 0; k < tabKol.length; k++)
        {    
            c = 0;
            iterator = 0;
            for(int i = 0; i < a; i++)
            {
                for(int j = 0; j < a; j++)
                {
                    if(k == j)
                        c += tab5[i][j];
                }
                iterator++;
            }
            tabKol[k] = c;
        }
        System.out.println();
        
        System.out.println("\nTABLICA SUM Z KOLUMN");
        // TABLICA SUM Z KOLUMN
        for(int i = 0; i < tabKol.length; i++)
        {
            System.out.print(tabKol[i] + " ");
        }
                   
        // REALIZACJA SUMY KOLUMN V2
        System.out.println();
        int[] tabKol2 = new int[a];
        for(int i = 0; i < a; i++)
        {
            c = 0;
            for(int j = 0; j < a; j++)
            {
                c += tab5[j][i];
            }
            tabKol2[i] = c;
        }
        
        System.out.println("\nTABLICA SUM Z KOLUMN V2");
        // TABLICA SUM Z KOLUMN V2
        for(int i = 0; i < tabKol2.length; i++)
        {
            System.out.print(tabKol2[i] + " ");
        }
        //System.out.println(Arrays.deepToString(statki));
        
        System.out.println("\n\nTABLICA SUM Z KOLUMN alternatywne wyswietlenie:  " + Arrays.toString(tabKol2));
        */
    }
}
