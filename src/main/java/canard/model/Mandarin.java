package canard.model;

public class Mandarin extends Canard {

    public Mandarin(String nom) {
        super(nom);
    }

    @Override
    public String nager() {
        return "Tous les canards flottent, même les leurres";
    }

    @Override
    public String afficher() {
        return "Je suis un vrai mandarin";
    }

}
