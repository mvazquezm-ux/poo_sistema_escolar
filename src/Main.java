 public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Sofia Rangel", 19, "2470237", "Ingeniería en Sistemas Inteligentes");
        Profesor profesor = new Profesor("Ricardo Roman", 29, "Programación Orientada a Objetos", "Grupo I2");

        estudiante.presentarse();
        profesor.presentarse();
    }
}
