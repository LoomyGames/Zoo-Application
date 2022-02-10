package packageBoi;

import java.util.ArrayList;
import java.util.Scanner;

public class ZooMain {
	
	static Mammal Zebra = new Mammal("Zebra", "Mammal", "Plains", "Herbs");// a declaration of an animal, using the constructor
	static Mammal Elephant = new Mammal("Elephant", "Mammal", "Savanna", "Herbs");//only added 8 animals, 2 of each type, more can be added any time 
	static Reptile Crocodile = new Reptile("Crocodile", "Reptile", "Swamp", "Meat");
	static Reptile Chameleon = new Reptile("Chameleon", "Reptile", "Forest", "Insects");
	static Bird Hawk = new Bird("Hawk", "Bird", "Desert", "Meat");
	static Bird Flamingo = new Bird("Flamingo", "Bird", "Lake", "Herbs");
	static Fish Shark = new Fish("Shark", "Fish", "Ocean", "Meat");
	static Fish Koi = new Fish("Koi", "Fish", "Ocean", "Herbs");
	
	static ArrayList<Animal> animalList = new ArrayList<Animal>();//The list containing all the existing animals
	static ArrayList<Animal> searchList = new ArrayList<Animal>();//The list containing the wanted search animals
	static int ok = 1;
	static Scanner input = new Scanner(System.in);
	static String choice = "";//the user's input in the console

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    animalList.add(Zebra);//Adding all the animals to the array list
	    animalList.add(Elephant);
	    animalList.add(Crocodile);
	    animalList.add(Chameleon);
	    animalList.add(Hawk);
	    animalList.add(Flamingo);
	    animalList.add(Shark);
	    animalList.add(Koi);
	    System.out.println("Welcome to the York St John relatively small zoo");//Introduction
	    while(ok == 1)//while the program is still going, or supposed to go
	    {
	    	System.out.println("Please choose an action: \n" 
	    			+ "S to search for animals and add them to a list;\n"
	    			+ "C for a list of animals grouped by a criteria;\n"
	    			+ "Anything else to exit.");
	    	choice = input.next();//get the user's choice
	    	if(choice.contentEquals("S"))//Animal Search
	    	{
	    		System.out.println("Please input what type of list you would like: \n"
	    				+ "F for a list of food required for the animals;\n"
	    				+ "D for a list of details of the animals;\n"
	    				+ "Anything else to return to the menu.");
	    		String choice4 = input.next();
	    		if(!(choice4.contentEquals("F") || choice4.contentEquals("D")))//if the user doesn't input the right stuff
	    		{
	    			System.out.println("Returning to menu.");//return to menu
	    			break;
	    		}
	    		
	    		System.out.println("Input the name of the animal \n"//otherwise start asking for list input
	    				+ "Input Stop at the end of the list");
	    		while(true) //while the user keeps inputing animal names, keep going
	    		{
	    		String choice2 = input.next();//get the name of the animal(s)
	    		if(choice2.contentEquals("Stop")) // if the user inputs Stop, 
	    		{
	    			break;//stop
	    		}else
	    		for(int i = 0; i < animalList.size(); i++)//loop through the array list
	    		{
	    			if(choice2.contentEquals(animalList.get(i).name))//if the animal exists in the zoo
	    			{
	    				searchList.add(animalList.get(i));//fill the search list
	    			}
	    		}
	    		}
	    		if(!searchList.isEmpty())//if there is something in the list
	    		{
	    			System.out.println("The list is the following: ");//start printing the list:
	    			for(int i = 0; i< searchList.size(); i++)//loop the array list
	    			{
	    				if(choice4.contentEquals("D"))//if the user wanted details
	    				{
	    					System.out.println(searchList.get(i).giveDetails());//show details
	    				}else if(choice4.contentEquals("F"))//otherwise show the food list
	    				{
	    					System.out.println(searchList.get(i).diet);
	    				}
	    				
	    			}
	    			searchList.clear();//clear the list for a future search
	    		}else
	    		{
	    			System.out.println("Nothing found, sorry!");//if the list is empty, that means no animals were found
	    		}
	    	}
	    	else if(choice.contentEquals("C"))//Animal list by criteria
	    	{
	    		System.out.println("Input the criteria: \n"
	    				+ "F is for food;\n"
	    				+ "T is for type;\n"
	    				+ "E is for environment;\n"
	    				+ "Anything else to return to menu.");
	    		String choice2 = input.next();//the user's choice regarding criteria
	    		if(choice2.contentEquals("F"))
	    		{
	    			System.out.println("Which type of food\n"
	    					+ "M is for meat;\n"
		    				+ "I is for insects;\n"
		    				+ "H is for herbs;\n"
		    				+ "Anything else to return to menu.");
	    			String choice3 = input.next();
	    			for(int i = 0; i<animalList.size();i++)//looping again
	    			{
	    				if(choice3.contentEquals(animalList.get(i).diet))//if an animal with that diet is found
	    				{
	    					System.out.println(animalList.get(i).name);//print the name
	    				}
	    			}
	    		}else if(choice2.contentEquals("T"))//if the user chooses type
	    		{
	    			System.out.println("We have:\n"//the user then types in Mammal, Fish or the others
	    					+ "Mammal;\n"
		    				+ "Fish;\n"
		    				+ "Reptile;\n"
		    				+ "Bird.");
	    			String choice3 = input.next();
	    			for(int i = 0; i<animalList.size();i++)//the program loops through the array list
	    			{
	    				if(choice3.contentEquals(animalList.get(i).type))//if the type exists
	    				{
	    					System.out.println(animalList.get(i).name);//return all animals of that type
	    				}
	    			}
	    		}else if(choice2.contentEquals("E"))
	    		{
	    			System.out.println("We have:\n"//the user then types in plains, savanna or the others
	    					+ "Plains;\n"
		    				+ "Savanna;\n"
		    				+ "Swamp;\n"
		    				+ "Forest;\n"
		    				+ "Lake;\n"
		    				+ "Ocean;\n"
		    				+ "Desert.");
	    			String choice3 = input.next();
	    			for(int i = 0; i<animalList.size();i++)
	    			{
	    				if(choice3.contentEquals(animalList.get(i).environment))//if the environment exists
	    				{
	    					System.out.println(animalList.get(i).name);//show all animals in that environment
	    				}
	    			}
	    		}else//if none are chosen, return to the menu.
	    		{
	    			System.out.println("Returning to menu");
	    			break;
	    		}
	    	}
	    	else // if the first choice isn't among searching or criteria search, then exit the program
	    	{
	    		ok = 0;//close the while
	    		System.out.println("Goodbye");//part ways
	    	}
	    }
	}

}
