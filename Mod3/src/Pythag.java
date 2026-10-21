//Write a static method areTriangular() that takes three double arguments and returns true
// if they could be the sides of a triangle (that is, none of them is greater than or equal
// to the sum of the other two)
public class Pythag {
    public static void main(String[] args) {

    }
    public static boolean areTriangular(double x, double y, double z){
        if(x == y && y == z){
        return true;
        }
        if(x < y & y > z){
            return Math.pow(x,2)+Math.pow(z,2) == Math.pow(y,2);
        }
        if(x > y & x > z){
            return Math.pow(y,2)+Math.pow(z,2) == Math.pow(x,2);
        }
        if(x < z & y < z){
            return Math.pow(x,2)+Math.pow(y,2) == Math.pow(z,2);
        }
        return false;
    }
}
