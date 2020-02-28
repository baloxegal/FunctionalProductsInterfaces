package dataProducts;

public class Product implements Cloneable /*Cloneable pentru varianta cu return obiect Product*/ {
	private String category;
    private String name;
    private Float price;
    private Integer quantity;
	
    public Product(String category, String name, Float price, Integer quantity) {
		super();
		this.category = category;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "category: " + category + ", name: " + name + ", price:" + (float)((int)(price * 100))/100 + ", quantity: " + quantity;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public Product clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Product) super.clone();
	}
}
