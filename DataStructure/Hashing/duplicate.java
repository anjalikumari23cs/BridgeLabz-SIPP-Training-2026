package DataStructure.Hashing;

import java.util.*;

public class duplicate {
    public static void main(String[] args) {
        String[] tokens = { "apple", "banana", "orange", "apple" };
        duplicate dupChecker = new duplicate();
        boolean hasDuplicates = dupChecker.duplicate(tokens);
        System.out.println("Contains duplicates: " + hasDuplicates);
    }

    public boolean duplicate(String[] tokens) {
        Set<String> seen = new HashSet<>();
        for (String token : tokens) {
            if (!seen.add(token)) { // add() returns false if already present
                return true;
            }
        }
        return false;
    }
}