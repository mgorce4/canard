package canard.model;

public class CanardEnPlastique extends Canard {

	public CanardEnPlastique(String nom) {
        super(nom);
    }

    @Override
    public String nager() {
        return "Tous les canards flottent, même les leurres";
    }

    @Override
    public String afficher() {
        return "Je suis un canard en plastique";
    }

}
