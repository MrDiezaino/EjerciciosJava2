package ejercicio8_9_10;

import java.util.Random;

public class Maquina extends Participante {
    public Maquina(String nombre) {
        super(nombre);
    }
    
    public int obtenerEleccionMaquina() {
        return (int) (Math.random() * 2);
    }
}
