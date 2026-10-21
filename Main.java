
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ProductManager productManager = new ProductManager();
        Cart cart = new Cart();

        while (true) {
            System.out.println("\n===== MiniShop =====");
            System.out.println("1. 상품 목록");
            System.out.println("2. 장바구니 담기");
            System.out.println("3. 장바구니 확인");
            System.out.println("4. 총 결제 금액");
            System.out.println("0. 종료");
            System.out.print("메뉴 선택: ");

            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    productManager.printProducts();
                    break;

                case 2:
                    System.out.print("상품 번호: ");
                    int productNo = sc.nextInt();

                    System.out.print("수량: ");
                    int quantity = sc.nextInt();

                    Product product =
                            productManager.getProduct(productNo);

                    if (product != null) {
                        cart.addProduct(product, quantity);
                    } else {
                        System.out.println("상품을 찾을 수 없습니다.");
                    }
                    break;

                case 3:
                    cart.printCart();
                    break;

                case 4:
                    System.out.println(
                        "총 결제 금액: "
                        + cart.getTotalPrice() + "원"
                    );
                    break;

                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;

                default:
                    System.out.println("잘못된 메뉴입니다.");
            }
        }
    }
}
