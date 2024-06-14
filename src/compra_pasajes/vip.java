package compra_pasajes;

public abstract class vip extends servicio {
    private boolean asiento;
    private boolean internet;
    private boolean dosMaletas;
    private boolean maletaExt;

    public vip() {
    }

    public vip(boolean television, boolean internet) {
        super(television, internet);
    }

    public vip(boolean asiento, boolean internet, boolean maletaExt, boolean dosMaletas) {
        this.asiento = asiento;
        this.internet = internet;
        this.maletaExt = maletaExt;
        this.dosMaletas = dosMaletas;
    }

    public vip(boolean television, boolean internet, boolean asiento, boolean internet1, boolean maletaExt, boolean dosMaletas) {
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

    @Override
    public double calcularCosto() {
        double costo = super.getPrecioBase() * 1.5;
        if (maletaExt) {
            costo += 5;
        }
        return costo;
    }
}
