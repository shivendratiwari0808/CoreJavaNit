/* 2. Create a class SalaryCalculation as given:
  Class name:   SalaryCalculation
  Data members/ variables: name,basicPay,specialAllowance,
                  conveyanceAllowance,gross,pf,netSalary,
          AnnualSalary.
 Member functions of class :
 i. void giveValues():  a method to assign details of employee
 ii. void salaryCalculate(): calculate the allowances and salary
                        specialAllowance: 25% of basic salary
            gross: basicpay + specialAllowance + conveyanceAllowance
            pf=8.33% of basicPay
            netSalary=gross-pf
            annualSalary=12 months of salary
iii. void display(): display all the details with suitable message
  */



class SaleryCalculation 
{
	String name;
	double basicPay,specialAllowance,conveyanceAllowance,gross,pf,netSalery,annualSalery;
	 
	
	public void giveValues(){
	name="shivendra";
	basicPay=20000;
	specialAllowance=basicPay*25/100;
	conveyanceAllowance=2000;
	pf=8.33;
	}
	public void salaryCalculate(){
	specialAllowance=basicPay*25/100;
	gross=basicPay+specialAllowance+conveyanceAllowance;
	pf=basicPay*8.33/100;
	netSalery=gross-pf;
	annualSalery=12*netSalery;
	}
	public void display(){
		System.out.println("emplployee name : "+name);
		System.out.println("emplployee basic salery : "+basicPay);
		System.out.println("emplployee special allowanace :"+specialAllowance);
		System.out.println("emplployee gross salery :"+gross);
		System.out.println("emplployee pf :"+pf);
		System.out.println("emplployee net salery :"+netSalery);
		System.out.println("emplployee annual salery :"+annualSalery);

	}
    public static void main(String[]args){
	SaleryCalculation emp=new SaleryCalculation();
	emp.giveValues();
	emp.salaryCalculate();
	emp.display();
	}
}
