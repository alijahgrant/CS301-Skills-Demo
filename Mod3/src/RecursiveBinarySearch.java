//Write a program named RecursiveBinarySearch.java that uses recursive binary search
//to determine whether a target value occurs in a sorted integer array.
// Your solution must use recursion and should repeatedly compare the target
// to the middle element of the current search range. Based on that comparison,
// recursively search either the left or right half of the array. Do not use a loop
// to search the array.

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] F = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18,19,20};

        System.out.println(rBS(F, 15));
        System.out.println(rBS(F,13));
    }
    public static boolean rBS(int[] a, int b){
        if(a.length == 0||a == null)return false;
        if(a.length==1){
            return a[0]==b;
        }
        return check(a,0,a.length-1,b);

    }
    private  static boolean check(int[] a, int left, int right, int b ){
        if(left > right){
            return false;
        }
        int mid = left + (right - left)/2 ;

        if (a[mid] == b) {
            return true;
        }else if(a[mid]< b){
            return check(a, mid + 1, right, b);
        }else {
            return check(a, left, mid - 1, b);
        }


    }
}
