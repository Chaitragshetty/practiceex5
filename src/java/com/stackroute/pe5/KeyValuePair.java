package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class KeyValuePair {
    //     If the key `val1` has a value, set the key `val2` to have that value, and
    //         Set the key `val1` to have the value `" "` (empty string).
    public static String rotateValue(Map<String, String> map) {
        if (map == null)
        {
            return null;
        }
        String val1 = map.get("val1");

        map.replace("val1", " ");
        map.replace("val2", val1);
        return map.toString();
    }


    public static void main(String[] args)
    {
        //String expexted = "{val2=dbms, val1=csharp }";
        Map<String, String> map = new HashMap<>();
        map.put("val1", "java");
        map.put("val2", "c++");
        String mapStore = KeyValuePair.rotateValue(map);
        System.out.println(map.toString());

    }
}


