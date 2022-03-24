package edu.poniperro.rgh.Roman;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class RomansGoHomeTest {
    private static final Map<String, Integer> casosTest = new HashMap<>();

    @BeforeClass
    public static void init() {
        casosTest.put("I", 1);
        casosTest.put("II", 2);
        casosTest.put("III", 3);

        casosTest.put("MMDCCLXXVII", 2777);
        casosTest.put("CDLXXXIII", 483);
        casosTest.put("CCLXXXIX", 289);
        casosTest.put("DXIV", 514);
        casosTest.put("XLVII", 47);
        casosTest.put("MMMCMXCIX", 3999);
    }

    @Test
    public void testToDecimal() {
        casosTest.forEach((roman, arabic) -> {
            RomansGoHome rgh = new RomansGoHome(roman);
            assertEquals(arabic.intValue(), rgh.toDecimal());
        });
    }
}