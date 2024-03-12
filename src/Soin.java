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
    public String afficherSoin() {
        return "Diagnostic{" +
                "Nom du Medecin : " + nomMedecin +
                "Date du Diagonstic : " + dateActe +
                "Liste des maladis : {\n " + listMaterial +
                "} \n}";
    }
}
