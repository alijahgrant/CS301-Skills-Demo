//Write a program TwentyFivePerLine.java that, using one for loop and one if statement,
//prints the integers from 1000 to 2000 with 25 integers per line. Hint: use the % operator.
public class TwentyFivePerLine{
    public static void main(String[] args){
        int j = 0;

            for(int i = 1000; i <= 2000; i++){
                if(j != 25){
                    System.out.print(i + " ");
                    j++;
                }else{
                    System.out.println(i);
                    j = 0;
                }
            }
    }




}
