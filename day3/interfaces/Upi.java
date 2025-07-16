package day3.interfaces;
import day3.interfaces.Payment;
public class Upi implements  Payment {
    
    @Override
   public  void payment(int money){
    	if(money<=0) {
    		System.out.println("Invalid amount");
    		return;
    	}
        System.out.println(money+" received through Upi" );
        
    }

    public void notification(){
        System.out.println(" ");
    }
}
