package AcadgildAssignments;

public class Assignment2_1
{

	public static void main(String[] args)
	{
		
     int a = 1057 ,b = 10 , c = 11300 ;
     
     int highest = 0;
     

// logic to display highest number among the given 3 numbers
     
        if(a > b)
          {
    	    highest = a ;
          }
        else
          {
    	    highest = b ;
          }
     
        if (c > highest)
          {
    	    highest = c ;
    	  }
        
        System.out.println("Highest of all the 3 numbers is "  + highest);
    }
}


