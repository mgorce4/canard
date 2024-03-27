package canard.model;

import canard.model.vol.VolerAvecDesAiles;

public class Colvert extends Canard {

    public Colvert(String nom) {
        super(nom, new VolerAvecDesAiles());
    }

    @Override
    public String nager() {
        return "Tous les canards flottent, même les leurres";
    }

    @Override
    public String afficher() {
        return "Je suis un vrai colvert";
    }

}
