package edu.poniperro.rgh.Roman;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomansGoHome {
    private String numeroRomano;

    public String getNumeroRomano() {
        return numeroRomano;
    }

    public void setNumeroRomano(String numeroRomano) {
        this.numeroRomano = numeroRomano;
    }

    public int toDecimal() {
        int decimal = 0;

        int lastIndex = 0;
        for (int i = RomanNumber.values().length-1; i >= 0; i--) {
            RomanNumber rn = RomanNumber.values()[i];
            Pattern p = rn.getRegEx();
            Matcher m = p.matcher(numeroRomano);

            if (m.find(lastIndex)) {
                decimal += rn.getValue() * ((m.end() - m.start()) / rn.name().length());
                lastIndex = m.end();
            }
        }

        return decimal;
    }
}
