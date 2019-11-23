package nauka;

public class ProgramowanieObiektowe {

    public static void main(String[] args)
    {
        Punkt p;
        p = new Punkt();
        
        p.x = 5;
        p.y = 20;
        
        System.out.println("p.x = " + p.x);
        System.out.println("p.y = " + p.y);
        
        Punkt r = new Punkt(10, 15);
        System.out.println(r.x);
        System.out.println(r.y);
    }
    
}

class Punkt
{
    Punkt()
    {
        System.out.println("Wywołano konstruktor domyślny");
        x = 20;
        y = 20;
    }
    Punkt(int pierwszy, int drugi)
    {
        x = pierwszy;
        y = drugi;
    }
    int x;
    int y;
}