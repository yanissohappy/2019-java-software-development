package hw3;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class TwoThreeFive {

	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in);
		String formula = scannerObject.next();
		scannerObject.close();
		
		char first_word = formula.charAt(0);;
		String string_value_after_equal = formula.substring(2);
		int value_after_equal = Integer.parseInt(string_value_after_equal);
		
		if(first_word == 'X')
		{
			if(value_after_equal == 1)
				System.out.print("true");
			
			if(value_after_equal != 1)
			{
				while((value_after_equal%2)==0)
				{
					value_after_equal = value_after_equal/2;
				}
				
				while((value_after_equal%3)==0)
				{
					value_after_equal = value_after_equal/3;
				}		
				
				while((value_after_equal%5)==0)
				{
					value_after_equal = value_after_equal/5;
				}				
				
				if(value_after_equal == 1)
				{
					System.out.print("true");
				}else {
					System.out.print("false");
				}
			}
			
		}
		
		if(first_word == 'Y')
		{
			long[] list = new long[1000000];
			list[0]=1;
			int pow2 = 0, pow3 = 0, pow5 = 0;
			int counter=0;	
			while(counter<999999)
			{
				while(pow5<100) 
				{
					pow2=0;
					pow3=0;
					while(pow3<100)
					{
						pow2=0;
						while(pow2<100)
						{
							list[counter] = (long)(1*Math.pow(2, pow2)*Math.pow(3,pow3)*Math.pow(5, pow5));
							counter++;	
							pow2++;
						}
						pow3++;
					}
					pow5++;
				}
			}
			Arrays.sort(list);
			System.out.println(list[value_after_equal-1]);	
		}
	}
}

