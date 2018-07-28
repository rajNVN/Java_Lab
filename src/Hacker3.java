import java.util.*;

class Hacker3
{
    public static void main(String args[]) {
        System.out.println("NewtonRaphson Implementation");
        Scanner manu = new Scanner(System.in);
        System.out.println("Enter the equation in the form :+2x2-3x1-5x0");
        String src = manu.next();
        int eq[] = new int[src.length()];
        System.out.println("Enter x0");
        double st = manu.nextDouble();
        int pos = 0, value = 0, degree = 0, i;
        for (i = 0; i < src.length(); i++) {
            if (src.charAt(i) == '+' || src.charAt(i) == '-') {
                int in = src.substring(i, src.length()).indexOf('x');
                in = in + i;

                if (src.charAt(i) == '-')
                    value = -1 * Integer.parseInt(src.substring(i + 1, in));
                else
                    value = Integer.parseInt(src.substring(i + 1, in));

                System.out.println("Value :" + value);
                pos = Integer.parseInt(src.substring(in + 1, in + 2));
                System.out.println("Position :" + pos);
                eq[pos] = value;
                if (degree < pos)
                    degree = pos;
            }
        }
        System.out.println("Solution :" + calculateSolution(eq, degree, st));
    }
    
    public static double calculateSolution(int eq[],int degree,double st) {
        int d[] = new int[degree];
        int i;
        for (i = 0; i < degree; i++) {
            d[i] = (i + 1) * eq[i + 1];
            System.out.println(d[i]);
        }

        for (i = 0; i <= 100; i++) {
            st = st - (cf(eq, st)) / (cf(d, st));
        }
        return st;
    }
    
    public static double cf(int e[],double x) {
        double res = 0;
        for (int i = 0; i < e.length; i++) {
            res = res + Math.pow(x, i) * e[i];
        }
        return res;
    }
}