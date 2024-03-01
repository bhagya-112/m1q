package m1q;  //email

import java.util.regex.*;
class Header{
	String from;
	String to;
	Header(	String from ,String to){
		this.from=from;
		this.to=to;
	}
}
 
class Email{
	Header header;
	String body;
	String greetings;
	Email(Header header,String body,String greetings){
		this.header=header;
		this.body=body;
		this.greetings=greetings;
	}
}
	class EmailOperations{
	public int emailVerify(Email e) {
		 String emailRegex = "^[a-zA-Z_]+@[a-zA-Z]+\\.[a-zA-Z]+$";
	        int count = 0;
 
	        Pattern emailPattern = Pattern.compile(emailRegex);
	        Matcher fromMatcher = emailPattern.matcher(e.header.from);
	        Matcher toMatcher = emailPattern.matcher(e.header.to);
 
	        if (fromMatcher.matches()) {
	            count++;
	        }
	        if (toMatcher.matches()) {
	            count++;
	        }
 
	        return count;
	    }
 
	
	public String bodyEncryption(Email e) {
		StringBuilder encryptedBody = new StringBuilder();
 
        for (char c : e.body.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                encryptedBody.append((char) ((c - base + 3) % 26 + base));
            } else {
                encryptedBody.append(c);
            }
        }
 
        return encryptedBody.toString();
	}
	public String greetingMessage(Email e) {
		String name = e.header.from.split("@")[0];
        return e.greetings + " " + name;
	}
}
 
public class q11 {
 
	public static void main(String[] args) {
		 Header header = new Header("amit@doselect.com", "john@example.com");
	        Email email = new Email(header, "Hello, how are you?", "Regards");
 
	        EmailOperations emailOperations = new EmailOperations();
	        int verifiedEmails = emailOperations.emailVerify(email);
	        String encryptedBody = emailOperations.bodyEncryption(email);
	        String greeting = emailOperations.greetingMessage(email);
 
	        System.out.println("Number of verified email addresses: " + verifiedEmails);
	        System.out.println("Encrypted body: " + encryptedBody);
	        System.out.println("Greeting message: " + greeting);
	    }
 
	}