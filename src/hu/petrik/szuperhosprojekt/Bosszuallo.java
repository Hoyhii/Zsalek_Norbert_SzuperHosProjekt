package hu.petrik.szuperhosprojekt;

public abstract class Bosszuallo implements Szuperhos {
    private double szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(double szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public abstract boolean megMentiAVilagot();

    @Override
    public boolean legyoziE(Szuperhos hos) {
        if (hos instanceof Bosszuallo && this.vanEGyengesege && this.szuperero < hos.mekkorAzEreje()) {
            return true;
        }
        if (hos instanceof Batman && this.szuperero >= hos.mekkorAzEreje() * 2.0D) {
            return true;
        }
        return false;

    }

    public double getSzuperero() {
        return szuperero;
    }

    public void setSzuperero(double szuperero) {
        this.szuperero = szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    @Override
    public double mekkorAzEreje() {
        return szuperero;
    }

    @Override
    public String toString() {
        return String.format("Szupererő:%f,%s gyengesége", this.szuperero, this.vanEGyengesege ? "van" : "nincs");
    }

}
