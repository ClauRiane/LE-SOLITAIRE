package JEU

public enum Couleur{
    CARREAU, COEUR, PIQUE, TREFLE;

    public boolean estRouge(){
        return couleur == Couleur.CARREAU || couleur == Couleur.COEUR;
    }

    public boolean estNoire(){
        return couleur == Couleur.PIQUE || couleur == Couleur.TREFLE;
    }
}
