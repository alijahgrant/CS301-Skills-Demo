//Given an array a[] of N distinct integers (positive or negative) in ascending order.
//Devise an algorithm (hint: binary search!) to find an index i such that a[i] = i
//if such an index exists. Name this program BinarySearch.java.
//
public class BinarySearch {
    public static void main(String[] args) {
        int[] Demo ={-1,-2,2,4,5,7,9} ;
       System.out.print(BS(Demo,0,Demo.length));


    }
    public static int BS(int[] a,int l, int h){
        if(a == null || l > h)return -1;
        int m = l + (h-l)/2;
        if(a[m] == m) {
            return m;
        }

        if(a[m] < m){
            return BS(a,m+1,h);
        }else{
            return BS(a,l,m-1);
        }
    }
}
