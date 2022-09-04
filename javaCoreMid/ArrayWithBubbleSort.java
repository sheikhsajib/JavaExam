package coremidexam;
import java.util.Arrays;
public class ArrayWithBubbleSort {

    
//Question No: 3
    
    public static void main(String[] args) {
        
        int bubbleArr[] =  {60,30,25,43,56,70,10};
        
        for(int i = 1 ; i<bubbleArr.length; i++){
            for(int j = 0; j<bubbleArr.length-1; j++ ){
                if(bubbleArr[j] > bubbleArr[j+1]){
                    int temp = bubbleArr[j];
                    bubbleArr[j] = bubbleArr[j+1];
                    bubbleArr[j+1] = temp;
                }
                System.out.println("Step "+ j + " of "+ i + " : "+ Arrays.toString(bubbleArr));
            }
            System.out.println("----------------------");
            System.out.println(Arrays.toString(bubbleArr));

        }
        System.out.println("Final Result : " + Arrays.toString(bubbleArr));
    }
}