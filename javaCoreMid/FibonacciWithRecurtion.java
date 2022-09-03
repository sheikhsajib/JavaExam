package practiceformidexam;

public class FibonacciWithRecurtion {

    static int a = 0;
    static int b = 1;
    static int c;

    public static void main(String[] args) {
        System.out.print(a + " ");
        System.out.print(b + " ");
        
        doFibonacci(10);
    }

    static public void doFibonacci(int i) {
        if (i >= 3) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;

            doFibonacci(i - 1);
        }
    }
}
