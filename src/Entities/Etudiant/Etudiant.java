package Entities.Etudiant;

import Entities.Ecole.Ecole;
public class Etudiant {
    public Integer id;
    public String nom;
    public String prenom;
    public float moyenne;

    //GETTERS

    public Integer getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public float getMoyenne() {
        return moyenne;
    }

    //SETTERS

    public void setId(Integer id) {
        this.id = id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setMoyenne(float moyenne) {
        this.moyenne = moyenne;
    }

    public Etudiant(){}
    public Etudiant(int id, String nom, String prenom, float moyenne){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.moyenne=moyenne;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass() == Etudiant.class){
            Etudiant e = (Etudiant) obj;
            return (e.getNom() == this.getNom()) && (e.getId() == this.getId());
        }
        return false;
    }

    @Override
    public String toString() {
        return "Identifiant :"+ id +"Nom :"+ nom + "Prénom :"+ prenom
                +"Moyenne :"+ moyenne;
    }

    public void ajouterUneAbsence() {}
}
