package hu.petrik.szuperhosprojekt;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Vasember vas = new Vasember();
        Batman bat = new Batman();
        Bosszuallo busz = new Bosszuallo(2, true) {

            @Override
            public boolean megMentiAVilagot() {
                return false;
            }

            @Override
            public boolean legyoziE(Szuperhos hos) {
                return true;
            }
        };

        Bosszuallo busz2 = new Bosszuallo(311, true) {

            @Override
            public boolean megMentiAVilagot() {
                return false;
            }

            @Override
            public boolean legyoziE(Szuperhos hos) {
                return false;
            }
        };
        Kepregeny.szereplok("szuperhos.txt");
        Kepregeny.szuperhosok();
        System.out.println(busz);
        System.out.println(busz2);
        System.out.println(busz.legyoziE(busz2));
        System.out.println(busz2.legyoziE(busz));
        System.out.println(vas.megMentiAVilagot());
        System.out.println(bat.legyoziE(vas));
        System.out.println(vas);


    }
}
