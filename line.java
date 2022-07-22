package com.epam.rd.autotasks.intersection;

public class Line {
      int k;
      int b;


    public Line(int k, int b) {
       this.k =k;
       this.b = b;
    }

    public Point intersection(Line other) {
        int determinant = this.b * other.b - this.k* other.k;
         if (k==other.k){
             return  null;
         }else {
             int x = (other.b- this.b)/(this.k - other.k);
             int y = k*x +b;
             return new Point(x, y);

         }


        //throw new UnsupportedOperationException();
    }

}

//CLASS MAIN Method main
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int k2 = scanner.nextInt();
        int b2 = scanner.nextInt();

        Line line1 = new Line(k1,b1);
        Line line2 = new Line(k2,b2);

        System.out.println("result is " + line1.intersection(line2));

    }

}
//CLASS POINT
public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d;%d)", x, y);
    }
}







