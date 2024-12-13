//2.Write a program to add elements to the HashMap given the key as integer and value data type is String.

package java_programs;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap with Integer as key and String as value
        HashMap<Integer, String> map = new HashMap<>();

        // Add elements to the HashMap
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Print the HashMap
        System.out.println("HashMap elements: " + map);
    }
}

//output:-
//
//HashMap elements: {1=Apple, 2=Banana, 3=Cherry}

