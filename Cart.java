import java.util.HashMap;

public class Cart {
	
	HashMap<Product, Integer> cartMap = new HashMap<>();
	
	public void addProduct(Product product, int quantity) {
		if(cartMap.containsKey(product)) {
			int currentQuantity = cartMap.get(product);
			cartMap.put(product, currentQuantity + quantity)
		}else {
			cartMap.put(product, quantity);
		}
		
	}
	
	public void printCart() {
		
	}
	
	public double getTotalPrice() {
		double total = 0;
		
		return total;
	}
}
