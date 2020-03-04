package zajecia5bootcamp;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main5 {
       
    public static void main(String[] args) throws FileNotFoundException {

        //  OPERACJE NA PLIKACH
        
        File file = new File("dane1");
        
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine())
            System.out.println(sc.nextLine());
        
        sc.close();
        
        PrintWriter pw = new PrintWriter("dane1");
        pw.println("Hello");
        pw.close();

            Scanner input = new Scanner(new File("dane1"));
            PrintWriter output = new PrintWriter("result");
            
            while(input.hasNextLine())
                output.println(input.nextLine());
            
            output.close();
            input.close();
        
            /*
            package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String listaProduktow = new String();
        //Trzeba tworzyć Scanner dla każdego źródła z osobno!!!
        Scanner inputFromFile = new Scanner(new File("plik.txt"));
        Scanner inputFromConsole = new Scanner(System.in);
        //Odczyt nowej listy produktów z pliku
        while (inputFromFile.hasNextLine()) {
            listaProduktow += inputFromFile.nextLine();
            listaProduktow += "\n";
        }
        inputFromFile.close();
        System.out.println("Aktualna lista produktów:");
        System.out.println(listaProduktow);
        //Dodawanie nowych produktów z konsoli
        System.out.print("Dodaj nowy produkt: ");
        listaProduktow += inputFromConsole.nextLine();
        inputFromConsole.close();
        System.out.println("Dodano do listy nowy produkt.");
        //Zapis nowej listy produktów do pliku
        PrintWriter pw = new PrintWriter("plik.txt");
        pw.println(listaProduktow);
        pw.close();
    }
}
            */

        
        
    
    
    
    
    }
}
