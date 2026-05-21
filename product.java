class product{
    int code;
    String name;
    int price;
product(int c,String n,int p){
    code=c;
    name=n;
    price=p;
}
public static void main(String []args){
product p1 =new product(1, "pencil",5);
product p2= new product(2, "pen", 10);
product p3= new product(3, "book", 100);
product lowest=p1;
if (p1.price<p2.price && p1.price<p3.price){
    lowest=p1;
}
else if (p2.price<p1.price && p2.price<p3.price){
    lowest=p2;
}
else{
    lowest=p3;
}
System.out.println("the lowest price product "+lowest.name);
     System.out.println("the lowest price "+lowest.price);
      System.out.println("the lowest price code"+lowest.code);
}
}