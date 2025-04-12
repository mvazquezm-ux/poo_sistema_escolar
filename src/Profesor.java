 public class Profesor extends Person {
    private String especialidad;
    private String grupoAsignado;

    public Profesor(String nombre, int edad, String especialidad, String grupoAsignado) {
        super(nombre, edad);
        this.especialidad = especialidad;
        this.grupoAsignado = grupoAsignado;
    }

    public void presentarse() {
        super.presentarse();
        System.out.println("Soy profesor de " + especialidad + " y enseño al grupo " + grupoAsignado + ".");
    }
}
