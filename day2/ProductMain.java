package day2;

 class Product {
	String[] type= {"Electronics","Clothes","Food"};
	int[] per= {10,12,15};
    private double price;
    private String category;
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return this.price;
    }
    public void setCategory(String category){
        this.category=category;
    }
    public String getCategory(){
        return this.category;
    }
    double discount(){
        double dis=this.price*0.1;
        return this.price-dis;
    }
    double discount(String category){
    	int percen=0;
    	for(int i=0;i<3;i++) {
    		if(type[i]==category) {
    			percen=per[i];
    		}
    	}
    	double dis=this.price*(percen/100.0);
        return this.price-dis;
    }

}
public class ProductMain{
    public static void main(String[] args) {
        Product p=new Product();
        p.setPrice(1000);
        p.setCategory("Clothes");
        System.out.println("Original discount is 10% "+p.discount());
        System.out.println("Custom Discount "+p.discount(p.getCategory()));
        
    }
}
