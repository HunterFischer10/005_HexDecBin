import java.util.Scanner;

public class BinPower {
	String name = "";
	// Fixed Scanner bug for float inputs

	private Scanner input = new Scanner(System.in);
	
	public BinPower() {
		
	}
	public void setBinary() {
		
		
		
		int ans = 0;
		double exp = Double.parseDouble(input.nextLine());
		
		// 2**2 does not work, differs from Python, got an error message
		// ans = 2**2;
		
		System.out.println("Hello most amazing Java student! What is your name?");
		name = input.nextLine();
		System.out.println("It's nice to meet you! " + name + " let's start \n");
		
		System.out.println(name + " what binary exponent do you want to enter?");
		exp = input.nextDouble();
		System.out.println(name + " you have entered: " + exp );
		
		
		
		ans = (int)Math.pow(2,exp);
		System.out.println("Answer is: " + ans);
		
	}
	
}

// int go( int a ) 
//{
	//  return (int)Math.pow(2,a);
	//}

/*
 * String check( int a ) 
{
  String num;
  num = Integer.toString(a);
  if (num.charAt(0) == num.charAt(num.length()-1)){
    return  "yes";
  }
  else{
    return  "no";
  }
}
 * 
*/