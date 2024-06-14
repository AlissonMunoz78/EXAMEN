package compra_pasajes;

public abstract class VIP extends servicio {
    private boolean asiento;
    private boolean internet;
    private boolean dosMaletas;
    private boolean maletaExt;

    public VIP() {
    }

    public VIP(boolean television, boolean internet) {
        super(television, internet);
    }

    public VIP(boolean asiento, boolean internet, boolean maletaExt, boolean dosMaletas) {
        this.asiento = asiento;
        this.internet = internet;
        this.maletaExt = maletaExt;
        this.dosMaletas = dosMaletas;
    }

    public VIP(boolean television, boolean internet, boolean asiento, boolean internet1, boolean maletaExt, boolean dosMaletas) {
        super(television, internet);
        this.asiento = asiento;
        this.internet = internet1;
        this.maletaExt = maletaExt;
        this.dosMaletas = dosMaletas;
    }

    public boolean isAsiento() {
        return asiento;
    }

    public void setAsiento(boolean asiento) {
        this.asiento = asiento;
    }

    @Override
    public boolean isInternet() {
        return internet;
    }

    @Override
    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public boolean isDosMaletas() {
        return dosMaletas;
    }

    public void setDosMaletas(boolean dosMaletas) {
        this.dosMaletas = dosMaletas;
    }

    public boolean isMaletaExt() {
        return maletaExt;
    }

    public void setMaletaExt(boolean maletaExt) {
        this.maletaExt = maletaExt;
    }

    public double calcularCosto(){
        double costo = super.getPrecioBase()*1.5;
        if (maletaExt) {
            costo += 5;
        }
        return costo;
    }
}
