package Library;

public class Date {
	int dd;
	int mm;
	int yyyy;
	
	public Date(int dd, int mm, int yyyy) {
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}
	
	public int getDay() {
		return dd;
	}
	
	public int getMonth() {
		return mm;
	}
	
	public int getYear() {
		return yyyy;
	}
	
	public String toString() {
		return dd+"-"+mm+"-"+yyyy;
	}
}
