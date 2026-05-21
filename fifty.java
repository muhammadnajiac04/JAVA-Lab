import java.util.*;
interface shape{
    double area();
    double perimeter();
}
 class circle implements shape{
    double radius;
circle(double radius){
    this.radius=radius;
}
public double area(){
    return 3.14*radius*radius;
}
public double perimeter(){
    return 2*3.14*radius*radius;
}
}
 class rect implements shape{
    double l;
    double b;
rect(double l,double b){
    this.l=l;
    this.b=b;
}
public double area(){
    return l*b;
}
public double perimeter(){
    return 2*l*b;
}
}
public class fifty{
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        int choice;
        while(true){
        System.out.println("menu");
    System.out.println("1.for circle");
    System.out.println("2.for rectangle");
    System.out.println("3.exit");
    System.out.println("enter ur choice");
    choice=sc.nextInt();
    switch(choice){
    case 1:
        System.out.println("enter the radius");
        double radius=sc.nextDouble();
        circle c=new circle(radius);
        System.out.println("area "+c.area());
        System.out.println("perimeter"+c.perimeter());
        break;
            case 2:
        System.out.println("enter the length");
        double lenth=sc.nextDouble();
        System.out.println("enter the breath");
        double breadth=sc.nextDouble();
        rect r=new rect(lenth,breadth);
        System.out.println("area "+r.area());
        System.out.println("perimeter"+r.perimeter());
        break;
        case 3:
        return;
        default:
            System.out.println("invalid");
    }
}
}
}