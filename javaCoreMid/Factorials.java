package practiceformidexam;
public class Factorials {
   static int facto = 1;
   public static void main(String[] args) {
//       Factorials with Recurtion;
        System.out.println(doFactorials(5));
    }
    public static int doFactorials (int i){
        if(i>1){
            facto *= i;
            doFactorials(i - 1);
        } 
       return facto;
    }
}
