package edu.poniperro.rgh.Roman;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomansGoHome {
    private final String numeroRomano;
    private Integer numeroDecimal = null;

    public RomansGoHome(String numeroRomano) {
        this.numeroRomano = numeroRomano;
    }

    public String getNumeroRomano() {
        return numeroRomano;
    }
    public Integer getNumeroDecimal() {
        return numeroDecimal;
    }
    private void setNumeroDecimal(int numeroDecimal) {
        this.numeroDecimal = numeroDecimal;
    }

    public int toDecimal() {
        if (getNumeroDecimal() == null)
            setNumeroDecimal(0);
        else
            return getNumeroDecimal();

        int lastIndex = 0;
        for (int i = RomanNumber.values().length-1; i >= 0; i--) {
            RomanNumber rn = RomanNumber.values()[i];
            Pattern p = rn.getRegEx();
            Matcher m = p.matcher(getNumeroRomano());

            if (m.find(lastIndex)) {
                int nuevoValor = getNumeroDecimal() +
                        (rn.getValue() * ((m.end() - m.start()) / rn.name().length()));
                setNumeroDecimal(nuevoValor);
                lastIndex = m.end();
            }

            if (lastIndex >= getNumeroRomano().length())
                break;
        }

        return getNumeroDecimal();
    }
}
