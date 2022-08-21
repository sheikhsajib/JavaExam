package maxmintest;

import java.util.Scanner;

public class Grading {
public static void doGrade(){
        Scanner input= new Scanner(System.in);
        int bangla =0;
        int math =0;
        int english =0;
        int java =0;

        System.out.println("Bangla Number");
        bangla=input.nextInt();

        System.out.println("Math Number");
        math=input.nextInt();

        System.out.println("English Number");
        english=input.nextInt();
        
        System.out.println("Java Number");
        java=input.nextInt();

        int total = bangla+math+english+java;
        int average = total/4;
        
        if(average>79 && average<100){
            System.out.println("Result"+"\n"+"A+");
        }else if(average>69 && average<80){
            System.out.println("Result"+"\n"+"A");
        }else if(average>59 && average<70){
            System.out.println("Result"+"\n"+"A-");
        }else if(average>49 && average<60){
            System.out.println("Result"+"\n"+"B");
        }else if(average>39 && average<50){
            System.out.println("Result"+"\n"+"C");
        }else if(average>33 && average<40){
            System.out.println("Result"+"\n"+"D");
        }


    }
}
