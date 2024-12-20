/* 5.An Electricity Company charges their consumers according to the
units consumed per month
According to the given traffic:
Units Consumed Charges
Up to 100 units Rs. 2 per unit
More than 100 units and up to 200 units Rs. 1.80 per unit
More than 200 units Rs.1.50 per unit
In addition to the above, every consumer has to pay Rs.200 as Service Charge
per month. Write a program to input the amount of units consumed and
calculate the total charges payable (Bill) by the consumer.*/



class ElectricityBill{

public static void main(String[] args)
{	
	double units=210,amount;
	
	if(units<=100)
	{
	amount=units*2+200;
	System.out.println("the total charges payable "+amount+ " by the counsumer");
	}
	else if(units<=200)
	{
	amount=100*2+(units-100)*1.80+200;
	System.out.println("the total charges payable "+amount+ " by the counsumer");
	}
	else if(units>200)
	{
	amount=100*2+100*1.80+(units-200)*1.50+200;
	System.out.println("the total charges payable "+amount+ " by the counsumer");
	}

}
}	