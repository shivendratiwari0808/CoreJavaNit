/* Q3. Design a class Bike with certain attributes and methods.
    Display the details of different mobile phones with suitable
    message. */



class Bike{

	String brand="bajaj",model="pulsar220f",warrenty="5 years",service="under 1000km",dealer="shree Bajaj";
	int price=190000;

	public static void main(String[]args)
	{
	Bike spec=new Bike();
	
	System.out.println("the bike brand name is :"+spec.brand);
	System.out.println("the bike model name is :"+spec.model);
	System.out.println("the bike warrenty is :"+spec.warrenty);
	System.out.println("the bike engine service is :"+spec.service);
	System.out.println("the bike dealer name is :"+spec.dealer);
	System.out.println("the bike price is :"+spec.price);
	} 
	
}