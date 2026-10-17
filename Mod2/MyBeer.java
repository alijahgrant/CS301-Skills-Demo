//A large number of college students are attending a party.
// Each guest is drinking a can of beer (or soda of they are under 21).
// An emergency causes the lights to go out and the fire alarm to go off.
// The guests calmly put down their beer and exit the building.
// When the alarm goes off, they re-enter and try to retrieve their beer.
// However, the lights are still off, so each student randomly grabs a bottle of beer.
// What are the chances that at least one student gets his or her original beer?
// Write a program MyBeer.java that takes a command-line argument n and runs 1,000 simulations this event,
// assuming there are n guests. Print the fraction of times that at least one guest gets their original beer.

public class MyBeer {
    public static void main(String[] args) {
        int beers = Integer.parseInt(args[0]);
        int w = 0;
        int l = 0;
        int[] match = new int[beers];

        //simulates 1000 simulations
        for(int i = 0; i < 1000; i++){
            //puts an element in every index
            for(int k = 0; k < beers; k++) {
                match[k]= k;
            }
            shuffle(match);
            int count = 0;
            int j = 0;
            //while no matches are made, and we haven't hit the end of the array, check for matches
            while(count == 0 && j < match.length){
                if(match[j]==j){
                    count++;
                    w++;
                }
                j++;
            }
            if(count == 0) l++;
        }
        double fraction = ((double) w/ 1000);
        if(l!=0){
            System.out.print( fraction  + " is the fraction of times at least one person picked up their beer");
        }else{
            System.out.print(" 1.0 is the fraction of time at least one person picked up their beer");
             }
    }
    public static void exch(int[] a, int i, int j) {
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
    public static void shuffle(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n-i));   // between i and n-1
            exch(a, i, r);
        }
    }
}
