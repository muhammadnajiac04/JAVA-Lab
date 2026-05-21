import java.util.*;
public class StringSort {
    public static void main(String[] args) {
        System.out.println("enter the number of strings");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String [] strings=new String[n];
        System.out.println("enter the strings");
        for(int i=0;i<n;i++){
            strings[i]=sc.next();
        }
        Arrays.sort(strings);
        System.out.println("sorted array is");
        for(int i=0;i<n;i++){
            System.out.println(strings[i]);

        }
        sc.close();


    }
}
