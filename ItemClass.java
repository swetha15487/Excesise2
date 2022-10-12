package Exercise1;



public class ItemClass {
	int itemid;
	String description;
	int price;
	String brand;

	public ItemClass(int itemid, String description, int price, String brand) {

		this.itemid = itemid;
		this.description = description;
		this.price = price;
		this.brand = brand;
	}

	public int getItemid() {
		return itemid;
	}

	public String getDescription() {
		return description;
	}

	public int getPrice() {
		return price;
	}

	public String getBrand() {
		return brand;
	}


	public String toString() {
		return "ItemClass [itemid=" + itemid + ", description=" + description + ", price=" + price + ", brand=" + brand
				+ "]";
	}
	

}
