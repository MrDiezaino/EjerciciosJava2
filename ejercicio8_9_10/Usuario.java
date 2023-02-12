package ejercicio8_9_10;

class Usuario extends Participante {
    public Usuario(String nombre) {
      super(nombre);
    }
  
    public int obtenerEleccionUsuario(String eleccion) {
      if (eleccion.equalsIgnoreCase("Cara")) {
        return 0;
      } else if (eleccion.equalsIgnoreCase("Cruz")) {
        return 1;
      } else {
        return -1;
      }
    }
  }
  