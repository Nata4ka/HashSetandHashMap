import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class Main {
    private static final String TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
            "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." +
            " Ut enim ad minim veniam, quis nostrud exercitation " +
            "ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
            "Duis aute irure dolor in reprehenderit in voluptate velit esse " +
            "cillum dolore eu fugiat nulla pariatur. " +
            "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui" +
            " officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String letters = TEXT.toLowerCase();
        for (int i = 0; i < letters.length(); i++) {
            char symbol = letters.charAt(i);

            if (Character.isLetter(symbol)) {
                Integer count = map.get(symbol);
                if (count == null) {
                    map.put(symbol, 1);
                } else {
                    map.put(symbol, ++count);
                }
            }
        }
        Map.Entry<Character,Integer>maxValue = null;
        for (Map.Entry<Character,Integer> elements : map.entrySet()){
            if(maxValue == null || elements.getValue()>maxValue.getValue()){
                maxValue=elements;
            }
        }
        Map.Entry<Character,Integer>minValue = null;
        for (Map.Entry<Character,Integer> elements : map.entrySet()){
            if(minValue == null || elements.getValue()<minValue.getValue()){
                minValue=elements;
            }
        }
        System.out.println(map);
        System.out.println("Максимальное количество элементов: " + maxValue);
        System.out.println("Минимальное количество элементов: " + minValue);



    }
}
