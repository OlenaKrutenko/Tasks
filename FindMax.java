import java.util.Scanner;

public class FindMaxInSeq {
   public static int max() {
//         Put your code here

       Scanner scan= new Scanner(System.in);
       int maxSoFar = Integer.MIN_VALUE;
       int numValues = 5;

       for (int i = 0; i < numValues; ++i) {
           int currValue = scan.nextInt();

           if (currValue > maxSoFar) {
               maxSoFar = currValue;
           }
       }

       return maxSoFar;
   }


    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        System.out.println(max());
    }
}

