import java.util.Scanner;

public class Quad {
    public static void main(String nvn[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter values of A,B&C : ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double d = b * b - 4 * a * scan.nextDouble();
        if (a == 0)
            System.out.println("Given values are not valid");
        else if (d > 0)
            System.out.println("Distinct roots are:\nroot1 -> "
                    + (-b + Math.sqrt(d)) / (2 * a) + "\nroot2 -> "
                    + (-b - Math.sqrt(d)) / (2 * a));
        else if (d == 0)
            System.out.println("Unique solution -> " + -b / (2 * a));
        else
            System.out.println("Imaginary roots are:\nroot1 -> "
                    + -b / (2 * a) + " + I " + Math.sqrt(-d / (2 * a)) + "\nroot2 -> "
                    + -b / (2 * a) + " - I " + Math.sqrt(-d / (2 * a)));
    }
}
