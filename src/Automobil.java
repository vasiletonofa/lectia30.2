import java.util.Objects;

public class Automobil {

    int anProducere;
    String denumire;


    public Automobil(int anProducere, String denumire) {
        this.anProducere = anProducere;
        this.denumire = denumire;
    }

    public int getAnProducere() {
        return anProducere;
    }

    public String getDenumire() {
        return denumire;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Automobil automobil = (Automobil) object;
        return anProducere == automobil.anProducere && Objects.equals(denumire, automobil.denumire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(anProducere, denumire);
    }

    @Override
    public String toString() {
        return "Automobil{" +
                "anProducere=" + anProducere +
                ", denumire='" + denumire + '\'' +
                '}';
    }
}
