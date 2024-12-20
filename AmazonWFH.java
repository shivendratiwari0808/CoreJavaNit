/* Q1. In Amazon work from home,employees  earn at the basic hourly wage of Rs.50. In addition to this, they also receive a commission on the sales they generate while tending the counter. The commission given to them is calculated according to the following table:

Total Sales Commmision Rate
Rs. 100 to less than Rs. 1000 1%
Rs. 1000 to less than Rs. 10000 2%
Rs. 10000 to less than Rs. 25000 3%
Rs. 25000 and above 3.5%
Write a program in Java that inputs the number of hours worked and the total sales. Compute the wages of the employees. */






       class AmazonWFH{
		double wage;
		double comm;
		String name;
		double sales,hours;
		public void calculate(){
		System.out.println("empolyee name : "+name);
		if(sales>=100 && sales<=1000)
		{
			comm=sales*1/100;

		}
		else if(sales>=1000 && sales<10000)
		{
		comm=sales*2/100;
		}
		else if(sales>=10000 && sales<25000)
		{
		comm=sales*3/100;
		}
		else if(sales>=25000)
		{
		comm=sales*3.5/100;
		}
	System.out.println("Total wage :"+((hours*wage)+comm));
	}
	public static void main(String[]args){
	
		
	
	
	AmazonWFH total=new AmazonWFH();
	total.name="omkar";
	total.comm=0;
	total.wage=50;
	total.hours=2;
	total.sales=25000;
	total.calculate();

	}

		
}  


