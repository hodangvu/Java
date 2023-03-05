package OOP;

public class BookV2 {
	String name;
	Author[] author;
	int qty;
	double price;
	public BookV2(String name, Author[] author, int qty, double price) {
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
	public Author[] getAuthor() {
		return author;
	}
	public void setAuthor(Author[] author) {
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
	
	public String getAuthorNames() {
		String rs = "";
		for (Author author2 : author) {
			rs += author2.getName() + ",";
		}
		if(!rs.isEmpty())
			rs = rs.substring(0, rs.length() -1);
		return rs;
	}
	@Override
	public String toString() {
		String authorString = "";
		for (Author author2 : author) {
			authorString += author2.toString() + ",";
		}
		if(!authorString.isEmpty())
			authorString = authorString.substring(0, authorString.length() -1);
		
		return String.format("BookV2[name=%s,author={%s},qty=%d,price=%f]", 
									name,	authorString, qty, 	price);
	}
}
