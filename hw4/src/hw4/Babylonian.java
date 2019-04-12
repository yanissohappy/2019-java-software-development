package hw4;

import java.util.Scanner;
import java.lang.Math;
import java.math.BigDecimal;


public class Babylonian {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double n = scanner.nextDouble();
		scanner.close();	
		double guess = n/2;
		double r;
		double diff;
		double the_former_one = guess;		
		
		do {
			r = n/guess;
			guess = (guess+r) / 2;			
			diff = Math.abs(((guess - the_former_one) / the_former_one));
			the_former_one = guess;
		}while(diff >= 0.01);
		
		String string_of_guess = Double.toString(guess);
		BigDecimal temp_ans = new BigDecimal(string_of_guess).setScale(2, BigDecimal.ROUND_HALF_UP);
		String temp_ans_string = temp_ans.toString();
		int indexOfDecimal = temp_ans_string.indexOf(".");
		String decimal_part = temp_ans_string.substring(indexOfDecimal);
		String integer_Part = temp_ans_string.substring(0, indexOfDecimal);
		
		
		if(decimal_part.equals(".00"))
		{
			System.out.println(integer_Part);
		}else if(decimal_part.charAt(1)!='0' && decimal_part.charAt(2)=='0'){
			System.out.println(integer_Part+"."+decimal_part.charAt(1));
		}else{
			System.out.println(temp_ans);
		}
		
	}

}

