public class Patient {
    private String nom;
    private String prenom;
    private String sexe;
    private Prescription prescription;
    private Diagnostic diagnostic;

    public Patient(){

    }
    public Patient(String nom, String prenom, String sexe, Prescription prescription, Diagnostic diagnostic) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.prescription = prescription;
        this.diagnostic = diagnostic;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public Diagnostic getDiagnostic() {
        return diagnostic;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public void setDiagnostic(Diagnostic diagnostic) {
        this.diagnostic = diagnostic;
    }
}
