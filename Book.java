package Library;

public class Book {
	private String bookId;
	private String title;
	private int qty;
	private float price;
	static int tempId;
	
	static {
		tempId = 1;
	}
	
	private int generateId() {
		return tempId++;
	}
	
	public Book(String title, int qty, float price) {
		this.bookId = "100"+generateId();
		this.title = title;
		this.qty = qty;
		this.price = price;
	}
	
	public String getBookId() 
    {
      return this.bookId;
    }

  public String getTitle() 
  {
    return this.title;
  }
  public int getQty()
  {
    return this.qty;
  }
  public float getPrice() 
  {
    return this.price;
  }
  public void setTitle(String title) 
  {
    this.title = title;
  }
  public void setQty(int qty)
  {
    this.qty  = qty;
  }
  public void setPrice(float price) 
  {
     this.price  = price;
  }

  public String toString()
  {
    String str;
    str = "Book_ID:"+this.bookId+"\nTitle: " + this.title + "\nQty:"+this.qty;
    str = str + "\n";
    str = str + String.format("Price: %.2f", price);
    return str;
  }

}
