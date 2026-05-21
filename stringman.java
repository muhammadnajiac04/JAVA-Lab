public class stringman {
    public static void main(String []args){
        String str="Hello World";
        int length=str.length();
        System.out.println("the string is "+str);
        System.out.println("length of the string is : "+length);
        String upper=str.toUpperCase();
        System.out.println(upper);
        String lower=str.toLowerCase();
        System.out.println(lower);
        String replace=str.replace('o','p');
        System.out.println(replace);
        String sub=str.substring(2,6);
        System.out.println(sub);
        boolean end=str.endsWith("World");
        System.out.println(end);
        boolean start=str.startsWith("World");
        System.out.println(start);
        String trim= "Hello,World".trim();
        System.out.println(trim);
    }
}