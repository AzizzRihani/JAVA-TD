package Entities.Ecole;

import Entities.Etudiant.Etudiant;
import Entities.Etudiant.Etudiant3eme;
import Entities.Etudiant.EtudiantAlternance;

public class Ecole {

    public String nom;
    private Etudiant[] etudiants;
    public int nbrEtudiants;
    public int MaxEtudiants=500;
    public Integer p=-1;
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public Ecole(){}
    public Ecole(String nom){
        this.etudiants = new  Etudiant[MaxEtudiants];
        this.nbrEtudiants = 0;
        this.nom=nom;
    }

    public int rechercherEtudiant(Etudiant e) {
        for (int i = 0; i < nbrEtudiants; i++) {
            if (e.getNom().equals(etudiants[i].getNom())) {
                return i;
            }
        }
        return -1;
    }
    public void ajouterEtudiant(Etudiant etudiant){
        if (rechercherEtudiant(etudiant) == -1)
        {
            if (nbrEtudiants < etudiants.length) {
                etudiants[nbrEtudiants] = etudiant;
                nbrEtudiants++;
                System.out.println("Étudiant ajouté");
                p=1;
            } else {
                System.out.println("L'école est pleine");
            }
        }
        else
        {
            System.out.println("inscrit");
        }
    }
    public float getMoyenneDes3A() {
        float sommeDesMoyennes = 0;
        int NEtudiants3A = 0;

        for (int i = 0; i < nbrEtudiants; i++) {
            if (etudiants[i] instanceof Etudiant3eme) {
                sommeDesMoyennes += etudiants[i].getMoyenne();
                NEtudiants3A++;
            }
        }

        if (NEtudiants3A == 0) {
            return 0;
        }

        return sommeDesMoyennes / NEtudiants3A;
    }
    public float moyenneSalaireAlternants() {
        float sommeDesSalaires = 0;
        int nombreAlternants = 0;

        for (int i = 0; i < nbrEtudiants; i++) {
            if (etudiants[i] instanceof EtudiantAlternance) {
                sommeDesSalaires += ((EtudiantAlternance) etudiants[i]).getSalaire();
                nombreAlternants++;
            }
        }

        if (nombreAlternants == 0) {
            return 0;
        }

        return sommeDesSalaires / nombreAlternants;
    }
    public void changerEcole(Etudiant etd, Ecole nouvelleEcole) {
        int iEtudiant = rechercherEtudiant(etd);

        if (iEtudiant != -1)
        {
            for (int i = iEtudiant; i < nbrEtudiants - 1; i++) {
                etudiants[i] = etudiants[i + 1];
            }
            nbrEtudiants--;
                nouvelleEcole.ajouterEtudiant(etd);
                if(p==1)
                {
                    System.out.println(etd.getNom() + "success.");
                }
                else
                {
                System.out.println("ERROR");
                etudiants[nbrEtudiants] = etd;
                nbrEtudiants++;
                }
        }
        else
        {
            System.out.println("n'est pas inscrit a cette école.");
        }
    }
}
