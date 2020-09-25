package practica4iterador_pilacola;

import java.util.ArrayList;

/**
 *
 * @author Jonathan
 */
public class IteradorPila implements Iterador {

    private ArrayList<Integer> pila;
    int indice;

    public IteradorPila(ArrayList<Integer> pila) {
        this.pila = pila;
        indice = 0;
    }

    //Devuelve el ultimo elemento de la pila
    @Override
    public Object Siguiente() {
        if (pila.size() > 0) {
            indice++;
            return pila.get(0 + indice - 1);
        } else {
            return "La pila está vacia";
        }
    }

    //Devuelve falso si la pila esta vacia
    @Override
    public boolean tieneSiguiente() {
        return !pila.isEmpty() && indice < pila.size();
    }
}
