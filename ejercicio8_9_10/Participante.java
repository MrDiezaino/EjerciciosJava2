package ejercicio8_9_10;

public class Participante {
    private int victorias;
    private int derrotas;
    private int partidas;
    private String nombre;

    public Participante(String nombre) {
        this.nombre = nombre;
        this.victorias = 0;
        this.derrotas = 0;
        this.partidas = 0;
    }

    public Participante() {
        this.victorias = 0;
        this.derrotas = 0;
        this.partidas = 0;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getPartidas() {
        return partidas;
    }

    public void setPartidas(int partidas) {
        this.partidas = partidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerInformacion() {
        return "Nombre: " + this.nombre + " Victorias: " + this.victorias + " Derrotas: " + this.derrotas;
    }
}
