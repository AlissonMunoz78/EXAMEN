package compra_pasajes;

public class normal extends servicio{
    private String asiento;
    private boolean maletaExt;

    public normal() {
    }

    public normal(boolean television, boolean internet) {
        super(television, internet);
    }

    public normal(String asiento, boolean maleta) {
        this.asiento = asiento;
        this.maletaExt = maleta;
    }

    public normal(boolean television, boolean internet, String asiento, boolean maleta) {
        super(television, internet);
        this.asiento = asiento;
        this.maletaExt = maleta;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public boolean isMaleta() {
        return maletaExt;
    }

    public void setMaleta(boolean maleta) {
        this.maletaExt = maleta;
    }
    @Override
    public double CalcularCosto(){
        double costo = super.getPrecioBase();
        if (asiento.equals("ventana")){
            costo += 25;
        }
        else if (asiento.equals("pasillo")){
            costo += 20;
        }else if (asiento.equals("al final")){
                costo += 15;
        } else if (asiento.equals("adelante")){
                costo += 10;
        }
        if (maletaExt){
            costo += 5;
        }
        return costo;
    }

}
