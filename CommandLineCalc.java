public class CommandLineCalc{ 
	public static void main(String[] args){
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		System.out.println(a+b); 
        	System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);           
	}
}