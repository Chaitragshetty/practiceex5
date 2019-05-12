//3. Write a program where an array of strings is input and output is a Map<String,boolean> where
//each different string is a key and its value is true if that string appears 2 or more times in the array
//Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
//Output - {“a” : true,”b” :false ,”c” :true,”d” : false}

import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacter {

    public static void main(String[] args) {
        RepeatedCharacter appearance = new RepeatedCharacter();
        //storing in Array
        String[] array = {"a", "b", "c", "d", "a", "c", "c"};
        String actualString = appearance.checkOccurence(String.join(" ", array)).replaceAll("=", " : ");
        System.out.println(actualString);
    }

        public String checkOccurence(String input) {
        if (input == null) return null;
        String[] stringArray = input.split("[\\W_]+");
        //creating maapset
        Map<String, Integer> map = new HashMap<>();
        for (String each : stringArray) { //to find the occurence of character
            if (map.containsKey(each)) {
                map.replace(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }

        Map<String, Boolean> booleanMap = new HashMap<>();
        for (String each : map.keySet()) { //to check whether the character is greater than 2
            if (map.get(each) >= 2) {
                booleanMap.put(each, true);
            } else {
                booleanMap.put(each, false);
            }
        }
        return booleanMap.toString();
    }
}