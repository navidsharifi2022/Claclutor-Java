import java.util.*;
class add{
    float adds(float  x,float y){
        return (x+y);
        
    }
    float devison(float y,float x){
        return (y/x);
    }
    float multiplication(float x,float y){
        return (x*y);
    }
    float minus(float y,float x){
        return(y-x);
    }
}
public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		add myclass=new add();
		float num1,num2;
		Scanner n=new Scanner(System.in);
		System.out.print("Enter First Number:");
		num1=n.nextFloat();
		Scanner n1=new Scanner(System.in);
		System.out.print("Enter Secound Number:");
		num2=n1.nextFloat();
		System.out.print("Enter Oprator:");
		String op=input.next();
		if(op.equals("+")){
		    System.out
		    .println("Result:"+myclass.adds(num1,num2));
		}
	
	else if(op.equals("/")){
	    System.out.println("Result:"+myclass.devison(num1,num2));
	}
	else if(op.equals("*")){
	    System.out.println("Result:"+myclass.multiplication(num1,num2));
	    
	}
	else if(op.equals("-")){
	    System.out.println("Result:"+myclass.minus(num1,num2));
	    
	    }
	    else{
	        System.out.println(" "+op+" The operator is incorrect");
	    }
}}

