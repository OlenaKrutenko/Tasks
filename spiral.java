class Spiral {
    static int[][] spiral(int rows, int columns) {
        int matrix[][] = new int[rows][columns];
        int minColumn = 0;
        int maxColumn = columns-1;
        int minRows = 0;
        int maxRows = rows-1;
        int CounterValue = 1;

        while (CounterValue<=rows*columns)
        {
            for (int i=minColumn; i<=maxColumn; i++){
                if(CounterValue<=rows*columns){
               matrix[minRows][i] = CounterValue;
               CounterValue++;}
            }
            for (int i = minRows+1; i <= maxRows; i++)
            {  if (CounterValue<=rows*columns) {
                matrix[i][maxColumn] = CounterValue;
                CounterValue++;}
            }
            for (int i = maxColumn-1; i >=minColumn; i--)
            {   if (CounterValue<=rows*columns){
                matrix[maxRows][i] = CounterValue;
                CounterValue++;}
            }
            for (int i = maxRows-1; i>=minRows+1; i--)
            { if (CounterValue<=rows*columns){
                matrix[i][minColumn] = CounterValue;
                CounterValue++;}
            }
            minColumn++;
            minRows++;
            maxColumn--;
            maxRows--;
        }

      return (matrix);
    }

}
