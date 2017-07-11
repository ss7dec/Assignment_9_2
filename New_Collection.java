//Assignment 9.2
//Write a program to copy all the elements from set2 to set1 so that the set1 becomes the union of set1 and set2.
//Expected Output
//Display the new collection.

/*
 * This assignment has helped to master the concepts of HashSet and operations on it.
 */


package assignment_9_2;
import java.util.*;       //importing all classes from java's util library.. Because it has Collection Class needed for this Assignment.
public class New_Collection {
	
	
	
		public static void main(String[] args)     //main function declaration. and because it is static, program execution starts from main function. 
		{
			HashSet<String> firstSet = new HashSet<String>();      //Creating HashSet of type String to store the data and removing duplicates
			
			//Adding two String values in the firstSet. 
			firstSet.add("New Zealand");
			firstSet.add("Argentina");
			firstSet.add("Greenland");
			firstSet.add("Greece");
			
			System.out.println("Countries in Set1 are: " + firstSet);
			
			HashSet<String> secondSet = new HashSet<String>();      //Creating another HashSet of type String to store the data and removing duplicate values.
			
			//Adding String elements in HashSet.
			secondSet.add("India");
			secondSet.add("Sierra Leone");
			secondSet.add("Iran");
			secondSet.add("Israel");
			secondSet.add("Peru");
			
			System.out.println("Countries in Set2 are: " + secondSet);
			
			//Merging elements of secondSet to firstSet.
			boolean bResult=firstSet.addAll(secondSet);
			
			if(bResult)
			{
				System.out.println("\n****** Merging of Set 1 & Set 2 is Successfully Executed ******* \n");
			}
			
			Iterator<String> listFirst=firstSet.iterator();         //Creating the Iterator for first Set.
			System.out.println("The elements in the first Set are : ");
			while(listFirst.hasNext())     //While loop to print elements.
			{
				System.out.println(listFirst.next());        //Printing the elements.
			}
			
			System.out.println();       //Leaving one line.
			
			Iterator<String> listSecond=secondSet.iterator();         //Creating the Iterator for second Set.
			System.out.println("The elements in the second Set are : ");
			while(listSecond.hasNext())     //While loop to print elements.
			{
				System.out.println(listSecond.next());        //Printing the elements.
			}
			
		}    //End of main function.

}

//	s1.addAll(s2) — transforms s1 into the union of s1 and s2. (The union of two sets is the
//set containing all of the elements contained in either set.)
