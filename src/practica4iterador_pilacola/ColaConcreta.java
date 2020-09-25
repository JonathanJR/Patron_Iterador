package practica4iterador_pilacola;

import java.util.ArrayList;

/**
 *
 * @author Jonathan
 */
public class ColaConcreta extends ArrayList<Integer> implements Agregado {

    //Añadimos un elemento al final de la cola
    @Override
    public void Agregar(int a) {
        this.add(a);
    }

    
    //Eliminamos el primer elemento que entró
    @Override
    public void Eliminar() {
        if (this.size() > 0) {
            this.remove(0);
        }
    }

    
    @Override
    public Iterador crearIterador() {
        return new IteradorCola(this);
    }

}
