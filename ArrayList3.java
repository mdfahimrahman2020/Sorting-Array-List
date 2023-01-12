import java.util.ArrayList;
import java.util.*;
public class ArrayList3
{
	public static void main(String[] args)
	{
		System.out.print("\n\n\n\t\"Sorting Array List\"");
		ArrayList <Integer> number = new ArrayList <Integer>();
		 

		//Adding, element.
		number.add(50);
		number.add(-3);
		number.add(10);
		number.add(40);
		number.add(70);
		

        //Printing ArrayList.
		System.out.print("\n\nBefor sorting Array List is : "+number);

		//Sorted in Ascending order.
		Collections.sort(number);
		System.out.print("\n\nAfter sorting in Ascending Order : "+number);

		//Sorted in Descending order.
		Collections.sort(number,Collections.reverseOrder());
		System.out.print("\n\nAfter sorting in Descending Order : "+number);


    }
}
