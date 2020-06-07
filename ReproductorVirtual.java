package evf.javadoc;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReproductorVirtual {
    List<Cancion> canciones;
    List<ListaReproduccion> listasReproduccion;
    Queue<Cancion> colaReproduccion;

    public ReproductorVirtual(List<Cancion> canciones,List<ListaReproduccion> listasReproduccion) {
        this.canciones = canciones;
        this.listasReproduccion = listasReproduccion;
        colaReproduccion = new LinkedList<Cancion>();
    }

    public Cancion seleccionarCancion(String nombreCancion){
       Cancion cancionSolicitada = null;
       for(Cancion song : canciones){
           if(song.getNombreCancion().equals(nombreCancion)) {
               cancionSolicitada = song;
               break;
           }
       }
       if(cancionSolicitada == null){
           throw new IllegalArgumentException("Conción no disponible ");
       }
       return cancionSolicitada;
    }


    public void reproducirCancion(String nombreCancion){
        Cancion cancionSolicitada = seleccionarCancion(nombreCancion);
        cancionSolicitada.reproducirCancion();
    }

    public void encolarSiguienteCancion(String nombreCancion){
        Cancion cancionSolicitada = seleccionarCancion(nombreCancion);
        colaReproduccion.add(cancionSolicitada);
    }

    public ListaReproduccion seleccionarPlayList(String nombrePlayList){
        ListaReproduccion listaReproduccionSeleccionada = null;
        for(ListaReproduccion playList : listasReproduccion){
            if(playList.getNombrePlayList().equals(nombrePlayList)){
                listaReproduccionSeleccionada = playList;
            }
        }
        if(listaReproduccionSeleccionada == null){
            throw new IllegalArgumentException("Lista de reproducción no disponible");
        }
        return listaReproduccionSeleccionada;
    }

    public void reproducirPlayList(String nombreListaReproduccion){
       ListaReproduccion listaReproduccion =  seleccionarPlayList(nombreListaReproduccion);
       List<Cancion> cancionesListaReproduccion = listaReproduccion.getCancionesPlayList();
       //Play First Song
        cancionesListaReproduccion.get(0).reproducirCancion();
       //Add remaining songs to the queue
        Cancion cancionActual;
        for(int i = 1 ; i < cancionesListaReproduccion.size() ; i++){
            cancionActual = cancionesListaReproduccion.get(i);
            colaReproduccion.add(cancionActual);
        }
    }

}