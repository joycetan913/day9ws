package workshop;

import java.io.Console;

public class App2 {
    public static void main(String[] args) {
        

        // recursiveReverseFunction(10);

        // recursiveAscendingFunction(0);
        Console cons = System.console();
        String input = cons.readLine("Enter a string of numbers:");
        String [] integerValues = input.split("");
        List<Integer> values = new ArrayList<>();
        for (int i:integerValues){ 
            values.add(integerValues);
        }
      

    

        Minimax mm = new Minimax();

        // e.g. 8 represents the size of the array, that means there are 8 numbers
        int level = mm.calculateDepth(arraySize); 
        System.out.println("Depth of recursing into the fibbonaci sequence: " + level);

        int result = mm.minimax(0, true, values, 0, level);
        System.out.println("Result of minimax for an array of integers: " + result);
    }
    
}
