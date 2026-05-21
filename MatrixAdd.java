import java.util.*;

class MatrixAdd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");

        int r=sc.nextInt();
        System.out.println("enter the number of cols");
        int c=sc.nextInt();

        int a[][]=new int[r][c];
        int b[][]=new int[r][c];
        System.out.println("Enter elements of first matrix:");
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                a[i][j]=sc.nextInt();
        System.out.println("Enter elements of second matrix:");
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                b[i][j]=sc.nextInt();
        System.out.println("added elements of matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
                System.out.print((a[i][j]+b[i][j])+" ");
            System.out.println();
        }
    }
}