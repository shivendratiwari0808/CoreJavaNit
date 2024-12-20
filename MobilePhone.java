/*  Q2. Design a class MobilePhone with certain attributes and methods.
    Display the details of different mobile phones with suitable
    message.*/





class MobilePhone{
	String brand="apple",warrenty="1 year",charger="1 N";
	int price = 40000;
	int imei=1234567890;
	
		
	
	public static void main(String[]args)
	{
		MobilePhone bill=new MobilePhone();
		System.out.println("the brand name is :"+bill.brand);
		System.out.println("the phone warrenty :"+bill.warrenty);
		System.out.println("the brand charger :"+bill.charger);
		System.out.println("the phone price :"+bill.price);
		System.out.println("the phone imei :"+bill.imei);
	}
	

}