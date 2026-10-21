//A prominent northeastern university receives 20,000 student applications.
//Assume that the SAT scores of these individuals is normally distributed with mean 1200
//and standard deviation 100. Suppose the university decides to admit the 5,000 students
//with the best SAT scores. Write a Java program named SAT.java
//to estimate the lowest score that will still be admitted.


/*
* I could reverse or use the standard deviation method
* using the SD 100 value and the average SAT score 1200 to find values
* that equal to a 100 SD and have an average of 1200 then organize the values
* to find the lowest value of the 20,000 at index 5000
* */
public class SAT {
    public static void main(String[] args) {
        double[] stud= new double[20000];
        for(int i = 0; i < 20000; i++){
            stud[i] = (Math.random() * 200) + 1100;
        }
        bubbleSort(stud);
        System.out.print(stud[14999]);
    }
    private static void bubbleSort(double[] d){
        double j = 0;
        for(int i = 0; i < d.length-1; i++){
            if(d[i]>d[i+1]){
                j = d[i+1];
                d[i+1]=d[i];
                d[i]=j;
            }
        }

    }
}
