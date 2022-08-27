package isdbexam;
import java.util.Scanner;
public class IsDBExam {
    public static void main(String[] args) {
    
    
    
}
    static int num = 4;
    void recursiveMethod(){
    num--;
    if(num == 0)
      return;
    System.out.print(num + " ");
    recursiveMethod(); 
        
        
        
        
        
//        Question 3
//        Create a super class Called Vehicle. The vehicle class
//        has the folloing feilds and methods.
//        int speed; double regularPrice; 
//        String Color; 
//        double getSalePrice();
//        b. Create a sub class of Vehicle class and name it as 
//        Truck. The Truck class has the following 
//        fields and methods
//        int weight;
//        -Now override the double getSalePrice() method from its
//        super class and apply the following logic.
//        if weight>2000, 30% discount. Otherwise no descount on 
//        regularPrice;
        Scanner sc = new Scanner(System.in);
        Truck tk = new Truck();
        
        System.out.println("Set regularPrice : ");
        tk.regularPrice = sc.nextDouble(); //50000;
        System.out.println("Set Vehicle Weight : ");
        tk.weight = sc.nextInt(); //2500;

        System.out.println("Truck Sele Price is :  " + tk.getSalePrice());

 //   }
    
}
