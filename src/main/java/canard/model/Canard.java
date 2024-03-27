package canard.model;

public abstract class Canard {

    protected String nom;

    public Canard(String nom) {
        this.nom = nom;
    }

    public abstract String nager();

    public abstract String afficher();
    
    public String getNom() {
        return nom;
    }


}
