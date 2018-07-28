import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Binary {
    public static void main(String nvn[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of array :");
        int n = scan.nextInt();
        int array[] = new int[n];
        System.out.print("Enter array elements :");
        for (int i = 0; i < n; i++)
            array[i] = scan.nextInt();
        System.out.print("Enter key to be searched:");
        int key = scan.nextInt();
        new Binary().search(array, key);
    }

    void search(int[] a, int k) {
        int low = 0, high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == k) {
                System.out.println("Key found at : " + (mid + 1));
                System.exit(0);
            } else {
                if (a[mid] < k)
                    high = mid - 1;
                else
                    low = mid + 1;
            }
        }
        System.out.println("Key not found!!!");
    }
}
