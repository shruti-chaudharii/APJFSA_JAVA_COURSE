package java_programs;

public class Operators {

	public static void main(String[] args) {
		
		int a=90, b=50, c=10, ans;
		
		//Arithmatic Operator(+,-,*,/,%)) 
//		System.out.println("Addition:"+(a+b));
//		System.out.println("substraction:"+(a-b));
//		System.out.println("Multiplication:"+(a*b));
//		System.out.println("Divison:"+(a/b));
//		System.out.println("module:"+(a%b));
//
//		//unary Operator(++,--)
//		System.out.println("Unary Preincrement:"+(++a));
//		System.out.println("Unary Postincrement:"+(a++));
//		System.out.println("value of a:"+(a));
//		System.out.println("Unary Predecrement:"+(--b));
//		System.out.println("Unary Postdecrement:"+(b--));
//		System.out.println("value of b:"+(b));
//		//System.out.println(c++ + ++c);
//		System.out.println(c++ + c++);
//		
//		//RelationalOperators(<,<=,>,>=,!=)
//		System.out.println("Less Than:"+(a<b));
//		System.out.println("Less Than equal to:"+(a<=b));
//		System.out.println("Greater Than:"+(a>b));
//		System.out.println("Greater Than equal to:"+(a>=b));
//		System.out.println("Not equal to:"+(a!=b));
		
		//Logical Operator(&&, ||, ~)
//		System.out.println("Logical AND:"+((a<b) && (a<c)));
//		System.out.println("Logical OR:"+((a<b) || (a<c)));
//		System.out.println("Logical NOT:"+(~(b)));
		
		//Assignment operator
//		a+=1; //a+1
//		System.out.println(a);
//		a-=1; //a=a-1
//		System.out.println(a);
//		a*=2; //a=a*2
//		System.out.println(a);
//		a/=3; //a=a/3
//		System.out.println(a);

		//Shift Operator(Left Shift, Right Shift)
		
		System.out.println(10<<2);
		System.out.println(2>>10);
		
		//Ternary Operator(Conditional Operator)
		int max=(a<b)?a:b;    //syntax= condition?exp1:exp2
		// when the condition is true it will display exp1 and if condn is false then it will display exp2
		System.out.println(max);
	}
}
