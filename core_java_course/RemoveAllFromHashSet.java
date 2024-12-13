//3.Write a Java program to remove all elements from a hash set.

package java_programs;

import java.util.HashSet;

public class RemoveAllFromHashSet {
    public static void main(String[] args) {
        // Create a HashSet and add elements
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");

        // Print the HashSet before removal
        System.out.println("HashSet before removal: " + set);

        // Remove all elements from the HashSet
        set.clear();

        // Print the HashSet after removal
        System.out.println("HashSet after removal: " + set);
    }
}

//output:-
//HashSet before removal: [Apple, Cherry, Date, Banana]
//HashSet after removal: []