package compra_pasajes;

public class pasajero {
    String nombre;
    int edad;

    public pasajero() {
    }

    public pasajero(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //getters y setters


    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
