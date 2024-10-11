package Library;

public class Member {
	String memberId;
	String memberName;
	
	static String tempId;
	static int count;
	
	static {
		tempId = "23UCS0";
		count = 0;
	}
	
	private String generateId() {
		count++;
		return tempId+count;
	}
	
	public Member(String memberName) {
		memberId = generateId();
		this.memberName = memberName;
	}
	
	public String getMemberId() {
		return this.memberId;
	}
	
	public String getName(){
		return this.memberName;
	}
	
	public  String toString() {
		String str;
		str = "Member_ID:"+this.memberId+"\nName: " + this.memberName;
	    str = str + "\n";
	    return str;

	}
}
