package JEU

import java.util.Stack;

public class Pile{
    private Stack<Carte> pile;
    private Stack<Carte> defausse;

    public Pile(){
        this.pile = new Stack<>();
        this.defausse = new Stack<>{};
    }

    public boolean estVide(){
        return pile.empty();
    }
    
    public void empiler(Carte c){
        if(c == null){
            throws new NullPointerException("la carte ne peut pas être null");
        }
        
    }

}
