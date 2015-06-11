import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Invoice {
	
	Stack<String> content=new Stack<String>();
	
	 double Item;
	 double UPay;
	
	CashReg register= new CashReg();
	String item;
	
	Scanner scan= new Scanner(System.in);
	
	public void UI(){
		System.out.print("Enter Item");
		 item= scan.next();
	
		System.out.print("ItemPrice");
		double price=scan.nextFloat();
		register.setItemPrice(price);
		
		System.out.print("Total amount");
		double pay=scan.nextDouble();
		register.setPayment(UPay);
		
		System.out.print("item" + item);
		System.out.print("Item price" + register.getItemPrice());
		System.out.print("Tax" + register.getSalesTax());
		System.out.print("Change" + register.giveChange());
		
		
	}
	
	public void Receipt(){
		
		System.out.print("item" + item + "\n");
		System.out.print("Item price" + register.getItemPrice() + "\n");
		System.out.print("Payment" );
		System.out.print("Tax" + register.getSalesTax() + "\n");
		System.out.print("Change" + register.giveChange() + "\n");
		
	}
	
}
