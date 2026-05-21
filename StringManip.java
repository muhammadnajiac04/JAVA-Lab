class StringManip{
    public static void main(String args[]){
        String s="Hello World";

        System.out.println("the length is "+s.length());
        System.out.println("To upper case "+s.toUpperCase());
        System.out.println("the lower case"+s.toLowerCase());
        System.out.println("replace "+s.replace("World","Java"));
        System.out.println(s.substring(0,5));
    }
}