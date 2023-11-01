package Entities.Etudiant;


public class Etudiant3eme extends Etudiant{
    String branche;

    public String getBranche() {
        return branche;
    }

    public void setBranche(String branche) {
        this.branche = branche;
    }
    public Etudiant3eme(){}
    public Etudiant3eme(int id, String nom, String prenom, float moyenne,String branche){
        super(id,nom,prenom,moyenne);
        this.branche=branche;
    }
    @Override
    public void ajouterUneAbsence( )
    {
        if(moyenne<=0)
        {
            moyenne=0;
            System.out.println("Invalid form of moyenne");
        }
        else {
            moyenne = moyenne - 0.5f;
        }
    }
}
