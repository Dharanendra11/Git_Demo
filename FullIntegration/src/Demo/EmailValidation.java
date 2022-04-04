package Demo;

public class EmailValidation {

	public static void main (String[] args) {
		String[] emails= {"abc@gmail.com", "ab@@yahoo.com", "onepiece.com"};
		for(int i =0 ; i <emails.length;i++) {
			int count=0;
			char[] e= emails[i].toCharArray();
			for(int j=0;j<e.length;j++) {
				if(e[j]=='@') {
					count++;
				}
			}
			if(count==1) {
				System.out.println(emails[i] + "Email is valid");
			}
		}
	}
}
