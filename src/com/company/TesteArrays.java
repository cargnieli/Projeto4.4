package com.company;

public class TesteArrays {

    public static void main(String[] args) {

        int [] notas = new int[7];
        notas[0] = 10;
        notas[1] = 8;
        notas[2] = 5;
        notas[3] = 7;
        notas[4] = 6;
        notas[5] = 5;
        notas[6] = 2;

        System.out.println("O Array tem: " + notas.length + " Array");
        
        for (int i =0; i < notas.length; i++){
            System.out.println("Posição[" + i + "]=" + notas[i]);
        }






    }
}
