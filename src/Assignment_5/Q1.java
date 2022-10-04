package Assignment_5;

interface PrivateMethod{
    private String reverseString(String string){
        StringBuffer sb = new StringBuffer(string);
        return sb.reverse().toString();
    }
    static String toUpperCase(String s){
        return s.toUpperCase();
    }

    static String toLowerCase(String s){
        return s.toLowerCase();
    }
}

public class Q1 {
    public static void main(String[] args) {
        System.out.println(PrivateMethod.toLowerCase("Hii......I am Mohit"));
        System.out.println(PrivateMethod.toLowerCase("Good day"));
    }
}
