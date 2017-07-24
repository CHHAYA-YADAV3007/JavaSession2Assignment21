

package AcadgildAssignments;

import java.util.Scanner ;

public class Assignment1_3 
{
  public static void main(String[] args)
  {
	 byte  a , b ;
	 
	 
	Scanner in = new Scanner(System.in);
	  
	  System.out.println("Please enter first input  ");
	  
	  a = (byte) in.nextInt();
	  
	  System.out.println("Please enter first second input ");
	  
	  b = (byte) in.nextInt();
	  
	  System.out.println("Bitwise And output : "+(a&b));
	   
	boolean x = (a==0)&&(b==0);
	
    boolean y = (a==1)&&(b==0);
	
	boolean v = (a==0)&&(b==1);
    
	boolean w = (a==1)&&(b==1);
	
	if (x)
	System.out.println("Logical And output : "+ (false && false));
	
	else if(y)
	System.out.println("Logical And output : "+ (true && false));
	
	else if(v)
	System.out.println("Logical And output : "+ (false && true));
	
	
	else if(w)
	System.out.println("Logical And output : "+ (true && true ));
	
	
	
	
	  in.close();
	  
  }
}
