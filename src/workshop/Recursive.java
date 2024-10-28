package workshop;

public class Recursive {
//fibonacci (max then min)
//recursive: call itself, needs break
//generate perm w recursive(hori,vert,diag)
    public static void main(String[] args) {
        //recursiveReverseFunction(10);
        //recursiveAscendingFunction(0);
        int values[] = {2, 5, 8, 12, 17, 28};
        int arraysize = values.length;
        Minimax mm = new Minimax();
        int level = mm.calculateDepth(arraysize);
        System.out.println("Depth in fibo sequence: " + level);
        int result = mm.Minimax(0, true, values, 0, level);
        System.out.println("Result: " + result);
    }
}
    //public static void recursiveReverseFunction(int n){
    //must be static if write under main
        //System.out.println(n);
    //n == 5 bream
        //if (n < 5) {
            //recursiveReverseFunction(n - 1);
        //}
    //}
    //public static void recursiveAscendingFunction(int n){
       // System.out.println(n);

        //if (n < 5) {
            //recursiveAscendingFunction(n + 1);
        //}
    
    

