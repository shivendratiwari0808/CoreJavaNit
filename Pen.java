/* 
Q5. Design a class Pen with certain attributes and methods.
    Display the details of different mobile phones with suitable
    message. */





class Pen{

String brand,colour,shape;
int price;



			void show(){
			System.out.println("the brand name :"+brand);
			System.out.println("the pen colour :"+colour);
			System.out.println("the pen shape:"+shape);
			System.out.println("the pen price :"+price);

			System.out.println();
			}

		public static void main(String[]args){
		
		Pen montax=new Pen();
		Pen luxri=new Pen();
		Pen pantonic=new Pen();
		
		montax.brand="montax";
		montax.colour="blue";
		montax.shape="long";
		montax.price=20;

		luxri.brand="luxri";
		luxri.colour="black";
		luxri.shape="long";
		luxri.price=10;
			
		pantonic.brand="pantonic";
		pantonic.colour="yellow";
		pantonic.shape="long";
		pantonic.price=30;


		montax.show();
		luxri.show();
		pantonic.show();
		


		}

}