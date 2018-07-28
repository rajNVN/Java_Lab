import java.util.Scanner;

public class Matrix {
    public static void main(String nvn[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the order of MATRIX 1:");
        int m1=scan.nextInt();
        int n1=scan.nextInt();
        System.out.print("Enter the order of MATRIX 2:");
        int m2=scan.nextInt();
        int n2=scan.nextInt();
        if(n1==m2)
        {
            int mat1[][]=new int[m1][n1];
            System.out.println("Enter MATRIX 1 values:");
            for(int i=0;i<m1;i++)
                for(int j=0;j<n1;j++)
                    mat1[i][j]=scan.nextInt();
            int mat2[][]=new int[m2][n2];
            System.out.println("Enter MATRIX 2 values:");
            for(int i=0;i<m2;i++)
                for(int j=0;j<n2;j++)
                    mat2[i][j]=scan.nextInt();
            int product[][]=new int[m1][n2];
            for(int i=0;i<m1;i++)
                for(int j=0;j<n2;j++)
                    for(int k=0;k<n1;k++)
                        product[i][j]+=mat1[i][k]*mat2[k][j];
            System.out.println("PRODUCT:");
            for(int i[]:product)
            {
                for(int j:i)
                    System.out.print(j+"\t");
                System.out.println();
            }
        }
    }
}
