package ejercicio8_9_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Declaración de Variables y Objetos
        int rondas = 5;
        Maquina maquina = new Maquina("Maquina");
        Usuario usuario = new Usuario("Usuario");
        Scanner sc = new Scanner(System.in);
        int aciertosUsuario = 0;
        int aciertosMaquina = 0;

        // Empieza el juego en función de las rondas especificadas anteriormente.
        for (int i = 0; i < rondas; i++) {
            System.out.println("Elige un valor: 'Cara' o 'Cruz': ");

            String eleccionUsuario = sc.nextLine();
            int eleccionMaquina = maquina.obtenerEleccionMaquina();

            // Obtiene la elección de la Máquina y el Usuario
            if (eleccionUsuario.equals("Cara") || eleccionUsuario.equals("Cruz")) {
                int eleccionUsuarioInt = usuario.obtenerEleccionUsuario(eleccionUsuario);

                // CASO: Empate
                if (eleccionUsuarioInt == eleccionMaquina) {
                    System.out.println("Empate");

                // CASO: Cara / Cruz
                } else if (eleccionUsuarioInt == 0) {
                    if (eleccionMaquina == 1) {
                        System.out.println("Gana la máquina");
                        aciertosMaquina++;
                    } else {
                        System.out.println("Gana el usuario");
                        aciertosUsuario++;
                    }
                } else {
                    if (eleccionMaquina == 0) {
                        System.out.println("Gana la máquina");
                        aciertosMaquina++;
                    } else {
                        System.out.println("Gana el usuario");
                        aciertosUsuario++;
                    }
                }

            // Elección distinta Cara/Cruz
            } else {
                System.out.println("Elección no válida");
            }
        }

        // Los aciertos del Usuario son mayores a los de la Máquina
        if (aciertosUsuario > aciertosMaquina) {
            System.out.println("El ganador es el usuario con " + aciertosUsuario + " aciertos");
            usuario.setVictorias(usuario.getVictorias() + 1);
            maquina.setDerrotas(maquina.getDerrotas() + 1);

        // Los aciertos de la Máquina son mayores a los del Usuario
        } else if (aciertosMaquina > aciertosUsuario) {
            System.out.println("El ganador es la máquina con " + aciertosMaquina + " aciertos");
            maquina.setVictorias(maquina.getVictorias() + 1);
            usuario.setDerrotas(usuario.getDerrotas() + 1);
        // Empate
        } else {
            System.out.println("La partida ha finalizado en empate con " + aciertosUsuario + " aciertos");
        }

        usuario.setPartidas(usuario.getPartidas() + 1);
        maquina.setPartidas(maquina.getPartidas() + 1);

      }
    
}
