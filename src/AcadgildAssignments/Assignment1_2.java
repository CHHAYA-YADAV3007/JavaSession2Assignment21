package AcadgildAssignments;

public class Assignment1_2 {
	
	
	public static void main(String[] args)
	
	{

		int a = 10;
		int b = 9 ;
		int sum ;
		
		sum= Add(a,b);

		System.out.println("Displaying the sum of two numbers without using + operator");
		
		System.out.println("Sum of "+a+" and "+b+" is :"+sum);
				
	}

public static int Add(int aa, int bb)
  {
     int carry ;
     
    while (bb != 0)
   {

    carry = aa & bb;

       aa = aa ^ bb; 
       
       bb = carry << 1;
     }
  return aa;
  
  }

}