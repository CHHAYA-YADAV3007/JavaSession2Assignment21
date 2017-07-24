package AcadgildAssignments;

import java.util.Scanner;
public class Assignment1_4

{

	public static void main(String[] args)
	
	{
		
	byte  b ;
	short s ;
	int i ;
	long l ;
	float f ;
	double 	d ;
	
	Scanner in = new Scanner(System.in);
	
	System.out.println(" Enter the BYTE value : ");
	
	b = in.nextByte();
	
    System.out.println(" Enter the SHORT value : ");
	
	s = (short) in.nextInt();
	
	i = b + s ;
	
	System.out.println(" Sum of BYTE & SHORT :" + i);
	
	l = s + i ;
	
	System.out.println(" Sum of SHORT & INTEGER " + l);
	
	f = l + i ;
	
	System.out.println(" Sum of INTEGER & LONG "+ f );
	
	d = f + l ;
	
	System.out.println(" Sum of LONG & FLOAT "+ d);
	
	in.close();
	
    }
}
