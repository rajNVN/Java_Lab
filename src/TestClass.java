//Remixed program
/*class Neton {

    private double getRoot(ArrayList<Integer> co_efficients, ArrayList<Integer> powers, double x) {
        double fx = 0, dfx = 0;
        for (int i = 0; i < powers.size(); i++) {
            double power = powers.get(i);
            if (i < powers.size() - 1)
                dfx += (co_efficients.get(i) * power) * Math.pow(x, power - 1);
            fx += (co_efficients.get(i)) * Math.pow(x, power);
        }
        return (x - (fx / dfx));
    }

    public static void main(String nvn[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the equation <_X2+_X1+_X0> : ");
        String eqn = scan.nextLine();
        System.out.print("Enter x value:");
        double x = scan.nextDouble();
        ArrayList<Integer> c = new ArrayList<Integer>();
        ArrayList<Integer> p = new ArrayList<Integer>();
        for (int i = 0; i < eqn.length(); i++)
            if (eqn.charAt(i) == 'X') {
                if (i - 2 >= 0 && eqn.charAt(i - 2) == '-')
                    c.add(-(Integer.parseInt(eqn.substring(i - 1, i))));
                else
                    c.add(Integer.parseInt(eqn.substring(i - 1, i)));
                p.add(Integer.parseInt(eqn.substring(i + 1, i + 2)));
            }
        double root = new Neton().getRoot(c, p, x);
        System.out.println("Root--->" + root);
    }
}
*/

import java.io.*;
class newtonRamp {
    double f(int[] eq, double x) {
        double val = 0;
        for (int i = 0; i < eq.length; i++) {
            val = val + Math.pow(x, i) * eq[i];
        }
        return val;
    }

    double solution(int[] eq, double st, int deg) {
        int[] deq = new int[deg];
        for (int j = 0; j < deg; j++) {
            deq[j] = (j + 1) * eq[j + 1];
        }
        for (int i = 0; i < 100; i++) {
            st = st - f(eq, st) / f(deq, st);
        }
        return st;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader ip = new BufferedReader(new InputStreamReader(System.in));
        newtonRamp my = new newtonRamp();
        System.out.println("Enetr the equation");
        System.out.println("Format < 1x2-2x1-2x0 > for equation"
                + " \"x square - 2*x - 2\" (!!dont add extra spaces!!)");
        String eqs = new String();
        eqs = ip.readLine();
        System.out.println("Enter the Expexted root");
        int st = Integer.parseInt(ip.readLine());
        int n = eqs.length();
        int[] eq = new int[n];
        int deg = 0, pos, val;
        for (int i = 1; i < n; i++) {
            if (eqs.charAt(i) == 'x') {
                pos = Integer.parseInt(eqs.substring(i + 1, i + 2));
                if (i - 2 >= 0 && eqs.charAt(i - 2) == '-')
                    val = -1 * Integer.parseInt(eqs.substring(i - 1, i));
                else
                    val = Integer.parseInt(eqs.substring(i - 1, i));
                if (pos > deg) deg = pos;
                eq[pos] = val;
            }
        }
        System.out.println("Approximate solution = " + my.solution(eq, st, deg));
    }
}