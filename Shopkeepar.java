/* Q.7 A shopkeeper offers
10% discount on the printed price of a Digital Camera. However, a customer has
to pay 6% GST on the remaining amount. Write a program in Java to calculate the
amount to be paid by the customer taking printed price as an input.
*/





import java.util.Scanner;
	
	
	class Shopkeepar{
	
	String name;
	double price,discount,gst,total,discountPrice,printedPrice;
	
	public void calculate()
	{
	discount=price*10/100;
	printedPrice=price-discount;
	gst=printedPrice*6/100;
	total=gst+printedPrice;
	}
	
	public void customer()
	{
	System.out.println("customer name "+name);
	System.out.println("discount price :"+discount);
	System.out.println("gst included price :"+gst);
	System.out.println("the paid amount :"+total);
	}
	
	
	public static void main (String[]args){
	
	Shopkeepar show=new Shopkeepar();
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter custemer name :");
	show.name=sc.next();
	System.out.println("enter price is :");
	show.price=sc.nextDouble();
	System.out.println("enter discount percentage :");
	show.discount=sc.nextDouble();
	System.out.println("enter gst percentage :");
	show.gst=sc.nextDouble();
	
	show.calculate();
	show.customer();
	
}
}
	 
	
	


