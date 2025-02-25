import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

class Product{  
    int id;  
    String name;  
    float price;  
      
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class Collectors {
	public static void main(String args[]) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1,"HP Laptop",25000f));
		list.add(new Product(2,"Dell Laptop",30000f));
		list.add(new Product(3,"Lenevo Laptop",28000f));
		list.add(new Product(4,"Sony Laptop",28000f));
		List<Float> productPriceList =   
                list.stream()  
                            .map(x->x.price)         // fetching price  
                            .collect(Collectors.toList());  
	}

}
