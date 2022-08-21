package javaexam;
import java.util.Random;
public class uniqRandom {
    public static void main(String[] args) {
        Random rdm = new Random();
        for (int i = 1; i <= 10; i++) {
            int value = rdm.nextInt(100);
            System.out.println(i + " random Number is : " + value);
        }
    }
}
