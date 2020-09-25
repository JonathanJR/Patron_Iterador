package practica4iterador_pilacola;

import java.util.ArrayList;

/**
 *
 * @author Jonathan
 */
public class PilaConcreta extends ArrayList<Integer> implements Agregado {

    //Añadimos un elemento a la pila
    @Override
    public void Agregar(int a) {
        this.add(0, a);
    }

    //Eliminamos el último elemento que entró
    @Override
    public void Eliminar() {
        if (size() > 0) {
            this.remove(0);
        }
    }

    @Override
    public Iterador crearIterador() {
        return new IteradorPila(this);
    }

}
