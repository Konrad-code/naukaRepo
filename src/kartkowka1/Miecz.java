package kartkowka1;

import java.awt.Color;

public class Miecz {
    private String kolor;
    
    public Miecz(String kolor){
        this.kolor = kolor;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    @Override
    public String toString() {
        return "Miecz{" + "kolor = " + kolor + '}';
    }
    
}
