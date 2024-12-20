/* Q6. Write a program to calculate teh discount given to a customer
on purchase of a LEDTelevision. The program also displays the amount
paid by the customer after disount.The details are given as:
 Class name: Television
 Data Members: cost,discount,amount
 Member methods:
 accept(): store the cost of the TV
 calculate(): calculate the discount
 display(): show the discount and the amount to be paid after discount.
" Its your TV so you decide the discount."
 */





	class Television{
		
		public static void main(String[]args){
		double cost=50000,discount=35,amount;
		
		System.out.println("store the cost of the TV ="+cost);
		discount=discount*cost/100;
		System.out.println("calculate the discount = "+discount);
		amount=cost-discount;
		System.out.println("show the discount and the amount to be paid after discount :"+amount);
		
		}





	}




