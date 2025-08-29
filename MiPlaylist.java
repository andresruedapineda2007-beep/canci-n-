public class MiPlaylist {
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion("Bohemian Rhapsody", "Queen", 355);
        Cancion cancion2 = new Cancion("Shape of You", "Ed Sheeran", 240);
        Cancion cancion3 = new Cancion("Billie Jean", "Michael Jackson", 294);

        cancion1.reproducir();
        cancion2.reproducir();
        cancion3.reproducir();

        System.out.println(cancion1.obtenerDetalles());
    }
}