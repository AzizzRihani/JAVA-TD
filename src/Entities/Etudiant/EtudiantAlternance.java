package Entities.Etudiant;

public class EtudiantAlternance extends Etudiant{
    int salaire;

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
    EtudiantAlternance(){}
    EtudiantAlternance(int id, String nom, String prenom, float moyenne,int salaire){
        super(id,nom,prenom,moyenne);
        this.salaire=salaire;
    }
    @Override
    public void ajouterUneAbsence()
    {
        if(salaire<=0)
        {
            salaire=0;
            System.out.println("Invalid form of salire");
        }
        else salaire -=50;
    }

    @Override
    public String toString() {
        return super.toString()+"Salaire :"+ salaire;
    }
}
