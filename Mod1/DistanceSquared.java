public class DistanceSquared {
    public static void main(String[] args) {
        if(args.length == 2){
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            System.out.print((int)Math.pow(x,2) + (int)Math.pow(y,2));
        }
    }
}
