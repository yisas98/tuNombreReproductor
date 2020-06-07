package evf.javadoc;

 public class Cancion {
    String nombreCancion;
    Artista artista;

    public Cancion(String nombreCancion, Artista artista) {
        this.nombreCancion = nombreCancion;
        this.artista = artista;
    }

    public void reproducirCancion(){
        System.out.println("Reprosuciendo la canción "+nombreCancion);
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public Artista getArtista() {
        return artista;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "nombreCancion='" + nombreCancion + '\'' +
                ", artista=" + artista +
                '}';
    }
  }

