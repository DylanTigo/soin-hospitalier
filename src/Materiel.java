public class Materiel {
    private String nomMat;
    private int qteMat;

    public Materiel(String nomMat, int qteMat) {
        this.nomMat = nomMat;
        this.qteMat = qteMat;
    }

    public String toString() {
        return "{ " +
                "nom du Materiel: '" + nomMat + '\'' +
                ", quantité de Matériel: " + qteMat +
                '}';
    }

    public String getNomMat() {
        return nomMat;
    }

    public void setNomMat(String nomMat) {
        this.nomMat = nomMat;
    }

    public int getQteMat() {
        return qteMat;
    }

    public void setQteMat(int qteMat) {
        this.qteMat = qteMat;
    }
}
