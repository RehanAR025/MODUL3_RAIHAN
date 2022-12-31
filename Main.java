import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
  public static void main(String[] args) {
    boolean repeat = true;
    Scanner scanner = new Scanner(System.in);
    Calculation calcu = new Calculation();

    do {
      try {
        System.out.print("=== Menu Program ===\n1. Square\n2. Circle\n3. Trapezoid\n0. Exit\nSelect menu : ");
        int menupick = scanner.nextInt();

        switch (menupick) {
          case 1: //Squares
            System.out.print("\nEnter the length of the side of the square : ");
            double sisi = scanner.nextDouble();
            calcu.side = sisi;

            calcu.setSquare();
            calcu.run();

            System.out.println("\nThe Calculation result: " + calcu.getSquare());
            break;

          case 2: //Circles
            System.out.print("\nEnter the radius of the circle : ");
            double jarijari = scanner.nextDouble();

            calcu.radius = jarijari;
            calcu.setCircle();
            calcu.run();

            System.out.println("\nThe Calculation result: " + calcu.getCircle());
            break;

          case 3: //Trapezoids
            System.out.print("\nEnter the upper side of the trapezoid : ");
            double base1 = scanner.nextDouble();

            System.out.print("Insert the side of the base of the trapezoid : ");
            double base2 = scanner.nextDouble();
            
            System.out.print("Enter the height of the trapezoid : ");
            double height = scanner.nextDouble();
            
            calcu.setTrapezoid(base1, base2, height);
            calcu.run();

            System.out.println("\nThe Calculation result: " + calcu.getTrapezoid());
            break;

          case 0: //Selesai
            System.out.println("\nProgram End");
            break;

          default:
            System.out.println("\nOption not available");
            continue;
        }
        repeat = false;
      } 

      catch (InputMismatchException e) {
        System.out.println("\n====Error: Input must be a number====");
        scanner.next(); 
      }

      catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }

    while (repeat);
    scanner.close();
  }
}