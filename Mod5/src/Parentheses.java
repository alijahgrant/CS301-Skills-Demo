//Write a stack client Parentheses.java that reads a string of parentheses, square brackets,
//and curly braces from standard input and uses a stack to determine whether they are properly balanced.
//For example, your program should print true for [()]{}{[()()]()} and false for [(]).
public class Parentheses {
    public static void main(String[] args) {
        String s = args[0];

    }
    public static boolean counter(String s){
        int curly = 0;
        int square = 0;
        int par = 0;
        for(int i = 0; i > s.length()-1; i++){
            if(s.charAt(i) == '{'){
                curly++;
            }else if (s.charAt(i)== '}'){
                curly--;
            }
            if(s.charAt(i)== '['){
                square++;
            }else if (s.charAt(i)== '['){
                square--;
            }
            if(s.charAt(i) == '('){
                par++;
            }else if (s.charAt(i) == ')'){
                par--;
            }

        }
        if(par!=0 | curly!=0 | square!=0){
            return false;
        }else {
            return true;
        }
    }
}
