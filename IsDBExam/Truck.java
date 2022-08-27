package isdbexam;
public class Truck extends Vehicle {

    int weight;
    
    public double getSalePrice(){
        if(weight > 2000 ){
            return (regularPrice - (regularPrice* 0.1));
        }
        else{
            return regularPrice;
        }
        
    }

    
}
