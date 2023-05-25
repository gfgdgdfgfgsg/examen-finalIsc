package models;

import java.util.ArrayList;

public class principal {

    static ArrayList<Clases> clase = new ArrayList<Clases>();

    static int cantHoja = 10;
     static int tempoPicad = 1;
    static  int arom = 6;
    static int azuca = 46;
    static int nicotin = 0;

    public static void totalCigarros() {

        clase.add(new Clases(cantHoja, tempoPicad, arom, azuca, nicotin));

        int total = 0;
        for (int i = 0; i < clase.size(); i++) {
            total += clase.get(i).getCantHojas();
            total += clase.get(i).getTempoPicado();
            total += clase.get(i).getAroma();
            total += clase.get(i).getAzucar();
            total += clase.get(i).getNicotina();
        }
        System.out.println(total);

        picadoDesvenado();

    }

    public static void picadoDesvenado(){
        int tiempo = tempoPicad;
        for (int i = 0; i < tiempo; i++) {
            if (i == 0) {
                System.out.println("Arrancando la máquina");
            }
            System.out.println("Picado y desvenado " + i);
        }
    }


}
