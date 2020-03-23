package pracaDomowa3;

public class MainPracaDomowa3 {

    public static void wypiszTab(int[] tab){
        if(tab.length == 0)
            System.out.println("Tablica jest pusta");
        else{
            System.out.println("Elementy tablicy to: ");
            for(int i = 0; i < tab.length; i++)
                System.out.print(tab[i] + " ");
            System.out.println();
        }
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
    
    // OKRESLENIE ROZMIARU TABLICY KTORA POWSTANIE Z NIEPOWTARZAJACYCH SIE WEWNETRZNIE ELEMENTOW TABLICY MACIERZYSTEJ
    public static int liczIleRoznychLiczbWTablicy(int[] tab){
        int it = 0;
        int zmienna = 0;
        boolean czyBreak = false;
        if(tab.length == 0)
            ;
        else{
            for(int i = 0; i < tab.length; i++){
                czyBreak = false;
        	zmienna = 0;
            	for(int j = i + 1; j < tab.length && !czyBreak; j++){
    	            if(tab[i] == tab[j]){
//    	            	System.out.printf("Element %d znajdujacy sie na pozycji %d pokrywa sie z tym samym %d na pozycji %d", tab[i], i, tab[j], j);
//    	            	System.out.println();
    	            	zmienna++;
    	                czyBreak = true;
    	            }
            	}
            	if(zmienna == 0)
            		it++;
            }
        }
//        System.out.println("W tablicy jest " + it + " roznych elementow");
        return it;
    }
    
    // STWORZENIE TABLICY KTORA SKLADA SIE Z NIEPOWTARZAJACYCH SIE WEWNETRZNIE ELEMENTOW TABLICY MACIERZYSTEJ
    public static int[] utworzTabliceLiczb(int[] tablica, int rozmiar){
    	int it = 0;
    	boolean czyPowtarza = false;
        int zmienna = 0;
        int przechowalnik = 0;
        int[] tab = new int[rozmiar];
        if(tablica.length == 0)
        	return tablica;
        else {
            for(int i = 0; i < tablica.length; i++){
        	zmienna = 0;
        	przechowalnik = 0;
        		
        	// PRZESZUKANIE WSZYSTKICH ELEMENTOW j KOPII TABLICY LICZAC OD ELEMENTU i + 1 NASTEPUJACEGO PO OBECNIE ROZPATRYWANYM W TABLICY MACIERZYSTEJ
            	for(int j = i + 1; j < tablica.length; j++){
    	            if(tablica[i] == tablica[j] && zmienna < 1){
//    	            	System.out.printf("Element %d znajdujacy sie na pozycji %d pokrywa sie z tym samym %d na pozycji %d", tablica[i], i, tablica[j], j);
//    	            	System.out.println();
    	            	zmienna++;
    	            }
            	}
            	
            	// JESLI PO PRZESZUKANIU KOPII TABLICY DLA DANEGO ELEMENTU NIE WYSTEPUJE POWTORZENIE FLAGOWANE zmienna 
            	// TO NA PIERWSZY INDEKS it DOCELOWEJ TABLICY tab WJEZDZA TEN ELEMENT 
            	if(zmienna == 0){
            		tab[it] = tablica[i];
//            		System.out.println(it);
//            		System.out.println("Wartosc: " + tab[it] + " trafia na miejsce " + it);
            		it++;
            	}
            }
            tab[tab.length - 1] = tablica[tablica.length - 1];        	
        }
        return tab;
    }
    
    public static int[] znajdzWsp(int[] tab, int[] tab2){
        
        // ZLICZANIE ELEMENTOW WSPOLNYCH W CELU OKRESLENIA ROZMIARU NOWEJ TABLICY (WSZYSTKIE ELEMENTY Z TAB1 i TYLKO POWTARZAJACE SIE Z TAB2)
        int rozmiarNowej = 0;                                                           // licz - tutaj rozmiar tablicy wspolneAB
        int it = 0;
        boolean czyBreak = false;

        if(tab.length == 0)
        	return tab;
        else if(tab2.length == 0)
        	return tab2;
        
        for(int i = 0; i < tab.length; i++){
            czyBreak = false;
            for(int j = 0; j < tab2.length && !czyBreak; j++)
                if(tab[i] == tab2[j]){
                    rozmiarNowej++;
                    czyBreak = true;
                }    
        }

        // ZAPISANIE NOWEJ TABLICY WARTOSCIAMI A, KTORE WYSTAPILY TEZ W B
        int[] wspolneAB = new int[rozmiarNowej];                                    // inicjalizacja tablicy wspolneAB o rozmiarze dlugosc
        for(int i = 0; i < tab.length; i++){
            czyBreak = false;
            for(int j = 0; j < tab2.length && !czyBreak; j++){
                if(tab[i] == tab2[j]){
//                    System.out.println("Element wspolny tablicy A " + tab[i] + " z miejsca " + i + " jest rowny elementowi " + tab2[j] + " z polozenia " + j);
                    wspolneAB[it] = tab2[j];
//                    System.out.println("Iterator ma wskazanie: " + it);
                    it++;
                    czyBreak = true;
                }
            }    
        }
        return wspolneAB;
    }
    
    public static int liczRozmiarAMinusB(int[] tab, int[] tab2){
        
// ZLICZANIE ELEMENTOW WSPOLNYCH W CELU OKRESLENIA ROZMIARU NOWEJ TABLICY (WSZYSTKIE ELEMENTY Z TAB1 MINUS POWTARZAJACE SIE Z TAB2)
        int rozmiarNowej = 0;      // rozmiar tablicy A - B
        int it = 0;
        boolean czyBreak = false;

        if(tab.length == 0)
            return rozmiarNowej;
        else if(tab2.length == 0)
            return tab.length;
        
        for(int i = 0; i < tab.length; i++){
            czyBreak = false;
            for(int j = 0; j < tab2.length && !czyBreak; j++)
                if(tab[i] == tab2[j]){
                    it++;
                    czyBreak = true;
                }    
        }
        rozmiarNowej = tab.length - it;     // Pomniejszamy rozmiar pierwotnej tablicy o ilosc powtorzen elementow miedzy tablica A i B
        return rozmiarNowej;
    }
    
    public static int liczRozmiarASumaB(int[] tab, int[] tab2){
        
// ZLICZANIE ELEMENTOW WSPOLNYCH W CELU OKRESLENIA ROZMIARU NOWEJ TABLICY (WSZYSTKIE ELEMENTY Z TAB1 MINUS POWTARZAJACE SIE Z TAB2)
        int rozmiarNowej = 0;      // rozmiar tablicy B - A
        int it = 0;
        int zmienna = 0;
        boolean czyBreak = false;

        if(tab.length == 0)
            return tab2.length;
        else if(tab2.length == 0)
            return tab.length;
        
        for(int i = 0; i < tab.length; i++){
            zmienna = 0;
            czyBreak = false;
            for(int j = 0; j < tab2.length && !czyBreak; j++)
                if(tab[i] == tab2[j]){
                    zmienna++;                    
                    czyBreak = true;
                }
            if(zmienna == 0)
                it++;
        }
        rozmiarNowej = tab2.length + it;   // Pomniejszamy rozmiar sumy rozmiarow tablic A i B o ilosc powtorzen elementow miedzy tablica A i B
        return rozmiarNowej;
    }
    
    public static int[] znajdzRozne(int[] tab, int[] tab2){
        
        // ALGORYTM REALIZUJACY A - B
        int rozmiarNowej = 0;                                                   // rozmiar tablicy A - B
        int it = 0;
        boolean czyBreak = false;
        int zmienna = 0;
        
        rozmiarNowej = liczRozmiarAMinusB(tab, tab2);
        
        // ZAPISANIE NOWEJ TABLICY WARTOSCIAMI Z TABLICY A, KTORE ZOSTALY POMNIEJSZONE O PULE ELEMENTOW Z TABLICY B
        int[] aMinusB = new int[rozmiarNowej];                                  // inicjalizacja tablicy A - B o rozmiarze rozmiarNowej
        for(int i = 0; i < tab.length; i++){
            zmienna = 0;
            czyBreak = false;
            for(int j = 0; j < tab2.length && !czyBreak; j++){
                if(tab[i] == tab2[j]){
//                    System.out.println("Element wspolny tablicy A " + tab[i] + " z miejsca " + i + " jest rowny elementowi " + tab2[j] + " z polozenia " + j);
                    zmienna++;                   
                    czyBreak = true;
                }
            }
            if(zmienna == 0){
                aMinusB[it] = tab[i];
                it++;                    
            }
        }
        return aMinusB;
    }
    
    public static int[] sumujAB(int[] tab, int[] tab2, int dlugosc){
        int it = 0;
        int zmienna = 0;
        boolean czyBreak = false;
        int[] sumaAB = new int[dlugosc];
                
        for(int i = 0; i < tab2.length; i++){                                    // PRZEPISANIE ELEMENTOW TABLICY B DO NOWEJ TABLICY
            sumaAB[i] = tab2[i];
            it++;
        }

        for(int i = 0; i < tab.length; i++){                                     // UZUPELNIENIE NOWEJ TABLICY sumaAB ELEMENTAMI WYSTEPUJACYMI TYLKO W TABLICY A
            zmienna = 0;
            czyBreak = false;
            for(int j = 0; j < tab2.length && !czyBreak; j++){
                if(tab[i] == tab2[j]){
                    zmienna++;
                    czyBreak = true;
                }   
            }
            if(zmienna == 0){
                sumaAB[it] = tab[i];
                it++;
            }
        }
        return sumaAB;        
    }
    
    public static int znajdzMax(int[] tab){
        int zmienna = 0;
        for(int i = 0; i < tab.length; i++){
                if(tab[i] > zmienna)
                    zmienna = tab[i];
            }
        return zmienna;
    }
    
    public static int znajdzMin(int[] tab){
        int zmienna = tab[0];
        for(int i = 0; i < tab.length; i++){
                if(tab[i] < zmienna)
                    zmienna = tab[i];
            }
        return zmienna;
    }
    
    public static int[] sortMin(int[] tab){ 
	if(tab.length == 0)
        	return tab;
        
        int[] tabPom = new int[tab.length];
	tabPom[0] = znajdzMin(tab);
		
        int zmienna = znajdzMax(tab);
        int a = zmienna;
        for(int i = 1; i < tabPom.length; i++){
	    zmienna = a;
            for(int j = 0; j < tab.length; j++){
	        if(tab[j] < zmienna && tab[j] > tabPom[i - 1])
	            zmienna = tab[j];
	        }
            tabPom[i] = zmienna;
        }
        return tabPom;
    }
    
    public static int[] wspolneAB(int[] tablica1, int[] tablica2){
        System.out.println("OBLICZ A n B");
        if(tablica1.length == 0)
        	return tablica1;
        else if(tablica2.length == 0)
        	return tablica2;
        
        wypiszTab(tablica1);
        wypiszTab(tablica2);
        
        int ileRoznychLiczb1 = liczIleRoznychLiczbWTablicy(tablica1);           // ROZMIAR TABLICY ROZNE LICZBY
        int ileRoznychLiczb2 = liczIleRoznychLiczbWTablicy(tablica2);

        int[] tab1 = utworzTabliceLiczb(tablica1, ileRoznychLiczb1);   		// TABLICA ROZNYCH LICZB (CZYLI USUWA WEWNETRZNIE POWTARZAJACE SIE ELEMENTY W TABLICY)
        int[] tab2 = utworzTabliceLiczb(tablica2, ileRoznychLiczb2);
              
        int[] tab3 = sortMin(tab1);						// POSORTOWANA TABLICA ROZNYCH LICZB ROSNACO
        int[] tab4 = sortMin(tab2);
        System.out.println("\nPosortowane elementy pierwszej tablicy ");
        wypiszTab(tab3);
        System.out.println("\nPosortowane elementy drugiej tablicy ");
        wypiszTab(tab4);
        
        int[] tab5 = znajdzWsp(tab3, tab4);                                     // STWORZENIE TABLICY WSPOLNYCH ELEMENTOW
        System.out.println("\nElementy wspolne obu tablic ");
        wypiszTab(tab5);
        System.out.println("\n\n");
        
        return tab5;
    }
    
    public static int[] zbioryAMinusB(int[] tablica1, int[] tablica2){
        System.out.println("OBLICZ A - B");
        if(tablica1.length == 0){
            System.out.println("Tablica A byla pusta");
            return tablica1;
        }
        else if(tablica2.length == 0){
            System.out.println("Pozostaje ci cala tablica A");	
            wypiszTab(tablica1);
            return tablica1;
        }
        
        wypiszTab(tablica1);
        wypiszTab(tablica2);
        
        int ileRoznychLiczb1 = liczIleRoznychLiczbWTablicy(tablica1);           // ROZMIAR TABLICY ROZNE LICZBY
        int ileRoznychLiczb2 = liczIleRoznychLiczbWTablicy(tablica2);

        int[] tab1 = utworzTabliceLiczb(tablica1, ileRoznychLiczb1);   		// TABLICA ROZNYCH LICZB (CZYLI USUWA WEWNETRZNIE POWTARZAJACE SIE ELEMENTY W TABLICY)
        int[] tab2 = utworzTabliceLiczb(tablica2, ileRoznychLiczb2);
              
        int[] tab3 = sortMin(tab1);						// POSORTOWANA TABLICA ROZNYCH LICZB ROSNACO
        int[] tab4 = sortMin(tab2);
        System.out.println("\nPosortowane elementy pierwszej tablicy ");
        wypiszTab(tab3);
        System.out.println("\nPosortowane elementy drugiej tablicy ");
        wypiszTab(tab4);
        
        int[] tabRozn = znajdzRozne(tab3, tab4);
        if(tabRozn.length > 0){
            System.out.println("\nElementy zbioru A - B");
            wypiszTab(tabRozn);
        }
        else{
            System.out.println("Roznica zbiorow A i B jest zbiorem pustym, a zbior B zawieral sie w zbiorze A");
        }
        System.out.println("\n\n");
        return tabRozn;
    }
    
    public static int[] zbioryBMinusA(int[] tablica1, int[] tablica2){
        System.out.println("OBLICZ B - A");
        if(tablica2.length == 0){
            System.out.println("Tablica B byla pusta");
            return tablica2;
        }
        else if(tablica1.length == 0){
            System.out.println("Pozostaje ci cala tablica B");	
            wypiszTab(tablica2);
            return tablica2;
        }
        
        int ileRoznychLiczb2 = liczIleRoznychLiczbWTablicy(tablica2);           // ROZMIAR TABLICY ROZNE LICZBY
        int ileRoznychLiczb1 = liczIleRoznychLiczbWTablicy(tablica1);

        int[] tab1 = utworzTabliceLiczb(tablica2, ileRoznychLiczb2);   		// TABLICA ROZNYCH LICZB (CZYLI USUWA WEWNETRZNIE POWTARZAJACE SIE ELEMENTY W TABLICY)
        int[] tab2 = utworzTabliceLiczb(tablica1, ileRoznychLiczb1);
              
        int[] tab3 = sortMin(tab1);						// POSORTOWANA TABLICA ROZNYCH LICZB ROSNACO
        int[] tab4 = sortMin(tab2);
        
        int[] tabRozn = znajdzRozne(tab3, tab4);
        if(tabRozn.length > 0){
            System.out.println("\nElementy zbioru B - A");
            wypiszTab(tabRozn);
        }
        else{
            System.out.println("Roznica zbiorow B i A jest zbiorem pustym, a zbior A zawieral sie w zbiorze B");
        }
        System.out.println("\n\n");
        return tabRozn;
    }

    public static int[] sumaAB(int[] tablica1, int[] tablica2){
        System.out.println("OBLICZ A u B");
        if(tablica1.length == 0 && tablica2.length == 0){
            System.out.println("Obie tablice sa puste");
            return tablica1;
        }
        else if(tablica1.length == 0){
            System.out.println("Tablica A byla pusta i wynikiem operacji sumy jest zawartosc zbioru B");
            wypiszTab(tablica2);
            return tablica2;
        }
        else if(tablica2.length == 0){
            System.out.println("Tablica B byla pusta i wynikiem operacji sumy jest zawartosc zbioru A");	
            wypiszTab(tablica1);
            return tablica1;
        }
        
        int ileRoznychLiczb1 = liczIleRoznychLiczbWTablicy(tablica1);           // ROZMIAR TABLICY ROZNE LICZBY
        int ileRoznychLiczb2 = liczIleRoznychLiczbWTablicy(tablica2);

        int[] tab1 = utworzTabliceLiczb(tablica1, ileRoznychLiczb1);   		// TABLICA ROZNYCH LICZB (CZYLI USUWA WEWNETRZNIE POWTARZAJACE SIE ELEMENTY W TABLICY)
        int[] tab2 = utworzTabliceLiczb(tablica2, ileRoznychLiczb2);
              
        int[] tab3 = sortMin(tab1);						// POSORTOWANA TABLICA ROZNYCH LICZB ROSNACO
        int[] tab4 = sortMin(tab2); 
        wypiszTab(tab3);
        wypiszTab(tab4);
        int dlugosc = liczRozmiarASumaB(tab3, tab4);
                    
        int[] sumaAB = sumujAB(tab3, tab4, dlugosc);                            // INICJALIZACJA TABLICY POMOCZNICZEJ sumaAB DLA SUMY A i B O ROZMIARZE dlugosc
        wypiszTab(sumaAB);
        System.out.println("\n\n");
        
        return sumaAB;
    }
    
    public static int silnia(int n){
        int wynik = 1;
        int wyrazPoprzedni = 1;
        if(n == 0)
            wynik = 1;
        else if(n > 0){
            for(int i = 1; i <= n; i++){
                wynik *= wyrazPoprzedni;
                wyrazPoprzedni = i;
            }
        }
        return wynik;
    }
        
    public static void main(String[] args){

    	int tablica[] = {3,3,9,1,5,2,9,1,7};
    	int tablica1[] = {3,3,3,9,1,1,2,1,1,2,3,9,9,3,2,1,1,1}; 
        
    	wspolneAB(tablica, tablica1);                                           // A n B
        int[] prim = zbioryAMinusB(tablica, tablica1);                          // A - B    - > pierwsze zadanie domowe
        int[] bis = zbioryBMinusA(tablica, tablica1);                           // B - A
        sumaAB(tablica, tablica1);                                              // A u B
        System.out.println("OBLICZ CZESC NIEWSPOLNA DLA ZBIOROW A i B PO DALSZYCH PRZEKSZTALCENIACH OPISYWANYCH JAKO A = (A - B) ^ B = (B - A)");
        int[] czescNiewspolnaAB = sumaAB(prim, bis);                            //(A - B) u (B - A) = (A u B) - (A n B)     - > drugie zadanie domowe
        System.out.println(silnia(6));
        
            	double a = 0;
    	while( 1 > 0)
    		a += 100000000;
    }
}
