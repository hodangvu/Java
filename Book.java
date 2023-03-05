package OOP;

public class Book {
	String name;
	Author author;
	int qty;
	double price;
	public Book(String name, Author author, int qty, double price) {
		this.name = name;
		this.author = author;
		this.qty = qty;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("Book[name=%s,author=%s,price=%f,qty=%d", name,author.toString(),price,qty);
	}
	
}
