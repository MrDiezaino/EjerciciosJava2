package ejercicio3;

import java.util.Random;

public class Maquina extends Participante {
    public int aleatorio() {
        Random rand = new Random();
        return rand.nextInt(2);
    }
}
