import java.lang.reflect.Array;
import java.util.Arrays;

class CycleSwap {
    static void cycleSwap(int[] array) {
        int x = array[array.length-1], i;
        if (array.length!=0) {
            for (i = array.length - 1; i > 0; i--)
                array[i] = array[i - 1];
            array[0] = x;
        }
    }

    static void cycleSwap(int[] array, int shift) {
       int j = 0;
       if  (array.length!=0) {
           while (shift > 0) {
               int temp = array[array.length - 1];
               for (j = array.length - 1; j > 0; j--) {
                   array[j] = array[j - 1];
               }
               array[j] = temp;
               shift--;
           }
       }


    }
}
