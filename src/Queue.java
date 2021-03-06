import java.util.Scanner;

public class Queue {
    public static void main(String[] nvn) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of Queue : ");
        int n = scan.nextInt(),Q[] = new int[n],r = -1;
        System.out.println("Queue operations:\n1.Insert\t2.Delete\t3.Display");
        while (true) {
            System.out.print("Enter your choice : ");
            int c = scan.nextInt();
            switch (c) {
                case 1:
                    if (r == n - 1)
                        System.out.println("Queue is Full!");
                    else {
                        System.out.print("Enter element : ");
                        Q[++r] = scan.nextInt();
                    }
                    break;
                case 2:
                    if (r < 0)
                        System.out.println("Queue is Empty!");
                    else {
                        System.out.println("Deleted element : " + Q[0]);
                        System.arraycopy(Q, 1, Q, 0, r--);
                    }
                    break;
                case 3:
                    if (r < 0)
                        System.out.println("Queue is Empty!");
                    else {
                        System.out.println("Queue contains : ");
                        for (int i = 0; i <= r; i++)
                            System.out.print(Q[i] + "\t");
                        System.out.println();
                    }
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
