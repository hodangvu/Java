package OOP;

public class InvoiceItem {
	String id;
	String desc;
	int qty;
	double unitPrice;
	public InvoiceItem(String id, String desc, int qty, double unitPrice) {
		super();
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getId() {
		return id;
	}
	public String getDesc() {
		return desc;
	}
	public double getTotal() {
		return qty * unitPrice;
	}
	@Override
	public String toString() {
		return String.format("InvoicelItem [id=%s,desc=%s,qty=%d,unitPrice=%f]", 
				id, desc,qty, unitPrice);
	}
}
