import java.util.Scanner;
public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner Y= new Scanner(System.in);	
	System.out.println("Please type two numbers");	
	int B=Y.nextInt();
	int C=Y.nextInt();
	
	
	
	
	System.out.println("Which opperation would you like to perform");	
	int app=Y.nextInt();
	
	
	int U=Type(app,B,C);
	
	System.out.println(U);
		
		
	}
		
	public static int Type(int J,int H1,int H2)	{
		if(J==1){
		return (H1+H2);
		}
		
		else if(J==2){
		return (H1-H2);
	}

		else if(J==3){	
		return (H1*H2);}
		
		else{
			return (H1/H2);
		}
		
		
}
}