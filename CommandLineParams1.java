public class CommandLineParams1 {
	public static void main(String[] args){
		for(int i = 0; i < args.length; i++){
			System.out.println("Аргумент " + i + " = " + args[args.length-1-i]);
		}
	}
}