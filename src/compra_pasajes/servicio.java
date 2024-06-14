package compra_pasajes;

public class servicio{
    private double precioBase;

    public servicio() {
    }

    public servicio(double precioBase) {
        this.precioBase = precioBase;
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
}



