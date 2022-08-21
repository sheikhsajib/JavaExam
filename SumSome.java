
package maxmintest;

import java.util.Scanner;

public class SumSome {

    public int doSomeSum( int ... a ){
        int result = 0;
        for( int val : a ){
            result += val;
        }
        return result;
    }

    public double doSomeSum( double ... a ){
        double result = 0;
        for(double val : a ){
            result+= val;
        }
        return result;
    }
}
