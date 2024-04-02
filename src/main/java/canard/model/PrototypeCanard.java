package canard.model;

import canard.model.cancan.Cancan;
import canard.model.vol.ComportementVol;
import canard.model.vol.NePasVoler;
import canard.model.vol.PropulsionAReaction;

public class PrototypeCanard extends Canard {

    private ComportementVol comportementVol;

    public PrototypeCanard(String nom, boolean vole) {
        super(nom, vole ? new PropulsionAReaction() : new NePasVoler(), new Cancan());
        this.comportementVol = vole ? new PropulsionAReaction() : new NePasVoler();
    }

    @Override
    public String nager() {
        return null;
    }

    @Override
    public String afficher() {
        return "Je suis un prototype de canard";
    }

    public ComportementVol getComportementVol() {
        return comportementVol;
    }

}