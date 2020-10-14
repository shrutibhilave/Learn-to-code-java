abstract class Animal
{
	String Fly;
	
	// abstract class constructor
	public Animal(String fly) {
		System.out.println("In Animal Constructor");
		this.Fly=fly;
	}

	//abstract method
	abstract int legs();
	public abstract String output();
	
	// concrete method 
	public String getName(String n)
	{
		return n;
	}
}

class Birds extends Animal
{
	int legs;
	
	public Birds(String fly,int legs)
	{
		//calling animal constructor
		super(fly);
		System.out.println("In Birds Constructor");
		this.legs=legs;
	}

	@Override
	int legs() {
		
		return legs;
	}

	@Override
	public String output() {
		
		return ("Can Fly : "+super.Fly+" no. of legs :"+legs());
	}
	
}



class Mammal extends Animal
{
	int legs;
	
	public Mammal(String fly,int legs)
	{
		//calling animal constructor
		super(fly);
		System.out.println("In Mammal Constructor");
		this.legs=legs;
	}

	@Override
	int legs() {
		
		return legs;
	}

	@Override
	public String output() {
		
		return ("Can Fly : "+super.Fly+" no. of legs :"+legs());
	}
	
}


public class Mian_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1=new Birds("Yes",2);
		System.out.println(a1.output());
		Animal a2=new Mammal("No",4);
		System.out.println(a2.output());

	}

}




/*
 *------OUTPUT------
  
 In Animal Constructor
In Birds Constructor
Can Fly : Yes no. of legs :2
In Animal Constructor
In Mammal Constructor
Can Fly : No no. of legs :4

*/
