package OOP;

public class Customer {
	int id;
	String name;
	int discount;
	public Customer(int id, String name, int discount) {
		this.id = id;
		this.name = name;
		this.discount = discount;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return String.format("Customer[name=%s,id=%d,discount=%d]",name,id,discount);
	}
	
}
