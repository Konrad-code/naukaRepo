package kartkowka1;

public class Jedi {
    private Miecz miecz;
    private int moc;
    private String nazwa;
    
    public Jedi(String nazwa, Miecz miecz, int moc){
        this.miecz = miecz;
        this.moc = moc;
        this.nazwa = nazwa;
    }

    public Miecz getMiecz() {
        return miecz;
    }

    public int getMoc() {
        return moc;
    }

    public String getNazwa() {
        return nazwa;
    }

    @Override
    public String toString() {
        return nazwa + "|" + moc + "|" + miecz.getKolor().toString() + "\n";
    }
}
