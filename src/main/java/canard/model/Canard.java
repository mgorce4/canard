package canard.model;

import canard.model.vol.ComportementVol;

public abstract class Canard {

    protected String nom;
    protected ComportementVol comportementVol;

    public Canard(String nom, ComportementVol comportementVol) {
        this.nom = nom;
        this.comportementVol = comportementVol;
    }

    public abstract String nager();

    public abstract String afficher();
    
    public String getNom() {
        return nom;
    }
    
    public void setComportementVol(ComportementVol comportementVol) {
        this.comportementVol = comportementVol;
    }

    public String effectuerVol() {
        return comportementVol.voler();
    }


}
