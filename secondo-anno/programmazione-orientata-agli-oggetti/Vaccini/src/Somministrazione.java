import java.util.Iterator;

public class Somministrazione {
    private Farmaco farmaco;
    private String data;
    private int numeroDose;
    private Patologia patologiaDaCurare;

    /**
     * Creo un'assunzione
     * @param f farmaco da far assumere
     * @param d data dell'assunzione
     */
    Somministrazione(Farmaco f, String d, Patologia p){
        farmaco = f;
        data = d;
        patologiaDaCurare = p;
    }

    public Farmaco getFarmaco(){
        return farmaco;
    }

    public Farmaco isCompatibile(Persona p){
        Iterator<Somministrazione> it = p.getSomministrazione().iterator();
        while(it.hasNext()){
            if(it.next().getFarmaco().isCompatibile(farmaco))
                return false;
        }
        return true;
    }

    public boolean compatibile(Persona p) {
        //@todo sistemare compatibilit√†
        //scorro la lista delle incompatibilit√† del farmaco confrontandola con le assunzioni della persona
        //se trovo qualcosa allora ritorna false
        //asltimenti il farmaco √® compatibile e ritorna true
        if(true){
            return false;
        }else{
            return true;
        }
    }
}
