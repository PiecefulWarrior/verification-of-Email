package linearSearchForEmails;

import java.util.ArrayList;
import java.util.Scanner;

public class searchLinearly {
	
	
	
	public String searchEmails(ArrayList<String> mails,String email) {
		
		for(String data : mails) {
			
			if(email.equalsIgnoreCase(data))
				return email;
		}
		
		return "Not available in system";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> mails= new ArrayList<String>();
		int ch = 0;
		do {
			
			System.out.println("Press 1 to add to register mail ID in system");
			System.out.println("Press 2 to search mail ID in system");
			System.out.println("Press 3 to close Application");
			Scanner sc = new Scanner(System.in);
			ch = sc.nextInt();
			
			switch (ch) {
			case 1:
				
				System.out.println("Enter mail id to register in system");
				String mail1 = sc.next();
				mails.add(mail1);
				break;
				
			case 2:
				System.out.println("Enter mail id to search in system");
				String mail2 = sc.next();
				searchLinearly sl = new searchLinearly();
				System.out.println(sl.searchEmails(mails, mail2));
				break;
				
			case 3:
				break;

			default:
				System.out.println("Wrong input");
				break;
			}
			
		}while(ch!=3);

	}

}
