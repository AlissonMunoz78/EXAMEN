package compra_pasajes;

public class ruta {
    private String origen;
    private String destino;
    private double precio;

    public ruta(String origen, String destino, double precio) {
        this.origen = origen;
        this.destino = destino;
        this.precio = precio;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}