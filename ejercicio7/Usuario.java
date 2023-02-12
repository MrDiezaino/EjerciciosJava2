package ejercicio7;

public class Usuario extends Participante {

    public Usuario() {}

    public Usuario(int victorias, int derrotas, int partidas, String nombre) {
        super(victorias, derrotas, partidas, nombre);
    }

    public int obtenerEleccion(String eleccion) {
        if (eleccion.equals("Cara")) {
            return 0;
        } else if (eleccion.equals("Cruz")) {
            return 1;
        } else {
            return -1;
        }
    }
}
