package hw1;
import java.lang.Character;


public class PigLatin {
	public static void main(String args[]){
		int i=0;
		int space_count=args.length-1;
		int char_num=0;
		String temp;
		String output="";		
		
		if(args.length == 0) {//if only one args	

		}else if(args.length == 1){ //one args
			char_num=args[0].length();
			
			if(char_num == 1) { // only one char
				if(args[0].charAt(0) == 'a' || args[0].charAt(0) == 'e' || args[0].charAt(0) == 'i' || args[0].charAt(0) == 'o' || args[0].charAt(0) == 'u') 
				{
					output += Character.toUpperCase(args[0].charAt(0)) + args[0].substring(1) + "ay";
				}else if(args[0].charAt(0) == 'A' || args[0].charAt(0) == 'E' || args[0].charAt(0) == 'I' || args[0].charAt(0) == 'O' || args[0].charAt(0) == 'U'){
					output += args[0].charAt(0) + args[0].substring(1) + "ay";
				}else{
					output += Character.toUpperCase(args[0].charAt(0)) + "ay";
				}			
			}else { //over one char
				if(args[0].charAt(0) == 'a' || args[0].charAt(0) == 'e' || args[0].charAt(0) == 'i' || args[0].charAt(0) == 'o' || args[0].charAt(0) == 'u') 
				{
					output += Character.toUpperCase(args[0].charAt(0)) + args[0].substring(1) + "ay";
				}else if(args[0].charAt(0) == 'A' || args[0].charAt(0) == 'E' || args[0].charAt(0) == 'I' || args[0].charAt(0) == 'O' || args[0].charAt(0) == 'U'){
					output += args[0].charAt(0) + args[0].substring(1) + "ay";
				}else{
					output += args[0].substring(1,2).toUpperCase() + args[0].substring(2) + args[0].substring(0,1)+ "ay";
				}
			}							
		}else{ //over one args
			for(i=0;i<args.length;i++)
			{
				temp=args[i];
				char_num=args[i].length();

				if(char_num == 1) {				
					if(temp.charAt(0) == 'a' || temp.charAt(0) == 'e' || temp.charAt(0) == 'i' || temp.charAt(0) == 'o' || temp.charAt(0) == 'u') 
					{
						output += Character.toUpperCase(temp.charAt(0)) + temp.substring(1) + "ay";
					}else if(args[i].charAt(0) == 'A' || args[i].charAt(0) == 'E' || args[i].charAt(0) == 'I' || args[i].charAt(0) == 'O' || args[i].charAt(0) == 'U'){
						output += args[i].charAt(0) + args[i].substring(1) + "ay";
					}else {
						output += Character.toUpperCase(temp.charAt(0)) + "ay";
					}	
					if(space_count > 0) {
						output +=" ";
						space_count--;
					}
				}else {
					if(temp.charAt(0) == 'a' || temp.charAt(0) == 'e' || temp.charAt(0) == 'i' || temp.charAt(0) == 'o' || temp.charAt(0) == 'u') 
					{
						output += Character.toUpperCase(temp.charAt(0)) + temp.substring(1) + "ay";
					}else if(args[i].charAt(0) == 'A' || args[i].charAt(0) == 'E' || args[i].charAt(0) == 'I' || args[i].charAt(0) == 'O' || args[i].charAt(0) == 'U'){
						output += args[i].charAt(0) + args[i].substring(1) + "ay";
					}else {
						output += args[i].substring(1,2).toUpperCase() + args[i].substring(2) + args[i].substring(0,1)+ "ay";
					}	
					if(space_count > 0) {
						output +=" ";
						space_count--;
					}					
				}
				
			}
		}		
		System.out.print(output.trim());		
	}
}
