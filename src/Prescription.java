import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Prescription {
    private String nomPres;
    private String datePres;
    private ArrayList<Soin> listSoin;
    private ArrayList<Medicament> listMedicament;

    public String getNomPres() {
        return nomPres;
    }

    public void setNomPres(String nomPres) {
        this.nomPres = nomPres;
    }

    public String getDatePres() {
        return datePres;
    }

    public void setDatePres(String datePres) {
        this.datePres = datePres;
    }

    public ArrayList<Soin> getListSoin() {
        return listSoin;
    }

    public void setListSoin(ArrayList<Soin> listSoin) {
        this.listSoin = listSoin;
    }

    public ArrayList<Medicament> getListMedicament() {
        return listMedicament;
    }

    public void setListMedicament(ArrayList<Medicament> listMedicament) {
        this.listMedicament = listMedicament;
    }

    public Prescription(String nomPres) {
        this.nomPres = nomPres;
        Date date = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy HH-mm");
        this.datePres = formatDate.format(date);
        this.listSoin = new ArrayList<>();
        this.listMedicament = new ArrayList<>();
    }

    public void ajouterElement (Medicament medicament){listMedicament.add(medicament);}
    public void retirerElement (Medicament medicament){listMedicament.remove(medicament);};
    public void ajouterElement (Soin soin){
        listSoin.add(soin);
    }
    public void retirerElement (Soin soin){
        listSoin.remove(soin);
    }
    public String afficherListMedicament() {
        String List = "Liste de Medicaments : {";
            for (Medicament medicament: this.listMedicament) {
                List = List + "\n    " + medicament.toString() ;
            }
            return List + "\n  }";
    }
    public String afficherListSoin() {
            String List = "Liste de Soins: {";
            for (Soin soin: this.listSoin) {
                List = List + "\n    " + soin.toString() ;
            }
            return List + "\n  }";
    }

    @Override
    public String toString() {
        return "Prescription : { \n" +
                "  nom: " + nomPres + '\n' +
                "  date de prescription: " + datePres + '\n' +
                "  " + afficherListSoin() + "\n" +
                "  " + afficherListMedicament()  + "\n" +
                "}";
    }

}
