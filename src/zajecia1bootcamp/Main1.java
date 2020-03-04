package zajecia1bootcamp;

public class Main1 {
    public static void main(String[] args) {
        int liczba = 3;
        int liczbaPowielen = 10;
        int n = 0;
        while(liczbaPowielen > 0){
            System.out.println(n += liczba);
            liczbaPowielen--;
        }
        
        int liczba2 = 455555510;
        int suma2 = 0;
        
        while(liczba2 > 0)
        {
            suma2 += liczba2 % 10;
            liczba2 /= 10;
        }
        System.out.println(suma2);

        // KWADRAT O BOKU WYMIARU X Z LICZB X
        
        int x = 9;
        
        for(int t = 0; t < x; t++)
        {
            for(int j = 0; j < x; j++){
                System.out.print(" " + x + " ");  
            }
            System.out.println();
        }
        
        // 1. RODZAJ PIRAMIDY Z *********
        
        x = 10;        
        for(int p = 0; p < x; p++)
        {
            for(int j = 0; j < x; j++){
                if(j < p)
                System.out.print(" * ");  
            }
            System.out.println();
        }
        System.out.println();
        
        //2. RODZAJ PIRAMIDY Z *********
        
        x = 5;
        for(int p = 0; p < x; p++)
        {
            for(int j = 0; j < x; j++){
                if(p < x - j)
                    System.out.print(" * ");  
            }
            System.out.println();
        }
        System.out.println();
        
        //3. RODZAJ PIRAMIDY Z *********

        x = 7;        
        for(int p = 0; p < x; p++)
        {
            for(int j = 0; j < x; j++){
                if(j < p)
                    System.out.print("   ");
                else
                    System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
        
        // 4. RODZAJ PIRAMIDY Z *********
        
        x = 13;
        for(int p = 0; p < x; p++)
        {
            for(int j = 0; j < x; j++){
                if(j + 1 >= x - p)
                    System.out.print(" * ");
                else
                    System.out.print("   ");  
            }
            System.out.println();
        }
        
        int t = 0, s;
        
        // KWADRAT Z LICZB X Z WYKORZYSTANIEM PETLI WHILE I ZMIENNYCH GLOBALNYCH
        
        while(t < x)
        {
            s = 0;
            while(s < x)
            {
                System.out.print(" " + x + " ");
                s++;
            }
            System.out.println();
            t++;
        }
        
        // SPRAWDZENIE LICZBY CZY JEST DOSKONALA
        
        int liczbaN2 = 28;
        int sumaZew = 0;
        for(int w = 1; w < liczbaN2; w++)
        {
            if(liczbaN2 % w == 0)
            {
                System.out.println(w);
                sumaZew += w;
            }
        }
        System.out.println(sumaZew);
        if(sumaZew == liczbaN2)
            System.out.println("Liczba " + liczbaN2 + " jest liczba doskonala");
        
        // WYSZUKIWANIE 4 PIERWSZYCH LICZB DOSKONALYCH
        
        for(int liczbaN = 2, iterator = 0; iterator < 4; liczbaN++)
        {
            int sumaWew = 0;
            for(int w = 1; w < liczbaN; w++)
            {
                if(liczbaN % w == 0)
                    sumaWew += w;
            }
            if(sumaWew == liczbaN)
            {
                System.out.println("Liczba " + liczbaN + " jest liczba doskonala");
                iterator++;
            }
        }
        
        // ZADANIE DODATKOWE - ALGORYTM ZOPTYMALIZOWANEGO WYSZUKIWANIA LICZB DOSKONALYCH W ZAKRESIE LONGA
        
        int limit = 30;
	long sum = 1;
        long aktualna = 2;
        int number = 2;
        boolean czyPierwsza = false;
        
            for(int w = 1; w < limit; w++)
            {
                sum += aktualna;
                czyPierwsza = true;
                for(int z = 2; z*z <= sum; z++)
                {
                    if(sum % z == 0)
                    {
                        czyPierwsza = false;
                        break;
                    }
                }
                if(czyPierwsza == true)
                    System.out.println(aktualna * sum);
                
                //System.out.print(aktualna + " " + sum + " ");
                //System.out.print(aktualna * sum + "\n");
                
                aktualna *= number;
            }
    }
}
