//RomanNumerals.toRoman(1000) // should return 'M'
//RomanNumerals.fromRoman("M") // should return 1000
public class RomanNumerals {
    private static final String[] ROMAN = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static final int[] NUMBERS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public static String toRoman(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < NUMBERS.length; i++) {                 
            if(n==1){
              sb.append("I");
              break;
            }
            while (n >= NUMBERS[i]) {
                n -= NUMBERS[i];
                sb.append(ROMAN[i]);
            } 
        }

        return sb.toString();
    }

    public static int fromRoman(String romanNumeral) {
        StringBuilder sb = new StringBuilder(romanNumeral);
        int result = 0;

        for(int i = 0; i<ROMAN.length; i++) {
            while(sb.toString().startsWith(ROMAN[i])) {
                int lengthRoman = ROMAN[i].length();
                sb.delete(0,lengthRoman);
                result += NUMBERS[i];
            }
        }
        return result;
    }
}