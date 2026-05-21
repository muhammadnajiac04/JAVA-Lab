import java.util.*;
interface sports {
public void getdata();
public void displaydata();
    
}
class student{
    int roll;
    String name;
    int score;
    student(int roll,String name,int score){
this.roll=roll;
this.name=name;
this.score=score;
    }
    void display(){
        System.out.println("details is ");
        System.out.println("name "+name);
        System.out.println("roll"+roll);
        System.out.println("score is "+score);
    }
}
class result extends student implements sports{
    int sportscore;
    Scanner sc=new Scanner(System.in);
    result(int roll,String name,int score){
        super(roll,name,score);

    }
    public void getdata(){
        System.out.println("enter you sports score ");
        sportscore =sc.nextInt();
    }
        public void displaydata(){
        System.out.println(" sports score "+sportscore);
    }
}
public class forty{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String name;
    int roll,mark;
    System.out.println("enter roll");
    roll=sc.nextInt();
    sc.nextLine();
        System.out.println("enter name");
    name=sc.nextLine();
        System.out.println("enter score");
    mark=sc.nextInt();
result re=new result(roll, name, mark);
re.getdata();
re.display();
re.displaydata();
}
}