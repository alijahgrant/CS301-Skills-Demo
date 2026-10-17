//Write a program Circles.java that draws filled circles of random size at random positions
// in the unit square, producing images like those below. Your program should take four command-line
// arguments: the number of circles, the probability that each circle is black, the minimum radius,
// and the maximum radius. Use the StdDraw library described in the textbook.
// Feel free to reference the library's documentation as necessary.
public class Circles {
    public static void main(String[] args) {
        //Takes in variables from command-line
        int numb = Integer.parseInt(args[0]);
        double prob = Double.parseDouble(args[1]);
        double minR = Double.parseDouble(args[2]);
        double maxR = Double.parseDouble(args[3]);
        //creates the unit square
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.square(.5, .5, .5);

    //iterates through number of circles while creating a random radius, random probability number
    //and the coordinates (x,y) for the radius
        for (int i = 0; i < numb; i++) {
            double randRadius =  (Math.random() * (maxR - minR) + minR);
            double randProb =  (Math.random() * 100);
            double x = Math.random();
            double y = Math.random();
            //if the random number is greater than the probability then
            //print an unfilled circle
            if (randProb < prob) {
                //unfilled circle
                StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.filledCircle(x,y, randRadius);
            } else {
                //filled circle
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.filledCircle(x, y, randRadius);
            }

        }

    }
}



