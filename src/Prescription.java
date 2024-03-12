import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Prescription {
    private String nomPres;
    private String datePres;
    private ArrayList<Soin> listSoin;
    private ArrayList<Medicament> listMedicament;

    public Prescription(String nomPres) {
        this.nomPres = nomPres;
        Date date = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy HH-mm");
        this.datePres = formatDate.format(date);
        this.listSoin = new ArrayList<>();
        this.listMedicament = new ArrayList<>();
    }

    public void ajouterMedicament (Medicament medicament){
        listMedicament.add(medicament);
    }
    public void retirerMedicament(Medicament medicament){
        listMedicament.remove(medicament);
    };
    public void ajouterSoin (Soin soin){
        listSoin.add(soin);
    }
    public void retirerSoin(Soin soin){
        listSoin.remove(soin);
    }
}
