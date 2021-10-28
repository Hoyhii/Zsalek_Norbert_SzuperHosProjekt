package hu.petrik.szuperhosprojekt;

public class Vasember extends Bosszuallo implements Milliardos{


    public Vasember() {
        super(150,true);

    }

    @Override
    public boolean megMentiAVilagot() {
        if (this.getSzuperero() > 1000){
            return true;
        }
        return false;
    }

    @Override
    public void kutyutKeszit() {
        this.setSzuperero(this.getSzuperero() + Math.random()*10);



    }

    @Override
    public String toString() {
        return String.format("Vasember " +super.toString());
    }
}

