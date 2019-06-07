package hw5;

public class Document {
	private String text;
	public Document(){}
	public Document(String text_input){
		text = text_input;
	}	
		
	
	public String toString(){
		return text;
	}
	public void setText(String text_input){
		text = text_input;
	}	
}
