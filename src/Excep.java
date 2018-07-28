import java.io.*;
import java.util.Scanner;

public class Excep {
    public static void main(String[] nvn)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Exception : \n1.IOException\t2.Arithmetic related Exceptions\t3.ArrayOutOfBoundsException\t4.StringIndexOutOfBoundsException");
        while(true) {
            System.out.print("Enter your choice for Exception : ");
            try {
                int c = Integer.parseInt(scan.nextLine());
                String str;
                switch (c) {
                    case 1:
                        File file = new File("C:/filename.exe");
                        new FileInputStream(file);
                        break;
                    case 2:
                        System.out.print("A: ");
                        int a = Integer.parseInt(scan.nextLine());
                        System.out.print("B: ");
                        int b = Integer.parseInt(scan.nextLine());
                        int d = a / b;
                        System.out.println("C=" + d + "\nAll went right no Exceptions triggered!");
                        break;
                    case 3:
                        int[] array = {1, 2, 3, 4, 5};
                        System.out.println("array[5] : {1,2,3,4,5}");
                        System.out.print("Enter the index to retrieve element:");
                        int i = Integer.parseInt(scan.nextLine());
                        System.out.println("Array[" + i + "]=" + array[i - 1]);
                        System.out.println("All went right no Exceptions triggered!");
                        break;
                    case 4:
                        str = "Hey this is NVN";
                        System.out.println("Sentence : \"Hey this is NVN\"");
                        System.out.print("Enter the index to display characterAt:");
                        System.out.println(str.charAt(Integer.parseInt(scan.nextLine())));
                        System.out.println("All went right no Exceptions triggered!");
                        break;
                    default:
                        System.exit(0);
                }
            } catch (IOException e) {
                System.out.println("tried to read filepath \"C:/filename.exe\" \n*IOException triggered!*");
            } catch (NumberFormatException e) {
                System.out.println("*NumberFormatException triggered!*");
            } catch (ArithmeticException e) {
                System.out.println("*ArithmeticException triggered!*");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("*ArrayIndexOutOfBoundsException triggered!*");
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("*StringIndexOutOfBoundsException triggered!*");
            }
        }
    }
}
