/* Q4. Design a class Fruits with certain attributes and methods.
    Display the details of different mobile phones with suitable
    message. */




class Fruits{

	String colour="brown",name="apple",shape="circle",weight="250.gm",store="ameerpet hyedrabad";
	int price=250;

		public static void main(String[]args){

		Fruits spec=new Fruits();
			
		System.out.println("the fruits name is :"+spec.name);
		System.out.println("the fruits colur is :"+spec.colour);
		System.out.println("the fruits shape :"+spec.shape);
		System.out.println("the fruits weight :"+spec.weight);
		System.out.println("the fruits buy store :"+spec.store);

		System.out.println();

		Fruits 	mango=new Fruits();
			mango.colour="red";
			mango.name="mango";
			mango.shape="circle";
			mango.weight="100gm";
			mango.store="ameerpet";
		System.out.println("the fruits name is :"+mango.name);
		System.out.println("the fruits colur is :"+mango.colour);
		System.out.println("the fruits shape :"+mango.shape);
		System.out.println("the fruits weight :"+mango.weight);
		System.out.println("the fruits buy store :"+mango.store);

		
		System.out.println();
			
		Fruits 	papya=new Fruits();
			papya.colour="yellow";
			papya.name="papya";
			papya.shape="long circle";
			papya.weight="1kg";
			papya.store="hi tech city";
		System.out.println("the fruits name is :"+papya.name);
		System.out.println("the fruits colur is :"+papya.colour);
		System.out.println("the fruits shape :"+papya.shape);
		System.out.println("the fruits weight :"+papya.weight);
		System.out.println("the fruits buy store :"+papya.store);


		}


		
}