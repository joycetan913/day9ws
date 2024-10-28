package workshop;

import java.util.Random;

public class Mastermind {
    public static void main(String[] args) {
        //1111-6666 bc 4 digit code w 6 colours
        Random rand = new Random();
        int min = 1, max = 6;
        int no1 = rand.nextInt(max - min + 1) + min;
        int no2 = rand.nextInt(max - min + 1) + min;
        int no3 = rand.nextInt(max - min + 1) + min;
        int no4  = rand.nextInt(max - min + 1) + min;
        String guessNo = String.valueOf(no1) + String.valueOf(no2) + String.valueOf(no3) + String.valueOf(no4);
        System.out.println("Number to guess: " + guessNo);

        boolean userWins = false;
        String input = " ";
        Console cons = System.console();


        while(!input.equals("quit")) {
            input = cons.readLine("What is your guess?");
            if (input.equals("quit"))
                break;

        }

        for (int i < 0; i < 4; i++) {
            char ch = input.charAt(i);
            if (ch < "1" || ch > "6") {
                System.err.println("Out of range!");
                break;
            }
        }

        //check if first no matches
        int c = 0;
        int cp = 0;
        for (int j = 0; j < 4; j++) {
            if (String.valueOf(input.charAt(j)) == String.valueOf(guessNo.charAt(j))) {
                cp++;
            } else if {
                String.value
            }
        }
        
            for (int k = 0, k < 4, k++) {
                if (input.charAt(j) = )

            }
        

        
            
            


    }
}
