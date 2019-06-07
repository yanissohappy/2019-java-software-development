package hw5;

public class Email extends Document{
	private String sender;
	private String recipient;
	private String title; // will be stored in the inherited text.
	private String answer;

	public String toString()
	{
		answer = "From: " + getSender() + "\n" + "To: " + getRecipient() + "\n" + "Title: " + getTitle() + "\n" + super.toString();
		return answer;
		
	}	
	public String getSender(){
		return sender;
	}
	
	public String getRecipient(){
		return recipient;
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setSender(String input){
		sender = input;
	}
	
	public void setRecipient(String input){
		recipient = input;
	}
	
	public void setTitle(String input){
		title = input;
	}	
}
