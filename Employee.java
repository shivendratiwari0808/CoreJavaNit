/* Q.6 Write a program by using class 'Employee' to accept
Basic Pay of an employee. Calculate the allowances/deductions as given below.

Allowance / DeductionRate

Dearness Allowance (DA)

30% of Basic Pay


House Rent Allowance (HRA)

15% of Basic Pay

Provident Fund (PF)

12.5% of Basic Pay

Finally, find and print the Gross and Net pay.

Gross Pay = Basic Pay + Dearness Allowance + House Rent Allowance

Net Pay = Gross Pay - Provident Fund
*/





import java.util.Scanner;
 	
	class Employee{
	
	String name;
	double basicPay,daAllowance,hraAllowance,pf,grossPay,netPay;

	public void calucaltions()
	{
	daAllowance=basicPay*30/100;
	hraAllowance=basicPay*15/100;
	pf=basicPay*12.5/100;
	grossPay=basicPay+daAllowance+hraAllowance;
	netPay=grossPay-pf;
	
	}

	public void empdetails(){
	
	System.out.println("employee name :"+name);
	System.out.println("basic pay :"+basicPay);
	System.out.println("Dearness Allowance (DA) :"+daAllowance);
	System.out.println("House Rent Allowance (HRA) :"+hraAllowance);
	System.out.println("Provident Fund (PF) :"+pf);
	System.out.println("gross pay :"+grossPay);
	System.out.println("net pay :"+netPay);
	
	}
	

	public static void main(String[]args){

	Employee show=new Employee();
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter empolyee name :");
	show.name=sc.nextLine();
	System.out.println("enter basic pay ");
	show.basicPay=sc.nextDouble();

	show.calucaltions();
	show.empdetails();
	
}	
	
}

