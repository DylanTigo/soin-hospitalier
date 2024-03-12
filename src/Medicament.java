public class Medicament {
    private String nomMedicament;
    private int qteMedicament;
    private String unite;
    private int frequence;

    public Medicament(String nomMedicament, int qteMedicament, String unite, int frequence) {
        this.nomMedicament = nomMedicament;
        this.qteMedicament = qteMedicament;
        this.unite = unite;
        this.frequence = frequence;
    }

    public String getNomMedicament() {
        return nomMedicament;
    }

    public void setNomMedicament(String nomMedicament) {
        this.nomMedicament = nomMedicament;
    }

    public int getQteMedicament() {
        return qteMedicament;
    }

    public void setQteMedicament(int qteMedicament) {
        this.qteMedicament = qteMedicament;
    }

    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }

    public int getFrequence() {
        return frequence;
    }

    public void setFrequence(int frequence) {
        this.frequence = frequence;
    }
}
