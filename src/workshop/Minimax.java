package workshop;

public class Minimax {

    public int calculateDepth(int n) {
        //true is 0, false is 1
        //return (n == 1)?0 : 1
        if (n == 1) {
            return 0;
        } else {
            return 1 + calculateDepth(n/2);

        }

       if (currentDepth == depth) {
        return values[currentNodeIndex];
        //last value
       }
    }
    public int minimax(int currentDepth, boolean isMax, int values[], int currentNodeIndex, int depth){
        if (isMax) {
            Minimax();
            return Math.max(minimax(currentDepth + 1, false, values, currentNodeIndex*2, depth), 
            minimax(currentDepth + 1, false, values, currentNodeIndex*2 + 1, depth));
        } else {
            return Math.min(minimax(currentDepth + 1, true, values, currentNodeIndex*2, depth), 
            minimax(currentDepth + 1, true, values, currentNodeIndex*2 + 1, depth));

        }








        return 0;
    }
    
}
