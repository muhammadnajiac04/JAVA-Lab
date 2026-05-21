public class Area{
    public double area(double r){
        return Math.PI*r*r;
    }
    public double area(double l,double w){
        return l*w;
    }
    public int area (int b,int h){
        return b*h;
    }
    public int area(int l){
        return l*l;
    }
    public static void main(String args[]){
        Area obj=new Area();
        System.out.println("the area of circle is "+obj.area(5.0));
        System.out.println("the area of rectangle is "+obj.area(3.0,4.0));
        System.out.println("the area of circle is "+obj.area(4,3));
        System.out.println("the area of circle is "+obj.area(5));
    }
} 
