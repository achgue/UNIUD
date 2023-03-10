package caratteristiche;

public interface Caratteristica<T> {

    /**
     * Valuta se una caratteristica √® soddisfatta da un oggetto t
     * @param t
     * @return true se √® soddisfatta, false altrimenti
     */
    public boolean √®Soddisfatta(T t);
}
