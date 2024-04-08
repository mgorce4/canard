package canard.model;

import canard.model.cancan.ComportementCancan;
import canard.model.vol.ComportementVol;

public abstract class Canard {

    protected String nom;
    private ComportementVol comportementVol;
	private ComportementCancan comportementCancan;

    public Canard(String nom, ComportementVol comportementVol, ComportementCancan comportementCancan) {
        this.nom = nom;
        this.comportementVol = comportementVol;
        this.comportementCancan = comportementCancan;
    }

    public abstract String nager();

    public abstract String afficher();
    
    public String getNom() {
        return nom;
    }
    
    public void setComportementVol(ComportementVol comportementVol) {
        this.comportementVol = comportementVol;
    }
    
    public void setComportementCancan(ComportementCancan comportementCancan) {
    	this.comportementCancan = comportementCancan;
    }

    public String effectuerVol() {
        return comportementVol.voler();
    }
    
    public String cancanner() {
    	return comportementCancan.cancaner();
    }
    public void changerComportementVol(ComportementVol comportementVol) {
        this.comportementVol = comportementVol;
    }

    public void changerComportementCancan(ComportementCancan comportementCancan) {
        this.comportementCancan = comportementCancan;
    }

}
