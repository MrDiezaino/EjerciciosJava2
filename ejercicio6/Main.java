package ejercicio6;

public class Main {
    public static void main(String[] args) {
        Participante participante1 = new Participante(2, 3, 5, "Diego");
        System.out.println("    Nombre del participante 1: " + participante1.getNombre());
        System.out.println("    Victorias del participante 1: " + participante1.getVictorias());
        System.out.println("    Derrotas del participante 1: " + participante1.getDerrotas());
        System.out.println("    Partidas del participante 1: " + participante1.getPartidas());
    
        System.out.println("");

        Maquina maquina1 = new Maquina();
        System.out.println("    Valor de la Máquina: " + maquina1.aleatorio()); 

        System.out.println("");

        Usuario usuario1 = new Usuario(3, 2, 5, "Diego");
        System.out.println("    Elección del usuario 1 (Cara): " + usuario1.obtenerEleccion("Cara"));
        System.out.println("    Elección del usuario 1 (Cruz): " + usuario1.obtenerEleccion("Cruz"));
    }
    
    
}
