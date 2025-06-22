package Inventory;

public class Product {
	
	    private static int count;
	    private String productId;
	    private String productName;
	    private int quantity;
	    private double price;

	    Product(String productName, int quantity, double price){
	        setProductId("PROD_" + count);
	        setProductName(productName);
	        setPrice(price);
	        setQuantity(quantity);
	        count++;
	    }

	    public String getProductId() {
	        return productId;
	    }

	    public void setProductId(String productId) {
	        this.productId = productId;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    public String getProductName() {
	        return productName;
	    }

	    public void setProductName(String productName) {
	        this.productName = productName;
	    }
	}

