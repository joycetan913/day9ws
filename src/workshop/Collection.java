package workshop;

import java.util.ArrayList;

public class Collection {
    public static void main(String[] args) {
        
    
    Console cons = System.console();
    String input = cons.readLine("Enter 4 alphabets");

    if (input.length != 4) {
        System.out.println("Invalid entry");
    }
    char[] alphabets = input.split(" ");
    calculatePermutations(alphabets, 0, alphabets.length() - 1);



    public void calculatePermutations(char[] alphabets, int left, int right){
        if (left == right){
            System.out.println(String(alphabets));

        } else {
            for (int i = left; i <= right; i++){
                swap(alphabets, left, i);
                calculatePermutations(alphabets, left + 1, right);
                swap(alphabets,left,i);

            }
            
        }
        

        }

    }
    Set<String> permutations = new HashSet<>();
    calculatePermutations();
    for (String permutation:permutations){
        permutations.add(permutation);
        System.out.println(permutations);
    }
    
}
