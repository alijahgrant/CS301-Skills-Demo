//Write a program Stats.java that takes an integer command-line argument n,
// reads n floating-point numbers from standard input, and prints their mean (average value)
// and sample standard deviation (square root of the sum of the squares of their differences from the average,
// divided by n−1).  Use the StdIn library described by the textbook.
public class Stats {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        double ave = 0;
        double sd = 0;
        double[] f = new double[n];

        for (int i = 0; i < n; i++) {
            f[i] = StdIn.readDouble();
            ave += f[i];

        }
        ave = ave / n;

        for (int i = 0; i < n; i++) {
            f[i] = Math.pow(f[i] - ave, 2);

        }
        for (int i = 0; i < n; i++) {
            sd += f[i];

        }
        sd = Math.sqrt(sd/(n-1));
        System.out.println("The standard deviation of this sequence is " + sd);
        System.out.println("The mean value of this sequence is " + ave);
    }
}

