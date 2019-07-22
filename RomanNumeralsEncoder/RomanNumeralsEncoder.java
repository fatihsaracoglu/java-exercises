import java.util.Map;
import java.util.HashMap;


public class RomanNumeralsEncoder {

    public static void main(String[] args) {
        System.out.println(encoder(1343)); // MCCCXLIII
        System.out.println(encoder(517)); // DXVII
        System.out.println(encoder(72)); // LXXII

    }

    public static String encoder(int n) {
        String romanNumeral = "";
        if (n >= 1000) {
            int q = n / 1000;
            for (int i = 0; i < q; i++) {
                romanNumeral += RomanNumerals.get(1000);
            }
            n %= 1000;
        }
        if (n >= 500) {
            if (n < 900) {
                int q = n / 500;
                for (int i = 0; i < q; i++) {
                    romanNumeral += RomanNumerals.get(500);
                }
                n %= 500;
            } else {
                romanNumeral += RomanNumerals.get(900);
                n %= 100;
            }
        }
        if (n >= 100) {
            if (n < 400) {
                int q = n / 100;
                for (int i = 0; i < q; i++) {
                    romanNumeral += RomanNumerals.get(100);
                }
                n %= 100;
            } else {
                romanNumeral += RomanNumerals.get(400);
                n %= 100;
            }
        }
        if (n >= 50) {
            if (n < 90) {
                int q = n / 50;
                for (int i = 0; i < q; i++) {
                    romanNumeral += RomanNumerals.get(50);
                }
                n %= 50;
            } else {
                romanNumeral += RomanNumerals.get(90);
                n %= 10;
            }
        }
        if (n >= 10) {
            if (n < 40) {
                int q = n / 10;
                for (int i = 0; i < q; i++) {
                    romanNumeral += RomanNumerals.get(10);
                }
                n %= 10;
            } else {
                romanNumeral += RomanNumerals.get(40);
                n %= 10;
            }
        }
        if (n >= 5) {
            if (n < 9) {
                int q = n / 5;
                for (int i = 0; i < q; i++) {
                    romanNumeral += RomanNumerals.get(5);
                }
                n %= 5;
            } else {
                romanNumeral += RomanNumerals.get(9);
                n = 0;
            }
        }
        if (n >= 1) {
            if (n < 4) {
                for (int i = 0; i < n; i++) {
                    romanNumeral += RomanNumerals.get(1);
                }
                n = 0;
            } else {
                romanNumeral += RomanNumerals.get(4);
                n = 0;
            }
        }
        return romanNumeral;
    }

    private static final Map<Integer, String> RomanNumerals = new HashMap<>();

    static {
        RomanNumerals.put(1, "I");
        RomanNumerals.put(4, "IV");
        RomanNumerals.put(5, "V");
        RomanNumerals.put(9, "IX");
        RomanNumerals.put(10, "X");
        RomanNumerals.put(40, "XL");
        RomanNumerals.put(50, "L");
        RomanNumerals.put(90, "XC");
        RomanNumerals.put(100, "C");
        RomanNumerals.put(400, "CD");
        RomanNumerals.put(500, "D");
        RomanNumerals.put(900, "CM");
        RomanNumerals.put(1000, "M");
    }
}