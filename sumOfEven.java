public class SumOfEvenNumbers {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 8, 15, 199};

        System.out.println(sum(array));
    }

    public static int sum(int[] array){

        //put your code here
        int [] arr = array;
        int sum1 = 0;
        if (array==null || array.length==0) {
            return (0);
        }
        for (int i: array)
            if(i%2 ==0){
                sum1 += i;
            }
        return sum1;
        
        //throw new UnsupportedOperationException();
    }
}
