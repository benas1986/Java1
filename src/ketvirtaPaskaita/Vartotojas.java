package ketvirtaPaskaita;

import java.util.Comparator;

/**
 * Created by Lina on 2017.06.09.
 */
public class Vartotojas implements Comparable<Vartotojas> {
    private String vardas;
    private String pavarde;
    private int amzius;
    private String miestas;

    public Vartotojas(String vardas, String pavarde, int amzius, String miestas) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.amzius = amzius;
        this.miestas = miestas;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public int getAmzius() {
        return amzius;
    }

    public void setAmzius(int amzius) {
        this.amzius = amzius;
    }

    public String getMiestas() {
        return miestas;
    }

    public void setMiestas(String miestas) {
        this.miestas = miestas;
    }

    @Override
    public String toString() {
        return "Vartotojas{" +
                "vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", amzius=" + amzius +
                ", miestas='" + miestas + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vartotojas that = (Vartotojas) o;

        if (amzius != that.amzius) return false;
        if (vardas != null ? !vardas.equals(that.vardas) : that.vardas != null) return false;
        return (pavarde != null ? pavarde.equals(that.pavarde) : that.pavarde == null) && (miestas != null ? miestas.equals(that.miestas) : that.miestas == null);
    }

    @Override
    public int hashCode() {
        int result = vardas != null ? vardas.hashCode() : 0;
        result = 31 * result + (pavarde != null ? pavarde.hashCode() : 0);
        result = 31 * result + amzius;
        result = 31 * result + (miestas != null ? miestas.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Vartotojas o) {
        return pavarde.compareTo(o.getPavarde());
    }

    public static Comparator<Vartotojas> sortByVardas = new Comparator<Vartotojas>() {
        @Override
        public int compare(Vartotojas o1, Vartotojas o2) {
            return o1.getVardas().compareTo(o2.getVardas());
        }
    };

    public static Comparator<Vartotojas> sortByPavarde = new Comparator<Vartotojas>() {
        @Override
        public int compare(Vartotojas o1, Vartotojas o2) {
            return o1.getPavarde().compareTo(o2.getPavarde());
        }
    };

}

