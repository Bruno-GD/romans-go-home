package edu.poniperro.rgh.Roman;

import java.util.regex.Pattern;

public enum RomanNumber {
    I(1, 3),
    IV(4, 1),
    V(5, 1),
    IX(9, 1),
    X(10, 3),
    XL(40, 1),
    L(50, 1),
    XC(90, 1),
    C(100, 3),
    CD(400, 1),
    D(500, 1),
    CM(900, 1),
    M(1000, 3);

    private final int value;
    private final String rgx;

    RomanNumber(int value, int max) {
        this.value = value;
        this.rgx = String.format("(%s){0,%d}", this.name(), max);
    }

    public int getValue() {
        return value;
    }

    public Pattern getRegEx() {
        return Pattern.compile(rgx);
    }
}
