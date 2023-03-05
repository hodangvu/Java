package OOP;

public class Invoice {
	int id;
	Customer[] customer;
	double amount;
	public Invoice(int id, Customer[] customer, double amount) {
		this.id = id;
		this.customer = customer;
		this.amount = amount;
	}
	public Customer[] getCustomer() {
		return customer;
	}
	public void setCustomer(Customer[] customer) {
		this.customer = customer;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getId() {
		return id;
	}
	public int getCustomerID() {
		return id;
	}
	public String getCustomerName() {
		String rs = "";
		for(Customer customer2 : customer) {
			rs += customer2.getName() + ",";
		}
		if(!rs.isEmpty())
			rs = rs.substring(0, rs.length() -1);
		return rs;
	}
}
