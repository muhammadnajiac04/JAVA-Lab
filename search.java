import java.util.*;
public class search{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numver of element");
        int n=sc.nextInt();
                int arr[]=new int[n];
        System.out.println("enter the numbers");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        boolean found=false;
        System.out.println("enter the number to search");
        int search=sc.nextInt();
        for(int i=0;i<n;i++){
            if (arr[i]==search){

            System.out.println("element found at position"+(i+1));
                        found=true;
            break;
            }

            }
                        if(!found){
                System.out.println("not found");
        }
    }
}