import java.io.*;
import java.util.Scanner;

class Str {
    private char s[];
    private int length;

    Str(String a) {
        s = new char[100000];
        for (int i = 0; i < a.length(); i++)
            s[i] = a.charAt(i);
        length = a.length();
    }

    void concat(Str b) {
        for (int i = length; i < b.length() + length; i++)
            s[i] = b.charAt(i - length);
        length += b.length();
    }

    void copyValueOf(String b) {
        for (int i = 0; i < b.length(); i++)
            s[i] = b.charAt(i);
        length = b.length();
    }

    int compareTo(Str b) {
        for (int i = 0; i < Math.min(this.length(), b.length()); i++)
            if (this.charAt(i) != b.charAt(i))
                return this.charAt(i) - b.charAt(i);
        if (this.length() < b.length())
            return -1;
        if (length() > b.length())
            return 1;
        return 0;
    }

    int length() {
        return length;
    }

    char charAt(int i) {
        if (i >= length)
            System.out.println("Index out of bound");
        return s[i];
    }
}
public class StringOverload {
    private static void print(String op) {
        System.out.print(op);
    }

    private static String getStr() {
        System.out.print("Enter second Str : ");
        return new Scanner(System.in).nextLine();
    }

    public static void main(String[] nvn) {
        Scanner scan = new Scanner(System.in);
        print("Enter the String : ");
        Str str1 = new Str(scan.nextLine());
        System.out.println("String operations : \n1.Concat\t2.copy\t3.Compare\t4.check length\t5.get charAt position n\t REST. Exit");
        while (true) {
            System.out.print("Enter your choice : ");
            int ch = Integer.parseInt(scan.nextLine());
            Str str2;
            switch (ch) {
                case 1:
                    str2 = new Str(getStr());
                    System.out.print("Concatinating second string to first string : \nString 1 -> ");
                    str1.concat(str2);
                    for (int i = 0; i < str1.length(); i++)
                        print("" + str1.charAt(i));
                    print("\n");
                    break;
                case 2:
                    String s = getStr();
                    System.out.print("Copying second string to first string : \nString 1 -> ");
                    str1.copyValueOf(s);
                    for (int i = 0; i < str1.length(); i++)
                        print("" + str1.charAt(i));
                    print("\n");
                    break;
                case 3:
                    str2 = new Str(getStr());
                    System.out.println("Comparing first string with second string : \n->" + str1.compareTo(str2));
                    break;
                case 4:
                    System.out.println("Length of the string : " + str1.length());
                    break;
                case 5:
                    System.out.print("Enter the index to find character : ");
                    System.out.println("Result : " + str1.charAt(Integer.parseInt(scan.nextLine())));
                default:
                    System.exit(0);
            }
        }
    }
}