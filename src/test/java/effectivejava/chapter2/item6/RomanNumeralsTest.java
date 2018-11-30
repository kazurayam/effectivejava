package effectivejava.chapter2.item6;

import static org.assertj.core.api.Assertions.*;

import java.util.Map;
import java.util.LinkedHashMap;
import org.junit.Test;

public class RomanNumeralsTest {

    private static Map<Integer, String> nums = new LinkedHashMap<>();
    static {
        nums.put(1,    "I");
        nums.put(2,    "II");
        nums.put(3,    "III");
        nums.put(4,    "IV");
        nums.put(5,    "V");
        nums.put(6,    "VI");
        nums.put(7,    "VII");
        nums.put(8,    "VIII");
        nums.put(9,    "IX");
        nums.put(10,   "X");
        nums.put(20,   "XX");
        nums.put(30,   "XXX");
        nums.put(40,   "XL");
        nums.put(50,   "L");
        nums.put(60,   "LX");
        nums.put(70,   "LXX");
        nums.put(80,   "LXXX");
        nums.put(90,   "XC");
        nums.put(100,  "C");
        nums.put(200,  "CC");
        nums.put(300,  "CCC");
        nums.put(400,  "CD");
        nums.put(500,  "D");
        nums.put(600,  "DC");
        nums.put(700,  "DCC");
        nums.put(800,  "DCCC");
        nums.put(900,  "CM");
        nums.put(1000, "M");
        nums.put(2000, "MM");
        nums.put(3000, "MMM");
        nums.put(11,   "XI");
        nums.put(515,  "DXV");
        nums.put(1804, "MDCCCIV");
        nums.put(1890, "MDCCCXC");
        nums.put(2018, "MMXVIII");
    }

    @Test
    public void testPrintFixture() {
        nums.forEach((k, v) -> System.out.println("key: " + k + ", value: " + v));
    }

    @Test
    public void testIsRomanNumeralSlow() {
        for (Map.Entry<Integer, String> entry : nums.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            assertThat(RomanNumerals.isRomanNumeralSlow(value)).
                    as("%s does not mean %s", value, key).isTrue();
        }
    }

    @Test
    public void testIsRomanNumeralFast() {
        nums.forEach((k, v) -> assertThat(RomanNumerals.isRomanNumeralFast(v)).
                as("%s does not mean %s", v, k).isTrue());
    }

}
