import java.util.Scanner;

public class Bubble
{
    private void sort(int[] ar) {
        for (int i = 0; i < ar.length; i++)
            for (int j = 0; j < ar.length - i - 1; j++)
                if (ar[j] > ar[j + 1]) {
                    int t = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = t;
                }
    }

    public static void main(String[] nvn) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = scan.nextInt();
        System.out.println("Enter the array elements : ");
        int ar[] = new int[n];
        for (int i = 0; i < n; i++)
            ar[i] = scan.nextInt();
        new Bubble().sort(ar);
        System.out.println("Sorted list:");
        for (int i : ar)
            System.out.println(i);
    }
}
