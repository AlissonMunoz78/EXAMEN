package compra_pasajes;

public class tickets {
    private Ruta ruta;
    private Servicio servicio;
    private Pasajero pasajero;
    private double costo;

    public tickets() {
    }

    public tickets(Ruta ruta, Servicio servicio, Pasajero pasajero, double costo) {
        this.ruta = ruta;
        this.servicio = servicio;
        this.pasajero = pasajero;
        this.costo = costo;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double calcularCosto() {
        return 0.0;
    }

    public void imprimirDatos(){
        System.out.println("Ruta: " + ruta);
        System.out.println("Servicio: " + servicio);
        System.out.println("Pasajero: " + pasajero);
        System.out.println("Costo: " + costo);
    }
}
