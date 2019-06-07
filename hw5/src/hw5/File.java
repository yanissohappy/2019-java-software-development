package hw5;

public class File extends Document{
	private String pathname;
	private String answer;

	public String toString()
	{
		answer = "Path: " + getPathname() + "\n" +super.toString() ;
		return answer;		
	}	
	
	public String getPathname(){
		return pathname;
	}
	
	public void setPathname(String text_input){
		pathname = text_input;
	}	
}
