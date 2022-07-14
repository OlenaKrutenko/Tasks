public class Average {
    public static void main(String[] args) {
         // (a+b+c)/n (n -number of numbers)
        // Use Scanner methods to read input
        Scanner scan = new Scanner(System.in);
        //String input = "0";
        int suma = 0, average = 0,  n = 0;
        int number;
        do
        {
            number = scan.nextInt();
            suma += number;
            if(number!=0)
                n++;
        }
        while (number!=0);
        average = suma / n;
        System.out.println(average);

    }
