package assignments2;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String defaultGrade = "B";
		int defaultScore = 80; 
		
		
		
		switch(defaultScore/10) {
      
        case 10:
        case 9:
           defaultGrade = "A";
           break;
        
        case 8:
           defaultGrade = "B";
           break;
        
        case 7:
           defaultGrade = "C";
           break;
       
        case 6:
           defaultGrade = "D";
           break;
        
        case 5:
         defaultGrade = "E";
           break;
        
        default:
           defaultGrade = "F";
           break;
      }
      
      // display result
      System.out.println("Grade = " + defaultGrade);
		
	}

}
