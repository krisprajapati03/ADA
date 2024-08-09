import java.util.Scanner;

public class Practical3 {


    public static int sumOfNum(int num, int count){
        if(num <= 1){
            count++;
            return num;
        }
        else
        return num+sumOfNum(num-1,count+=1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value : ");
        int num = sc.nextInt();
        int count=0;

        long startTime = System.nanoTime();
        int sum = sumOfNum(num,count);
        long endtime = System.nanoTime();

        System.out.println("Sum is : "+sum);
        System.out.println("Time Taken by code : "+ (endtime - startTime)+"ns");
        int count1=count;
        System.out.println("Num Of Steps Executed : "+count1);
    }
}
