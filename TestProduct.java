package lab_practice;

class Product {
	private int productId;
	private String productName;
	private double price;
	private int qty;

	public Product(int productId, String productName, double price, int qty) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.qty = qty;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {

		return "Product[productId=" + productId + ",productName =" + productName + ",price=" + price + ",qty=" + qty
				+ "]";
	}
}

class ShoppingCart {
	private Product[] products;
	private int capicity;
	private int size = 0;

	public ShoppingCart(int capicity) {
		super();
		this.capicity = capicity;
		products = new Product[capicity];
	}

	public int capicity() {
		return capicity;
	}

	public int size() {
		return size;
	}

	public void addProduct(Product product) {
		if (size < capicity) {
			Product p = findProductById(product.getProductId());
			if (p == null) {
				products[size++] = product;
				
			} else {
				p.setQty(product.getQty());
			}
		} else {
			System.out.println("cart is full");
		}
	}

	public Product findProductById(int id) {
		for (int i = 0; i < size; i++) {
			if (products[i].getProductId() == id) {
				return products[i];
			}
		}
		return null;
	}

	public void displayProducts() {
		if (size > 0) {
			
			for (int i = 0; i < size; i++) {
				System.out.println(products[i]);
			}
		} else {
			System.out.println("cart is empty");
		}
	}

	public double findproductPrice(String name) {
		for (int i = 0; i < size; i++) {
			if (products[i].getProductName().equalsIgnoreCase(name)) {
				return products[i].getPrice();
			}
		}
		return -1;
	}

	public double calculateTotalPrice() {
		double totalPrice = 0;
		for (int i = 0; i < size; i++) {
			Product p = products[i];
			totalPrice += p.getPrice() * p.getQty();
		}
		return totalPrice;
	}

	public void updateProductQty(int id, int newQty) {
		Product p = findProductById(id);
		if (p != null) {
			p.setQty(newQty);
		}
	}

	public void removeProduct(int id) {
		for (int i = 0; i < size; i++) {
			if (products[i].getProductId() == id) {
				for (int j = i; j < size - 1; j++) {
					products[i] = products[j + 1];
				}
				size--;
				products[size] = null;
			}
		}
	}

	public void clearCart() {
		for (int i = 0; i < size; i++) {
			products[i] = null;
		}
		size = 0;
	}
}

public class TestProduct {
	public static void main(String[] args) {
		Product p1 = new Product(101, "laptop", 50000, 10);
		Product p2 = new Product(102, "mobile", 70000, 10);
		Product p3 = new Product(103, "iphone", 60000, 10);
		Product p4 = new Product(104, "bag", 40000, 10);
		Product p5 = new Product(105, "shirt", 5000, 10);
		Product p6 = new Product(106, "jeans", 1000, 10);
		Product p7 = new Product(107, "cover", 300, 10);
		Product p8 = new Product(108, "book", 3000, 10);
		Product p9 = new Product(109, "headphone", 500, 10);
		Product p10 = new Product(110, "laptop", 140000, 10);

		ShoppingCart sc = new ShoppingCart(10);
		sc.addProduct(p1);
		sc.addProduct(p2);
		sc.addProduct(p3);
		sc.addProduct(p4);
		sc.addProduct(p5);
		sc.addProduct(p6);
		sc.addProduct(p7);
		sc.addProduct(p8);
		sc.addProduct(p9);
		sc.addProduct(p10);

		sc.displayProducts();

	}
}