package Library;
import java.util.Calendar;
public class IssueReturnBook {
	private String bookId;
	private String memberId;
	private Date dateOfIssue;
	private Date dateOfReturn;
	private boolean returnStatus;
	private float fine;
	
	public IssueReturnBook(String memberId, String bookId) {
		this.memberId = memberId;
		this.bookId = bookId;
		
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		this.dateOfIssue = new Date(day, month, year);
		
		day = day+7;
		dateOfReturn = new Date(day, month, year);
		
		this.returnStatus = false;
		this.fine = 0;
	}
	
	public String getbookId()
	 {
	    return bookId;
	 } 
	public String getMemberId()
	 {
	    return memberId;
	 }
	public Date getDateOfIssue()
	 {
	    return dateOfIssue;
	 }
	public Date getDateOfReturn()
	 {
	    return dateOfReturn;
	 }

	public Date getIssueDate()
	{
	    return dateOfIssue;
	}
	public Date getReturnDate()
	{
	    return dateOfReturn;
	}
	public float getFine()
	 {
	    return this.fine;
	 }
	 public boolean getReturnStatus()
	{
	    return this.returnStatus;
	}
	 
	 
	 public float returnBook() {
		 int ndays, nmonth;
		 float fine;
		 
		 Calendar calendar =  Calendar.getInstance();
		 int year = calendar.get(Calendar.YEAR);
		 int month = calendar.get(Calendar.MONTH);
		 int day = calendar.get(Calendar.DAY_OF_MONTH);
		 
		 this.dateOfReturn = new Date(day, month, year); // doubtful
		 this.returnStatus = true;
		 
		 
		 ndays  = day - this.dateOfReturn.getDay();
		 nmonth =  month - this.getDateOfReturn().getMonth();
		 
		 this.fine = calFine(ndays, nmonth);
		 
		 return this.fine;
	 }
	 
	 public float calFine(int nday, int nmonth) {
		 if(nmonth>0) {
			 fine = 50 * nmonth*30;
		 }
		 
		 else {
			 fine = 7*nday;
		 }
		 
		 return fine;
	 }
	 
	 public void displayRecord() {
		 System.out.println("MemberID:"+this.memberId);
	      System.out.println("Book Issued:"+this.bookId);
	      System.out.print("Issued Date:");
	      System.out.println(this.dateOfIssue);
	      System.out.print("Returned Date:");
	      System.out.println(this.dateOfReturn);
	      System.out.print("Fine:"+this.fine);
	 }
	 

}
