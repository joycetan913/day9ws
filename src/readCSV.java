package workshop;

import java.io.FileNotFoundException;

public class readCSV {
    
    public static void main(String[] args) {
        
        String inputFile;

        try {
            if(args.length < 0) {
                inputFile = args[0];
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        }
        
    }
}
