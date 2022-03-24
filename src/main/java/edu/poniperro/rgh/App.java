package edu.poniperro.rgh;

import edu.poniperro.rgh.Roman.RomansGoHome;

public class App {

    public static void main(String[] args) {
        /*
        TESTEAR UNA SOLA LETRA
         */

        System.out.println("-- NUMEROS SIMPLES --");

        RomansGoHome arabizador = new RomansGoHome("I");
        System.out.printf("%s = %d\n", arabizador.getNumeroRomano(), arabizador.toDecimal());

        arabizador = new RomansGoHome("V");
        System.out.printf("%s = %d\n", arabizador.getNumeroRomano(), arabizador.toDecimal());

        arabizador = new RomansGoHome("X");
        System.out.printf("%s = %d\n", arabizador.getNumeroRomano(), arabizador.toDecimal());

        arabizador = new RomansGoHome("L");
        System.out.printf("%s = %d\n", arabizador.getNumeroRomano(), arabizador.toDecimal());

        arabizador = new RomansGoHome("C");
        System.out.printf("%s = %d\n", arabizador.getNumeroRomano(), arabizador.toDecimal());

        arabizador = new RomansGoHome("D");
        System.out.printf("%s = %d\n", arabizador.getNumeroRomano(), arabizador.toDecimal());

        arabizador = new RomansGoHome("M");
        System.out.printf("%s = %d\n", arabizador.getNumeroRomano(), arabizador.toDecimal());

        /*
        MÁS DE UNA LETRA
         */

        System.out.println("-- NUMEROS COMBINADOS --");

        arabizador = new RomansGoHome("II");
        System.out.printf("%s = %d\n", arabizador.getNumeroRomano(), arabizador.toDecimal());

        arabizador = new RomansGoHome("III");
        System.out.printf("%s = %d\n", arabizador.getNumeroRomano(), arabizador.toDecimal());

        arabizador = new RomansGoHome("XVI");
        System.out.printf("%s = %d\n", arabizador.getNumeroRomano(), arabizador.toDecimal());

        /*
        RESTAS DE NUMEROS COMBINADOS
        */

        System.out.println("-- RESTAR NUMEROS COMBINADOS --");

        arabizador = new RomansGoHome("IV");
        System.out.printf("%s = %d\n", arabizador.getNumeroRomano(), arabizador.toDecimal());

        arabizador = new RomansGoHome("XIV");
        System.out.printf("%s = %d\n", arabizador.getNumeroRomano(), arabizador.toDecimal());

        arabizador = new RomansGoHome("MCXXIV");
        System.out.printf("%s = %d\n", arabizador.getNumeroRomano(), arabizador.toDecimal());
    }
}
