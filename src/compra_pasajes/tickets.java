package compra_pasajes;

public class tickets {
    private ruta ruta;
    private servicio servicio;
    private pasajero pasajero;
    private double costo;

    public tickets(ruta ruta, servicio servicio, pasajero pasajero, double costo) {
        this.ruta = ruta;
        this.servicio = servicio;
        this.pasajero = pasajero;
        this.costo = costo;
    }

    public ruta getRuta() {
        return ruta;
    }

    public void setRuta(ruta ruta) {
        this.ruta = ruta;
    }

    public servicio getServicio() {
        return servicio;
    }

    public void setServicio(servicio servicio) {
        this.servicio = servicio;
    }

    public pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }


    public double calcularCosto() {
        double precioBase = servicio.getPrecioBase(); // Obtener el precio base del servicio
        double costoTotal = precioBase * costo; // Multiplicar el precio base por el factor de costo
        return costoTotal;
    }

    public void imprimirDatos() {
        System.out.println("Ruta: " + ruta.getOrigen() + " - " + ruta.getDestino());
        System.out.println("Servicio: " + servicio.getClass().getSimpleName());
        System.out.println("Pasajero: " + pasajero.getNombre() + ", Edad: " + pasajero.getEdad());
        System.out.println("Costo: $" + costo);
    }
}
