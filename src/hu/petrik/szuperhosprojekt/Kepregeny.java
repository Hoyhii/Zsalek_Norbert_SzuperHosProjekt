package hu.petrik.szuperhosprojekt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Kepregeny {
    private static List<Szuperhos> list = new ArrayList<>();

    public static void szereplok(String fajl) throws IOException {
        List<String> list;
        list = Files.readAllLines(Paths.get(fajl));
        Vasember vas = new Vasember();
        Batman bat = new Batman();
        for (String tores: list)
        {
            String[] hely = tores.split(" ");
            if (hely[0] == "Batman"){
                for (int i =0; i < Integer.parseInt(hely[1]); i++){
                    bat.kutyutKeszit();
                }
            }
            else{
                for (int i =0; i < Integer.parseInt(hely[1]); i++){
                    vas.kutyutKeszit();
                }

            }
        }
        Kepregeny.list.add(bat);
        Kepregeny.list.add(vas);


    }
    public static void szuperhosok(){
        for (Szuperhos hos: list
             ) {
            System.out.println(hos);

        }
    }

}
