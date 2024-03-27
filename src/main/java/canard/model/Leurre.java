package canard.model;

import canard.model.vol.NePasVoler;

public class Leurre extends Canard {

    public Leurre(String nom) {
        super(nom, new NePasVoler());
    }

    @Override
    public String nager() {
        return "Tous les canards flottent, même les leurres";
    }

    @Override
    public String afficher() {
        return "Je suis un leurre";
    }

}