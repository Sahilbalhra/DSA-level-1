// HasMap in Java
// used when we need to store pair values
// example: rollno and name of student in class
//key-value pair
//key must be unique
//the are unordered data structure
package HashMap;

import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        // country(key) ,population(value)
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion

        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        // output
        System.out.println(map);
        // updating the value
        map.put("China", 180);

        // Search with key
        // true or false
        if (map.containsKey("China")) {
            System.out.println("Key is present in the map");
        } else {
            System.out.println("Key is not present in the map");
        }
        // getting the value with value
        System.out.println(map.get("China"));// 180
        System.out.println(map.get("Rusia"));// null

        // for loop for iteration in HashMap

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        // remove element from map

        map.remove("China");// key
        System.out.println(map);

    }
}