public class Maladie {
    private String nomMal;
    private String causeMal;

    public Maladie(String nomMal, String causeMal) {
        this.nomMal = nomMal;
        this.causeMal = causeMal;
    }

    @Override
    public String toString() {
        return "{" + "nom de la maladie: '" + nomMal + '\'' +
                ", cause de la maladie: '" + causeMal + '\'' +
                '}';
    }

    public String getNomMal() {
        return nomMal;
    }

    public void setNomMal(String nomMal) {
        this.nomMal = nomMal;
    }

    public String getCauseMal() {
        return causeMal;
    }

    public void setCauseMal(String causeMal) {
        this.causeMal = causeMal;
    }
}
