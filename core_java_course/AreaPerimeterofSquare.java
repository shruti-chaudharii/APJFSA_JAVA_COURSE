package java_programs;

public class AreaPerimeterofSquare {

public void AreaOfSquare(float side) {
		
		float ans = side*side;   // calculating using formula
		
		System.out.println("Area of Square : "+ans);
		
	}
	
	//  Calculating perimeter of square 
	public void Perimeter(float side) {
		
		float val = 4*side;     // calculating using formula
		
		System.out.println("Perimeter of Square : "+val);
		
	}
	
	
	public static void main(String[] args) {
		
		AreaPerimeterofSquare obj = new AreaPerimeterofSquare();    //instance of class
		
		obj.AreaOfSquare(4);      //  Passing value of side as a parameter  
 		
		obj.Perimeter(6);         //  Passing value of side as a parameter 

	}

}
