import java.util.Scanner;

public class Practical2 {

    public static void sumOfNum(int num){
        int sum;
        int count=0;

        long startTime = System.nanoTime();
        sum = ((num*(num+1))/2);
        count++;
        long endTime = System.nanoTime();   
        System.out.println("Sum Is : "+ sum);

        System.out.println("Total Execution Time : "+ (endTime - startTime)+ "ns");
        System.out.println("Num Of Steps Executed : "+count);
    }


    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Value : ");
        int num = in.nextInt();

        sumOfNum(num);
    }
}
