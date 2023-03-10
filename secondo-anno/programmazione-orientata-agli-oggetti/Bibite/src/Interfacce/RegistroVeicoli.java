package Interfacce;

import Oggetti.Veicolo;

public interface RegistroVeicoli {

    /**
     * Verifica la disponibilit√† di un veicolo
     * @param veicolo per cui si vuole verificare la disponibilit√†
     * @return true se √® disponibile, false altrimenti
     */
    public boolean verificaDisponibilit√†(Veicolo veicolo);
}
