class Triangle {
    Point a;
    Point b;
    Point c;
    double d1;
    double d2;
    double d3;
    double x1;
    double y1;
    double x2;
    double y2;
    double x3;
    double y3;

    public Triangle(Point a, Point b, Point c) {
        //TODO
       x1 = a.getX();
       y1 = a.getY();
        x2 = b.getX();
        y2 = b.getY();
        x3 = c.getX();
        y3 = c.getY();

           d1 = Math.sqrt( ( ( x2 - x1 ) * ( x2 - x1 ) ) + ( ( y2 - y1 ) * ( y2 - y1 ) ) );
          d2 = Math.sqrt( ( ( x3 - x2 ) * ( x3 - x2 ) ) + ( ( y3 - y2 ) * ( y3- y2 ) ) );
          d3 = Math.sqrt( ( ( x3 - x1 ) * ( x3 - x1 ) ) + ( ( y3 - y1 ) * ( y3 - y1 ) ) );
         if (d1 >= d2+d3 || d2>= d1+d3 || d3>=d2+d1){
             throw new IllegalArgumentException();
         }

    }

    public double area() {
        //TODO
        double p = (d1+d2+d3)/2;
        return Math.sqrt(p*(p-d1)*(p-d2)*(p-d3));
    }

    public Point centroid(){
        //TODO
        double centroidX = 1/3.0 *(x1 + x2+ x3);
        double centroidY = 1/3.0 * (y1 +y2 +y3);
        return new Point( centroidX, centroidY);
    }

}

