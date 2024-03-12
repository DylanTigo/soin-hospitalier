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
    public String afficherListMaldies(){
        String List = "Liste de Maladies: { ";
        for (Maladie maladie: this.listMaladies) {
            List =  List + "\n    " + maladie.toString();
        }
        return List + "\n  }";
    }
    @Override
    public String toString() {
        return "Diagnostic { " +
                "\n  Nom du Medecin: " + nomMedecin +
                "\n  Date du Diagonstic: " + dateActe +
                "\n  " + afficherListMaldies() +
                "\n}";
    }
}
