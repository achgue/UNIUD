package caratteristiche.albergo;

import ConcreteObjects.Albergo;
import caratteristiche.Caratteristica;

public class haSalaConvegno implements Caratteristica<Albergo> {
    private int n;
    haSalaConvegno(int n){
        this.n = n;
    }

    @Override
    public boolean √®Soddisfatta(Albergo albergo) {
        return false;
    }
}