/* 4. WAP to input unit price and quantity of a product.Claculate total cost,discount
20% if the total purchase is more than Rs20000 otherwise discount is 10%.
Also find the net price to be paid.*/


class Product
{

	public static void main(String[] args) 
	{
		double unitPrice,quantity,total,cost,discount,discount1,total1;
		
		System.out.println("welcome to store ");
		unitPrice=15000;
		System.out.println("samsung phone price :"+unitPrice);
		quantity=2;
		System.out.println("quantity is :"+quantity);
		cost=unitPrice*quantity;
		System.out.println("product quantity purchase is:"+cost);

		if(cost>20000){
		discount=cost*20/100;
		System.out.println("product discount is 20% is :"+discount);
		total=cost-discount;
		System.out.println("product total price :"+total);
		}
		
		else{
		discount=cost*10/100;
		System.out.println("product discount is 10% :"+discount);
		total=cost-discount;
		System.out.println("the payable amount is :"+total);
		
		}

	}
}
