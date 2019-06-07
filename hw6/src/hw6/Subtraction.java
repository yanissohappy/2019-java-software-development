package hw6;

public class Subtraction implements IOperation{
	public String perform(String num1, String num2){
		char sign_char_of_num1 = num1.charAt(0);
		char sign_char_of_num2 = num2.charAt(0);
		String result = "";
		int num1_length = num1.length();
		int num2_length = num2.length();
		
		int array_size = (num1_length > num2_length) ? num1_length : num2_length;
		int the_shorter_one = (num1_length > num2_length) ? num2_length : num1_length;
		
		//there are 4 possibilities. 
		// () + () 
		// -() + ()
		// () + -()
		// -() + -()
		
		if(sign_char_of_num1 != '-' && sign_char_of_num2 != '-') // () - () OK
		{
			String value_of_num1 = num1;
			String value_of_num2 = num2;
//			System.out.println(value_of_num2);
			String sign = "";
			String bigger_one = (isSmaller(value_of_num1 , value_of_num2) == true)? value_of_num2 : value_of_num1;
			String smaller_one = (isSmaller(value_of_num1 , value_of_num2) == true)? value_of_num1 : value_of_num2;
			boolean is_it_the_same = value_of_num1.equals(value_of_num2);
//			System.out.println(bigger_one);
//			System.out.println(smaller_one);
			if(isSmaller(value_of_num1 , value_of_num2) && is_it_the_same != true)
			{
				sign = "-";				
				result = sign + find_Diff(bigger_one , smaller_one);
			}else {
				result = sign + find_Diff(bigger_one , smaller_one);
			}
			
			if(is_it_the_same == true)
				result = "0";
			
			//TEST WHETHER THE ANSWER IS 0
			if(result.equals("0") || result.equals("-0") )
			{
				result = "0";
			}
		}else if(sign_char_of_num1 == '-' && sign_char_of_num2 != '-') //OK
		{
			String without_neg_num1 = num1.substring(1);
			String without_neg_num2 = num2;
			int without_neg_num1_length = without_neg_num1.length();
			int without_neg_num2_length = without_neg_num2.length();
			int without_neg_array_size = (without_neg_num1_length > without_neg_num2_length) ? without_neg_num1_length : without_neg_num2_length;
			int carry = 0;
			int temp1 = 0, temp2 = 0;
			int last_number_of_the_char = without_neg_array_size - 1;
			if(without_neg_num1_length > without_neg_num2_length)
			{
				int i = without_neg_num2_length;
				while(i != without_neg_num1_length)
				{
					without_neg_num2 = "0"+without_neg_num2;
					i++;
				}			
			}else if(without_neg_num1_length < without_neg_num2_length)
			{
				int i = without_neg_num1_length;
				while(i != without_neg_num2_length)
				{
					without_neg_num1 = "0"+without_neg_num1;
					i++;
				}			
			}
			
			while(last_number_of_the_char >= 0)
			{
					temp1 = (int)without_neg_num1.charAt(last_number_of_the_char)- '0';
					temp2 = (int)without_neg_num2.charAt(last_number_of_the_char)- '0';
					
					if ((temp1 + temp2 + carry)>=10)
					{
						if(last_number_of_the_char != 0)
						{
							
							result = Integer.toString((temp1 + temp2 - 10 + carry))+ result;
							carry=1;
						}else {
							
							result = Integer.toString((temp1 + temp2 - 10 + carry))+ result;
							carry=1;
						}
					}
					else
					{
						result = Integer.toString((temp1 + temp2 + carry))+ result;
						carry = 0;
					}

				last_number_of_the_char--;
			}
			if(carry == 1)
			result = Integer.toString((carry))+ result;	
			
			result = "-" + result;
			
			//TEST WHETHER THE ANSWER IS 0
			if(result.equals("0") || result.equals("-0") )
			{
				result = "0";
			}
		}else if(sign_char_of_num1 != '-' && sign_char_of_num2 == '-') // OK 
		{
			String without_neg_num1 = num1;
			String without_neg_num2 = num2.substring(1);
			int without_neg_num1_length = without_neg_num1.length();
			int without_neg_num2_length = without_neg_num2.length();
			int without_neg_array_size = (without_neg_num1_length > without_neg_num2_length) ? without_neg_num1_length : without_neg_num2_length;
			int carry = 0;
			int temp1 = 0, temp2 = 0;
			int last_number_of_the_char = without_neg_array_size - 1;
			if(without_neg_num1_length > without_neg_num2_length)
			{
				int i = without_neg_num2_length;
				while(i != without_neg_num1_length)
				{
					without_neg_num2 = "0"+without_neg_num2;
					i++;
				}			
			}else if(without_neg_num1_length < without_neg_num2_length)
			{
				int i = without_neg_num1_length;
				while(i != without_neg_num2_length)
				{
					without_neg_num1 = "0"+without_neg_num1;
					i++;
				}			
			}
			
			while(last_number_of_the_char >= 0)
			{
					temp1 = (int)without_neg_num1.charAt(last_number_of_the_char)- '0';
					temp2 = (int)without_neg_num2.charAt(last_number_of_the_char)- '0';
					
					if ((temp1 + temp2 + carry)>=10)
					{
						if(last_number_of_the_char != 0)
						{
							
							result = Integer.toString((temp1 + temp2 - 10 + carry))+ result;
							carry=1;
						}else {
							
							result = Integer.toString((temp1 + temp2 - 10 + carry))+ result;
							carry=1;
						}
					}
					else
					{
						result = Integer.toString((temp1 + temp2 + carry))+ result;
						carry = 0;
					}

				last_number_of_the_char--;
			}
			if(carry == 1)
			result = Integer.toString((carry))+ result;	
			
			//TEST WHETHER THE ANSWER IS 0
			if(result.equals("0") || result.equals("-0") )
			{
				result = "0";
			}
		}else if(sign_char_of_num1 == '-' && sign_char_of_num2 == '-') // value equals to -() - -() 
		{
			String value_of_num1 = num1.substring(1);
			String value_of_num2 = num2.substring(1);
//			System.out.println(value_of_num2);
			String sign = "";
			String bigger_one = (isSmaller(value_of_num1 , value_of_num2) == true)? value_of_num2 : value_of_num1;
			String smaller_one = (isSmaller(value_of_num1 , value_of_num2) == true)? value_of_num1 : value_of_num2;
			boolean is_it_the_same = value_of_num1.equals(value_of_num2);
//			System.out.println(bigger_one);
//			System.out.println(smaller_one);
			if(isSmaller(value_of_num2 , value_of_num1) && is_it_the_same != true)
			{
				sign = "-";				
				result = sign + find_Diff(bigger_one , smaller_one);
			}else {
				result = sign + find_Diff(bigger_one , smaller_one);
			}			
			
			if(is_it_the_same == true)
				result = "0";
			
			//TEST WHETHER THE ANSWER IS 0
			if(result.equals("0") || result.equals("-0") )
			{
				result = "0";
			}
		}else {
			// empty
		}
		
		return result;
	}
	
	static String find_Diff(String str1, String str2) //bigger number should be in str1!!!!!!
	{ 
	    int n1 = str1.length();
	    int n2 = str2.length(); 
	  
	    String str = ""; 	  
	    int diff = n1 - n2; 	  
	    int carry = 0; 
	  
	    for (int i = n2 - 1; i >= 0; i--) 
	    { 
	        int sub = (((int)str1.charAt(i + diff) - (int)'0') - ((int)str2.charAt(i) - (int)'0') - carry); 
	        if (sub < 0) 
	        { 
	            sub = sub+10; 
	            carry = 1; 
	        } 
	        else
	            carry = 0; 
	  
	        str += String.valueOf(sub); 
	    } 
	  
	    for (int i = n1 - n2 - 1; i >= 0; i--) 
	    { 
	        if (str1.charAt(i) == '0' && carry > 0) 
	        { 
	            str += "9"; 
	            continue; 
	        } 
	        int sub = (((int)str1.charAt(i) - (int)'0') - carry); 
	        if (i > 0 || sub > 0) 
	            str += String.valueOf(sub); 
	        carry = 0; 
	  
	    } 
	    
	    if(str.charAt(str.length() - 1) =='0')
	    {
		    for(int i = str.length() - 1; i >= 0; i--) {
		    	if(str.charAt(i) != '0')
		    		break;
		    	
		    	if(str.charAt(i) == '0')
		    	str = str.substring(0, i);
	        }	    
	    }
	   
	    return new StringBuilder(str).reverse().toString(); 
	} 	
	
	static boolean isSmaller(String str1, String str2) 
	{ 
	    int n1 = str1.length();
	    int n2 = str2.length(); 
	  
	    if (n1 < n2) 
	        return true; 
	    if (n1 > n2) 
	        return false; 
	    if (n2 == n1)
	    for (int i = 0; i < n1; i++) 
	    { 
	        if (str1.charAt(i) < str2.charAt(i)) 
	            return true; 
	        else if (str1.charAt(i) > str2.charAt(i)) 
	            return false; 
	    } 
	    return false; 
	} 	
}