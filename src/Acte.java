import java.text.SimpleDateFormat;
import java.util.Date;

public class Acte {
    protected String dateActe;
    protected String nomMedecin;

    public Acte( String nomMedecin) {
        Date date = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy HH-mm");
        this.dateActe = formatDate.format(date);
        this.nomMedecin = nomMedecin;
    }

    public String getDateActe() {
        return dateActe;
    }

    public void setDateActe(String dateActe) {
        this.dateActe = dateActe;
    }

    public String getNomMedecin() {
        return nomMedecin;
    }

    public void setNomMedecin(String nomMedecin) {
        this.nomMedecin = nomMedecin;
    }

    @Override
    public String toString() {
        return "Acte{" +
                "dateActe=" + dateActe +
                ", nomMedecin='" + nomMedecin + '\'' +
                '}';
    }
}
