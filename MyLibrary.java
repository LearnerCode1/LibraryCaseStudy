package Library;
import java.util.Scanner;
public class MyLibrary {
	public int searchMember(Library.Member member[], int size, String memberId) {
		for(int i=0;i<size;i++) {
			if(memberId.equals(member[i].getMemberId())) {
				return i;
			}
		}
		return -1;
	}
	
	public int searchBook(Library.Book book[], int size, String bookId) {
		for(int i=0;i<size;i++) {
			if(bookId.equals(book[i].getBookId())) {
				return i;
			}
		}
		return -1;
	}
	
	public int searchIssueReturn(Library.IssueReturnBook isr[], int size, String memberId) {
		for(int i=0;i<size;i++) {
			if(memberId.equals(isr[i].getMemberId())) {
				return i;
			}
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		MyLibrary lib = new MyLibrary();
		Library.IssueReturnBook issueReturnTable[] = new Library.IssueReturnBook[10];
		Scanner sc = new Scanner(System.in);
		
		Library.Book book[] = new Library.Book[10];
		Library.Member member[] = new Library.Member[5];
		
		String bname, mname, mid, bid;
		int choice, bqty, bcount = 0, mcount = 0, bpos, ircount = 0, mpos;
		float bprice, fine;
		
		
		 while(true)
		    {   
		      System.out.println("Library Management System");
		      System.out.println("1. Add Book Record");
		      System.out.println("2. Add Member Record");
		      System.out.println("3. Issue Book");
		      System.out.println("4. Return Book");
		      System.out.println("5. Display A Record");
		      System.out.println("6. Exit");
		      System.out.println("Enter Your Choice[1-5]:");
		      choice =  sc.nextInt();
		      sc.nextLine();
		      switch(choice)
		      {
		     
		       case 1: 
		       		System.out.println("Enter Book Details:");
		       		System.out.println("Enter Book Name:");
		       		bname = sc.nextLine();
		          
		       		System.out.println("Enter Quantity of Books:");
		       		bqty = sc.nextInt();
		       		sc.nextLine();
		 
		     			System.out.println("Enter Price of Books:");
		        		bprice = sc.nextFloat();
		     			book[bcount] = new Library.Book(bname,bqty,bprice);
		     			bcount++;
		                break;

		       case 2:    System.out.println("Enter Member Details:");
		      
		      		System.out.println("Enter Member Name:");
		      		mname = sc.nextLine();
		          
		      		member[mcount] = new Library.Member(mname);
		     			mcount++;
		     			break;

		       case 3:   System.out.println("Enter Member Id:");
		                mid = sc.nextLine();
		                mpos =  lib.searchMember(member,mcount,mid);
		     		if(mpos>=0)
		     		{
		                  System.out.println("Enter Book Id:");
		                  bid = sc.nextLine();
		                  bpos = lib.searchBook(book, bcount,bid);
		           	  if(bpos>=0)
		           	    {  
		            		issueReturnTable[ircount]=new Library.IssueReturnBook(mid, bid);
		            		ircount++;
		            	    }   
		           	   else
		                      System.out.println("Book does not exist");
		       		}
		     		else
		       		  System.out.println("Member does not exist");    
		     	
		     	       break; 

		     case 4: System.out.println("Enter Member Id:");
		             mid = sc.nextLine();
		             mpos =  lib.searchIssueReturn(issueReturnTable,ircount,mid);
		             if(mpos>=0)
		              {
		          	if((issueReturnTable[mpos].getReturnStatus())== false)
		              	{
		                 issueReturnTable[mpos].returnBook();
		                  fine= issueReturnTable[mpos].getFine();
		                  System.out.println("Fine ="+fine);
		                }
		           	else
		              	  System.out.println("Book Already Returned");
		              }
		            else
		             System.out.println("Member does not exist");    
		         
		           break;
		      case 5:   System.out.println("Enter Member Id:");
		                mid = sc.nextLine();
		     		mpos = lib.searchIssueReturn(issueReturnTable,ircount,mid);
		     		if(mpos>=0)
		     		   issueReturnTable[mpos].displayRecord();
		                else
		       		   System.out.println("Member does not exist");    
		               
		           break; 
		     
		      case 6: System.out.println("Exiting from Library");    
		             System.exit(0);
		      default: System.out.println("Invalid Chocie[1-5]:");
		       
		   }
		  }
	}
}
