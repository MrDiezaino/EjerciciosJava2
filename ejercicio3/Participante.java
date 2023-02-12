package ejercicio3;

public class Participante {
    private String nombre;
    private int victorias;
    private int derrotas;
    private int partidas;
    
    public Participante() {
    }
    
    public Participante(String nombre, int victorias, int derrotas, int partidas) {
        this.nombre = nombre;
        this.victorias = victorias;
        this.derrotas = derrotas;
        this.partidas = partidas;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }
    
    public int getVictorias() {
        return victorias;
    }
    
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    
    public int getDerrotas() {
        return derrotas;
    }
    
    public void setPartidas(int partidas) {
        this.partidas = partidas;
    }
    
    public int getPartidas() {
        return partidas;
    }
}
