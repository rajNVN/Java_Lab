/*import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Stak {
    public static void main(String nvn[]) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> s= new Stack<>();
        System.out.println("Stack operations:\n1.Push\t2.Pop\t3.Display");
        while (true) {
            try{
                System.out.print("Enter your choice:");
                int c = scan.nextInt();
                switch (c) {
                    case 1:
                        System.out.print("Enter element:");
                        s.push(scan.nextInt());
                        break;
                    case 2:
                        System.out.println("Popped element: " + s.pop());
                        break;
                    case 3:
                        if(s.isEmpty())
                            break;
                        System.out.println("Stack containes:");
                        Iterator<Integer> it=s.iterator();
                        while(it.hasNext()) {
                            System.out.print(it.next() + "\t");
                        }
                        System.out.println();
                        break;
                    default:
                        System.exit(0);
                }
            }
            catch(EmptyStackException e)
            {
                System.out.println("Stack Underflow!");
            }
            catch(StackOverflowError e)
            {
                System.out.println("Stack Overflow!");
            }
        }
    }
}
*/