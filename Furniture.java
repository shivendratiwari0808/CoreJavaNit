/* Q1. Write a program for the following requirement:
   StudyTable is an object of the class Furniture.
   Provide the operations and data members of your choice.
   Print the details with suitable message.*/



/* class Furniture{
	String tree="wood";
	int price=5000;

	public static void main(String[]args)
	{

		Furniture chair= new Furniture();
		
		System.out.println("furniture made is :"+chair.tree);
		System.out.println("furniture price is :"+chair.price);
                   

               Furniture table= new Furniture();
                table.tree="knell";
                table.price=5999;
		System.out.println("furnture made is : "+table.tree);
		System.out.println("furnture price is : "+table.price);

		
	}
	
}
	*/





class Furniture{
	//attributes

	String type;
	String material;
	String colour;

//method/behaviour
public void getDetails(){     // note : in java represents operations/behaviour.
	System.out.println("Type :"+type);
	System.out.println("material :"+material);
	System.out.println("colour :"+colour);
	System.out.println();
}
public static void main(String[]args){
	System.out.println("main starts");
      Furniture studyTable = new Furniture();

	studyTable.type = "Table";
	studyTable.material = "wood";
	studyTable.colour = "brown";

	studyTable.type = "Table";
	studyTable.material = "wood";
	studyTable.colour = "Red";


	studyTable.type = "Table";
	studyTable.material = "wood";
	studyTable.colour = "Black";


	studyTable.getDetails(); 
	studyTable.getDetails(); 
	studyTable.getDetails(); 
	System.out.println("main ends");	

}
}