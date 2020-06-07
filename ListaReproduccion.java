package evf.javadoc;

import java.util.List;

public class ListaReproduccion {
    String nombreListaReproduccion;
    List<Cancion> cancionesListaReproduccion;
    public ListaReproduccion(String nombreListaReproduccion,List<Cancion> cancionesListaReproduccion) {
        this.nombreListaReproduccion = nombreListaReproduccion;
        this.cancionesListaReproduccion = cancionesListaReproduccion;
    }
    public void agregarCancion(Cancion cancion){
        cancionesListaReproduccion.add(cancion);
    }

    public String getNombrePlayList() {
        return nombreListaReproduccion;
    }

    public List<Cancion> getCancionesPlayList() {
        return cancionesListaReproduccion;
    }
}

