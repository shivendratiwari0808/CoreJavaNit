/* 
Q. 10 A shopkeeper sells
two calculators for the same price. He earns 20% profit on one and suffers a
loss of 20% on the other. Write a program to find his total cost price of the
calculators by taking selling price as input.

 CP = (SP / (1 + (profit / 100))) (when profit)

 CP = (SP / (1 - (loss / 100))) (when loss)

*/


import java.util.Scanner;

   class  Shopkeeper1{
	
	static double per=.2d;
	int profit,loss;
	
	public static double profits(double sp){
	
	double cp = (sp / (1+per));
		
		return cp;
	}
	public static double lossCalulate(double sp){
	double cp = (sp / (1 - per));
		
		return cp;
	}
	
		
	public static void main(String[]args){
	
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter profitted calculator selling price :");
	double sellingPriceProfit=sc.nextDouble();
	
	
	System.out.println("enter loss calculator selling price : ");
	double sellingPriceLoss=sc.nextDouble();
	
	
	double cp=profits(sellingPriceProfit);
	System.out.println("total cost price of the profit calculator "+cp);
	
	double costPriceOfLossCalcultor=lossCalulate(sellingPriceLoss);
	System.out.println("total cost price of the profit calculator :"+costPriceOfLossCalcultor);	
	}

}
