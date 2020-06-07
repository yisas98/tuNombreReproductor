package evf.javadoc;

import java.util.ArrayList;
import java.util.List;

public class PruebaReproductorVirtual {
    public static void main(String[] args) {

        List<Cancion> canciones = new ArrayList<Cancion>();
        Cancion cancion1 = new Cancion("Roses",new Artista("David"));
        Cancion cancion2 = new Cancion("Ride",new Artista("21Pilots"));
        canciones.add(cancion1);
        canciones.add(cancion2);

        List<ListaReproduccion> listasReproduccion = new ArrayList<ListaReproduccion>();
        List<Cancion> cancionesListaReproduccion = new ArrayList<Cancion>();
        cancionesListaReproduccion.add(cancion2);
        ListaReproduccion playList = new ListaReproduccion("Hello",cancionesListaReproduccion);
        listasReproduccion.add(playList);

        ReproductorVirtual jukeBox = new ReproductorVirtual(canciones,listasReproduccion);

        jukeBox.reproducirCancion("Roses");
        jukeBox.reproducirPlayList("Hello");
    }
}
