 public class Estudiante extends Person {
    private String matricula;
    private String carrera;

    public Estudiante(String nombre, int edad, String matricula, String carrera) {
        super(nombre, edad);
        this.matricula = matricula;
        this.carrera = carrera;
    }

    public void presentarse() {
        super.presentarse();
        System.out.println("Soy estudiante de " + carrera + " y mi matrícula es " + matricula + ".");
    }
}
