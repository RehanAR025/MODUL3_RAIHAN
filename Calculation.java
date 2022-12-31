public class Calculation implements Runnable {
    protected double radius;
    protected double side;
    protected double area;
    protected final double phi = 3.14;

    //Squares 
    public void setSquare() throws IllegalArgumentException {
      if (side < 1) {
        throw new IllegalArgumentException("The Side used cannot be less than 1");
      }
      this.area = side * side;
    }
    public double getSquare() {
      return this.area;
    }

    //Circles
    public void setCircle() throws IllegalArgumentException {
      if (radius < 1) {
        throw new IllegalArgumentException("The Radius used cannot be less than 1");
      }
      this.area = phi * (radius * radius);
    }
    public double getCircle() {
      return this.area;
    }

    //Trapezoids
    public void setTrapezoid(double A, double B, double h) throws IllegalArgumentException {
      if (A < 1 || B < 1) {
        throw new IllegalArgumentException("The base length used cannot be less than 1.");
      }
      if (h < 1) {
        throw new IllegalArgumentException("The height used cannot be less than 1.");
      }
      this.area = ((A + B)/2) * h;
    }
    public double getTrapezoid() {
      return this.area;
    }

    @Override
    public void run() {
      System.out.println("\n==== Program Will Start In ====");
      for (int i = 3; i > 0; i--) {
        try {
          System.out.println("Starting with thread "+i);
          Thread.sleep(500);
        } 

        catch (InterruptedException e) {
          System.out.println("Error");
        }
     }
   }
}