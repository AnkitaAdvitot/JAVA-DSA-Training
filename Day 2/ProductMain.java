 class Product {
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
    public double getCategory(){
        return this.price;
    }
    double discount(){
        double dis=this.price*0.1;
        return this.price-dis;
    }
    double discount(int per){
        double dis=this.price*(per/100.0);
        return this.price-dis;
    }

}
public class ProductMain{
    public static void main(String[] args) {
        Product p=new Product();
        p.setPrice(1000);
        p.setCategory("Dress");
        System.out.println("Original discount is 10% "+p.discount());
        System.out.println("Custom Discount "+p.discount(20));
        
    }
}
