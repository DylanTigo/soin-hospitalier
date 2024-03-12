import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Diagnostic diagnostic1 = new Diagnostic("Tigomo Dylan");

        //Creation des maladies
        Maladie palu = new Maladie("Paludime", "piqures de moustiques");
        Maladie grippe = new Maladie("Grippe", "virus Influenza");
        Maladie diabète  = new Maladie("Diabète ", "facteurs génétique et mode de vie");

        //ajout des maladies au diagonstic
        diagnostic1.ajouterMaladie(palu);
        diagnostic1.ajouterMaladie(grippe);
        diagnostic1.ajouterMaladie(diabète);

        System.out.println(diagnostic1.toString());

        Soin soin1 = new Soin("Tsakem Noel");
        Materiel compresse = new Materiel("compresse", 4);
        Materiel pince = new Materiel("pince", 1);
        Materiel bétadine = new Materiel("bétadine", 1);

        soin1.ajouterMateriel(compresse);
        soin1.ajouterMateriel(pince);
        soin1.ajouterMateriel(bétadine);
        System.out.println(soin1.toString());

        Medicament para = new Medicament("Paracétamol",1000,"mg",2);
        Medicament effaralgan = new Medicament("Efferalgan",500,"mg",1);
        Medicament codex = new Medicament("Codex",20,"cl",2);
        Prescription prescription1 = new Prescription("PRS001");
        prescription1.ajouterElement(para);
        prescription1.ajouterElement(effaralgan);
        prescription1.ajouterElement(codex);
        System.out.println(prescription1.toString());
        prescription1.retirerElement(para);

        System.out.println("Entrer le nom du patient");
        String nom = sc.next();
        System.out.println("Entrer le prénom du patient");
        String prenom = sc.next();
        System.out.println("Entrer le sexe du patient");
        String sexe = sc.next();
        Patient patient1 = new Patient();
        patient1.setNom(nom);
        patient1.setPrenom(prenom);
        patient1.setSexe(sexe);
        patient1.setDiagnostic(diagnostic1);
        patient1.setPrescription(prescription1);

        //Liste des soins
        System.out.println("Pour le patient " + patient1.getNom() + ", on a " + patient1.getPrescription().getListSoin().size() + " Soin");
        System.out.println(patient1.getPrescription().afficherListSoin());
        System.out.println("\n");

        //Liste des diagnostics
        System.out.println(patient1.getDiagnostic().toString());
        System.out.println("\n");

        //Liste des Medicaments
        System.out.println("Pour le patient " + patient1.getNom() + ", on a " + patient1.getPrescription().getListMedicament().size()+ " medicament");
        System.out.println(patient1.getPrescription().afficherListMedicament());
    }
}