import java.util.Scanner;

public class Stack {
    public static void main(String nvn[]) {
        Scanner scan = new Scanner(System.in);
        int stack[], top = -1;
        System.out.print("Enter size of stack : ");
        int n = scan.nextInt();
        stack = new int[n];
        System.out.println("Stack operation:\n1.Push\t2.Pop\t3.Display");
        while (true) {
            System.out.print("Enter your choice : ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    if (top == n - 1)
                        System.out.println("Stack Overflow!");
                    else {
                        System.out.print("Enter element : ");
                        stack[++top] = scan.nextInt();
                    }
                    break;
                case 2:
                    if (top == -1)
                        System.out.println("Stack Underflow!");
                    else
                        System.out.println("Popped element : " + stack[top--]);
                    break;
                case 3:
                    if (top == -1)
                        System.out.println("Stack Underflow!");
                    else {
                        System.out.println("stack contains : ");
                        for (int i : stack)
                            System.out.println(i);
                    }
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
