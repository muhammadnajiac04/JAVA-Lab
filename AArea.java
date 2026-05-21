interface InterGra{
    int tri(int l,int b);
    int sqr(int l);
    double cir(double r);
    double rect(double l,double w);


}
public class AArea implements InterGra{
    public int tri(int l,int b){
        return l*b;

    }
        public int sqr(int l){
        return l*l;

    }
        public double cir(double r){
        return 3.14*r*r;

    }
        public double rect(double l, double b){
        return l*b;

    }
}