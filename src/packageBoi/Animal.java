package packageBoi;

public class Animal {
	
	String name; //Declaring all the attributes an animal can have
	String type;
	String environment;
	String diet;
	
	Animal(String n, String t, String e, String d)//a constructor for easier animal creation
	{
		name = n;
		type = t;
		environment = e;
		diet = d;
	}
	
	public String giveDetails()//a method which shows all the details of an animal when called
	{
		return "The " + name + "'s " + " diet is: " + diet + ", the type is: " + type +
				" and its environment is: " + environment;
	}

}
