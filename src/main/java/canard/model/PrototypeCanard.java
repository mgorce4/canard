package canard.model;

import canard.model.cancan.Cancan;
import canard.model.vol.VolerAvecDesAiles;

public class PrototypeCanard extends Canard{

	public PrototypeCanard(String nom) {
        super(nom, new VolerAvecDesAiles(), new Cancan());
    }

	@Override
	public String nager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String afficher() {
		// TODO Auto-generated method stub
		return null;
	}

}
