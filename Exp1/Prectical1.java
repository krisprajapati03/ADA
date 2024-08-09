import java.util.*;

public class Prectical1 {

    public static void sumOfNum(int num){
        int sum = 0;
        int i=1;
        int count = 0;
        
        long startTime = System.nanoTime();
        while(i<=num){
            count ++;
            sum += i;
            count++;
            i++;
        }

        // for(int i=1; i<=num ; i++){
        //     sum += i;
        // }
        long endTime = System.nanoTime();

        System.out.println("Sum Is : "+sum);
        System.out.println("Time Taken : "+(endTime - startTime) +"ns");
        System.out.println("Num Of Steps Executed : "+count);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value : ");
        int num = sc.nextInt();
        sumOfNum(num);
    }
}