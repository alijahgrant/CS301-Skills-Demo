

public class ROT13 {
    public static void main(String[] args) {

    System.out.print(rotate("Encryption"));
    }
    public static String rotate(String s){
        char[][] c ={ {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'} ,{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'}};
        String next = "";
        int j = 0;
        int k = 0;
        int count = 0;
        for(int i =0; i < s.length(); i++){
            while(s.charAt(i)!=c[k][j]){
                j++;
                System.out.println(j+" Array: "+ c[k][j] + " Letter: " + s.charAt(i) );
                if(j == 25){
                    j=0;
                    k=1;
                }
                count++;
            }
            if(j > 12){
                next+= c[k][j-13];
            }else{
                next+= c[k][j+13];
            }
            k=0;
            j=0;
            count=0;
        }
        return next;
    }
}
