package hw6;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		IOperation add = new Addition();
		IOperation sub = new Subtraction();
		IOperation com = new Comparison();

		String input = scanner.nextLine();
//		String input2 = scanner.nextLine();
//		System.out.println(sub.perform(input, input2));
		
		if(input.indexOf(">") != -1 || input.indexOf("<") != -1 || input.indexOf("=") != -1) //logical operator
		{
			String[] split_input = input.split(" ");
			String former_value = split_input[0];
			String operator = split_input[1];
			String latter_value = split_input[2];
			
			if(com.perform(former_value, latter_value).equals("-1") && operator.equals("<"))
				System.out.println("true");
			else if(com.perform(former_value, latter_value).equals("-1") && operator.equals(">"))
				System.out.println("false");
			else if(com.perform(former_value, latter_value).equals("-1") && operator.equals("="))
				System.out.println("false");
			else if(com.perform(former_value, latter_value).equals("0") && operator.equals("<"))
				System.out.println("false");
			else if(com.perform(former_value, latter_value).equals("0") && operator.equals(">"))
				System.out.println("false");			
			else if(com.perform(former_value, latter_value).equals("0") && operator.equals("="))
				System.out.println("true");	
			else if(com.perform(former_value, latter_value).equals("1") && operator.equals("<"))
				System.out.println("false");
			else if(com.perform(former_value, latter_value).equals("1") && operator.equals(">"))
				System.out.println("true");			
			else if(com.perform(former_value, latter_value).equals("1") && operator.equals("="))
				System.out.println("false");				
		}else { // arithmetic operator
			String[] split_input = input.split(" ");
			int operator_counter = 0;
			int i = 0;
			for(; i < split_input.length - 1; i++)
			{
				if((split_input[i].indexOf("-") != -1 || split_input[i].indexOf("+") != -1) && split_input[i].length()==1 )
					operator_counter++;
			}
			
//			System.out.println(operator_counter);
			
			int index = 0;
			boolean first_time_enter_this_loop = true;
			String return_string = "";
			
			if(split_input.length >= 2)
			{
				while(operator_counter != 0)
				{
					if(first_time_enter_this_loop == true)
					{
						String former_value = split_input[index];
						String operator = split_input[++index];
						String latter_value = split_input[++index];
						
						if(operator.equals("+"))
							return_string = add.perform(former_value, latter_value);
						else if(operator.equals("-"))
							return_string = sub.perform(former_value, latter_value);
						
						first_time_enter_this_loop = false;
					}else {
						String operator = split_input[++index];
						String latter_value = split_input[++index];
						
						if(operator.equals("+"))
							return_string = add.perform(return_string, latter_value);
						else if(operator.equals("-"))
							return_string = sub.perform(return_string, latter_value);				
						
					}					
					operator_counter--;
				}
			}else {
				return_string = split_input[0];
			}
			String result = return_string;
			result.trim();
			System.out.println(result);
			
		}
		scanner.close();
	} 	
}