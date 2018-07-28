import java.util.Scanner;

public class Complex {
    private double real, img;

    private Complex(double a, double b) {
        real = a;
        img = b;
    }

    private Complex add(Complex a) {
        return new Complex(real + a.real, img + a.img);
    }

    private Complex sub(Complex a) {
        return new Complex(real - a.real, img - a.img);
    }

    private Complex mul(Complex a) {
        return new Complex(real * a.real - img * a.img, real * a.img + img * a.real);
    }

    private Complex div(Complex a) {
        Complex conjugate = new Complex(a.real, -a.img);
        Complex numerator = this.mul(conjugate);
        Complex denominator = a.mul(conjugate);
        return new Complex(numerator.real / denominator.real, numerator.img / denominator.img);
    }

    private void print() {
        System.out.println(real + "+ i " + img);
    }

    public static void main(String[] nvn) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Complex number numbers : ");
        Complex complex1 = new Complex(scan.nextDouble(), scan.nextDouble());
        System.out.print("Enter First Complex number numbers : ");
        Complex complex2 = new Complex(scan.nextDouble(), scan.nextDouble());
        System.out.println("1.ADDITION\t2.SUBTRACTION\t3.MULTIPLICATION\t4.DIVISION\t(Other):EXIT");
        while (true) {
            System.out.print("Enter choice : ");
            int ch = scan.nextInt();
            switch (ch) {
                case 1:
                    complex1.add(complex2).print();
                    break;
                case 2:
                    complex1.sub(complex2).print();
                    break;
                case 3:
                    complex1.mul(complex2).print();
                    break;
                case 4:
                    complex1.div(complex2).print();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
