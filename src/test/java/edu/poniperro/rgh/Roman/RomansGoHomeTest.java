package edu.poniperro.rgh.Roman;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class RomansGoHomeTest {
    private final RomansGoHome rgh = new RomansGoHome();
    private final Map<String, Integer> casosTest = new HashMap<>();

    @Before
    public void init() {
        this.casosTest.put("I", 1);
        this.casosTest.put("II", 2);
        this.casosTest.put("III", 3);

        this.casosTest.put("MMDCCLXXVII", 2777);
        this.casosTest.put("CDLXXXIII", 483);
        this.casosTest.put("CCLXXXIX", 289);
        this.casosTest.put("DXIV", 514);
        this.casosTest.put("XLVII", 47);
    }

    @Test
    public void testToDecimal() {
        this.casosTest.forEach((roman, arabic) -> {
            rgh.setNumeroRomano(roman);
            assertEquals(arabic.intValue(), rgh.toDecimal());
        });
    }
}