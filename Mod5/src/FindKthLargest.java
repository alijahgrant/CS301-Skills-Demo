//Given an array of N elements, not necessarily in ascending order, devise an
//algorithm to find the kth largest one. It should run in O(N) time on random inputs.
public class FindKthLargest {
    public static void main(String[] args) {

    }
    public static int kLarge(int[] a){
        if(a == null|| a.length==0 )return 0;
        int x = a[0];
      for(int i = 1;i < a.length-1;i++) {
        if(a[i] > x){
            x = a[i];
        }
      }
      return x;
    }
}
