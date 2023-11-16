package org.example;

import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
//    algoritmo que pida dos numeros
//    scanner
//    buscar cual es el mayor
//    recoori y pregunto
//    buscar cual es el mayor
//    recooro y pregunto
//    o si son iguales

    public static void main(String[] args) {
        String[] drogas = new String[4];
        drogas[0] = "bareta";
        drogas[1] = "cocaina";
        drogas[2] = "mariguana";
        drogas[3] = "lsd";
        System.out.println("desde un arrya estatico");
        for(String droga:drogas){
            System.out.println(droga);
        }
        System.out.println("");

        ArrayList<String> lis = new ArrayList<String>();
        lis.add("bareto");
        lis.add("cocaina");
        lis.add("bazuca");
        lis.add("lsd");

        System.out.println("imprimiendo con un for normal");
        for (int i = 0; i < lis.size(); i++){
            System.out.println(lis.get(i));
        }
        System.out.println("imprimiendo con un for mejorado");
        for(String droga : lis){
            System.out.println(droga);
        }
    }
}