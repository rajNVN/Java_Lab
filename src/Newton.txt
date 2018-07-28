import java.util.Scanner;

public class Newton {
    static double fx(int[] vals, double x) {
        double val = 0;
        for (int i = 0; i < vals.length; i++)
            val = val + Math.pow(x, i) * vals[i];
        return val;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the equation");
        System.out.print("Format< 1X2-2X1-2X0 > : ");
        String eqn = scan.nextLine();

        System.out.print("Enter the Expected root : ");
        double x = scan.nextDouble();

        int n = eqn.length();
        int[] values = new int[n];
        int degree = 0, power;

        for (int i = 1; i < n; i++) {
            if (eqn.charAt(i) == 'X') {
                power = Integer.parseInt(eqn.substring(i + 1, i + 2));
                if (i > 2 && eqn.charAt(i - 2) == '-')
                    values[power] = -Integer.parseInt(eqn.substring(i - 1, i));
                else
                    values[power] = Integer.parseInt(eqn.substring(i - 1, i));
                if (power > degree) degree = power;
            }
        }

        int[] d_values = new int[degree];
        for (int i = 0; i < degree; i++)
            d_values[i] = (i + 1) * values[i + 1];

        for (int i = 0; i < 100; i++)
            x = x - fx(values, x) / fx(d_values, x);

        System.out.println("Approximate solution = " + x);
    }
}
