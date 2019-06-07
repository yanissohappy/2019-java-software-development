package hw5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String mode = scan.nextLine();
		String type = scan.nextLine();	
		
		if(type.equals("Document"))
		{
			Document document = new Document();
			String text = scan.nextLine();
			document.setText(text);
			if(mode.equals("A"))
			{
				System.out.println(document.toString());
			}
			if(mode.equals("B"))
			{
				String keyword = scan.nextLine();
				if(text.indexOf(keyword) < 0)
					System.out.println("false\n");
				else
					System.out.println("true\n");				
			}
			if(mode.equals("C")){//C
				String var = scan.nextLine();
				if(var.equals("text"))
				document.setText(scan.nextLine());
				
				System.out.println(document.toString());////
			}
		}
		if(type.equals("File"))
		{
			File file = new File();
			String pathname = scan.nextLine();
			file.setPathname(pathname);
			String text = scan.nextLine();
			file.setText(text);		
			if(mode.equals("A"))
			{
				System.out.println(file.toString());
			}
			if(mode.equals("B"))
			{
				String keyword = scan.nextLine(); //the word for checking

				if(pathname.contains(keyword) || text.contains(keyword))
				{
					System.out.println("true\n");
				}else {
					System.out.println("false\n");
				}			
			}
			if(mode.equals("C")){//C
				String var = scan.nextLine();
				if (var.equals("pathname"))
					file.setPathname(scan.nextLine());
				else
					file.setText(scan.nextLine());
				System.out.println(file.toString());
			}
		}
		if(type.equals("Email")){ //Email
			Email email = new Email();
			String sender_name = scan.nextLine();
			email.setSender(sender_name);
			String recipient_name = scan.nextLine();
			email.setRecipient(recipient_name);
			String title_name = scan.nextLine();
			email.setTitle(title_name);
			String text = scan.nextLine();
			email.setText(text);	
			
			if(mode.equals("A"))
			{
				System.out.println(email.toString());
			}
			if(mode.equals("B"))
			{
				String keyword = scan.nextLine();
				if(sender_name.contains(keyword) || recipient_name.contains(keyword) || title_name.contains(keyword) || text.contains(keyword))
				{
					System.out.println("true\n");
				}else {
					System.out.println("false\n");
				}						
			}
			if(mode.equals("C")){//C
				String var = scan.nextLine();
				if(var.equals("text"))
				{
					email.setText(scan.nextLine());
				}else if(var.equals("sender"))
				{
					email.setSender(scan.nextLine());
				}else if(var.equals("recipient"))
				{
					email.setRecipient(scan.nextLine());
				}else if(var.equals("title"))
				{
					email.setTitle(scan.nextLine());
				}
				
				System.out.println(email.toString());
			}
		}
		scan.close();

	}

}
