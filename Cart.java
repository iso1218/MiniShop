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
		if(cartMap.isEmpty()) {
			System.out.println("장바구니가 비어 있습니다");
			return;
		}
		
		for (Product product : cartMap.ketSet()) {
			int quantity = cartMap.get(product);
			System.out.println("- " + product.getName() + " : " + quantity + "개");
		}
	}
	
	public double getTotalPrice() {
		double total = 0;
		
		for (Product product : cartMap.keySet()) {
			int quantity = cartMap.get(product);
			double price = product.getPrice();
			
			total += (price * quantity);
		}
		return total;
	}
}
