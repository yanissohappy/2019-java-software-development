package hw6;

public class Comparison implements IOperation{
	public String perform(String num1, String num2){
		char num1_sign = num1.charAt(0);
		char num2_sign = num2.charAt(0);
	    
		if(num1.equals(num2))
		{
			return "0"; 
		}
		
		if(num1_sign != '-' && num2_sign != '-') // + +
		{
			int n1 = num1.length();
		    int n2 = num2.length(); 
			  
		    if (n1 < n2) 
		        return "-1"; 
		    if (n1 > n2) 
		        return "1"; 
		    if (n2 == n1)
		    for (int i = 0; i < n1; i++) 
		    { 
		        if (num1.charAt(i) < num2.charAt(i)) 
		            return "-1"; 
		        else if (num1.charAt(i) > num2.charAt(i)) 
		            return "1"; 
		    } 
		    return "0"; 
		}else if(num1_sign == '-' && num2_sign != '-') // - +
		{
			return "-1";
			
		}else if(num1_sign != '-' && num2_sign == '-') // + -
		{	
			return "1";
			
		}else if(num1_sign == '-' && num2_sign == '-') // - -
		{
			String without_neg_num1 = num1.substring(1);
			String without_neg_num2 = num2.substring(1);	
			
			int n1 = without_neg_num1.length();
		    int n2 = without_neg_num2.length(); 
			  
		    if (n1 < n2) 
		        return "1"; // n2長度較長，代表實際上其值較小(我指加完負號後)
		    if (n1 > n2) 
		        return "-1"; 
		    if (n2 == n1)
		    for (int i = 0; i < n1; i++) 
		    { 
		        if (without_neg_num1.charAt(i) < without_neg_num2.charAt(i)) 
		            return "1"; 
		        else if (without_neg_num1.charAt(i) > without_neg_num2.charAt(i)) 
		            return "-1"; 
		    } 
		    return "0"; 			
		}
		
		return "0"; // Default?
	}
}
