//Write a program ReverseString.java that takes a string and reverses it using recursion.

public class ReverseString {
    public static void main(String[] args) {
    System.out.print(reverse(args[0]));
    }
    public static String reverse(String s){
        char[] c = new char[s.length()];
        String x = "";
        s.getChars(0,s.length(),c,c[0]);

            for(int i = 1;i <= s.length();i++) {
            x += c[s.length() - i];
            }
            return x;
    }
}
