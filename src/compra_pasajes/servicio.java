package compra_pasajes;

public abstract class servicio{
    private double precioBase;

    public servicio() {
    }

    public servicio(double precioBase) {
        this.precioBase = precioBase;
    }

    public servicio(boolean television, boolean internet) {
        if (television) {
            this.precioBase = 50;
        }
        if (internet) {
            this.precioBase = 150;
        }
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    public double calcularCosto(){
        return precioBase ;
    }

    public abstract double CalcularCosto();
}



