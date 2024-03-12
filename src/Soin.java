import java.util.ArrayList;
import java.util.Date;

public class Soin extends Acte{
    private ArrayList<Materiel> listMaterial;

    public Soin( String nomMedecin) {
        super(nomMedecin);
        this.listMaterial = new ArrayList<>();
    }
    public void ajouterMateriel(Materiel materiel){
        listMaterial.add(materiel);
    }
    public void retirerMateriel(Materiel materiel){
        listMaterial.remove(materiel);
    }
    public String afficherListMateriel() {
        String List = "Liste de Materiels : { ";
        if (this.listMaterial.size() == 0){
            return List + " Auchun Materiels }";
        }
        for (Materiel materiel: this.listMaterial) {
            List = List + materiel.toString() + ", ";
        }
        return List + "\n}";
    }
    @Override
    public String toString() {
        return "Soin { \n" +
                "  Nom du Medecin: " + nomMedecin + "\n" +
                "  Date du Diagonstic: " + dateActe + "\n" +
                "  " + this.afficherListMateriel();
    }
}
