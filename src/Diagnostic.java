import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Diagnostic extends Acte{
    private ArrayList<Maladie> listMaladies;

    public Diagnostic( String nomMedecin) {
        super( nomMedecin);
        this.listMaladies = new ArrayList<>();
    }

    public ArrayList<Maladie> getlistMaladies() {
        return listMaladies;
    }

    public void ajouterMaladie(Maladie maladie){
        listMaladies.add(maladie);
    }
    public void retirerMaladie(Maladie maladie){
        listMaladies.remove(maladie);
    }

    public String afficherDiagnostic() {
        return "Diagnostic{" +
                "Nom du Medecin : " + nomMedecin +
                "Date du Diagonstic : " + dateActe +
                "Liste des maladis : {\n " + listMaladies +
                "} \n}";
    }
}
