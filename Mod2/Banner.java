//Write a program Banner.java that takes a string s from the command line
// and display it in banner style on the screen, moving from left to right
// and wrapping back to the beginning of the string as the end is reached.
// Add a second command-line argument to control the speed. Use the StdDraw
// library described in the textbook.

public class Banner {
    public static void main(String[] args) {

        String s = args[0];
        int speed = Integer.parseInt(args[1]);
        double i = 0.0;

        StdDraw.setCanvasSize(500,500);
        StdDraw.enableDoubleBuffering();

        for(int j = 0; j != 5;j++) {
            while (i < 1) {
                StdDraw.clear();
                StdDraw.text(i, .5, s);
                StdDraw.show();
                StdDraw.pause(speed);
                i+=.005;
            }
            StdDraw.text(0, .5, s);
            i = 0;
        }
    }
}
