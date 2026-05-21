class complex{
    int real;
    int img;

complex(int r,int i){
    this.real=r;
    this.img=i;
}
public static void main(String args[]){
    complex c1=new complex(1,2);
    complex c2=new complex(3,4);
    int realsum=c1.real+c2.real;
    int imgsum=c1.img+c2.img;

    System.out.println(realsum+"+"+imgsum+"i");
}
}