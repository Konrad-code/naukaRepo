package kartkowka1;

import java.util.Arrays;

public class ZakonJedi {
    private String nazwa;
    private Jedi[] jediSquad;

    public ZakonJedi(String nazwa) {
        this.nazwa = nazwa;
        this.jediSquad = new Jedi[0];
    }

    public String getNazwa() {
        return nazwa;
    }

    public Jedi[] getJediSquad() {
        return jediSquad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
            sb.append("Nazwa zakonu Jedi: " + nazwa + "\n");
            sb.append("\tJedi: " + Arrays.toString(jediSquad));
            return sb.toString();
    }
    
    public void dodajJedi(Jedi jedi) {
        Jedi[] nowiJedi = new Jedi[jediSquad.length + 1];
        for (int i = 0; i < jediSquad.length; i++)
                nowiJedi[i] = jediSquad[i];

        nowiJedi[nowiJedi.length - 1] = jedi;
        jediSquad = nowiJedi;
	}
}
