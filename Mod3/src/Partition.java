//Write a program Partition.java that takes a positive integer N as a command-line argument
//and prints out all partitions of N. A partition of N is a way to write N as a sum of positive integers.
//Two sums are considered the same if they only differ in the order of their constituent summands.

public class Partition {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
    part(N,N,"");
    }


    public static void part(int n, int max, String s) {
        if (n == 0) {
            System.out.println(s);
        } else {
            for (int i = Math.min(n, max); i >= 1; i--) {
                if (s.equals("")) {
                    part(n - i, i, s + i);
                } else {
                    part(n - i, i, s + " " + i);
                }
            }
        }


    }
}









