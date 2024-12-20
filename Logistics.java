/*  Q2. In Hyderabad logistics and solutions type firms have grown and they all charges for parcels as per the following tariff:

Weight Charges
Upto 10 Kg. Rs. 30 per Kg.
For the next 20 Kg. Rs. 20 per Kg.
Above 30 Kg. Rs. 15 per Kg.
Write a program in Java to calculate the charge for a parcel, taking the weight of the parcel as an input  
*/




class Logistics{
	int weight,total;
 public void charges(){
	System.out.println("Hyderabad logistics and solutions company ");
	if(weight>=0 && weight<10)
	{
	 total=weight*30;
	 System.out.println("under 0 to 10 kg weight charges : "+total);
	}
	else if(weight<=30)
	{
	total=10*30+(weight-10)*20;
	System.out.println("under 10 to 30 kg weight charges : "+total);
	}
	else if(weight>30)
	{
	total=10*30+20*20+(weight-30)*15;
	System.out.println("under 20 to 30 kg weight charges : "+weight);
	}
	    }
	public static void main(String[]args){
	Logistics display=new Logistics();
	display.weight=20;
	 
	display.charges();
	}
}

	
