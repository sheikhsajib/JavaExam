package maxmintest;
import java.util.Scanner;
public class SumTill0 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);    
    double allSum = 0;
    while(true){
        System.out.println("Enter Your value : ");
        double value = input.nextDouble();
        allSum += value;
        
        if(0 == value){
            break;
        }
    }
    System.out.println(allSum);
    }
}
