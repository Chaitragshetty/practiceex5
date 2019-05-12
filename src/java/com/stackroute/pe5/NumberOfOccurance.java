/* Write a program to find the number of counts in the following String. Store the output in
Map<String,Integer> as key value pair.
Input : String str = “one one -one___two,,three,one @three*one?two”;
Output : {"one":5 , "two":2, "three" :2}   */

package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NumberOfOccurance {
    public static void main(String args[])
    {
        NumberOfOccurance.count();
    }

    public static void count()
    {
        //split given string store it in array
        String string="one one -one___two,,three,one @three*one?two";
        String array[]=string.split(" |-|___|,,|,|@|[*]|[?]");
        //creating mapset
        Map<String ,Integer> map=new HashMap<>();
        for(String name: array)
        {
            if(map.containsKey(name))
            {
                map.put(name,map.get(name)+1);
            }
            else
            {
                map.put(name,1);
            }
        }
        map.remove("");
        System.out.println(map);
    }
}


