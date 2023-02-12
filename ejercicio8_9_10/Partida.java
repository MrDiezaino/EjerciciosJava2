package ejercicio8_9_10;

public class Partida {
    private Maquina maquina;
    private Usuario usuario;
    private int numeroDeRondas;
    private int rondasTotales;

    public Partida(Maquina maquina, Usuario usuario, int numeroDeRondas, int rondasTotales) {
        this.maquina = maquina;
        this.usuario = usuario;
        this.numeroDeRondas = numeroDeRondas;
        this.rondasTotales = rondasTotales;
    }

    public Partida() {}

    public void iniciarPartida(String nombreJugador, String nombreMaquina) {
        this.usuario = new Usuario(nombreJugador);
        this.maquina = new Maquina(nombreMaquina);
    }    

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getNumeroDeRondas() {
        return numeroDeRondas;
    }

    public void setNumeroDeRondas(int numeroDeRondas) {
        this.numeroDeRondas = numeroDeRondas;
    }

    public int getRondasTotales() {
        return rondasTotales;
    }

    public void setRondasTotales(int rondasTotales) {
        this.rondasTotales = rondasTotales;
    }

    public int generarNumeroAleatorio() {
        return (int) (Math.random() * 2);
    }

}
