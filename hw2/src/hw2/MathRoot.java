package hw2;
import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Scanner;


public class MathRoot {
	public static void main(String args[]){
		double a,b,c;
		
		Scanner scannerObject = new Scanner(System.in);
		a = scannerObject.nextDouble();
		b = scannerObject.nextDouble();
		c = scannerObject.nextDouble();
		String format_form = scannerObject.next();
		scannerObject.close();
		
		DecimalFormat pattern = new DecimalFormat(format_form);
		
		double root1 = (-1*b + Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);
		double root2 = (-1*b - Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);
		String Final_ans1 = pattern.format(root1);
		String Final_ans2 = pattern.format(root2);
		
		
		if(a>0) {
			if(root1 > root2)
			{
				System.out.printf("%s\n%s", Final_ans1, Final_ans2);
			}else {
				System.out.printf("%s\n%s", Final_ans2, Final_ans1);
			}	
			
		}else {
			if(root1 > root2)
			{
				System.out.printf("%s\n%s", Final_ans2, Final_ans1);
			}else {
				System.out.printf("%s\n%s", Final_ans1, Final_ans2);
			}				
		}
	}
}
