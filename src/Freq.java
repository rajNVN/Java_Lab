import java.util.Scanner;
import java.util.StringTokenizer;

public class Freq {
    public static void main(String nvn[])
    {
        System.out.print("Enter the string you want to check : ");
        StringTokenizer st = new StringTokenizer(new Scanner(System.in).nextLine());
        System.out.print("Enter the pattern to be searched : ");
        String pattern = new Scanner(System.in).nextLine();
        int count = 0;
        while(st.hasMoreElements())
            if(st.nextElement().equals(pattern))
                count++;
        System.out.println("Count ---> "+count);
    }
}
