package dennisosimon.romannumerals;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class RomanNumerals {

    private static final Map<Integer, String> romainNumeralsMap = new TreeMap<>(Comparator.reverseOrder());

    static {
        romainNumeralsMap.put(1, "I");
        romainNumeralsMap.put(5, "V");
        romainNumeralsMap.put(10, "X");
        romainNumeralsMap.put(50, "L");
        romainNumeralsMap.put(100, "C");
        romainNumeralsMap.put(500, "D");
        romainNumeralsMap.put(1000, "M");
    }


    public int toInteger(String number) {
        String[] romanNumbers = number.split("");
        int[] intNumbers = new int[romanNumbers.length];

        for(Map.Entry<Integer, String> entry : romainNumeralsMap.entrySet()) {
            for (int i = 0; i < romanNumbers.length; i++) {
                if (entry.getValue().equals(romanNumbers[i])) {
                    intNumbers[i] = entry.getKey();
                }

                boolean nextValueIsOutOfBounds = i + 1 == romanNumbers.length;
                if (nextValueIsOutOfBounds) {
                    continue;
                }
                boolean nextValueIsBigger = intNumbers[i] < intNumbers[i + 1];
                if (nextValueIsBigger) {
                    intNumbers[i] = -intNumbers[i];
                }
            }
        }

        return Arrays.stream(intNumbers).sum();
    }
}