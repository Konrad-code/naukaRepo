package kartkowka1;

import java.awt.Color;

public class Miecz {
    private Color kolor;
    
    public Miecz(Color kolor){
        this.kolor = kolor;
    }

    public Color getKolor() {
        return kolor;
    }

    public void setKolor(Color kolor) {
        this.kolor = kolor;
    }

    @Override
    public String toString() {
        return "Miecz{" + "kolor = " + kolor + '}';
    }
    
}
