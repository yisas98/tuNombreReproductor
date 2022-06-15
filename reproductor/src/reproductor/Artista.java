package evf.javadoc;

public class Artista {
    String nombreArtista;

    public Artista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    
    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }
// jesus guerrero muriel

    @Override
    public String toString() {
        return "Artista{" +
                "nombreArtista='" + nombreArtista + '\'' +
                '}';
    }
}


