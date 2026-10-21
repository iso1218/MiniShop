
import java.util.ArrayList;
import java.util.List;

public class ProductManager {
	List<Product> product = new ArrayList<>();
	
	
	public void printProducts() {
		product.add(new Product("키보드", 50000, 10));
		product.add(new Product("마우스", 25000, 20));
		product.add(new Product("모니터", 300000, 5));
		product.add(new Product("헤드셋", 80000, 8));
		product.add(new Product("USB", 15000, 30));
		
		System.out.println("===== 상품목록 =====");
		for(int i = 0 ; i < product.size() ; i++) {
			System.out.println("상품 번호 : " + i+1 + ", 상품명 : " + product.get(i).name + 
					", 가격 : " + product.get(i).price + "원, 초기제고 : " + product.get(i).stock + "개");
		}
	}
	
	public Product getProduct(int productNo) {
		if(productNo <= 0) {
			return null;
		}
		Product pro = product.get(productNo-1);
		return pro;
	}
}
