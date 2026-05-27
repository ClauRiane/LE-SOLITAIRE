package JEU

public class Carte{
    private Numero numero;
    private Couleur couleur;

    public Carte(Numero n, Couleur c){
        if(n==null || c==null){
            throws new NullPointerException("une carte ne peut pas etre composée d'un élément nul");
        }
        this.numero = Nombre.n;
        this.couleur = Couleur.c;
    }
     
}
