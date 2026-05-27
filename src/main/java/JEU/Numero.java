package JEU

public enum Numero{
    AS, DEUX, TROIS, QUATRE, CINQ, SIX, SEPT, HUIT, NEUF, DIX, VALET, DAME, ROI;

    public int valeur(){
        return ordinal()+1;
    }
    
    /**
     * Retourne le successeur de la carte actuelle
     * Par exemple, successeur de AS = DEUX
     */
    public Numero successeur(){
        if(this==ROI){
            return NULL;
        }
        Numero[] tab_num = Numero.values();
        return tab_num[this.valeur()];
    }

    /**
     *Retourne le predecesseur de la carte actuelle
     Par exemple predecesseur de VALET = DIX
     */
    publi  Numero predecesseur(){
        if(this == AS){
            return NULL;
        }
        Numero[] tab_num = Numero.values();
        return tab_num[this.valeur()-1];
    }
}
