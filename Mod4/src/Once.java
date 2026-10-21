//Write a program, Once.java, that reads in a string and prints the first character
//that appears exactly once in the string. Ex: ABCDBADDAB -> C.
public class Once {
    public static void main(String[] args) {

    System.out.println(Once(args[0]));
    }
    public static char Once(String s){
        if(s == null || s.isEmpty()) return ' ';
        char c = ' ';
        int count = 0;
        String left = " ";
        String right = " ";
        //check every char in s
        for(int i = 0 ; i < s.length();i++){
            c = s.charAt(i);
            if(i < s.length()-1) {
                right = s.substring(i + 1);
                //check right for c
                for (int j = 0; j < right.length(); j++) {
                    if (right.charAt(j) == c) {
                        count++;
                    }
                }
            }
            if(i>0){
                left = s.substring(0,i);
                //check left for c
                for(int j =0; j < left.length(); j++){
                    if(left.charAt(j)==c){
                        count++;
                    }
                }
            }
            if(count == 0){
                return c;
            }else{
                count=0;
            }
        }
        return ' ';

    }
}
/*

if(count ==0){
            for(int i = 0;i < s.length();i++) {
                c = s.charAt(i);
                for (int j = 0; j < s.length(); j++) {
                    if (c != s.charAt(j)) {
                        break;
                    }

                }
            }


        }
 */
