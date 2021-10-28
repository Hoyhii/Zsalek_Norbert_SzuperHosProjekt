package hu.petrik.szuperhosprojekt;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Vasember vas = new Vasember();
        Batman bat = new Batman();
        Szuperhos hos = new Bosszuallo(2, true) {

            @Override
            public boolean megMentiAVilagot() {
                return false;
            }

            @Override
            public boolean legyoziE(Szuperhos hos) {
                return true;
            }
        };

        Szuperhos hos2 = new Bosszuallo(311, true) {

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
        System.out.println("első szupererős hős"+hos);
        System.out.println("második szupererős hős"+hos2);
        System.out.println("hos vs hos2"+hos.legyoziE(hos2));
        System.out.println("hos2 vs hos"+hos2.legyoziE(hos));
        System.out.println(vas.megMentiAVilagot());
        System.out.println(bat.legyoziE(vas));
        System.out.println(vas);


    }
}
