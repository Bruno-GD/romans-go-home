package edu.poniperro.rgh;

import edu.poniperro.rgh.Roman.RomansGoHome;

public class App {

    public static void main(String[] args) {

        RomansGoHome arabizador = new RomansGoHome();
        /*
        TESTEAR UNA SOLA LETRA
         */

        System.out.println("-- NUMEROS SIMPLES --");

        arabizador.setNumeroRomano("I");
        System.out.printf("%s = %d\n", arabizador.getNumeroRomano(), arabizador.toDecimal());

        arabizador.setNumeroRomano("V");
        System.out.printf("%s = %d\n", arabizador.getNumeroRomano(), arabizador.toDecimal());

        arabizador.setNumeroRomano("X");
        System.out.printf("%s = %d\n", arabizador.getNumeroRomano(), arabizador.toDecimal());

        arabizador.setNumeroRomano("L");
        System.out.printf("%s = %d\n", arabizador.getNumeroRomano(), arabizador.toDecimal());

        arabizador.setNumeroRomano("C");
        System.out.printf("%s = %d\n", arabizador.getNumeroRomano(), arabizador.toDecimal());

        arabizador.setNumeroRomano("D");
        System.out.printf("%s = %d\n", arabizador.getNumeroRomano(), arabizador.toDecimal());

        arabizador.setNumeroRomano("M");
        System.out.printf("%s = %d\n", arabizador.getNumeroRomano(), arabizador.toDecimal());

        /*
        MÁS DE UNA LETRA
         */

        System.out.println("-- NUMEROS COMBINADOS --");

        arabizador.setNumeroRomano("II");
        System.out.printf("%s = %d\n", arabizador.getNumeroRomano(), arabizador.toDecimal());

        arabizador.setNumeroRomano("III");
        System.out.printf("%s = %d\n", arabizador.getNumeroRomano(), arabizador.toDecimal());

        arabizador.setNumeroRomano("XVI");
        System.out.printf("%s = %d\n", arabizador.getNumeroRomano(), arabizador.toDecimal());

        /*
        RESTAS DE NUMEROS COMBINADOS
        */

        System.out.println("-- RESTAR NUMEROS COMBINADOS --");

        arabizador.setNumeroRomano("IV");
        System.out.printf("%s = %d\n", arabizador.getNumeroRomano(), arabizador.toDecimal());

        arabizador.setNumeroRomano("XIV");
        System.out.printf("%s = %d\n", arabizador.getNumeroRomano(), arabizador.toDecimal());

        arabizador.setNumeroRomano("MCXXIV");
        System.out.printf("%s = %d\n", arabizador.getNumeroRomano(), arabizador.toDecimal());
    }
}
