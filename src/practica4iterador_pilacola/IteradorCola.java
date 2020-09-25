package practica4iterador_pilacola;

import java.util.ArrayList;

/**
 *
 * @author Jonathan
 */
public class IteradorCola implements Iterador {

    private ArrayList<Integer> cola;
    int indice;

    public IteradorCola(ArrayList<Integer> cola) {
        this.cola = cola;
        indice = 0;
    }

    //Devuelve el primer elemento de la cola
    @Override
    public Object Siguiente() {
        if (cola.size() > 0) {
            indice++;
            return cola.get(0 + indice - 1);
        } else {
            return "La cola esta vacia";
        }
    }

    //Devuelve falso si la cola esta vacia
    @Override
    public boolean tieneSiguiente() {
        return !cola.isEmpty() && indice < cola.size();
    }
}
