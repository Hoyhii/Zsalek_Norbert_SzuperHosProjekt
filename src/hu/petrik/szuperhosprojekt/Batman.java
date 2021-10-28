package hu.petrik.szuperhosprojekt;

public class Batman implements Szuperhos,Milliardos{

    private double lelemenyesseg;

    public Batman() {
        this.lelemenyesseg = 100;
    }



    @Override
    public void kutyutKeszit() {
        this.lelemenyesseg += 50;
    }

    @Override
    public boolean legyoziE(Szuperhos hos) {
        if (hos.mekkorAzEreje() < this.lelemenyesseg){
            return true;
        }
        return false;
    }

    @Override
    public double mekkorAzEreje() {
        return this.lelemenyesseg * 2;
    }

    @Override
    public String toString() {
        return String.format("Batman leleményessége: %f", this.lelemenyesseg);
    }
}
