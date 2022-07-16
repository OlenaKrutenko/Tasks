public class MaxMethod {
    public static int max(int[] values) {
       //throw new UnsupportedOperationException();
        int [] arr = values;
        int max = arr [0];
        for (int value : arr) {
            if (max < value) {
                max = value;
            }
        }

        return (max);

    }
}

