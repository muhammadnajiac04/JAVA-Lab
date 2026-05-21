 import java.util.*;
class Employee{
    int id;
    String name;
    int salary;
    String address;
    Employee(int id,String name,int salary,String address){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.address=address;}
        public void display(){
            System.out.println("the id= "+id);
            System.out.println("the name= "+name);
            System.out.println("the salary= "+salary);
            System.out.println("the address= "+address);
            
        }
}
    
    class teacher extends Employee{
        String dep;
        String sub;
        teacher(int id,String name,int salary,String address,String dep,String sub){
            super(id,name,salary,address);
            this.dep=dep;
            this.sub=sub;
        }
            public void display() 
{
            super.display();
            System.out.println("the dept= "+dep);
            System.out.println("the sub= "+sub);
}
}
public class prg{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no: teachers ");
        int n=sc.nextInt();
        sc.nextLine();
         teacher []t=new teacher[n];
         for(int i=0;i<n;i++){
              System.out.println("enter the  detailsof teacher" +(i+1));
              System.out.println("enter the id");
              int id=sc.nextInt();
              sc.nextLine();
              System.out.println("enter the name");
               String name=sc.nextLine();
              System.out.println("enter the salary");
              int salary=sc.nextInt();
              sc.nextLine();
              System.out.println("enter the address");
               String address=sc.nextLine();
              System.out.println("enter the dept");
               String dep=sc.nextLine();
              System.out.println("enter the sub");
               String sub=sc.nextLine();
              t[i]=new teacher(id,name,salary,address,dep,sub);
         }
        System.out.println("\n teacher details is \n");
        for(int i=0;i<n;i++){
            t[i].display();
            System.out.println();
        }
        sc.close();
    }
} 
    
